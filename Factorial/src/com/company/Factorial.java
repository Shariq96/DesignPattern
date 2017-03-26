package com.company;

/**
 * Created by hp on 1/22/2017.
 */
public class Factorial
{
    public void fact() {

        System.out.println("Enter you Input : ");

        java.util.Scanner input = new java.util.Scanner(System.in);

        int a = input.nextInt();

        int fact = 1;

        for (int i = 1; i <= a; i++)
        {
            fact *=i;
        }
        System.out.println("Your Factorial" + " " + fact);
    }
}
