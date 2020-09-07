package numbers;

import java.util.Scanner;

//The below line of code gets an integer input for the range and forms a right angle triangle 
//for ex: if the range is entered as 5, then the output will be as below
//5 4 3 2 1 
//4 3 2 1 
//3 2 1 
//2 1 
//1

public class RightAngleTriangleFormatThree {

	public static void main(String[] args) {

		try {
			System.out.println("Enter the Range: ");
			Scanner scan = new Scanner(System.in);
			int input = scan.nextInt();
			if(input<1)
			{
				System.out.println("Range should be greater than 0");
				System.exit(0);
			}
			for (int i = input; i >= 1; i--) 
			{
				for (int j = i; j >= 1; j--) 
				{
					System.out.print(j+" ");
				}
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println("Please check the entered Range");
		}
	}

}
