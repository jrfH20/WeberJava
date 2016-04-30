package assign10;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class Assign10 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		System.out.println("Would you like to encrypt or decrypt a file?");
		Scanner kb = new Scanner(System.in);
		String enOrdec = kb.nextLine();
		
		
		while (!enOrdec.equalsIgnoreCase("encrypt")&&!enOrdec.equalsIgnoreCase("decrypt"))
			{
				System.out.println(("Sorry, \"")+enOrdec+("\" is not a valid entry."));
				System.out.println("Would you like to encrypt or decrypt a file?");
				enOrdec = kb.nextLine();
			}
		
		System.out.println("Please enter file name.");
		String pathFile = kb.nextLine();
		//I used C:\\Users\\ZTferg385\\Desktop\\Java output\\myFirstFile2.txt
		Scanner inFile = new Scanner(Paths.get(""+pathFile+""));
		String line = null;
		
		if (enOrdec.equalsIgnoreCase("encrypt")){
			PrintWriter fileo = new PrintWriter("C:\\Users\\ZTferg385\\Desktop\\Java output\\Encrypted.txt");
			if (enOrdec.equalsIgnoreCase("encrypt")){
			
				do{
						line = inFile.nextLine();
						
						for (int i = 0;line.length()>i;i++)
						{
						char ch = line.charAt(i);
						if (ch >= 'A' && ch < 'Z') ch++;
						else if (ch == 'Z') ch = 'A';
						else if (ch >= 'a' && ch < 'z') ch++;
						else if (ch == 'z') ch = 'a';
						
						fileo.print(ch);
						
						}
						fileo.println();
				}
				while(inFile.hasNextLine());}
						fileo.close();}

		
		if (enOrdec.equalsIgnoreCase("decrypt")){
			PrintWriter fileo = new PrintWriter("C:\\Users\\ZTferg385\\Desktop\\Java output\\Decrypted.txt");	
			if (enOrdec.equalsIgnoreCase("decrypt")){
			do{
					line = inFile.nextLine();
					
					for (int i = 0;line.length()>i;i++)
					{
					char ch = line.charAt(i);
					if (ch == 'A') ch = 'Z';
					else if (ch == 'a') ch = 'z';
					else if (ch >= 'A' && ch <= 'Z') ch--;
					else if (ch >= 'a' && ch <= 'z') ch--;
					fileo.print(ch);
					
					}fileo.println();}
			
				while(inFile.hasNextLine());}
					fileo.close();}
	}

}
