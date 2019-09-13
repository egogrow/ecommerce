package com.egogrow.commerce.controller;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.egogrow.commerce.dto.CategoryDTO;
import com.egogrow.commerce.service.CategoryService;

/**
 * @project commerce
 * @class MainController.java
 * @classDoc 메인 컨트롤러
 *
 * @date 2019. 9. 10.
 * @author 이지훈
 */
@Controller
public class MainController {

	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
	@Inject
    private CategoryService categoryService;	

	/**
	 * @project commerce
	 * @method getIndex
	 * @return ModelAndView
	 * @throws Exception
	 * @mothodDoc 카테고리 데이터 메인 화면 전달
	 *
	 * @date 2019. 9. 10.
	 * @author 이지훈
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)	
	public ModelAndView mainPage() throws Exception {
		System.out.println("main");
		ModelAndView mv = new ModelAndView("main/index");
		Map<String,List<CategoryDTO>> categoryList = categoryService.categoryList();
		mv.addObject("categoryList",categoryList);
		
		return mv;
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
	
}
