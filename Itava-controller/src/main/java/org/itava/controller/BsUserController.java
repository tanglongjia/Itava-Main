package org.itava.controller;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.itava.pojo.BsUser;
import org.itava.service.BsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
  
  
@Controller  
@RequestMapping("/bsUser")  
public class BsUserController {  
	
    @Autowired  
    private BsUserService bsUserService;  
      
    @RequestMapping("/showUser")  
    public String toIndex(HttpServletRequest request,Model model){ 
        BsUser user = this.bsUserService.getUserById(new Integer(1));  
        model.addAttribute("user", user);  
        return "bsUser";  
    }  
    
    @RequestMapping(value="/selectUserPage",method=RequestMethod.GET, produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String selectUserPage(HttpServletRequest request,Model model){ 
    	Map<String, Comparable> param = new HashMap();
    	param.put("departid", 1);
    	String truename = "";
    	try {
    		truename = request.getParameter("truename");
    		if(truename!=null && truename !=""){
    			truename = new String(truename.getBytes("ISO-8859-1"), "UTF-8"); 
    		}
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
    	if(!"".equals(truename)){
    		param.put("truename",truename );
    	}
    	if(!"".equals(request.getParameter("telephone"))){
    		param.put("telephone", request.getParameter("telephone"));
    	}
        List<BsUser> userList = this.bsUserService.selectUserPage(param);
      /*  PageInfo<BsUser> pageInfo = new PageInfo<BsUser>(userList);
        model.addAttribute("pageInfo", pageInfo);  
        model.addAttribute("userList", userList);*/
        Map<String,Object> resultMap = new HashMap<String,Object>();
        resultMap.put("rows", userList);
        resultMap.put("total", "11");
        String jsonStr = JSON.toJSONString(resultMap);
        return jsonStr;  
    }
    
    @RequestMapping("/userAdd")  
    public String userAdd(HttpServletRequest request,Model model){ 
        return "/user/userAdd";  
    }  
}  