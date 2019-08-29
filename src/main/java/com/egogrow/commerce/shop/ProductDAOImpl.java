package com.egogrow.commerce.shop;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDAOImpl implements ProductDAO {
	
	@Resource
	SqlSession sqlSession;

	// 상품 목록
	@Override
	public List<ProductDTO> listAll() {
		System.out.println("listall DAO impl call");
		return sqlSession.selectList("product.listAll");		
	}

}
