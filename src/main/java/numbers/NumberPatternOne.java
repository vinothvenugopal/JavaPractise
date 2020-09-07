package numbers;

import java.util.Scanner;

//The below line of code gets an integer input for the range and forms a Isosceles triangle 
//for ex: if the range is entered as 3, then the output will be as below
//11111
//11122
//11333
//14444
//55555


public class NumberPatternOne {

	public static void main(String[] args) {

		try {
			System.out.println("Enter the Range: ");
			Scanner scan = new Scanner(System.in);
			int input = scan.nextInt();
			if(input < 1)
			{
				System.out.println("Range should be greater than 0");
				System.exit(0);
			}
			for (int i = 1; i <= input; i++) 
			{
				for (int j = 1; j <= input-i; j++) 
				{
					System.out.print(1);
				}
				for (int j = 1; j <= i; j++) 
				{
					System.out.print(i);
				}
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println("Please check the range entered");
		}
	}
}

