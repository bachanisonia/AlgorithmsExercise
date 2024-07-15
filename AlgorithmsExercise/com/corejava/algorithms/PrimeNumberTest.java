package com.corejava.algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class PrimeNumberTest {

	PrimeNumber primeNumber;
	
	@ParameterizedTest
	@ValueSource(ints = {7, 13, 11, 23})
	void testMultipleValidInputs(int number) {
		assertTrue(primeNumber.isPrime(number));
	}
	
	@BeforeEach
	void init() {
		primeNumber = new PrimeNumber();
	}
	
	@Nested
	@DisplayName("Testing Valid Inputs")
	class TestValidInputs {
	
		@Test
		void testInput1() {
			assertTrue(primeNumber.isPrime(7));
		}
		
		@Test
		void testInput2() {
			assertFalse(primeNumber.isPrime(12));
		}
		
		@Test
		void testInput3() {
			assertTrue(primeNumber.isPrime(97));
		}
		
		@Test
		void testInput4() {
			assertFalse(primeNumber.isPrime(111));
		}

	}
}
