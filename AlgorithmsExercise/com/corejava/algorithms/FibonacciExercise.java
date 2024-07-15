package com.corejava.algorithms;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class FibonacciExercise {

	// Data
	static List<Integer> fiboSeries;
	static int seriesLength;
	
	static List<Integer> getFibonacciSeries(int seriesLength) {
	
		if (seriesLength < 0 || seriesLength == 0) {
		}
		
		fiboSeries = new ArrayList<>(seriesLength);
		
		fiboSeries.add(0);
		fiboSeries.add(1);
		
		int length = seriesLength-2;
		int nextNo;
		
		for(int i=0; i<length; i++) {
			nextNo = fiboSeries.get(i) + fiboSeries.get(i+1);
			fiboSeries.add(nextNo);
		}
		
		System.out.println("Printing the Fibonacci series");
		fiboSeries.stream().forEach(System.out::println);;
		return fiboSeries;
	}
		
	// Get user input
	public static void getUserInput() {
		
		// 1. How long should be the Fibonacci Series
		/*System.out.println("Please enter the length of Fibonacci series you would like ? ");
		
		try {
			Scanner scan = new Scanner(System.in);
			int seriesLength = scan.nextInt();
		}
		catch(InputMismatchException e) {
			System.out.println("Invalid Input Type. Please enter an integer value");
			return;
		}
		catch(NullPointerException e) {
			System.out.println("Null Input. Please enter some value");
			return;
		}
		
		*/
		
		
		// Call method to return the Fibonacci series
		//getFibonacciSeries(fiboSeries, seriesLength);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
