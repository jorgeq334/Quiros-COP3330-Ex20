package org.example;
import java.util.Scanner;
/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jorge Quiros
 */
public class Taxcalculator
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        int amount;
        double totalAmount=0;
        double tax = 0;
        System.out.print("What is order amount? ");
        amount = input.nextInt();
        System.out.print("What state do you live in? ");
        String state = input.next();
        if(state.equals("Wisconsin")){
            System.out.print("What county do you live in? ");
            String county = input.next();
            if(county.equals("EauClaire")){
                tax = (amount*5.005)/100;
                totalAmount = tax + amount;
            }
            else if(county.equals("Dunn")){
                tax = (amount*5.004)/100;
                totalAmount = tax + amount;
            }
            else{
                System.out.println("Please enter correct county");
            }
        }
        else if(state.equals("Illinois")){
            tax = (amount*8)/100;
            totalAmount = tax + amount;
        }
        else{
            tax = 0.0;
            totalAmount = amount;
        }
        System.out.println("The tax is  $"+String.format("%.2f",tax));
        System.out.println("The total is  $"+String.format("%.2f",totalAmount));
    }
}
