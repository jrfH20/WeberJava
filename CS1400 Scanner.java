import java.util.Scanner;

public class scannerTest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input_from_keyboard =  new Scanner (System.in);
		
		System.out.println("Would you like to play a game?");
		
		String answer;
		
		answer = input_from_keyboard.nextLine();
		
		if(answer.equalsIgnoreCase("Yes"));
			
	}
}
