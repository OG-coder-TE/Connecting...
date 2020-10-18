package com.techelevator;

import java.util.Scanner;

public class Display {
	
	Scanner userInput = new Scanner(System.in);
	String pointNumber = "";
	String firstRoll = "";
	TwoThreeTwelveElevenSeven tttes = new TwoThreeTwelveElevenSeven();
	PuckOn puckon = new PuckOn();
	
	
	public void appLaunch() {
		
		System.out.println("================================================================");
		System.out.println("                WELCOME TO THE VIRTUAL CRAPS GAME!!!    ");
		System.out.println("=================================================================");
		System.out.println();
	    System.out.println("\"general guidance of actions and payouts\"");
		System.out.println();
		System.out.println("####################################################################");
		
		boolean pointEstablished = false;
		
		while(!pointEstablished) {
			System.out.println();
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");	
		System.out.println("COME OUT roll!!! Make your bets! Line and Center Action!");
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println();
		System.out.println("Enter the number that rolled: ");
		firstRoll = userInput.nextLine();
		
		if(firstRoll.equals("2") || firstRoll.equals("3") || firstRoll.equals("11") || firstRoll.equals("12")) {
		comeOutRollHornNumbers();
		pointEstablished = false;		
		}
		else if(firstRoll.equals("7")) {
			tttes.sevenComeOutMessage();
			sevenComeOut();
			
		pointEstablished = false;	
		}
		else if(firstRoll.equals("4") || firstRoll.equals("10") || firstRoll.equals("5") || firstRoll.equals("9") ||
				firstRoll.equals("6") || firstRoll.equals("8")) {
			establishingPoint();	
		}	
		}		
	}
	
	public void comeOutRollHornNumbers() {
		
		   tttes.puckOffNoPointMessage(firstRoll);
		
		   System.out.println("Did you hop number " + firstRoll + "? [Y] [N]");
		   String yesNo = userInput.nextLine();
		   if(yesNo.toUpperCase().equals("Y")) {
			   
			   System.out.println("How much did you bet? ");
			   String betString = userInput.nextLine();
			   int bet = Integer.parseInt(betString);
			   
			   tttes.puckOff(firstRoll, bet);
		   }
	}
	
	public void sevenComeOut() {
		boolean dont = true;
		while(dont) {
		System.out.println("Did you have Don't(s)? [Y] [N] /no Don't Come bets can exist on the shooter's first point or more than 1 Seven on ComeOut roll/");
		String yesNo = userInput.nextLine();
		
		if(yesNo.toUpperCase().equals("N")) {
			dont = false;
		}
		
		if(yesNo.toUpperCase().equals("Y")) {
			System.out.println("Don't(s) pay 1:1. If you laid odds, please enter the number that had Don't Come bet: ");
			String number = userInput.nextLine();
			System.out.println("How much were the odds? ");
			String betString = userInput.nextLine();
			int bet = Integer.parseInt(betString);
			
			tttes.payingDonts(number, bet);
		}
		}
		sevenHopOrAnySeven();
	}
	
	public void sevenHopOrAnySeven() {
		System.out.println("Did you have 'Any Seven' [A] or did you 'Hop Sevens' [H]? (press any key if you din't bet any of those) ");
		String yesNo = userInput.nextLine();
		if(yesNo.toUpperCase().equals("A")) {
			System.out.println("How much did you bet? ");
			String betS = userInput.nextLine();
			int bet = Integer.parseInt(betS);
			System.out.println("$" + tttes.anySeven(bet) + " is your payout!");
		}
		if(yesNo.toUpperCase().equals("H")) {
			System.out.println("How much did you bet on 'Hop Sevens'? ");
			String hopString = userInput.nextLine();
			int bet = Integer.parseInt(hopString);
			System.out.println("$" + tttes.sevenHop(bet) +  " is your payout");			
		}		
		}
	
	public void establishingPoint() {
		
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		
		puckon.pointMessage(firstRoll);
		pointNumber = firstRoll;
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		System.out.println();
		System.out.println("Did you have a working Place Bet or working  Come bet's odds on number " + pointNumber + " ?");
		System.out.println();
		
        puckon.betChoice();
		String workingBet = userInput.nextLine();
		
		if(workingBet.toUpperCase().equals("P")) {
		  System.out.println("How much was your bet? ");
		  String betString = userInput.nextLine();
		  int bet = Integer.parseInt(betString);
		  
		  puckon.placeBetPay(pointNumber, bet);
		}
		else if(workingBet.toUpperCase().equals("C")) {
			System.out.println("Come bet pays 1:1. How much did you bet on your odds? ");
			String betString = userInput.nextLine();
			int bet = Integer.parseInt(betString);
			
			puckon.trueOddsPay(pointNumber, bet);
		}
		 System.out.println("Did you hop " + pointNumber + "? [Y] [N]");
		   String yesNo = userInput.nextLine();
		   if(yesNo.toUpperCase().equals("Y")) {
			   System.out.println("How much did you bet on that dice combination? ");
			   String betString = userInput.nextLine();
			   System.out.println("Enter the dice combination that just rolled, space-delimited: ");
			   String combination = userInput.nextLine();
			   int bet = Integer.parseInt(betString);
			   puckon.hop(pointNumber, combination, bet);
		   }
		
		mainPlay();		
	}
	
