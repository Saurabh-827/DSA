package com.saurabh;

import java.util.Arrays;

// we use variable length arguments (VarArgs)
// when we don't know about how many inputs we are giving
public class VarArgs {
    public static void main(String[] args) {

        fun();  // giving so many arguments due to varargs
        multiArgs(5, "hi", "how");
    }

    private static void multiArgs(int a, String b , String ...n) {
        System.out.println(a + " " + b + " " + Arrays.toString(n));

    }

    static void fun(int ...n) {
        System.out.println(Arrays.toString(n));
    }
}
