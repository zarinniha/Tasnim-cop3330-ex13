/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Zarin Tasnim
 */

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;
//import java.lang.Object;

class compoundInterest {

    public static void main(String args[])
    {
        System.out.print("What is the principle amount? ");
        Scanner sc = new Scanner(System.in);
        double principle = sc.nextDouble();

        System.out.print("What is the rate? ");
        double rate = sc.nextDouble();

        System.out.print("What is the number of years? ");
        double time = sc.nextDouble();

        System.out.print("What is the number of times the interest is compounded per year? ");
        double n = sc.nextDouble();

        //Amount=principle(1+rate/n)^(n*time)
        double amount = principle*Math.pow((1+(rate/100)/n),(n*time));

        //formatting the output as money
        Locale usa = new Locale ("en", "US");
        NumberFormat dollarFormat = NumberFormat.getCurrencyInstance(usa);
        System.out.print(principle+ " invested at "+rate+" % for "+ time+
                " years compounded at "+n+" times per year is "+dollarFormat.format(amount));


    }
}