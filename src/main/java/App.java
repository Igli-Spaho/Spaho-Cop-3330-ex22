//UCF COP3330 Summer 2021 Assignment 22 Solution
// *  Copyright 2021 Igli Spaho

//Comparing one input to a known value is common enough, but you’ll often need to process a collection of inputs.
//
//Write a program that asks for three numbers. Check first to see that all numbers are different. If they’re not different, then exit the program. Otherwise, display the largest number of the three.
//
//Example Output
//Enter the first number: 1
//Enter the second number: 51
//Enter the third number: 2
//The largest number is 51.
//Constraint
//Write the algorithm manually. Don’t use a built-in function for finding the largest number in a list.


import java.util.Scanner;

public class App {
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number:");
        Integer first = in.nextInt();

        System.out.print("Enter the second number:");
        Integer second = in.nextInt();

        System.out.print("Enter the third number:");
        Integer third = in.nextInt();

        int largest = Integer.MAX_VALUE;
        int smallest = Integer.MAX_VALUE;

        int max = first;
        if(second>max){
            max=second;
        }

        if(third>max){
            max=third;
        }
            System.out.print("The largest number is "+ max);
    }
}
