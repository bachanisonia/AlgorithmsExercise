package com.corejava.algorithms;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DuplicateElementsExercise {

	public static List<Integer> removeDuplicate(List<Integer> list) {
		
		//Set<Integer> uniqueSet = new HashSet<>();
		
		List<Integer> result = list.stream()
			.distinct()
			.collect(Collectors.toList());
		
		return result;
		
	}
	
}
