package com.techelevator;

public class PuckOn {
	
	protected int bet;
	
	

	SixEight sixEight = new SixEight(bet);
	FiveNine fiveNine = new FiveNine(bet);
	FourTen fourTen = new FourTen(bet);
	
		
   public void  pointMessage(String pointNumber) {
		
		if(pointNumber.equals("6") || pointNumber.equals("8") || pointNumber.equals("5")) {
			System.out.println(pointNumber +  " no field. The Point is " + pointNumber + " light it up!!!");
	}
		else if(pointNumber.equals("4") || pointNumber.equals("10") || pointNumber.equals("9")) {
		    System.out.println("Mark the " + pointNumber + ", single the field. The point is " + pointNumber + "!!!");
		}
		}
   
   public void nonPointPossiblePointMessage(String rolledNumber) {
	   if(rolledNumber.equals("6") || rolledNumber.equals("8") || rolledNumber.equals("5")) {
		   System.out.println(rolledNumber + " no field, down behind! Dont's and Comes go to " + rolledNumber + "!!!");   
	   }
	   else if(rolledNumber.equals("4") || rolledNumber.equals("10") || rolledNumber.equals("9")){
		   System.out.println(rolledNumber + " field roll, down behind! Donts and Comes go to " + rolledNumber);
	   }
   }
   
   
   
   public void placeBetPay(String rolledNumber, int bet) {
	   if(rolledNumber.equals("6") || rolledNumber.equals("8")) {
		 System.out.println(sixEight.placeBetPay(bet) + " is your pay");
	   }
	   
	   else if(rolledNumber.equals("5") || rolledNumber.equals("9")) {
		   System.out.println(fiveNine.placeBetPay(bet) + " is your pay");
	   }
	   else {
		   System.out.println(fourTen.placeBetPay(bet) + " is your pay");
	   }
	 
   }
   
   
   
   public void trueOddsPay(String rolledNumber, int bet) {
	   
	  
	   if(rolledNumber.equals("6") || rolledNumber.equals("8")) {
			System.out.println("$" + sixEight.trueOdds(bet) + " is your pay");
	   }
	   else if(rolledNumber.equals("5") || rolledNumber.equals("9")) {
			 System.out.println("$" + fiveNine.trueOdds(bet) + " is your pay");
	   }
	   else if(rolledNumber.equals("4") || rolledNumber.equals("10")) {
			 System.out.println("$" + fourTen.trueOdds(bet) + " is your pay");
   }
   }
   
   public void hop(String number, String combination, int bet) {
	   if(number.equals("6") && (combination.equals("2 4") || combination.equals("4 2") || combination.equals("5 1") || combination.equals("1 5"))) {
		   System.out.println("$" + hopEasy(bet) + " is your payout");
	   }
	   else if(number.equals("6") && combination.equals("3 3")) {
		   System.out.println("$" + hopHard(bet) + " is your payout");
	   }
	   else if(number.equals("8") && (combination.equals("5 3") || combination.equals("5 3") || combination.equals("6 2") || combination.equals("2 6"))) {
		   System.out.println("$" + hopEasy(bet) + " is your payout");
	   }
	   else if(number.equals("8") && combination.equals("4 4")) {
		   System.out.println("$" + hopHard(bet) + " is your payout");
	   }
	   else if(number.equals("5") && (combination.equals("4 1") || combination.equals("1 4") || combination.equals("3 2") || combination.equals("2 3"))) {
		   System.out.println("$" + hopEasy(bet) + " is your payout");
	   }
	   else if(number.equals("9") && (combination.equals("5 4") || combination.equals("4 5") || combination.equals("6 3") || combination.equals("3 6"))) {
		   System.out.println("$" + hopEasy(bet) + " is your payout");
	   }
	   else if(number.equals("10") && (combination.equals("6 4") || combination.equals("4 6"))) {
		   System.out.println("$" + hopEasy(bet) + " is your payout");
	   }
	   else if(number.equals("10") && combination.equals("5 5")) {
		   System.out.println("$" + hopHard(bet) + " is your payout");
	   }
	   else if(number.equals("4") && (combination.equals("1 3") || combination.equals("3 1"))) {
		   System.out.println("$" + hopEasy(bet) + " is your payout");
	   }
	   else if(number.equals("4") && combination.equals("2 2")) {
		   System.out.println("$" + hopHard(bet) + " is your payout");
	   }
	   
	   
   }
   
   public int hopEasy(int bet) {
		
		int pay = 0;
		if(bet <= 0) {
			return 0;
		}
		pay = bet * 15;
		return pay;
		
	}
   
   public int hopHard(int bet) {
		
		int pay = 0;
		if(bet <= 0) {
			return 0;
		}
		pay = bet * 30;
		return pay;
		
	}
   
   public void frontLineWinnerMessage(String rolledNumber) {
	   System.out.println(rolledNumber + " WINNER! Take the Don't, pay the line! Shooter, it's your roll again!");
	   }
   
  public void betChoice() {
    System.out.println("[P] for Place bet ");
	System.out.println("[C] for Come bet / no Come bets can exist on the shooter's first point/ ");
	System.out.println("[N] for no bets ");
  }
  
   
   public void endMessage() {
	   System.out.println("======================");
	   System.out.println("THANK YOU FOR PLAYING!");
	   System.out.println("======================");
	   
   } 
   
   }



	

	