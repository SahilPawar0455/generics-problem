package com.brigdelabz;

public class MaximumNumberMain {
    public static void main(String[] args) {
        System.out.println("welcome to Maximum Number");
        MaximumNumber.integerMax(56, 89, 56);
        MaximumNumber.floatsMax(45.268F,63.89F,89.25F);
        MaximumNumber.stringsMax("sahilpawar","pawar","ssdaddsf");
        MaximumNumber.genericMax(56,89,56);
        MaximumNumber.genericMax(45.268F,63.89F,89.25F);
        MaximumNumber.genericMax("sahilpawar","pawar","ssdaddsf");
        MaximumNumber.maxParameter(56, 89, 56,45,63,89);
    }
}
