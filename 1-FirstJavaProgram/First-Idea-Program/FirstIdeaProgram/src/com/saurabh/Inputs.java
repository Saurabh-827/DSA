package com.saurabh;

import java.util.Scanner;

public class Inputs {
    static void main(String[] args) {
        System.out.print("Please enter a number: ");
        Scanner input = new Scanner(System.in);
        int rollNumber = input.nextInt();
        System.out.println("Now your rollnumber is " + rollNumber );
    }
}
