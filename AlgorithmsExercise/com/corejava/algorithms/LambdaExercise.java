package com.corejava.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaExercise {

	public static void main(String[] args) {
		
		
		Predicate<Integer> evenOddTest = number -> {
				if (number%2 == 0) return false;
				return true;
			};

		
		Predicate<Integer> primeTest = number -> {
			
			if (number == 0 || number == 1) return false;
			if (number == 2) return true;
			
			for (int i=2; i<=number; i++) {
				if (number == i) return true;
				if (number%i == 0) return false;
			}
			return true;
		};
		
		Predicate<String> palindromeTest = string -> {
			
			int len = string.length();
			for(int i=0,j=len-1; i<len/2 && j>(len/2)-1; i++, j--) {
				if (string.charAt(i) != string.charAt(j)) return false;
			}
			return true;
		};
		
		System.out.println(evenOddTest.test(13) ? "Odd" : "Even");
		System.out.println(primeTest.test(13) ? "Prime" : "Not Prime");
		System.out.println(palindromeTest.test("palindrome") ? "Palindrome" : "Not a Palindrome");
		
		
		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 2);
		map.put(2, 7);
		map.put(3, 37);
		map.put(4, 40);
		
		Set<Map.Entry<Integer, Integer>> set1 = map.entrySet();
		Set<Integer> set2 = map.keySet();
		
		set1.stream()
			.filter( x -> x.getValue() > 30)
			.forEach(System.out::println);
		
		List<Integer> numberList = new ArrayList<>( Arrays.asList(1, 2, 1,2, 3, 4, 2,1, 3, 4, 6, 1) );
		
		Map<Integer, Integer> countMap = numberList.stream()
										.collect(Collectors.toMap(Function.identity(), v -> 1, Integer::sum));
		
		System.out.println(countMap);
		
		
	}

}
