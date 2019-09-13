package com.egogrow.commerce.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @project commerce
 * @class AdminController.java
 * @classDoc 
 *
 * @date 2019. 9. 10.
 * @author 이지훈
 */
@Controller
@RequestMapping("admin/*") 
public class AdminController {
	
	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);

    @RequestMapping("/sample")
    public String samplePage() throws Exception {
    	System.out.println("sample_admin");
        return "redirect:/sample_admin/index.html";
    }
    
    /**
     * @project commerce
     * @method getIndex
     * @return
     * @mothodDoc
     *
     * @date 2019. 9. 10.
     * @author 이지훈
     */
	@RequestMapping(value = "/index.do", method = RequestMethod.GET)
    public String adminPage() throws Exception {
    	System.out.println("admin/index back office 타일즈 포함");
    	return "admin/index";
    }
	
//	@RequestMapping(value = "", method = RequestMethod.GET)
//	public String login() throws Exception {
//		System.out.println("admin/login 타일즈 미포함");
//		return "admin/login";
//	}
    
}
