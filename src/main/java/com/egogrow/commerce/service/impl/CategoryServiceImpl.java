package com.egogrow.commerce.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.egogrow.commerce.dao.CategoryDAO;
import com.egogrow.commerce.dto.CategoryDTO;
import com.egogrow.commerce.service.CategoryService;

@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {
	
	@Inject
	private CategoryDAO categoryDAO;
	
	@Override
	public Map<String,List<CategoryDTO>> categoryList() throws Exception {

		List<CategoryDTO> list = categoryDAO.getCategoryList();
		List<CategoryDTO> categoryList = new ArrayList<>();
		List<CategoryDTO> divisionList = new ArrayList<>();
		List<CategoryDTO> sectionList = new ArrayList<>();		
		Map<String,List<CategoryDTO>> categoryMap = new HashMap<>();
		for (CategoryDTO categoryData : list) {
			  switch(categoryData.getCategoryDepth()) {	  
		        case 1 : 
		        	categoryList.add(categoryData); // 대분류
		            break;
		        case 2 :        	
		        	divisionList.add(categoryData); // 중분류
		            break;
		        case 3 :
		        	sectionList.add(categoryData); // 소분류
		            break;
			  }
		}
		
		Map<String, Integer> divisionCountMap = new HashMap<>();
		divisionList.forEach(e -> {
			String ref = e.getCategoryCodeRef();			
		    Integer count = divisionCountMap.get(ref);
		    divisionCountMap.put(ref, count == null ? 1 : count + 1);
		});
		
		Map<String, Integer> sectionCountMap = new HashMap<>();
		sectionList.forEach(e -> {
			String ref = e.getCategoryCodeRef();			
		    Integer count = sectionCountMap.get(ref);
		    sectionCountMap.put(ref, count == null ? 1 : count + 1);
		});
		
		categoryList.forEach(e -> {
			if (divisionCountMap.containsKey(e.getCategoryCode())) {
				e.setCategoryCodeRefCount(divisionCountMap.get(e.getCategoryCode()));
			}
		});
		
		divisionList.forEach(e -> {
			if (sectionCountMap.containsKey(e.getCategoryCode())) {
				e.setCategoryCodeRefCount(sectionCountMap.get(e.getCategoryCode()));				
			}
		});
		
		categoryMap.put("category", categoryList);
		categoryMap.put("division", divisionList);
		categoryMap.put("section", sectionList);

		return categoryMap;
	}

}	
