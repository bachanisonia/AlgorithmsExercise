package com.corejava.algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ReverseWordsExerciseTest {

	@ParameterizedTest
	@ValueSource(strings = {"This is a girl", "How are you", "Ah, what a lovely day"})
	void test(String inputString) {
		
		if(inputString.equals("This is a girl")) {
			assertEquals(ReverseWordsExercise.getReversedSentence(inputString), "girl a is This");
		}
		
		if(inputString.equals("How are you")) {
			assertEquals(ReverseWordsExercise.getReversedSentence(inputString), "you are How");
		}
		
		if(inputString.equals("Ah, what a lovely day")) {
			assertEquals(ReverseWordsExercise.getReversedSentence(inputString), "day lovely a what ,Ah");
		}
		
	}

}
