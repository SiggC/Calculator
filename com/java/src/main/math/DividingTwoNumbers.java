package com.java.src.main.math;

import java.util.Scanner;

public class DividingTwoNumbers {

    public static void main(String[] args) {
// Input is an object of the scanner class
        Scanner input = new Scanner (System.in); // This line is where we define the input.
            System.out.println("Input the first number: ");
            float a = input.nextFloat(); // I'm using the nextFloat() to get the Float from the user
                System.out.println("Input the second number: ");
                float b = input.nextFloat();
                // b == 0 -->> (Here I can check if b == 0 by writing an if statement)
                float d = a/b;
                //int d = a/b;
        System.out.println();
        System.out.println("The division of a and b is:" +d);


        System.out.println("Input the first number: ");
        int c = input.nextInt(); // I'm using the nextInt() to get the integer from the user
        System.out.println("Input the second number: ");
        int e = input.nextInt();
        // b == 0 -->> (Here I can check if b == 0 by writing an if statement)
        int f = c/e;
        System.out.println();
        System.out.println("The division of a and b is:" +f);
    }

}

/*
link to video I followed along with.
 */
