package Repalit;

import java.util.Scanner;

public class logicalStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("do you need loan");

        boolean loan = scan.nextBoolean();
        System.out.println("do youhave credit card");

        int creditCard = scan.nextInt();

        if (creditCard < 600) {
            System.out.println("not eligilble");
        } else if (creditCard > 600 && creditCard < 700) {
            System.out.println("mabe eligible");{

            }
        } else if (creditCard>701&&creditCard<800) {
            System.out.println("you are eligible");



        } else if (creditCard>800) {
            System.out.println("definitly eligible");

        }else {
            System.out.println("unknown");
        }


    }





}