package com.corejava.algorithms;

public class PrimeNumber {
	
	private int n = 2;
	
	public boolean isPrime(int no) {
		
		if (no == 2) { 
			return true;
		}
		
		if (no == 1) {
			return false;
		}
		
		if (no <= 0) {
			System.out.println("Invalid Input. Please enter a positive no");
			return false;
		}
		
		if (no == n) {
			return true;
		}
		
		if (no%n == 0) {
			return false;
		}
	
		n++;
		
		return isPrime(no);
	}

}
