package com.techelevator;


public abstract class PossiblePoint {
	
	
    public int bet;
	
	
	public PossiblePoint (int bet) {
		this.bet = bet;
	}
	

	
	public abstract int placeBetPay(int bet); 
	
	public abstract int trueOdds(int bet);
	
	public abstract int darkSideTrueOdds(int bet);
	
	
}


