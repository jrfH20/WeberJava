import java.util.Scanner;


public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner question1 = new Scanner (System.in);
		Scanner question2 = new Scanner (System.in);
		Scanner question3 = new Scanner (System.in);
		
		String answer3;
		
	do	
	{	
		System.out.println("TWO Questions!");
		System.out.println();
		System.out.println("Think of an object, and I'll try to guess it.");
		System.out.println();
		System.out.println("animal, vegetable, or mineral?");
		String answer1 = question1.nextLine();
		
		System.out.println("is it bigger than a breadbox?");
		String answer2 = question2.nextLine();

		if (answer1.equalsIgnoreCase("animal") && answer2.equalsIgnoreCase("yes"))
		{
			System.out.println("My guess is that you are thinking of a moose.");
		}
	
		if (answer1.equalsIgnoreCase("animal") && answer2.equalsIgnoreCase("no"))
		{
			System.out.println("My guess is that you are thinking of a mouse.");
		}
	
		if (answer1.equalsIgnoreCase("vegetable") && answer2.equalsIgnoreCase("yes"))
		{
			System.out.println("My guess is that you are thinking of a pumpkin.");
		}
		
		if (answer1.equalsIgnoreCase("vegetable") && answer2.equalsIgnoreCase("no"))
		{
			System.out.println("My guess is that you are thinking of a carrot.");
		}
		
		if (answer1.equalsIgnoreCase("mineral") && answer2.equalsIgnoreCase("no"))
		{
			System.out.println("My guess is that you are thinking of a magnet.");
		}
		
		if (answer1.equalsIgnoreCase("mineral") && answer2.equalsIgnoreCase("yes"))
		{
			int i;
			for (i = 0; i < 10; i++)
				System.out.println("A new car!!!!!");
		}
		System.out.println ();
		System.out.println ("Would you like to play a game again? (Yes/No)");
		answer3 = question3.nextLine();
		
	}	
	
		while (answer3.equalsIgnoreCase("Yes"));	
	}

}
