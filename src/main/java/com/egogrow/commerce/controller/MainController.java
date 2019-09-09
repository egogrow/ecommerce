package com.egogrow.commerce.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.egogrow.commerce.dto.CategoryDTO;
import com.egogrow.commerce.service.CategoryService;

@Controller
public class MainController {

    @Resource(name = "categoryService")
    private CategoryService categoryService;	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)	
	public ModelAndView main() throws Exception {
		
		ModelAndView mv = new ModelAndView("main/index");
		Map<String,List<CategoryDTO>> categoryList = categoryService.categoryList();
//		System.out.println(categoryList);
		mv.addObject("categoryList",categoryList);
//		mv.att
//		Map<String,Object> map = new HashMap<>();
//		map.put("list",list);
//		mv.addObject("map",map);		
//		List<ProductDTO> list = productService.listAll();
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("shop/product");
//		Map<String,Object> map = new HashMap<>();
//		map.put("list",list);
//		mav.addObject("map",map);
//		
//		System.out.println("productController call end");
//		
//		return mav;		
		
		return mv;
	}
	
    /**
     * �븮�� ��� ��ȸ
     * 
     * @param vo
     * @return
     * @throws Exception
     */
	/*	
    @ResponseBody
    @RequestMapping(value = "/searchAgeincy.do", produces = "application/text; charset=utf8")
    public String searchAgeincy(@ModelAttribute AgencyVO vo) throws Exception {

        List<AgencyVO> list = agencyService.selectAgencyList(vo);
        Map<String, Object> returnData = new HashMap<String, Object>();
        returnData.put("data", list);
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(returnData);
    }	*/
	
}
