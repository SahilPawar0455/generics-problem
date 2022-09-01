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
}
