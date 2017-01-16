package org.itava.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  
@RequestMapping("/bsReport")  
public class BsReportController {

	  @RequestMapping("/reportInit")  
	    public String toIndex(HttpServletRequest request,Model model){ 
	        return "report";  
	    }  
}
