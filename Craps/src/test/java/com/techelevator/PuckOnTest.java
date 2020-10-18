package com.techelevator;

import org.junit.Assert;
import org.junit.Test;



public class PuckOnTest {

	
	PuckOn test = new PuckOn();
	
	@Test
	public void hop_5_1_for_10_should_result_150() {
		
		int easy = test.hopEasy(10);
		Assert.assertEquals(150, easy);
	}
	
	@Test
    public void hop_3_2_for_minus5_should_result_0() {
		
		int easy = test.hopEasy(-5);
		Assert.assertEquals(0, easy);
}
	@Test
    public void hop_3_3_for_7_should_result_210() {
		
		int hard = test.hopHard(7);
		Assert.assertEquals(210, hard);
	}
	
	@Test
    public void hop_4_4_for_0_should_result_150() {
		
		int hard = test.hopHard(0);
		Assert.assertEquals(0, hard);
}
}
