package com.egogrow.commerce.shop;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {
	
	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);
	
	/*
	 * [흐름도] 
	 * => 클라이언트 -> controller -> service 인터페이스 -> serviceImpl -> DAO -> DAOImpl -> DB -> DTO 
	 * 
	 * controller : 요청에 대한 request를 받으면 Service에 전달, 모든 처리후 결과 view에 전달
	 * service : 비지니스 로직에 대한 interface, 확장성과 유연성이 높이기 위해 사용
	 * serviceImpl : 실제 비지니스 로직 controller로 부터 호출되며 DAO를 호출한다
	 * DAO : DB 로직 interface, 확장성과 유연성을 높이기 위해 사용
	 * DAOImpl : DB 실제 로직, DB에 엑세스하여 데이터를 조회하거나 조작하는 기능을 담당
	 * DTO : 계층간 데이터 교환을 위한 자바빈즈다. 이 객체는 데이터베이스의 레코드의 데이터를 매핑하기 위한 데이터 객체를 말한다.
	 * DAO가 DB로부터 데이터를 얻은 뒤 service나 controller 등으로 보낼 때 사용하는 객체이며, 데이터를 주고받을 포맷이라고 할 수 있다.
	 */
	
	/*
	 * [설계 패턴]
	 * => 
	 */
	
	// interface를 호출했는데 실제 구현 로직인 impl이 수행되는 원리?
	/*
	인터페이스는 설계에 관련된 클래스이고..
	구현체는 말 그대로 구현체인거지요..
	인터페이스로 업무를 파악할 수 있고..
	구련체로는 개별 단위업무의 실제 로직을 확인하는거지요.
	인터페이스 자체에 구현에 대한 주석이 포함되어 있어야 하는거고요..
	*/
	// oop에서 구조체란? 실제 구현 로직을 의미함.
	// myBatis(map xml) vs ORM Hibernate(JPA) 하이버네이트?
	
	@Resource
	ProductService productService;

	/**
	 * Method to Add Products to the Shopping Cart First Check if the Product is
	 * available in the Wishlist, if available, remove the product from Wishlist
	 * 
	 * @author Sai Upadhyayula
	 * 
	 * @param ProductID
	 * @param HttpServletRequest
	 * @return Product Page View
	 */
	@RequestMapping(value = "/product.do", method = RequestMethod.GET)
	public ModelAndView productList() throws Exception {
		
		System.out.println("productController call");
		
		List<ProductDTO> list = productService.listAll();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("shop/product");
		Map<String,Object> map = new HashMap<>();
		map.put("list",list);
		mav.addObject("map",map);
		
		System.out.println("productController call end");
		
		return mav;
	}

}

