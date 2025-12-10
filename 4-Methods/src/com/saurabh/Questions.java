package com.saurabh;

import java.util.Scanner;

public class Questions {
    public static void main() {
        Scanner sc = new Scanner(System.in);;

//        int n = sc.nextInt();
//
//        System.out.println("is number " + n + " an Armstrong number? answer: " + checkArmstrong(n));
//
//        System.out.println("Is number " + n + " a prime number? answer: " + checkPrime(n));

        for (int i = 100; i <= 999; i++) {
            if(checkArmstrong(i)){
                System.out.print(i+ " ");
            }
        }
    }


    //checking all 3 digit armstrong number
    private static boolean checkArmstrong(int n) {
        int old = n;
        int a = 0;

        while(n> 0){
            int b = n%10;
            a += b*b*b;
            n= n/10;
        }
        return a==old;

    }






// prime number
    private static boolean checkPrime(int n) {
        if(n<= 1) return false;
        for (int i=2; i * i<=n; i++) {
            if(n%i==0) return false;
        }
        return true;
    }
}
