package com.egogrow.commerce.service;

import java.util.List;
import java.util.Map;

import com.egogrow.commerce.dto.CategoryDTO;

public interface CategoryService {
	
	// ī�װ� ��� ��ȸ
	Map<String,List<CategoryDTO>> categoryList() throws Exception;
	
}
