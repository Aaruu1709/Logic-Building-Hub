package org.example.Java_basic_program;

public class EvenOdd {
    public static void main(String[] args) {
        //Method 1: Using Modulus Operator (Naive & Most Readable)
        //If a number gives remainder 0 when divided by 2, it is even; otherwise, odd.
        int num=10;
        if(num% 2==0){
            System.out.println("Entered number is Even");
        }else{
            System.out.println("Entered number is odd");
        }
    }
}
