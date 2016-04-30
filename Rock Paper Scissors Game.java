package practice;

import java.util.*;

public class Oneten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input_keyboard = new Scanner (System.in);
		
		System.out.println("Welcome to Rock, Paper, Scissors!");
		int number_games;
		int compchoice;//0-rock, 1-paper, 2-scissors
		int playerWins = 0;
		int compWins = 0;
		String user, compnew = null;
		Random r = new Random();
		
		System.out.println("Please enter the number of rounds you would like to play:");
		number_games = input_keyboard.nextInt();
		
		while (number_games%2==0)
			{
				System.out.println("Sorry, you need to enter an odd number. Please try again:");
				number_games = input_keyboard.nextInt();	
			}
		
		while ((playerWins+compWins)<number_games)
			{
				System.out.println("Rock, Paper, Scissors?");
				user = input_keyboard.next();
				while (!user.equalsIgnoreCase("Rock")&&!user.equalsIgnoreCase("Paper")&&!user.equalsIgnoreCase("Scissors"))
					{			
						System.out.println(("Sorry, \"")+user+("\" is not a valid entry."));
						System.out.println("Rock, Paper, Scissors?:");
						user = input_keyboard.next();
					}	
				compchoice = r.nextInt(3);
				
				if (compchoice==0) 
						{System.out.println("Computer chooses Rock.");
						compnew = "Rock";}
												
				if (compchoice==1) 
						{System.out.println("Computer chooses Paper.");
						compnew = "Paper";}
									
				if (compchoice==2) 
						{System.out.println("Computer chooses Scissors.");
						compnew = "Scissors";}
						
				if (compnew.equalsIgnoreCase("rock") && user.equalsIgnoreCase("rock"))
						System.out.println("It's a tie.");
				
				if (compnew.equalsIgnoreCase("paper") && user.equalsIgnoreCase("paper"))
						System.out.println("It's a tie.");
				
				if (compnew.equalsIgnoreCase("scissors") && user.equalsIgnoreCase("scissors"))
						System.out.println("It's a tie.");
								
				if (user.equalsIgnoreCase("rock") && compchoice==2)
						{System.out.println("You Win.");
						playerWins++;}
							
				if (user.equalsIgnoreCase("paper") && compchoice==0)
						{System.out.println("You Win.");
						playerWins++;}
										
				if (user.equalsIgnoreCase("scissors") && compchoice==1)
						{System.out.println("You Win.");
						playerWins++;}
				
				if (user.equalsIgnoreCase("rock") && compchoice==1)
						{System.out.println("You Lose.");
						compWins++;}
					
				if (user.equalsIgnoreCase("paper") && compchoice==2)
						{System.out.println("You Lose.");
						compWins++;}
				
				if (user.equalsIgnoreCase("scissors") && compchoice==0)
						{System.out.println("You Lose.");
						compWins++;}
							
			}						
			System.out.println();
			System.out.println("User wins: "+playerWins);
			System.out.println("Computer wins: "+compWins);
			
			if (playerWins>compWins)
			{System.out.println("User wins the game!");}
			else {System.out.println("Computer wins the game!");}
}}