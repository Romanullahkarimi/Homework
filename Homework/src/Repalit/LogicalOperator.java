package Repalit;

import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Do you need loan?");
        boolean loan=scan.nextBoolean();
        if(loan){
            System.out.println("What is your credit score?");
            double score=scan.nextDouble();
            String result=null;
            if(score<600){
                result="Not eligible";
            } else if (score>=600&&score<=700) {
                result="Maybe is eligible";

            } else if (score>=701&&score<=800) {
                result="Eligible";

            }else if (score>800){
                result="Definitely e";
            }
            System.out.println("The eligibility is "+result);
        }else {
            System.out.println("Unknown");
        }
        scan.close();
    }
}



