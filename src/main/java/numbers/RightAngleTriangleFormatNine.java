package numbers;

import java.util.Scanner;

//The below line of code gets an integer input for the range and forms a right angle triangle 
//for ex: if the range is entered as 5, then the output will be as below
//1
//10
//101
//1010
//10101
//101010
//1010101

public class RightAngleTriangleFormatNine {

	public static void main(String[] args) {
		try {
			String one = "1";
			String zero = "0";
			String output = "";

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
				if(i%2 > 0)
				{
					output = output+one;
					System.out.print(output);
				}
				else
				{
					output = output+zero;
					System.out.print(output);
				}
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println("Please check the range entered");
		}
	}

}
