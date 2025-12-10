package com.saurabh;

import java.util.Scanner;

public class TempConversion {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter the temperature in Celsius: ");
       float celsiusTemp = input.nextFloat();
       float fahrenheitTemp = (celsiusTemp *  9 /5) + 32;
       System.out.println("The temperature in Fahrenheit is " + fahrenheitTemp);
    }
}
