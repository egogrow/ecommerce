package com.egogrow.commerce.shop;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Resource
	ProductDAO productDao;
	
	@Override
	public List<ProductDTO> listAll() throws Exception {
		System.out.println("listall service impl call");
		return productDao.listAll();
	}

}
