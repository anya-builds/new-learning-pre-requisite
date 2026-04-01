package com.Ankita.res;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
//        arr[0]=23;
//        arr[1]=45;
//        arr[2]=25;
//        arr[3]=34;
//        arr[4]=78;

        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
//            System.out.println(arr[i]);

        }
        System.out.println(Arrays.toString(arr));
    }
}
