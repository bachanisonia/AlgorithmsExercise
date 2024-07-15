package com.corejava.algorithms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class PalindromeSubstring {

	public static void main(String[] args) {
		
		System.out.println("Enter the String : ");
		Scanner scan = new Scanner(System.in);
		String inputString = scan.nextLine().toString();
		
		Boolean palindromeCounter=true;
		List<String> palindromeList = new ArrayList<>();
		String resultPalindrome="";
		
		int length = inputString.length();
		
		for (int i=0; i <length-1; i++) {
			
			for (int j=i+2; j<=length-1; j++) {
				
				for (int k=i, l=j; k<=(i+j/2) && l >( (((i+j)/2)-1) ); k++, l--) {
					if (inputString.charAt(k) == inputString.charAt(l)) {
						palindromeCounter = true;
					}
					else {
						palindromeCounter = false;
						break;
					}
				}
				if (palindromeCounter == true) {
					palindromeList.add(inputString.substring(i, j+1));
					if(inputString.substring(i, j+1).length() > resultPalindrome.length()) {
						resultPalindrome = inputString.substring(i, j+1);
					}
				}
			}
		}
		
		System.out.println("List of Palindrome Strings found : ");
		palindromeList.stream().forEach(System.out::println);
		System.out.println("Longest Palindrome Substring : ");
		
		System.out.println(palindromeList.stream()
				.max(Comparator.comparing(String::length)));
			//.max( (x1,x2) -> x1.length()>x2.length() ? 1:-1).get());

	}

}
