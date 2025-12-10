package com.saurabh;

import java.util.Scanner;

public class Sum {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        String secondNumber = input.nextLine();

        String sum  = firstNumber + secondNumber;
        System.out.println(sum);
    }
}
