package studentCode;
import java.util.Scanner;


public class CryptoQuiz {
	
	static int NUM_BITS1 = 80, NUM_BITS2 = 128, NUM_BITS3 = 168;
	static String CRYPT1 = "Skipjack", CRYPT2 = "Rijndael", CRYPT3 = "TripleDES";



	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);


		
		System.out.print("Enter 1 to guess a cryptographic system, 2 to guess how many BITs: ");
		int num = myScanner.nextInt();


		if(num == 1)
		{
			System.out.print("Choose number of BITs:");
			int num1=myScanner.nextInt();




			if(num1==NUM_BITS1 || num1==NUM_BITS2 || num1==NUM_BITS3)
			{
				System.out.print("Which cryptographic system uses "+ num1 +" BITs? ");
				String word= myScanner.next();

				if(word.equalsIgnoreCase(CRYPT1) && num1==NUM_BITS1 || 
						word.equalsIgnoreCase(CRYPT2) && num1==NUM_BITS2||
						word.equalsIgnoreCase(CRYPT3) && num1==NUM_BITS3 )
				{
					System.out.println("Correct!");
				}
				else
					System.out.println("Incorrect!");

			}
			else
			{
				System.out.println("Invalid choice.");
			}
		}

		else if(num ==2)
		{
			System.out.print("Choose a cryptographic system: ");
			String word1=myScanner.next();
			
			if(word1.equalsIgnoreCase(CRYPT1) || word1.equalsIgnoreCase(CRYPT2)
					|| word1.equalsIgnoreCase(CRYPT3))
			{
				System.out.print("How many BITs used in a " +word1+" system? ");
				int num2 = myScanner.nextInt();
				
				if(word1.equalsIgnoreCase(CRYPT1) && num2==NUM_BITS1 || 
						word1.equalsIgnoreCase(CRYPT2) && num2==NUM_BITS2||
						word1.equalsIgnoreCase(CRYPT3) && num2==NUM_BITS3)
				{
					System.out.println("Correct!");
				}
				else
					System.out.println("Incorrect!" );
				
			}
			else
			{
				System.out.println("Invalid choice.");
			}
			
		}

			
			
		

		

		myScanner.close();
	}
}
