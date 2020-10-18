package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class SixEightTest {
	
	SixEight test = new SixEight(0);
	
	@Test
	public void placeBetPay_44_pay_49() {
		
		int result = test.placeBetPay(44);
		Assert.assertEquals(49, result);
	}
	
	@Test
    public void placeBetPay_minus5__pay_0() {
		
		int result = test.placeBetPay(-5);
		Assert.assertEquals(0, result);
	}
	
	@Test
	public void true_odds_66_result_78() {
		
		int result = test.trueOdds(66);
		Assert.assertEquals(78, result);
	}
	
	@Test
	public void true_odds_minus_fifteen_pay_0() {
		
		int result = test.trueOdds(-15);
		Assert.assertEquals(0, result);
	}
	@Test
	public void darkSide_69_result_55() {
		
		int result = test.darkSideTrueOdds(69);
		Assert.assertEquals(55, result);
	}
	
	@Test
	public void darkSide_minus30_result_0() {
		
		int result = test.darkSideTrueOdds(-30);
		Assert.assertEquals(0, result);
	}

}
