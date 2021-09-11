/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jazz Faye Olario
 */

import java.util.Scanner;   //Using class scanner

public class App {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);   //Use scanner to obtain input
        System.out.println("Please enter the number of the month: ");
        //Using try..cath statement
        try {
            String month = sc.nextLine();   //Obtain input from the user
            int number = Integer.parseInt(month);   //Convert user input from String to integer
            //Use switch statement to transfer control to a particular case,
            switch (number) {
                case 1: //If user choose 1
                    month = "January";
                    break;  //to terminate a statement sequence
                case 2: //If user choose 2
                    month = "February";
                    break;
                case 3: //If user choose 3
                    month = "March";
                    break;
                case 4: //If user choose 4
                    month = "April";
                    break;
                case 5: //If user choose 5
                    month = "May";
                    break;
                case 6: //If user choose 6
                    month = "June";
                    break;
                case 7: //If user choose 7
                    month = "July";
                    break;
                case 8: //If user choose 8
                    month = "August";
                    break;
                case 9: //If user choose 9
                    month = "September";
                    break;
                case 10: //If user choose 10
                    month = "October";
                    break;
                case 11: //If user choose 11
                    month = "November";
                    break;
                case 12: //If user choose 12
                    month = "December";
                    break;
            }
            System.out.printf("The name of the month is %s.", month);   //Display the month
        } catch (NumberFormatException e) {
            //If user inputs anything else other than numbers from 1-12
            System.out.println("Invalid input. Please enter only numeric values 1-12");
        }
    }
}
