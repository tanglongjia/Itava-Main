package org.itava.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.itava.pojo.BsResource;
import org.itava.service.BsResourceService;
import org.itava.util.MessageStreamResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;

@Controller  
@RequestMapping("/bsResource")  
public class BsResourceController {

	@Autowired
	private BsResourceService bsResourceService;
	/**
	 * 生成左侧菜单树
	 * @return
	 */
	@RequestMapping(value="/getLeftMenu", method=RequestMethod.GET, produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String getLeftMenu(){
		Map<String,Integer> paramMap= new HashMap<String,Integer>();
		paramMap.put("parentid", 0);
		List<BsResource> bsResouceList = new ArrayList<BsResource>();
		try {
			bsResouceList = bsResourceService.getLeftMenu(paramMap);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(!bsResouceList.isEmpty()){
			for (BsResource bsResource : bsResouceList) {
					Map<String,Integer> pMap = new HashMap<String,Integer>();
					pMap.put("parentid", bsResource.getId());
					List<BsResource> childList = null;
					try {
						childList = bsResourceService.getLeftMenu(pMap);
					} catch (Exception e) {
						e.printStackTrace();
					}
					bsResource.setChildren(childList);
			}
		}
    	String jsonStr = JSON.toJSONString(bsResouceList);
    	return jsonStr;
    }
	
	/**
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping("/resInit")  
    public String toIndex(HttpServletRequest request,Model model){ 
        return "bsResource";  
    }  
	
	
	/**
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/getAllMenu",method=RequestMethod.POST, produces = "text/html;charset=UTF-8") 
    public ModelAndView getAllMenu(HttpServletRequest request,HttpServletResponse response, Model model){ 
		String menuname = request.getParameter("menuname");
		try {
			menuname = URLDecoder.decode(menuname, "UTF-8");
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		} 
		//定义第一层 写死的
		BsResource bsResRoot = new BsResource();
		bsResRoot.setId(0);
		bsResRoot.setMenuname("全部");
		bsResRoot.setMenucode("test");
		bsResRoot.setLeafNode("否");
		bsResRoot.setParentid(-1);
		bsResRoot.setMenulevel(0);
		bsResRoot.setIsleafnode(1);
		bsResRoot.setStatus(1);
		//查询第二层子菜单
		Map<String,Object> p2Map = new HashMap<String,Object>();
		p2Map.put("parentid", 0);
		p2Map.put("menuname", menuname);
		List<BsResource> bsResList = null;
		try {
			bsResList = bsResourceService.getMenuByParentId(p2Map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		bsResRoot.setChildren(bsResList);
		//查询第三层
		Map<String,Object> p3Map = new HashMap<String,Object>();
		//int total = 1+bsResList.size();
		for (BsResource bsResource : bsResList) {
			p3Map.put("parentid", bsResource.getId());
			p3Map.put("menuname", menuname);
			List<BsResource> bsRes3List = null;
			try {
				bsRes3List = bsResourceService.getMenuByParentId(p3Map);
			} catch (Exception e) {
				e.printStackTrace();
			}
			bsResource.setChildren(bsRes3List);
			//total = total + bsRes3List.size();
		}
		Map<String,Object> resultMap = new HashMap<String,Object>();
        resultMap.put("Rows", bsResList);
        String jsonStr = JSON.toJSONString(resultMap);
        try {
			MessageStreamResult.msgStreamResult(response, jsonStr);
		} catch (Exception e) {
			e.printStackTrace();
		}
        return null;  
    } 
	
	
	    
}
