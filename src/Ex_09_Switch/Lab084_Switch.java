package Ex_09_Switch;

import java.util.Scanner;

public class Lab084_Switch {
    public static void main(String[] args) {

        // You nee to take user input and ask for the integer from 1 to 7.
        // And if user enters 1 to 7,
        //  It will dislapy which day it is.

        // USE LOGIC BUILDING FORMULA

        // Step 1 - to use the Scanner class.
        // Step 2 - figuring out the expression and days
        // Step 3 - to add rough logic.
        // Step 4 - to write, then fix the logic and optimize
        // Step 5 - figure out the end case.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the digit from 1 to 7 to get Day");

        if(scan.hasNextInt()) {

            int day = scan.nextInt();
            switch (day){

                case 1 :
                    System.out.println("Monday");
                    break;
                case 2 :
                    System.out.println("Tuesday");
                    break;
                case 3 :
                    System.out.println("Wednesday");
                    break;
                case 4 :
                    System.out.println("Thursday");
                    break;
                case 5 :
                    System.out.println("Friday");
                    break;
                case 6 :
                    System.out.println("Saturday");
                    break;
                case 7 :
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Enter int number from 1 to 7 only");

            }
        }else{
            System.out.println("Why you entering value other than int are you THAT DUM!!");
        }
    }
}
