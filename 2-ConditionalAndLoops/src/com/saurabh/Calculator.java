package com.saurabh;

import java.util.Scanner;

public class Calculator {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int answer = 0;
        while(true){

            System.out.print("Enter operator: ");
            char o = in.next().charAt(0);

            if (o == '+'||o == '-' || o == '*' || o == '/' || o == '%') {
                System.out.print("Enter first operand: ");
                int a  = in.nextInt();
                System.out.print("Enter second operand: ");
                int b = in.nextInt();
                if (o == '+') {
                    answer = a + b;
                }
                if (o == '-') {
                    answer = a - b;
                }
                if (o == '*') {
                    answer = a * b;
                }
                if (o == '/') {
                    if (b != 0) {
                        answer = a / b;
                    }
                }
                if (o == '%') {
                    answer = a % b;
                }

            }else if (o == 'x' || o == 'X') {
                break;
            } else {
                System.out.println("Invalid operator");
            }
            System.out.println("Answer is " + answer);
        }

    }
}
