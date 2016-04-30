import java.util.InputMismatchException;
import java.util.Scanner;


public class BodyMassIndex {

	public static void main(String[] args) {

		
		
		double weight = 0;
		boolean user_input_right = false;
		boolean user_input_right2 = false;
		double height = 0;
		
		System.out.print("Enter height in inches:");
		while (!user_input_right){
			try{Scanner kb = new Scanner(System.in);	
				height = kb.nextDouble();
				if (height>0){user_input_right = true;}
				else {System.out.println("Invalid inches value. Must be positive.");
				System.out.print("Re-enter height in inches:");}}
			catch (InputMismatchException e)
			{System.out.println("Invalid inches value. Must be a decimal number.");
			System.out.print("Re-enter height in inches:");}}
			 
		
		System.out.print("What is your weight?");
		while (!user_input_right2){	
			try{Scanner kb = new Scanner(System.in);	
				weight = kb.nextDouble();
				if (weight>0){user_input_right2 = true;}
				else {System.out.println("Invalid pounds value. Must be positive.");
				System.out.print("Re-enter weight in pounds:");}}
			catch (InputMismatchException e)
				{System.out.println("Invalid pounds value. Must be a decimal number.");
				System.out.print("Re-enter weight in pounds:");}}
			
		System.out.println("height= "+height+"\"");
		System.out.println("weight= "+weight+" pounds");
		
		
		double partTwo = (height *height);
		double Bmi = (weight)/(partTwo)*703;
		System.out.print("body mass index= ");
		System.out.printf("%.1f\n", Bmi);
				

	}}
