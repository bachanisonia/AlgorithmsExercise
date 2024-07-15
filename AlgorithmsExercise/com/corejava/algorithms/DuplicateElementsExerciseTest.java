package com.corejava.algorithms;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class DuplicateElementsExerciseTest {

	@Test
	void test1() {
		assertEquals(DuplicateElementsExercise.removeDuplicate(Arrays.asList(1,2,3,1,2)), Arrays.asList(1,2,3));
	}

}
