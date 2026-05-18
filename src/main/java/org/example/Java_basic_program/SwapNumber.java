package org.example.Java_basic_program;
//Java Program to Swap Two Numbers
//The goal is to interchange the values of two variables
//Input: m=9, n=5
//Output: m=5, n=9
//Approach 1: Using a Temporary Variable
public class SwapNumber {
    public static void main(String[] args) {
        int m=90, n=100;
        System.out.println("before swapping: m= "+m+","+ "n="+ n );
        int temp=m;
        m=n;
        n=temp;
        System.out.println("After swapping: m= "+ m+ ", n="+ n);
    }
}
