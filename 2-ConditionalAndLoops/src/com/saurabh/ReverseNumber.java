package com.saurabh;

import java.util.Scanner;

public class ReverseNumber {
    static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number for reversing: ");
        int n = in.nextInt();
        int reverseNumber = 0;
        while(n != 0){
            reverseNumber = reverseNumber *10 + n%10;
            n/=10;
        }
        System.out.println("The reversed number is: " + reverseNumber);
    }

}
