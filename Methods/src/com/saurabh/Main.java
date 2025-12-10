package com.saurabh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.print("Please enter first number: ");
        int firstNumber =  input.nextInt();
        System.out.print("Please enter second number: ");
        int secondNumber =  input.nextInt();
        int sum = firstNumber + secondNumber;
        System.out.println("Sum of numbers is " +  sum);

        // what if I need to this sum again and again then we use functions(methods)
        // functions are used in other folder
    }
}