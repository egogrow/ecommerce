package com.egogrow.commerce.service;

import java.util.List;
import java.util.Map;

import com.egogrow.commerce.dto.CategoryDTO;

public interface CategoryService {
	
	/**
	 * 카테고리 정보를 조회하는 메서드
	 * 
	 * @return Map<String,List<CategoryDTO>>
	 */
	public Map<String,List<CategoryDTO>> categoryList() throws Exception;
	
}
