package com.corejava.algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PhoneNumberDecoderTest {

	@Test
	void testPhoneNumber1() throws InvalidCharacterException {
		assertEquals(PhoneNumberDecoder.decode("777EFH12JK"), "7773341255");
	}
	
	
	@Test
	void testPhoneNumber2() throws InvalidCharacterException {
		assertEquals(PhoneNumberDecoder.decode("800888TEST"), "8008888378");
	}
	
	@Test
	void testInvalidPhoneNumber() {
		assertThrows(InvalidCharacterException.class, () -> PhoneNumberDecoder.decode("800TEST@!"), "");
	}

	

}
