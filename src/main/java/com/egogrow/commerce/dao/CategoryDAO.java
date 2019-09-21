package com.egogrow.commerce.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.egogrow.commerce.dto.CategoryDTO;

@Repository("categoryDAO")
public interface CategoryDAO {

	public List<CategoryDTO> getCategoryList();
	
}
