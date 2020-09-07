package numbers;

import java.util.Scanner;

//The below line of code gets an integer input for the range and forms a right angle triangle 
//for ex: if the range is entered as 5, then the output will be as below
//1 
//1 2 1 
//1 2 3 2 1 
//1 2 3 4 3 2 1 
//1 2 3 4 5 4 3 2 1 

public class RightAngleTriangleFormatSeven {

	public static void main(String[] args) {

		try {
			System.out.println("Enter the range: ");
			Scanner scan = new Scanner(System.in);
			int input = scan.nextInt();
			if(input < 1)
			{
				System.out.println("The range should be greater than 0");
				System.exit(0);
			}
			for (int i = 1; i <= input; i++) 
			{
				for (int j = 1; j <= i ; j++) 
				{
					System.out.print(j+" ");
				}

				for (int j = i-1; j >= 1; j--) 
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
