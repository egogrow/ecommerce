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
		List<CategoryDTO> categoryList = new ArrayList<>(); // ��з� ����Ʈ
		List<CategoryDTO> divisionList = new ArrayList<>(); // �ߺз� ����Ʈ
		List<CategoryDTO> sectionList = new ArrayList<>(); // �Һз� ����Ʈ		
		Map<String,List<CategoryDTO>> categoryMap = new HashMap<>();	//	ī�װ� ��ü (��з�, �ߺз�, �Һз�)
		/*
		List<String> listA = Arrays.asList("AAA", "AAA", "AAA", "BBB", "BBB", "BBB", "BBB", "ccc", "DDD", "DDD");
		Map<String, Integer> countMap = new HashMap<>();
		
		// 중복 값 카운팅
		listA.forEach(e -> {
		    Integer count = countMap.get(e);
		    countMap.put(e, count == null ? 1 : count + 1);
		});
		
		// 중복 값 부분 배열로 묶음
		List<List<String>> resultList = new ArrayList<>();
		countMap.forEach((k, v) -> {
		    List<String> list2 = new ArrayList<>();
		    for (int i = 0; i < v; i++)
		    	list2.add(k);
		    resultList.add(list2);
		});
		*/
		
		for (CategoryDTO categoryData : list) {
			  switch(categoryData.getcategoryDepth()) {	  
		        case 1: 
//		        	categoryMap.put("��з�",);
		        	categoryList.add(categoryData); // ��з� ����Ʈ
		            break;
		        case 2:        	
		        	divisionList.add(categoryData); // �ߺз� ����Ʈ
		            break;
		        case 3 :
		        	sectionList.add(categoryData); // �Һз� ����Ʈ
		            break;		            
			  }
		}
		
		System.out.println(categoryMap.get("category"));
		
		Map<String, Integer> divisionCountMap = new HashMap<>();
		divisionList.forEach(e -> {
			String ref = e.getCategoryCodeRef();			
		    Integer count = divisionCountMap.get(ref);
		    divisionCountMap.put(ref, count == null ? 1 : count + 1);
		});
		System.out.println(divisionCountMap);
		System.out.println("=============================================");
		Map<String, Integer> sectionCountMap = new HashMap<>();
		sectionList.forEach(e -> {
			String ref = e.getCategoryCodeRef();			
		    Integer count = sectionCountMap.get(ref);
		    sectionCountMap.put(ref, count == null ? 1 : count + 1);
		});
		System.out.println(sectionCountMap);
		System.out.println("=============================================");
		
//		List<List<String>> resultList = new ArrayList<>();
//		Integer index = 0;
		System.out.println(String.format("추가 전 %s", categoryList));
		categoryList.forEach(e -> {
//			System.out.println(String.format("카테고리(key): %s, 카운트맵(value): %s", e.getcategoryCode(), divisionCountMap.get(e.getcategoryCode())));
			if (divisionCountMap.containsKey(e.getcategoryCode())) {
//				System.out.println(String.format("key 존재함: %s", e.getcategoryCode()));
				e.setCategoryCount(divisionCountMap.get(e.getcategoryCode()));				
			}
//			e.
//			index++;
//			countMap.getKey();
//			System.out.println(countMap.get(e.getcategoryCode()));
//		    List<String> list2 = new ArrayList<>();
//		    for (int i = 0; i < v; i++)
//		    	list2.add(k);
//		    resultList.add(list2);
		});
		System.out.println(String.format("추가 후 %s", categoryList));
		
		categoryMap.put("category", categoryList);
		categoryMap.put("division", divisionList);
		categoryMap.put("section", sectionList);
		
		
		

		return categoryMap;
	}

}	
