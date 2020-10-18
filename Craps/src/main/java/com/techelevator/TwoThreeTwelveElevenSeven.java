package com.techelevator;

public class TwoThreeTwelveElevenSeven {
	
	int bet = 0;
	
	SixEight sixEight = new SixEight(bet);
	FiveNine fiveNine = new FiveNine(bet);
	FourTen fourTen = new FourTen(bet);
	
	
	public void puckOffNoPointMessage(String nonpoint) {
		switch(nonpoint) {
		
		
		case "2": {
			System.out.println("2! Aces! Twice in the rice! Take the line, pay the don't! Double the bubble!"); break;
		}
		
		case "3": {
			System.out.println("3! Ace-deuce! A buck and a duck! Take the line, pay the don't! Single the field!"); break;
			
		}
		case "12": {
			System.out.println("12! Boxcars! All the spots and all the dots! Take the line, bar the don't! Double the field!"); break;
		}
		case "11": {
			System.out.println("Yo! 11! Yo! Take the don't, pay the line, field roll"); break;
			
		}
		case "7": {
			System.out.println("Seven winner! Take the don't, pay the line! Save the odds and pay behind!"); break;
	}

	}
	}
	
	public void puckOnMessage(String nonpoint) {
		switch(nonpoint) {

	case "2":
	System.out.println("2 craps! The eyes! Take Come bet, pay Don't Come, double the field"); break;

	case "3": 
	System.out.println("3 craps! Australian Yo! Take Come bet, pay Don't Come, single the field"); break;

	case "12":
	System.out.println("12 craps! Two lines! Take Come bet, bar Don't Come, double the field"); break;

	case "11":
	System.out.println("11! Yo! Take Don't Come bet, pay Come, single the field"); break;
	}
	}
	
	public void puckOff(String nonpoint, int bet) {
		if(bet <= 0) {
			System.out.println("What game are you playing???");
		}
		else if(nonpoint.equals("2") || nonpoint.equals("12")) {
			System.out.println("$" + twoTwelvePay(bet) + " is your payout"); 
		}
		else if(nonpoint.equals("3") || nonpoint.equals("11")) {
			System.out.println("$" + threeYoPay(bet) + " is your payout"); 
		}
		}
	
	public void puckOn(String nonpoint, int bet) {
		if(bet <= 0) {
			System.out.println("What game are you playing???");
		}
		if(nonpoint.equals("2") || nonpoint.equals("12")) {
			System.out.println("$" + twoTwelvePay(bet) + " is your payout"); 
		}
		else if(nonpoint.equals("3") || nonpoint.equals("11")) {
			System.out.println("$" + threeYoPay(bet) + " is your payout"); 
		}
	}
	
	public void payingDonts(String number, int bet) {
		if(bet <= 0) {
			System.out.println("What game are you playing???");
		}
		if(number.equals("6") || number.equals("8")) {
		System.out.println("$" + sixEight.darkSideTrueOdds(bet) + " is your payout");
		}
		if(number.equals("5") || number.equals("9")) {
			System.out.println("$" + fiveNine.darkSideTrueOdds(bet) + " is your payout");
		}
		if(number.equals("4") || number.equals("10")) {
			System.out.println("$" + fourTen.darkSideTrueOdds(bet) + " is your payout");
		}
	}
	
	public int anySeven(int bet) {
		int pay = 0;
		if(bet <= 0) {
			return 0;
		}
		pay = bet * 4;
		return pay;
	}
	
	public int sevenHop(int bet) {
		int pay = 0;
		if(bet <= 0) {
			return 0;
		}
		if(bet % 3 != 0) {
			int change = bet % 3;
			bet -= change;
			System.out.println("Your bet should be in increments of 3, " + "$" + change + " is your change");
		}
		pay = bet / 3 * 15 - bet * 2 /3;
		return pay;
	}
	
	public void sevenOutMessage(String number) {
		System.out.println("SEVEN OUT! SEVEN! Take the line, pay the don't and last come, pay behind! "
				+ "There was no " + number + ". New dice shooter!");
	}
	
	public void sevenComeOutMessage() {
		System.out.println("SEVEN WINNER! Take the don't, pay the line, save the odds and pay behind!");
	}
	
	public int twoTwelvePay(int bet) {
		int pay = 0;
		if(bet <= 0) {
			return 0;
		}
		pay = bet * 30;
		return pay;
	}
	
	public int threeYoPay(int bet) {
		int pay = 0;
		if(bet <= 0) {
			return 0;
		}
		pay = bet * 15;
		return pay;
	}
	
}
	
	
	