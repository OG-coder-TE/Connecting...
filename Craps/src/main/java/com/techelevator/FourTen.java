package com.techelevator;

public class FourTen extends PossiblePoint {

	public FourTen(int bet) {
		super(bet);
	}

	@Override
	public int placeBetPay(int bet) {
		
		int pay = 0;
		
		if(bet <= 0) {
			return 0;
		}
		if(bet > 0 && bet < 20) {
		    
		    int change = bet % 5;
		    bet -= change;
		    pay = bet * 9 / 5;
		    System.out.println("$" + change + " is your change");
		    
		} if(bet >= 20) {
			int vig = bet / 20;
			pay = bet * 2 - vig;
		}
		return pay;
		
	}

	@Override
	public int trueOdds(int bet) {
		
		int pay = 0;
		if(bet <= 0) {
			return 0;
			
		} pay = bet * 2;
			return pay;
	}

	@Override
	public int darkSideTrueOdds(int bet) {
		int pay = 0;
		if(bet <= 0) {
			return 0;
		} if(bet % 2 != 0) {
			bet --;
			System.out.println("$ " + 1 + " is your change");
	}   pay = bet * 1 / 2;
		return pay;
	
	}
}
