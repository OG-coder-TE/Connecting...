package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class FourTenTest {

	FourTen test = new FourTen(0);
	
	@Test
	public void placeBetPay_12_pay_18() {
		
		int result = test.placeBetPay(12);
		Assert.assertEquals(18, result);
	}
	
	@Test
    public void placeBetPay_45__pay_88() {
		
		int result = test.placeBetPay(45);
		Assert.assertEquals(88, result);
	}
	
	@Test
	public void true_odds_66_pay_112() {
		
		int result = test.trueOdds(66);
		Assert.assertEquals(132, result);
	}
	
	@Test
	public void true_odds_minus_30_pay_0() {
		
		int result = test.trueOdds(-30);
		Assert.assertEquals(0, result);
	}
	@Test
	public void darkSide_89_result_44() {
		
		int result = test.darkSideTrueOdds(89);
		Assert.assertEquals(44, result);
	}
	
	@Test
	public void darkSide_minus50_result_0() {
		
		int result = test.darkSideTrueOdds(-50);
		Assert.assertEquals(0, result);
	}

}


