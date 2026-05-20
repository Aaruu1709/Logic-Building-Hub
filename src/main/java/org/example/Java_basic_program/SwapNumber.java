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
// This swap only affects local copies in memory.
// If you pass m and n to a method,
// the original variables remain unchanged due to Java's pass-by-value.
//---------------------------------------------------------
//second approach
//Using Arithmetic (Sum and Difference)
//Add both numbers and store the result in the first variable.
//Subtract the second number from the first variable and store it in the second variable.
//Subtract the new second variable from the first variable to get the original second number
 class SwapNumber2 {
    public static void main(String[] args) {
        int m=2, n=3;
        System.out.println("before swapping value of m="+ m+ ", n= "+ n);

        m=m+n;
        n=m-n;
        m=m-n;
        System.out.println("After swapping: m = " + m + ", n = " + n);
//This method avoids extra variables but can cause overflow with very large numbers.
//        when we use temporary variable it uses an extra variable (temp) but avoids overflow problems.
    }
    }