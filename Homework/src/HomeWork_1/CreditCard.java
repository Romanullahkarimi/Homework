package HomeWork_1;

import java.util.Scanner;

public class CreditCard {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Do you have a credit Card");
        String CreditCard=scan.next();
        if(CreditCard.equals("yes")){
            System.out.println(" what is the balance in the card");
        }else{
            System.out.println("sorry! first get Credit Card");
        }
        int balance=scan.nextInt();
        if(balance>=2000){
            System.out.println("Pay it off immediately");
        }else{
            System.out.println("you can spend more");
        }




    }
}
