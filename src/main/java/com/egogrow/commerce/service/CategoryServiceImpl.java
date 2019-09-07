package com.egogrow.commerce.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.egogrow.commerce.dao.CategoryDAO;
import com.egogrow.commerce.dto.CategoryDTO;

@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {
	
	@Resource(name = "categoryDAO")
	private CategoryDAO categoryDAO;

	// ī�װ� ��� ��ȸ
	@Override
	public Map<String,List<CategoryDTO>> categoryList() throws Exception {

		List<CategoryDTO> list = categoryDAO.categoryList();
		List<CategoryDTO> categoryList = new ArrayList<>();
		List<CategoryDTO> divisionList = new ArrayList<>();
		List<CategoryDTO> sectionList = new ArrayList<>();		
		Map<String,List<CategoryDTO>> categoryMap = new HashMap<>();
		for (CategoryDTO categoryData : list) {
			  switch(categoryData.getcategoryDepth()) {	  
		        case 1: 
		        	categoryList.add(categoryData); // 대분류
		            break;
		        case 2:        	
		        	divisionList.add(categoryData); // 중분류
		            break;
		        case 3 :
		        	sectionList.add(categoryData); // 소분류
		            break;		            
			  }
		}
		
		System.out.println(categoryMap.get("category"));
		
		Map<String, Integer> divisionCountMap = new HashMap<>();
		divisionList.forEach(e -> {
			String ref = e.getcategoryCodeRef();			
		    Integer count = divisionCountMap.get(ref);
		    divisionCountMap.put(ref, count == null ? 1 : count + 1);
		});
		Map<String, Integer> sectionCountMap = new HashMap<>();
		sectionList.forEach(e -> {
			String ref = e.getcategoryCodeRef();			
		    Integer count = sectionCountMap.get(ref);
		    sectionCountMap.put(ref, count == null ? 1 : count + 1);
		});
		
		categoryList.forEach(e -> {
			if (divisionCountMap.containsKey(e.getcategoryCode())) {
				e.setcategoryCodeRefCount(divisionCountMap.get(e.getcategoryCode()));
			}
		});
		
		divisionList.forEach(e -> {
			if (sectionCountMap.containsKey(e.getcategoryCode())) {
				e.setcategoryCodeRefCount(sectionCountMap.get(e.getcategoryCode()));				
			}
		});
		
		categoryMap.put("category", categoryList);
		categoryMap.put("division", divisionList);
		categoryMap.put("section", sectionList);

		return categoryMap;
	}

}	
