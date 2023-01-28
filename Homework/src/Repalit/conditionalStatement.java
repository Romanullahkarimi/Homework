package Repalit;

import java.util.Scanner;

public class conditionalStatement {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        boolean positive=true;
        int num=0;
        int num1=0;
        System.out.println("Please enter first number");
        num=scan.nextInt();
        System.out.println("Please enter the second number");
        if(num*num1>0){
            System.out.println(positive);
        }else{
            System.out.println(!positive);
        }
    }
}

