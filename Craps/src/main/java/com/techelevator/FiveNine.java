package com.techelevator;

public class FiveNine extends PossiblePoint{

	public FiveNine(int bet) {
		super(bet);
	}

	@Override
	public int placeBetPay(int bet) {
		
       int pay = 0;
       
       if(bet <= 0) {
    	   return 0;
    	   
       }
		
		if(bet % 5 != 0) {
			int change = bet % 5;
			bet -= change;
			System.out.println("Your bet should be in increments of 5, " + "$" + change + " is your change");
			
		}
		pay = bet * 7 / 5;
		return pay;
		
	}

	@Override
	public int trueOdds(int bet) {
        int pay = 0;
        
        if(bet <= 0) {
        	return 0;
        }
		
		if(bet % 2 != 0) {
			bet --;
			System.out.println("Your bet should be in increments of 2, " + "$" + 1 + " is your change");
			
		}
		pay = bet * 3 / 2;
		return pay;
		
	}
	
	@Override
	public int darkSideTrueOdds(int bet) {
		int pay = 0;
		if(bet <= 0) {
			return 0;
		}
		if(bet % 3 != 0) {
			int change = bet % 3;
			bet -= change;
			System.out.println("Your bet should be in increments of 3, " + "$" + change + " is your change");
		}
		pay = bet * 2 / 3;
		return pay;
	}
	
}
	
	
