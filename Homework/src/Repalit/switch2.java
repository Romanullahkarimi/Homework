package Repalit;

import java.util.Scanner;

public class switch2 {
    public static void main(String[] args) {
       Scanner scan =new Scanner(System.in);
        String name=scan.next();



        switch (name){
            case "1":
                System.out.println("You can Crawl");
                break;
            case "2":
                System.out.println("You can Talk");
                break;
            case "3":
                System.out.println("You can Dance");
                break;
            case "4":
                System.out.println("You can get trouble");
                break;

            default:
                System.out.println("I don't know how old are you");

        }
    }





}

