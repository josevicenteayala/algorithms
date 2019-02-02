package com.test.solution.jumpheight;

import static org.junit.Assert.*;

import org.junit.Test;

public class JumpHeightTest {

	@Test
	public void testHurdleRace() {
		int initialDose = 5;
		int[] arrayInts = {1,5,7,9,2,4,3};
		int dose = JumpHeight.hurdleRace(initialDose, arrayInts);
		assertTrue("Expected 4 but found "+dose,4 == dose);
	}

	@Test
	public void testHurdleRaceWithSort() {
		int initialDose = 5;
		int[] arrayInts = {1,5,7,9,2,4,3};
		int dose = JumpHeight.hurdleRaceWithSort(initialDose, arrayInts);
		assertTrue("Expected 4 but found "+dose,4 == dose);
	}
	
	@Test
	public void testHurdleRaceWithStream() {
		int initialDose = 5;
		int[] arrayInts = {1,5,7,9,2,4,3};
		int dose = JumpHeight.hurdleRaceWithStream(initialDose, arrayInts);
		assertTrue("Expected 4 but found "+dose,4 == dose);
	}	
}
