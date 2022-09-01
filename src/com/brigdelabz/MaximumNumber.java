package com.brigdelabz;

public class MaximumNumber {
    public static void integerMax(int x, int y, int z) {
        if (x > y) {
            if (x > z) {
                System.out.println("Maximum Integers is = " + x);
            }
        }
        if (y > x) {
            if (y > z) {
                System.out.println("Maximum Integers is = " + y);
            }
        }
        if (z > x) {
            if (z > y) {
                System.out.println("Maximum Integers is = " + z);
            }
        }
    }
    public static void floatsMax(float x, float y, float z) {
        if (x > y) {
            if (x > z) {
                System.out.println("Maximum float is = " + x);
            }
        }
        if (y > x) {
            if (y > z) {
                System.out.println("Maximum float is = " + y);
            }
        }
        if (z > x) {
            if (z > y) {
                System.out.println("Maximum float is = " + z);
            }
        }
    }

    public static void stringsMax(String x, String y, String z) {
        if (x.length() > y.length()) {
            if (x.length() > z.length()) {
                System.out.println("Maximum String is = " + x);
            }
        }
        if (y.length() > x.length()) {
            if (y.length() > z.length()) {
                System.out.println("Maximum String is = " + y);
            }
        }
        if (z.length() > x.length()) {
            if (z.length() > y.length()) {
                System.out.println("Maximum String is = " + z);
            }
        }
    }

    public static <T extends Comparable> void genericMax(T x,T y,T z) {
        T max = x;
        if (y.compareTo(max)>0){
            max = y;
        } else if (z.compareTo(max)>0) {
            max = z;
        }
        System.out.println("Maximum Number is = "+max);
    }
}
