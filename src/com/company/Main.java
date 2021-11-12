package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //properties of an array
        //1. zero based index
        int [] age = {5, 6,8, 7,1};
//        age [5] = 20;

        System.out.println(age[3]);
//        System.out.println(age[5]);

        String[] st = {"hello", "me"};

        String [] d = new String[6];
        d[0] = "hello";
        d[1] = "hello1";
        d[2] = "hello2";
        d[3] = "hello3";
        d[4] = "hello4";

        System.out.println(Arrays.toString(d));

        d[5] = "hello5";
        System.out.println(Arrays.toString(d));
        System.out.println(Arrays.toString(d));
        System.out.println(Arrays.toString(d));
        System.out.println(Arrays.toString(d));
    }
}
