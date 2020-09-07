package numbers;

import java.util.Scanner;

//The below line of code gets an integer input for the range and forms a right angle triangle 
//for ex: if the range is entered as 5, then the output will be as below
//1 
//2 6 
//3 7 10 
//4 8 11 13 
//5 9 12 14 15 

public class RightAngleTriangleFormatTen {

	public static void main(String[] args) {

		try {
			System.out.println("Enter the range: ");
			Scanner scan = new Scanner(System.in);
			int input = scan.nextInt();
			int endNum = 0;
			if(input < 1)
			{
				System.out.println("Range should be greater than 0");
				System.exit(0);
			}
			for (int i = 1; i <= input; i++) 
			{
				endNum = i;
				for (int j = 1; j <=i; j++) 
				{
					System.out.print(endNum+" ");
					endNum = endNum+input-j;
				}
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println("Please check the range entered");
		}
	}

}
