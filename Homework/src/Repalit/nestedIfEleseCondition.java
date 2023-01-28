package Repalit;

import java.util.Scanner;

public class nestedIfEleseCondition {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter 3 district number");
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        int num3=scan.nextInt();
        if(num1>num2&&num1>num3){
            System.out.println("The largest number is "+num1);

        }if(num2>num1&&num2>num3){
            System.out.println("The largest number is "+num2);
        }else {
            System.out.println("The largest number is "+num3);
        }
    }
}
