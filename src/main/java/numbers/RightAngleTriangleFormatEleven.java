package numbers;

import java.util.Scanner;

//The below line of code gets an integer input for the range and forms a pattern as below
//for ex: if the range is entered as 5, then the output will be as below
//1 
//2 3 
//4 5 6 
//7 8 9 10 
//11 12 13 14 15 

public class RightAngleTriangleFormatEleven {

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
			int nextNum=1;
			for (int i = 1; i <= input; i++) 
			{
				for (int j = 1; j <= i; j++) 
				{
					System.out.print(nextNum+" ");
					nextNum++;
				}
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println("Please check the range entered");
		}
	}

}
