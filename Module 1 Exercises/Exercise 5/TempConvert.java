package com.techelevator;
import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to the Temperature Converter! ");
		System.out.print("Please enter the temperature: ");

		double temp = scanner.nextDouble();
		scanner.nextLine();


		System.out.print("Is the temperature in (C)elsius, or (F)arenheit? Enter: F or C");
		String fOrC = scanner.nextLine();

		System.out.println(temp + fOrC.toUpperCase() + " is " + doConversion(temp, fOrC) + (fOrC.toUpperCase().startsWith("F") ? "C" : "F"));
	}

	public static double doConversion(double temp, String tempType){


			if (tempType.toLowerCase().startsWith("c")) {
				double celsiusToFarenheit = (temp * 1.8) + 32;
				return celsiusToFarenheit;
			} else {
				double farenheitToCelsius = ((temp - 32) / 1.8);
				return farenheitToCelsius;
			}
		}
	}



