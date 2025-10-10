package com.saurabh;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args){
        // syntex of for loop
        /*
        for(intialisation; condition; increment/decrement) {
           //body
        }
        */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        for (int num = 0; num <= n; num++) {
//            System.out.println(num);}

        /*
        * Syntex of while loop
            while(condition) {
             //body
             increment;
            }
         */
//        int num = 0;
//        while(num < n){
//            System.out.println(num);
//            num++;
//        }

        /*
            //Do while loop

            do{
             //body
             } while(condition);
        */

        int num =1;
        do {
            System.out.println(num);
            num +=1;
        }while(num<=n);
    }
}
