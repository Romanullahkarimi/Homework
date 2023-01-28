package Repalit;

import java.util.Scanner;

public class logicalOperation {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("is it weekend");

       boolean weekend=scan.nextBoolean();

       String result=null;
        if(!weekend){
            result=("manual testing");
            }else {
            result=("Java");

        }
        System.out.println("Today will be "+result);
scan.close();
    }

}



