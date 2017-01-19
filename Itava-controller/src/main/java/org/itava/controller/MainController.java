package org.itava.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller  
@RequestMapping("/tilesMain")  
public class MainController {
	
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public ModelAndView main(HttpServletRequest request) {
		
		ModelAndView modelView = new ModelAndView();
		
		modelView.setViewName("mainView");
		
		return modelView;
	}
	
	
	@RequestMapping(value = "/one", method = RequestMethod.GET)
	public ModelAndView one(HttpServletRequest request) {
		
		ModelAndView modelView = new ModelAndView();
		
		modelView.setViewName("one");
		
		return modelView;
	}
	
	
	@RequestMapping(value = "/two", method = RequestMethod.GET)
	public ModelAndView two(HttpServletRequest request) {
		
		ModelAndView modelView = new ModelAndView();
		
		modelView.setViewName("two");
		
		return modelView;
	}

}
