package numbers;

import java.util.Scanner;

//The below line of code gets an integer input for the range and forms a Isosceles triangle 
//for ex: if the range is entered as 3, then the output will be as below
//1 
//1 2 
//1 2 3 
//1 2 
//1 

public class IsoscelesTriangleFormat {

	public static void main(String[] args) {

		try {
			int reverseRange = 0;
			System.out.println("Enter the Range : ");
			Scanner scan = new Scanner(System.in);
			int input = scan.nextInt();
			if(input < 1)
			{
				System.out.println("Enter a range greater than 1");
				System.exit(0);
			}
			for (int i = 1; i <= input; i++) 
			{
				for (int j = 1; j <= i; j++) 
				{
					System.out.print(j+" ");
				}
				System.out.println();
				reverseRange = i;
			}

			for (int i = reverseRange; i >= 1 ; i--) 
			{
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
