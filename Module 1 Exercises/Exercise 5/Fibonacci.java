package com.techelevator;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to the Fibonacci Calculator!");
		System.out.print("Please enter a whole number and see the Fibonacci sequence leading up to it: ");

		String value = scanner.nextLine();
		int userNum = Integer.parseInt(value);

		int num1 = 0;
		int num2 = 1;
		int num3 = num1 + num2;

/* Last Step: figure out how to rewrite so loop stops before actual guess, not number of answers provided
*/
		if (userNum == 0 || userNum < 0)
		{
			System.out.println("0, 1");
		}
		else if (userNum == 1)
		{
			System.out.print("0, 1, 1");
		}
		else {
			int i = 1;
			do{
				System.out.print(num1 + " ");
				int sum = num1 + num2;
				num1 = num2;
				num2 = sum;
				i++;
			} while (num1 < userNum); 
			//This works! Converted While to Do While....
		}
	}
}





