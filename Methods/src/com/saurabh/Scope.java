package com.saurabh;

public class Scope {
    static void main(String[] args) {
        int a = 10;
        int b = 30;
        {
            int c = 99;
            //variables initialized in this  block remain in this block
            System.out.println(a + b);
        }

        
    }
}
