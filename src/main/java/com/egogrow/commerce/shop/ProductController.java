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
	 * [�帧��] 
	 * => Ŭ���̾�Ʈ -> controller -> service �������̽� -> serviceImpl -> DAO -> DAOImpl -> DB -> DTO 
	 * 
	 * controller : ��û�� ���� request�� ������ Service�� ����, ��� ó���� ��� view�� ����
	 * service : �����Ͻ� ������ ���� interface, Ȯ�强�� �������� ���̱� ���� ���
	 * serviceImpl : ���� �����Ͻ� ���� controller�� ���� ȣ��Ǹ� DAO�� ȣ���Ѵ�
	 * DAO : DB ���� interface, Ȯ�强�� �������� ���̱� ���� ���
	 * DAOImpl : DB ���� ����, DB�� �������Ͽ� �����͸� ��ȸ�ϰų� �����ϴ� ����� ���
	 * DTO : ������ ������ ��ȯ�� ���� �ڹٺ����. �� ��ü�� �����ͺ��̽��� ���ڵ��� �����͸� �����ϱ� ���� ������ ��ü�� ���Ѵ�.
	 * DAO�� DB�κ��� �����͸� ���� �� service�� controller ������ ���� �� ����ϴ� ��ü�̸�, �����͸� �ְ���� �����̶�� �� �� �ִ�.
	 */
	
	/*
	 * [���� ����]
	 * => 
	 */
	
	// interface�� ȣ���ߴµ� ���� ���� ������ impl�� ����Ǵ� ����?
	/*
	�������̽��� ���迡 ���õ� Ŭ�����̰�..
	����ü�� �� �״�� ����ü�ΰ�����..
	�������̽��� ������ �ľ��� �� �ְ�..
	����ü�δ� ���� ���������� ���� ������ Ȯ���ϴ°�����.
	�������̽� ��ü�� ������ ���� �ּ��� ���ԵǾ� �־�� �ϴ°Ű��..
	*/
	// oop���� ����ü��? ���� ���� ������ �ǹ���.
	// myBatis(map xml) vs ORM Hibernate(JPA) ���̹�����Ʈ?
	
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

