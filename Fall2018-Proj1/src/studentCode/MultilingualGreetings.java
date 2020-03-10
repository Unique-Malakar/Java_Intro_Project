package studentCode;

import java.util.Scanner;

public class MultilingualGreetings {
	private static String greetingString;
	

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
	
		System.out.println(" 1) English   2) Espanol   3) Francais: ");
		
		
		//Based on the language selected above, set the greetingString 
		//  variable in that language.
		int num= myScanner.nextInt();
		
		
		if(num == 1)
		{
			greetingString = "Hello World!";
			
		}
		else if (num ==2)
			greetingString = "Hola Mundo!";
			
		else if (num ==3)
			greetingString = "Bonjour le Monde!";
			
		else
			greetingString = "###########";
		
		
		System.out.println(greetingString);
		
		myScanner.close();
	}
}
