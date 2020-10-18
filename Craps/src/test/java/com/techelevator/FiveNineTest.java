package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class FiveNineTest {
	
	FiveNine test = new FiveNine(0);
	
	@Test
	public void placeBetPay_90_pay_126() {
		
		int result = test.placeBetPay(90);
		Assert.assertEquals(126, result);
	}
	
	@Test
    public void placeBetPay_minus70__pay_0() {
		
		int result = test.placeBetPay(-70);
		Assert.assertEquals(0, result);
	}
	
	@Test
	public void true_odds_31_result_45() {
		
		int result = test.trueOdds(31);
		Assert.assertEquals(45, result);
	}
	
	@Test
	public void true_odds_minus_10_result_0() {
		
		int result = test.trueOdds(-10);
		Assert.assertEquals(0, result);
	}
	@Test
	public void darkSide_105_result_70() {
		
		int result = test.darkSideTrueOdds(105);
		Assert.assertEquals(70, result);
	}
	
	@Test
	public void darkSide_minus30_result_0() {
		
		int result = test.darkSideTrueOdds(-30);
		Assert.assertEquals(0, result);
	}

}



