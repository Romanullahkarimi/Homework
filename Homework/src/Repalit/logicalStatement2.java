package Repalit;

import java.sql.SQLOutput;
import java.util.Scanner;

public class logicalStatement2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter two number");
        String word1=scan.next();
        String word2=scan.next();
        System.out.println("Please enter two number");

        int int1=scan.nextInt();
        int int2= scan.nextInt();
        String result=null;
        if((int1==int2)&&(word1.equals(word2))){
            result="AND";

        } else if ((int1==int2)||word1.equals(word2)) {
            result="OR";

        } else if ((int1!=int2)&&(!word1.equals(word2)) ){
            result="NONE";

        }
        System.out.println("your result is "+result);
        scan.close();


    }





}