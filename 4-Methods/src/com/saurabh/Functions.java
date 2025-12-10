package com.saurabh;
 import java.util.Scanner;
public class Functions {
    public static void main(String[] args) {
//        int ans = sum2();
//        System.out.println("Sum of numbers is " + ans);

        int ans =  sum3(12,123);
        System.out.println(ans);
    }
    static void sum(){
        Scanner input =  new Scanner(System.in);
        System.out.print("Please enter first number: ");
        int firstNumber =  input.nextInt();
        System.out.print("Please enter second number: ");
        int secondNumber =  input.nextInt();
        int sum = firstNumber + secondNumber;
        System.out.println("Sum of numbers is " +  sum);
    }

    //return types

    static int sum2(){
        Scanner input =  new Scanner(System.in);
        System.out.print("Please enter first number: ");
        int firstNumber =  input.nextInt();
        System.out.print("Please enter second number: ");
        int secondNumber =  input.nextInt();
        int sum = firstNumber + secondNumber;
        return sum;
    }

    // passing the value of numbers when calling the methods (arguments)

    static int sum3(int a, int b){
        int sum =  a + b;
        return sum;
    }
}


