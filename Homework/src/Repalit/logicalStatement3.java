package Repalit;

import java.util.Scanner;

public class logicalStatement3 {
  /*  Take 2 boolean inputs from a user:
            "Are you thirsty?"
            "Are you sleepy?"
    If user is thirsty and not sleepy--> drink=water
    If user is thirsty and sleepy--> drink=coffee
    If user is not thirsty and sleepy --> drink=tea
    Otherwise drink="nothing"*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Are you thirsty?");
        boolean thirsty = scan.nextBoolean();
        System.out.println("Are you sleepy?");
        boolean sleepy = scan.nextBoolean();
        String result;
        if (thirsty && !sleepy) {
            result = "water";
        } else if (thirsty && sleepy) {
            result="coffee";
        } else if (!thirsty && sleepy) {
            result="tea";

        }else {
            result="nothing";
        }
        System.out.println("Look like you need to drink "+result);
        scan.close();

    }



}