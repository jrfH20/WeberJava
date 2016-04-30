import java.util.Scanner;


public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the month you were born:");
		
		String Month = input.next();
		
		System.out.println("Enter the day you were born:");
		
		int Day = input.nextInt();
		
		System.out.println("Enter the year you were born:");
		
		int Year = input.nextInt();
		
		int retire = (Year+65);
		
		System.out.println("You will be 65 on "+ Month+" "+Day+", "+retire);		
		}

}
