package com.saurabh;
// when scopes overlaps then we use to shadow a value with another.
public class Shadowing {
    static int x = 40;

    public static void main(String[] args) {
        System.out.println(x);
        int x = 50;
        System.out.println(x);
        fun();
    }

     static void fun() {
         System.out.println(x);
    }
}
