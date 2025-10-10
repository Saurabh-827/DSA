package com.saurabh;

import java.util.Scanner;

public class CaseCheck {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);;
        System.out.print("Enter the string or letter: ");
        char a = in.next().charAt(0); // as i am giving input through terminal then it does not needed trim
//        String a = "  ha";
//        String b = "sa ";
//        System.out.println(a.trim().charAt(0));
//        System.out.println(b.trim().charAt(2)); //now becomes out of bounds due to trim() trimmed empty spaces from the string

        if (a >= 'a' && a <= 'z'){
            System.out.println(a + " is a lowercase letter.");
        }else {
            System.out.println(a+ " is uppercase letter.");
        }
    }
}
