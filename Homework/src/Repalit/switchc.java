package Repalit;

import java.util.Scanner;

public class switchc {
    public static void main(String[] args) {
       Scanner scan =new Scanner(System.in);
        String name=scan.next();



        switch (name){
            case "101":
                System.out.println("Student name:Ramesh");
                break;
            case "102":
                System.out.println("Student name:Mahesh ");
                break;
            case "103":
                System.out.println("Student name:Mukesh ");
                break;

            default:
                System.out.println("Not found Student name: in class");

        }
    }





}

