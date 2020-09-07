package numbers;

import java.util.Scanner;

//The below line of code gets an integer input for the range and forms a right angle triangle 
//for ex: if the range is entered as 5, then the output will be as below
//12345
// 2345
//  345
//   45
//    5
//   45
//  345
// 2345
//12345

public class RightAngleTriangleFormatReflectionTwo {

	public static void main(String[] args) {

		try {
			System.out.println("Enter the Range: ");
			Scanner scan = new Scanner(System.in);
			int input = scan.nextInt();
			if(input<0)
			{
				System.out.println("Range should be greater than 0");
				System.exit(0);
			}
			for (int i = 1; i <= input-1 ; i++) 
			{
				for (int j = 0; j < i; j++) 
				{
					System.out.print(" ");
				}
				for (int j = i; j <= input ; j++)
				{
					System.out.print(j);
				}
				System.out.println();
			}
			for (int i = input; i >=1; i--) 
			{
				for (int j = i; j >=1; j--) 
				{
					System.out.print(" ");
				}
				for (int j = i; j <=input ; j++) 
				{
					System.out.print(j);
				}
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println("Please check the range entered");
		}
	}
}
