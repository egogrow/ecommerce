package com.egogrow.commerce.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

	public static void main(String[] args) {

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
		
		System.out.println(listA.indexOf("ccc"));
		
	}
}
