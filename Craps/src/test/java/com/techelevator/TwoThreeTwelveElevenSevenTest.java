package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class TwoThreeTwelveElevenSevenTest {
	
	TwoThreeTwelveElevenSeven test = new TwoThreeTwelveElevenSeven();
	
	@Test
	public void any_Seven_for_4_should_result_16() {
		
		int result = test.anySeven(4);
		Assert.assertEquals(16, result);
	}
	
	@Test
	public void any_Seven_for_minus10_should_result_0() {
		
		int result = test.anySeven(-10);
		Assert.assertEquals(0, result);
	}
	
	@Test
	public void seven_hop_for_35_2_change_143_pay() {
		
		int result = test.sevenHop(35);
		Assert.assertEquals(143, result);
	}
	
	@Test
    public void seven_hop_for_12_pay_52() {
		
		int result = test.sevenHop(12);
		Assert.assertEquals(52, result);
	}
	
	@Test
    public void two_twelve_hop_for_15_result_450() {
		
		int result = test.twoTwelvePay(15);
		Assert.assertEquals(450, result);
	}
	
	@Test
    public void two_twelve_hop_for_minus_three_result_450() {
		
		int result = test.twoTwelvePay(-3);
		Assert.assertEquals(0, result);
	}
	
	@Test
    public void three_Yo_hop_for_12_result_180() {
		
		int result = test.threeYoPay(12);
		Assert.assertEquals(180, result);
	}
	
	@Test
    public void three_Yo_hop_for_0_result_180() {
		
		int result = test.threeYoPay(0);
		Assert.assertEquals(0, result);
	}


}

