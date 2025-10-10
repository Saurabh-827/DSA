package com.saurabh;

import java.util.Scanner;

public class Ocuurences {
    static void main(String[] args) {

        // By string method ;

//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        String n = in.nextLine();
//        System.out.print("Which number to be checked: ");
//        char p = in.next().charAt(0);
//        int count = 0;
//        for (int i = 0; i < n.length(); i++) {
//            if(n.charAt(i) == p) {
//                count++;
//            }
//        }
//        System.out.println(count);

        // By integer method

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        System.out.print("Which number to be checked: ");
        int p = in.nextInt();

        int count = 0;
        while(count < n){
            int rem = n % 10;
            if (rem == p){
            count++;}
            n = n/10;
        }
        System.out.println("Total occurrence " + count);
        System.out.println(3%10);
    }
}
