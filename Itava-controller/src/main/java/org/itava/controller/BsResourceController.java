package org.itava.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.itava.pojo.BsResource;
import org.itava.service.BsResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
		List<BsResource> bsResouceList = bsResourceService.getLeftMenu(paramMap);
		if(!bsResouceList.isEmpty()){
			for (BsResource bsResource : bsResouceList) {
					Map<String,Integer> pMap = new HashMap<String,Integer>();
					pMap.put("parentid", bsResource.getId());
					List<BsResource> childList = bsResourceService.getLeftMenu(pMap);
					bsResource.setChildList(childList);
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
	@ResponseBody
    public String getAllMenu(HttpServletRequest request,Model model){ 
		//定义第一层 写死的
		BsResource bsResRoot = new BsResource();
		bsResRoot.setId(0);
		bsResRoot.setMenuname("全部");
		bsResRoot.setLeafNode("否");
		bsResRoot.setState("open");
		//查询第二层子菜单
		Map<String,Integer> p2Map = new HashMap<String,Integer>();
		p2Map.put("parentid", 0);
		List<BsResource> bsResList = bsResourceService.getMenuByParentId(p2Map);
		bsResRoot.setChildList(bsResList);
		//查询第三层
		Map<String,Integer> p3Map = new HashMap<String,Integer>();
		int total = 1+bsResList.size();
		for (BsResource bsResource : bsResList) {
			p3Map.put("parentid", bsResource.getId());
			List<BsResource> bsRes3List = bsResourceService.getMenuByParentId(p3Map);
			bsResource.setChildList(bsRes3List);
			total = total + bsRes3List.size();
		}
		Map<String,Object> resultMap = new HashMap<String,Object>();
        resultMap.put("rows", bsResRoot);
        resultMap.put("total", total);
        String jsonStr = JSON.toJSONString(resultMap);
        //String jsonStr = "{'total':2,'rows':[{'id':1,'name':'全国','parentId':null},{'id':2,'name':'全国2','parentId':1}]}";
		System.out.println(jsonStr);
        return jsonStr;  
    } 
	
	
	    
}
