package com.egogrow.commerce.dao;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.egogrow.commerce.dto.CategoryDTO;

@Repository("categoryDAO")
public class CategoryDAO extends AbstractDAO {

	// SqlSessionTemplate DI
    @Inject
    private SqlSessionTemplate sqlSession;
    
    /**
     * 카테고리 목록 조회
     * 
     * @param dto
     * @return
     * @throws Exception
     */
	public List<CategoryDTO> categoryList() throws Exception {
//		List<CategoryDTO> list = 
		return sqlSession.selectList("category.listAll");
	}
	
	/*
	 * @Override 
	 * public List<Student> selectList(SqlSession session) { 
	 * List<Student> list = session.selectList("student.selectList"); 
	 * System.out.println(list);
	 * return list; 
	 * }
	 */	

}
