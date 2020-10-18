package com.techelevator;

public class SixEight extends PossiblePoint{
	
	
	public SixEight(int bet) {
		super(bet);
	}
	
	public int placeBetPay(int bet) {
		
		
		int pay = 0;
		
		if(bet <= 0) {
			return 0;
		}

		if(bet > 0 && bet % 6 != 0) {
			int change = bet % 6;
			bet -= change;
			System.out.println("Your bet should be in increments of 6, " + "$" + change + " is your change");
			
		}
		pay = bet * 7 / 6;
		return pay;
}
	
	
	
	public int  trueOdds(int bet) {
         int pay = 0;
         
         if(bet <= 0) {
        	 return 0;
         }
		
         else if(bet % 5 != 0) {
			int change = bet % 5;
			bet -= change;
			System.out.println("Your bet should be in increments of 5, " + "$" + change + " is your change");
			
		}
		pay = bet * 6 / 5;
		return pay;
}
		

	public int darkSideTrueOdds(int bet) {
		int pay = 0;
		if(bet <= 0) {
			return 0;
		}
		if(bet % 6 != 0) {
			int change = bet % 6;
			bet -= change;
			System.out.println("Your bet should be in increments of 6, " + "$" + change + " is your change");
		}
		pay = bet * 5 / 6;
		return pay;
	}
}
