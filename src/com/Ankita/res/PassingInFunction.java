package com.Ankita.res;

import java.util.Arrays;

public class PassingInFunction {
    public static void main(String[] args) {
        int[] nums={2,3,4,6};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void change(int[] arr){
        arr[0]=99;
    }
}
