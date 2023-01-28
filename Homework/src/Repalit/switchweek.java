package Repalit;

import java.util.Scanner;

public class switchweek {
    public static void main(String[] args) {
       Scanner scan =new Scanner(System.in);
        String name=scan.next();



        switch (name){
            case "1":
                System.out.println("Saturday");
                break;
            case "2":
                System.out.println("Sunday");
                break;
            case "3":
                System.out.println("Monday");
                break;
            case "4":
                System.out.println("Tuesday");
                break;
            case "5":
                System.out.println("Wednesday");
                break;
            case "6":
                System.out.println("Thursday");
                break;
            case "7":
                System.out.println("Friday");

            default:
                System.out.println("Invalid");

        }
    }





}