	public void mainPlay() {
		
		boolean pointOrSeven = false;
		
		while(!pointOrSeven) {
	
		System.out.println("Enter the number that rolled: ");
		String rolledNumber = userInput.nextLine();
		System.out.println();
		
		puckon.nonPointPossiblePointMessage(rolledNumber);
		
		if(!rolledNumber.equals(pointNumber) && (rolledNumber.equals("4") || rolledNumber.equals("10") || rolledNumber.equals("5") ||
				rolledNumber.equals("9") || rolledNumber.equals("6") || rolledNumber.equals("8"))) {
		
		   puckon.betChoice();
		   String workingBet = userInput.nextLine();
		
		
		   if(workingBet.toUpperCase().equals("P")) {
			  System.out.println("How much was your bet? ");
	          String betString = userInput.nextLine();
		      int bet = Integer.parseInt(betString);
		 
			  puckon.placeBetPay(rolledNumber, bet);
		      }
		    else if(workingBet.toUpperCase().equals("C")) {
		        System.out.println("Come bet pay 1:1. How much did you bet on your odds? ");
		        String betString = userInput.nextLine();
			    int bet = Integer.parseInt(betString);
			 
				puckon.trueOddsPay(rolledNumber, bet);
				
			   }
		   System.out.println("Did you hop " + rolledNumber + "? [Y] [N]");
		   String yesNo = userInput.nextLine();
		   if(yesNo.toUpperCase().equals("Y")) {
			   System.out.println("How much did you bet on that dice combination? ");
			   String betString = userInput.nextLine();
			   System.out.println("Enter the dice combination that just rolled, space-delimited: ");
			   String combination = userInput.nextLine();
			   int bet = Integer.parseInt(betString);
			   puckon.hop(rolledNumber, combination, bet);
		   }
		   pointOrSeven = false;
		}
		
		else if(rolledNumber.equals("2") || rolledNumber.equals("3") || rolledNumber.equals("12") || rolledNumber.equals("11")) {
			tttes.puckOnMessage(rolledNumber);
			
			System.out.println("Did you bet on " + rolledNumber + " in Center Action? [Y] [N]");
			String yesNo = userInput.nextLine();
			
			if(yesNo.toUpperCase().equals("Y")) {
				
				System.out.println("How much did you bet?");
				String betString = userInput.nextLine();
				int bet = Integer.parseInt(betString);
				
			tttes.puckOn(rolledNumber, bet);
			}
	
			pointOrSeven = false;
		}
		else if(rolledNumber.equals(pointNumber)) {
			System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
			puckon.frontLineWinnerMessage(pointNumber);
			System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
			System.out.println();
			
			System.out.println("Pass line pays 1:1. How much did you bet on your odds? ");
			String betString = userInput.nextLine();
			int bet = Integer.parseInt(betString);
			puckon.trueOddsPay(pointNumber, bet);
			System.out.println("Did you hop " + rolledNumber + "? [Y] [N]");
			   String yesNo = userInput.nextLine();
			   if(yesNo.toUpperCase().equals("Y")) {
				   System.out.println("How much did you bet on that dice combination? ");
				   String betS = userInput.nextLine();
				   System.out.println("Enter the dice combination that just rolled, space-delimited: ");
				   String combination = userInput.nextLine();
				   int betI = Integer.parseInt(betS);
				   puckon.hop(rolledNumber, combination, betI);
			   }
			System.exit(0);
		}
		else if(rolledNumber.equals("7")) {
			System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
			tttes.sevenOutMessage(pointNumber);
			System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
			System.out.println();
			
			System.out.println("Did you bet on Don't Pass? [Y] [N]");
			String dontPass = userInput.nextLine();
			
			if(dontPass.toUpperCase().equals("Y")) {
			  System.out.println("Don't Pass pays 1:1. How much were your odds? ");
			  
				  String betString = userInput.nextLine();
				  int bet = Integer.parseInt(betString);
				  tttes.payingDonts(pointNumber, bet);
				  
			  }
			boolean dontCome = true;
			while(dontCome) {
			System.out.println("Did you have Don't Come(s)? [Y] [N]");
			String yesNo = userInput.nextLine();
			if(yesNo.toUpperCase().equals("Y")) {
				System.out.println("What number had Don't Come? ");
				
				String number = userInput.nextLine();
				System.out.println("Don't come pays 1:1. How much were your odds on " + number + "? ");
				String betString = userInput.nextLine();
				int bet = Integer.parseInt(betString);
				tttes.payingDonts(number, bet);
				dontCome = true;
				}
			else {
				dontCome = false;
				}
			}
			
			sevenHopOrAnySeven();
			puckon.endMessage();
			System.exit(0);
			
		} 
	}
	}
	
	
	}

