/* To convert integer to binary, start with the integer in question and divide it by 2 keeping notice of the quotient and the remainder.
Continue dividing the quotient by 2 until you get a quotient of zero. Then just write out the remainders in the reverse order.


Write a command-line program which prompts the user for a series of decimal integer values separated by spaces. Display each decimal integer along with its equivalent binary value.

Please enter in a series of decimal values (separated by spaces): 460 8218 1 31313 987654321

460 in binary is 111001100
8218 in binary is 10000000011010
1 in binary is 1
31313 in binary is 111101001010001
987654321 in binary is 111010110111100110100010110001
*/

package com.techelevator;
import java.util.Arrays;
import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//scanner created
		System.out.println("Welcome to the Decimal to Binary Converter!");
		System.out.print("Please enter a series of decimal values separated by spaces ");
		//user enters decimal numbers

		String value = scanner.nextLine();
		String[] stringUserNumbersArray = value.split(" ");
		//now we have a string array with each number indexed. convert to ints by Integer.parseInt()

		for (int i = 0; i < stringUserNumbersArray.length; i++) {
			int userNum = Integer.parseInt(stringUserNumbersArray[i]);
			System.out.println(userNum + " in binary is " + Integer.toBinaryString(userNum));
		}
	}
}










