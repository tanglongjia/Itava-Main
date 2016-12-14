package org.itava.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.itava.pojo.BsResource;
import org.itava.service.BsResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
					System.out.println(bsResource.getId()+"*************");
					List<BsResource> childList = bsResourceService.getLeftMenu(pMap);
					bsResource.setChildList(childList);
			}
		}
    	String jsonStr = JSON.toJSONString(bsResouceList);
    	return jsonStr;
    }
}
