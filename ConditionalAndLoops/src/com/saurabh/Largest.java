package com.saurabh;

import java.util.Scanner;

public class Largest {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three number: ");

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        //Q1: Find the largest of the 3 numbers.

//        int max  = a;
//        if(b> max) {
//            max = b;
//        }
//        if(c> max){
//            max = c;
//        }

        int max = Math.max(Math.max(a,b), c);
        System.out.println("Maximum is: "+ max);
    }
}
