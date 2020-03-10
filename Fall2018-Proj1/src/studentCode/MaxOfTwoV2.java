package studentCode;

import java.util.Scanner;

public class MaxOfTwoV2 {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		
		//YOUR CODE IN HERE

		int one, two;
		//System.out.println("Enter the First Number: ");
		one = myScanner.nextInt();
		
		//System.out.println("Enter the Second Number: ");
		two = myScanner.nextInt();
		
		if(one > two)
		
			System.out.println(one+" is greater than "+two);
		
		else if (two > one) 
			System.out.println(two+" is greater than "+ one);
		
		else
		
			System.out.println(one+" is equal to "+ two);
		
		//YOUR CODE IN HERE
		
		
		myScanner.close();
	}
	
	
}
