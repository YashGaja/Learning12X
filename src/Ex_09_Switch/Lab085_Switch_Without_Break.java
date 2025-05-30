package Ex_09_Switch;

import java.util.Scanner;

public class Lab085_Switch_Without_Break {
    public static void main(String[] args) {
        // SWITCH

        // Take the user input and give them a day
        // 1 to 7  i.e. Monday to Sunday
        // 8 ? -->Invalid

        //  int day = Integer.parseInt(args[0]); ---> BY CIL option

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the digit from 1 to 7 to get Day");
        if (scan.hasNextInt()) {
            int day = scan.nextInt();
            switch (day) {
                case 1:
                    System.out.println("Monday");
                case 2:
                    System.out.println("Tuesday");
                case 3:
                    System.out.println("Wednesday");
                case 4:
                    System.out.println("Thursday");
                case 5:
                    System.out.println("Friday");
                case 6:
                    System.out.println("Saturday");
                case 7:
                    System.out.println("Sunday");

                default:
                    System.out.println("Invalid");

            }
        }else{
            System.out.println("Why you entering value other than int are you THAT DUM!!");
        }
    }
}