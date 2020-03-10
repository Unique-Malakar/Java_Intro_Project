package studentCode;

import java.util.Scanner;

public class MaxOfTwoV1 {

	public static void main(String[] args) {

		int one, two;
		Scanner myScanner = new Scanner(System.in);

		one = myScanner.nextInt();
		two = myScanner.nextInt();

		if(one > two)

			System.out.println(one + " is greater than "+two);

		else if(two>=one)
			System.out.println(two+" is greater than or equal to "+ one);	

		myScanner.close();
	}


}
