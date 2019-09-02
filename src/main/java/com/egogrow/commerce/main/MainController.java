package com.egogrow.commerce.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	
	private static final Logger log = LoggerFactory.getLogger(MainController.class);
	
//	@Resource
//	CategoryService categoryService;
		
	@RequestMapping(value = "/", method = RequestMethod.GET)	
	public String main() {
		
		System.out.println("mainController call");
//		logger.info("@@@@@@");
//	    $sql = " select ca_id, ca_name from {$g5['g5_shop_category_table']} where ca_use = '1' ";		
//		category
		
		return "main/index";
	}
    
    /**
     * Tiles를 사용하지 않은 일반적인 형태
     */    
    @RequestMapping("/index")
    public String index() {
        return "sample/index";
    }
    @RequestMapping("/blog")
    public String blog() {
        return "sample/blog";
    }    
    @RequestMapping("/blog_single")
    public String blog_single() {
        return "sample/blog_single";
    }     
    @RequestMapping("/cart")
    public String cart() {
        return "sample/cart";
    }        
    @RequestMapping("/contact")
    public String contact() {
        return "sample/contact";
    }        
    @RequestMapping("/product")
    public String product() {
        return "sample/product";
    }        
    @RequestMapping("/reqular")
    public String reqular() {
        return "sample/reqular";
    }        
    @RequestMapping("/shop")
    public String shop() {
        return "sample/shop";
    }
    
    @RequestMapping("/sample_admin")
    public String sample_admin() {
    	System.out.println("admin call");
        return "redirect:/sample_admin/index.html";
    }      
    
    /**
     * Tiles를 사용(header, left, footer 포함)
     */        
//    @RequestMapping("/testPage.do")
//    public String testPage() {
//        return "test.tikle";
//    }
    
    /**
     * Tiles를 사용(header, left, footer 제외)
     */    
//    @RequestMapping("/testPart.do")
//    public String testPart() {
//        return "test.part";
//    } 	

}

