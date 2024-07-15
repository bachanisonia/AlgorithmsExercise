package com.corejava.algorithms;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class FibonacciExerciseTest {

	/*
	@BeforeEach
	void getUserInput() {
		System.out.println("Enter the Fibonacci series length you would like : ");
	}*/
	
	@Nested
	@DisplayName("Testing Invalid Scenarios")
	class InvalidTestCases {
		
		@Test
		@DisplayName("Blank Input")
		void testBlankInput() {
			//FibonacciExercise.getFibonacciSeries(-1);
		}
		
		@Test
		@DisplayName("Zero Input")
		void testZeroInput() {
			
		}
		
		@Test
		@DisplayName("Invalid Char Input")
		void testInvalidCharInput() {
			
		}
	}
	
	@Nested
	@DisplayName("Testing Valid scenarios")
	class ValidTestCases {
		
		@Test
		@DisplayName("Testing length as 10")
		void testInput1() {
			assertEquals(FibonacciExercise.getFibonacciSeries(10), Arrays.asList(0,1,1,2,3,5,8,13,21,34));
		}
		
		@Test
		@DisplayName("Testing length as 20")
		void testInput2() {
			assertEquals(FibonacciExercise.getFibonacciSeries(20), Arrays.asList(0,1,1,2,3,5,8,13,21,34,55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181));
		}
	}
	

}
