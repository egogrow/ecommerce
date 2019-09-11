package com.egogrow.commerce.dao;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.egogrow.commerce.dto.CategoryDTO;

/**
 * @project commerce
 * @class CategoryDAO.java
 * @classDoc 카테고리 DAO
 *
 * @date 2019. 9. 10.
 * @author 이지훈
 */
@Repository
public class CategoryDAO extends AbstractDAO {

    @Inject
    private SqlSessionTemplate sqlSession;
    

	/**
	 * @project commerce
	 * @method categoryList
	 * @return List<CategoryDTO>
	 * @throws Exception
	 * @mothodDoc 카테고리 데이터 엑세스
	 *
	 * @date 2019. 9. 10.
	 * @author 이지훈
	 */
	public List<CategoryDTO> categoryList() throws Exception {
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
