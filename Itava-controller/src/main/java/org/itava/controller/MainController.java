package org.itava.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  
@RequestMapping("/main")  
public class MainController {

	 @RequestMapping("/index")  
    public String index(HttpServletRequest request,Model model){ 
		 String topUrl = "/bsUser/showUser";
         return "redirect:" + topUrl;  
    }  
}
