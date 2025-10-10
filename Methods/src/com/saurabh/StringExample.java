package com.saurabh;

import java.util.Scanner;

public class StringExample {
    static void main(String[] args) {
//        System.out.println(greet());
        Scanner input =  new Scanner(System.in);;
        System.out.print("Please enter your name: ");
        String name =  input.next();;
 String person = greeting(name);
        System.out.println(person);
    }
    static String greet(){
        return "How Are You?";
    }


    static String greeting(String name){
        return "Hello " + name;
    }

}
