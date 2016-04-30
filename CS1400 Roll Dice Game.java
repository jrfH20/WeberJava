import java.util.Random;
import java.util.Scanner;


public class RollDice{
	public void LetsRoll(){
	System.out.println("Welcome to the dice throwing simulator!");
	System.out.print("How many dice rolls would you like to simulate? ");
	Scanner kb = new Scanner(System.in);
	int numberRolls = kb.nextInt();
	int intPosition = 2;	
	//String[] dicey = new String[12];
	String[] dicey =
		{"","","","","","","","","","","",""};
	
	Random rndm = new Random();
	
	for (int i=0; i<numberRolls; i++)
	{
	int dice1 = rndm.nextInt(6)+1;
	int dice2 = rndm.nextInt(6)+1;
	int diceTotal = (dice1+dice2)-1;
	dicey[diceTotal] = dicey[diceTotal]+"*";
	}
	
	System.out.println("DICE ROLLING SIMULATION RESULTS");
	System.out.println("Each \"*\" represents each roll.");
	System.out.println("Total number of rolls = "+numberRolls);
	//below prints the array
		for(int i=1; i<dicey.length; i++)
			{
				System.out.println(intPosition+": "+dicey[i]);
				intPosition++;
			}
}
}
