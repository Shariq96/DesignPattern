package com;

/**
 * Created by hp on 1/22/2017.
 */
public class company
{
    public  static void main(String args[])
    {
       java.util.Scanner input = new java.util.Scanner(System.in);

       System.out.println("Enter Your 1st no : ");
       int a = input.nextInt();

        System.out.println("Enter Your 2nd no : ");
        int b = input.nextInt();

        Addition obj = new Addition();
        Subtraction obj2 = new Subtraction();

        System.out.println(obj.add(a,b));
        System.out.println(obj2.sub(a,b));
    }
}