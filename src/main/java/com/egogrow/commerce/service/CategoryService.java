package com.egogrow.commerce.service;

import java.util.List;
import java.util.Map;

import com.egogrow.commerce.dto.CategoryDTO;

public interface CategoryService {
	
	// 카테고리
	public Map<String,List<CategoryDTO>> categoryList() throws Exception;
	
}
