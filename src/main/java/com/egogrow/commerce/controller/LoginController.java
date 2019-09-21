package com.egogrow.commerce.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

	@RequestMapping(value = "/login")
	public String loginPage() throws Exception {
		logger.debug("login");
		
		return "login/login";
	}
	
	@RequestMapping(value = "/accessDenied", method = RequestMethod.GET)
	public String accessDeniedPage() throws Exception {
		logger.debug("accessDenied");
		
		return "login/accessDenied";
	}
	
    @RequestMapping(value="/accessDeniedAlert")
    public ModelAndView accessDeniedAlert() throws Exception {
    	logger.debug("accessDeniedAlert");
    	
    	ModelAndView mv = new ModelAndView("login/accessDeniedAlert");
    	mv.addObject("msg", "접근 권한이 없습니다.");
    	mv.addObject("url", "/");
    	
    	return mv;
    }
	
}
