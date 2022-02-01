package com.techelevator;
import java.util.Locale;
import java.util.Scanner;

public class LinearConvert {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Linear Converter! ");
        System.out.print("Please enter a length: ");

        double length = scanner.nextDouble ();
        scanner.nextLine();


        System.out.print("Is the length in (M)eters, or (F)eet? Enter: M or F");
        String mOrF = scanner.nextLine();

        System.out.println(length + mOrF.toUpperCase() + " is " + doConversion(length, mOrF) + (mOrF.toUpperCase().startsWith("M") ? "F" : "M"));
    }

    public static double doConversion(double length, String lengthType) {


        if(lengthType.toLowerCase().startsWith("m")) {
            double resultFeet = length * 3.2808399;
            return resultFeet;
        }
        else {
            double resultMeters = length * 0.3048;
            return resultMeters;
        }
    }
 }


