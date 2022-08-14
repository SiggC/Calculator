package com.java.src.main.math;

import java.util.Scanner;

public class DividingTwoNumbers {

    public static void main(String[] args) {
// Input is an object of the scanner class
        Scanner input = new Scanner (System.in); // This line is where we define the input.

        int a = input.nextInt(10); // I'm using the nextInt() to get the integer from the user
        System.out.println("Input the first number: ");
        int b = input.nextInt(5);
        int sum = a/b;      // float d = a/b;


        System.out.println("Input the second number: ");
        System.out.println();
        System.out.println("The division of a and b is:" +sum);
    }

}
