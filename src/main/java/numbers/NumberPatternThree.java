package numbers;

import java.util.Scanner;

//The below line of code gets an integer input for the range and forms a pattern as below
//for ex: if the range is entered as 5, then the output will be as below
//1 2 3 4 5 
//2 3 4 5 1 
//3 4 5 1 2 
//4 5 1 2 3 
//5 1 2 3 4 

public class NumberPatternThree {

	public static void main(String[] args) {

		try {
			System.out.println("Enter the range: ");
			Scanner scan = new Scanner(System.in);
			int input = scan.nextInt();
			int endNum = 0, startNum = 0;
			if(input < 1)
			{
				System.out.println("Range should be greater than 0");
				System.exit(0);
			}
			for (int i = 1; i < input+1; i++) 
			{
				for (int j = i; j < input+1; j++) 
				{
					System.out.print(j+" ");
				}
				for (int j = 1; j < i; j++) 
				{
					System.out.print(j+" ");
				}
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println("Please check the range entered");
		}

	}
}
