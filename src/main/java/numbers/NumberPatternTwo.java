package numbers;

import java.util.Scanner;

//incomplete

public class NumberPatternTwo {

	public static void main(String[] args) {
		String one = "1", zero = "0", output = "";

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
			if(i % 2 == 0)
			{
				for (int j = 1; j <= input; j++) 
				{
					output = output + zero+one;
					System.out.println(output);
					output = "";
				}
				System.out.println();
			}
			else
			{
				for (int j = 1; j <= input; j++) 
				{
					output = output + one + zero;
					//System.out.println(output);
					//output = "";
				}
				System.out.println(output);
				System.out.println();
			}
		}
	}

}
