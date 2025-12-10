package com.saurabh;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        {
            // int a =  20;  you can not initialize because it is already initialize outside the block
            // ,but you can reassign the value
            a = 20;
            int c = 99;
            //variables initialized in this  block remain in this block
            System.out.println(a + b);
        }
        System.out.println(a);

        
    }
}
