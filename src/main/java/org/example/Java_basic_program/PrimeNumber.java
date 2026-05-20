package org.example.Java_basic_program;

import java.util.Scanner;

//Java Program to Display All Prime Numbers from 1 to N
//Input: N = 11
//Output: 2, 3, 5, 7, 11
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //here we take input from user
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        System.out.println("prime no. from 1 to " + n+ " are:");
        //we start loop from 2 to n wihch we provide
        for(int i=2;i<=n;i++){
            boolean isPrime=true;
            //here we write logic to check if it is prime
            for (int j=2;j<=i/2;j++){
                if (i%j==0){
                    isPrime=false;
                    break;
                }
            }
            //print prime number
            if (isPrime){
                System.out.println(i+" ");
            }
        }
        sc.close();
    }
}
//working
//The program takes a number N from the user.
//It checks each number from 2 to N.
//If a number has no divisors other than 1 and itself, it is prime.
//Then it prints the prime numbers.
//A prime number is a number that:
//
//is greater than 1
//has only 2 factors
//1
//itself
//i = 2  → Prime
//i = 3  → Prime
//i = 4  → Divisible by 2 → Not Prime
//i = 5  → Prime
//i = 6  → Divisible by 2 → Not Prime
//i = 7  → Prime
//i = 8  → Divisible by 2 → Not Prime
//i = 9  → Divisible by 3 → Not Prime
//i = 10 → Divisible by 2 → Not Prime