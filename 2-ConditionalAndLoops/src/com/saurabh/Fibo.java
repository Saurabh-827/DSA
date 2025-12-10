package com.saurabh;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter nth number you want: ");
        int n = in.nextInt();

        int a = 0 ;
        int b = 1;
        if(n==0) b=a;  //i add it by myself for the 0  input 
        int count = 2;
        while (count <= n){
            int temp = b;
            b = a + b;
            a = temp;
            count++;
        }
        System.out.println( "Your nth fibonacci number is " + b);
    }
}
