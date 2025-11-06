package com.saurabh;

import java.util.Arrays;

public class ChangeValue {
    static void main(String[] args) {
        //create an array
        int[] num = {87,45,5,4,53,46};
        System.out.println(System.identityHashCode(num));//same
        change(num);
        System.out.println(System.identityHashCode(num));//same
        System.out.println(Arrays.toString(num));


    }
    static void change(int[] nums){
        System.out.println(System.identityHashCode(nums));//same
        nums[0] = 78; //here array is mutated, and you know that I not have to return it.
        // This means String create a new object.
        System.out.println(System.identityHashCode(nums));//same
    }
}
