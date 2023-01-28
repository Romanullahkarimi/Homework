package Repalit;

import java.util.Scanner;

public class nestifCondition2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a number");
        int num=input.nextInt();
        if(num%2==0){
            System.out.println("Value is evan");

        if(num>1000){
            System.out.println("even value is large");
        }else {
            System.out.println("Even value is just right");
        }
    }else{
            System.out.println("Value is odd");
        if(num>1000){
            System.out.println("odd value is large");
        }else{
            System.out.println("Odd value is just right");

    }
}
}}


