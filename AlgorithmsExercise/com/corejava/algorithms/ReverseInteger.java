package com.corejava.algorithms;

import java.util.Scanner;

public class ReverseInteger {

	public static void main(String[] args) {
		/*
		System.out.println("Enter the integer : ");
		Scanner scan = new Scanner(System.in);
		String numberStr = scan.nextLine();
		
		StringBuilder newNumber = new StringBuilder();
		
		int length = numberStr.length();
		System.out.println(numberStr +"-"+length);
		
		for (int i=length-1; i>=0; i--) {
			newNumber.append(numberStr.charAt(i));
		}

		System.out.println(newNumber);
		*/
		
		System.out.println("Enter the Long value : ");
		Scanner scan = new Scanner(System.in);
		Long input = scan.nextLong();
		Long output=0L;
		
		while(input != 0) {
			output = output*10 + input%10;
			input /=10;
		}
		System.out.println(output);
	}

}
