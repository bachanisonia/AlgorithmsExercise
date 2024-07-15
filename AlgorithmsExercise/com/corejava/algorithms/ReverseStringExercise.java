package com.corejava.algorithms;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ReverseStringExercise {

	public static void main(String[] args) {
		
		System.out.println("Enter the string to be reversed : ");
		Scanner scan = new Scanner(System.in);
		String inputString = scan.nextLine().toString();
		
		String outputString = ReverseString.getReversedString(inputString);

		System.out.println("Original String : " + inputString);
		System.out.println("Reversed String : " + outputString);
		
	}

}

class ReverseString {
	
	static String getReversedString(String inputString) {
				
		//Deque<Character> listString = new LinkedList<>();
		List<String> list = new ArrayList<>();
		
		char[] stringArray = inputString.trim().toCharArray();
		int stringLength = inputString.length();
		StringBuilder newString = new StringBuilder();
		
		for (int i=stringLength-1; i>=0; i--) {
			newString.append(stringArray[i]);
		}
		
		return newString.toString();
	}
	
}
