package org.itava.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.itava.pojo.SNews;
import org.itava.service.SNewsService;
import org.itava.util.MessageStreamResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;

@Controller
@RequestMapping("/snews")  
public class SNewsController {
	
	@Autowired
	private SNewsService snewsService;

	/**
	 * @param request
	 * @param model 初始化页面
	 * @return
	 */
	@RequestMapping("/init")  
    public String index(HttpServletRequest request,Model model){ 
         return "snews";  
    } 
	
	
	/**
	 * @param request
	 * @param model
	 * @return 查询新闻列表
	 */
	@RequestMapping(value="/selectNewsPage",method=RequestMethod.GET, produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String selectNewsPage(HttpServletRequest request,Model model){ 
		Map parmMap = new HashMap();
		parmMap.put("newsTitle", request.getParameter("newsTitle"));
		parmMap.put("newsCategory", request.getParameter("newsCategory"));
		String page  = (String) request.getParameter("pageNumber");
		String pageSize = (String) request.getParameter("pageSize");
		int pageNum = 1;
		if(page!=null && page !=""){
			pageNum = Integer.parseInt(page);
		}
		int startNum = (pageNum-1)*new Integer(pageSize);
		int endNum = pageNum * new Integer(pageSize);
		parmMap.put("startNum",startNum);
		parmMap.put("endNum",endNum);
		 List<SNews> snewsList = null;
		try {
			snewsList = snewsService.selectSNewsListPage(parmMap);
		} catch (Exception e) {
			e.printStackTrace();
		}
		 int total = 0;
         if(snewsList!=null){
        	 total = snewsList.size();
         }
         Map<String,Object> resultMap = new HashMap<String,Object>();
         resultMap.put("rows", snewsList);
         resultMap.put("total", total);
         String jsonStr = JSON.toJSONString(resultMap);
         return jsonStr;  
    } 
	
	/**
	 * @param request
	 * @param model
	 * @return 弹出新增新闻页面
	 */
	@RequestMapping("/newsAdd")  
    public ModelAndView newsAdd(HttpServletRequest request,ModelMap modelMap){ 
		String id = request.getParameter("id");
		SNews news = null;
		if(id!=null&& id!=""){
			try {
				news = snewsService.getSNewsById(new Integer(id));
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		modelMap.put("news", news);
        return new ModelAndView("/snews/newsAdd", modelMap);  
    }  
	
	/**
	 * @param request
	 * @param model
	 * @return 保存信息信息
	 */
	@RequestMapping("/newsSave")  
    public String newsSave(HttpServletRequest request,HttpServletResponse response,Model model){ 
		
		String formId = request.getParameter("formId");
		if(formId!=null && formId!=""){//更新操作
			try {
				SNews news = snewsService.getSNewsById(new Integer(formId));
				news.setNewstitle(request.getParameter("formNewsTitle"));
				news.setNewscategory(request.getParameter("formNewsCategory"));
				news.setNewsurl(request.getParameter("formNewsUrl"));
				news.setNewscontent(request.getParameter("formNewsContent"));
				news.setStatus(new Integer(request.getParameter("formStatus")));
				news.setUpdated(new SimpleDateFormat("yyyy-MM-dd hh:MM:ss").format(new Date()));
				news.setUpdatedby(0);
				snewsService.updateNews(news);
				MessageStreamResult.msgStreamResult(response, "2");
			} catch (NumberFormatException e) {
				e.printStackTrace();
				try {
					MessageStreamResult.msgStreamResult(response, "3");
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			} catch (Exception e) {
				e.printStackTrace();
				try {
					MessageStreamResult.msgStreamResult(response, "3");
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		}else{//新增操作
			SNews news = new SNews();
			news.setNewstitle(request.getParameter("formNewsTitle"));
			news.setNewscategory(request.getParameter("formNewsCategory"));
			news.setNewsurl(request.getParameter("formNewsUrl"));
			news.setNewscontent(request.getParameter("formNewsContent"));
			news.setCreaterName("管理员");
			news.setCreated(new SimpleDateFormat("yyyy-MM-dd hh:MM:ss").format(new Date()));
			news.setReadcount(0);
			news.setStatus(new Integer(request.getParameter("formStatus")));
			try {
				snewsService.saveNews(news);
				MessageStreamResult.msgStreamResult(response, "1");
			} catch (Exception e) {
				try {
					MessageStreamResult.msgStreamResult(response, "0");
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		}
		
        return null;  
    }  
	
	/**
	 * @param request
	 * @param response
	 * @param model
	 * @return 根据id 删除新闻
	 */
	@RequestMapping("/newsDel")  
    public String newsDel(HttpServletRequest request,HttpServletResponse response,Model model){
		int id = new Integer(request.getParameter("id"));
		try {
			snewsService.deleteNews(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
