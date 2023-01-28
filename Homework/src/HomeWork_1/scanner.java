package HomeWork_1;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {




            /*
        Write a program to ask user to enter numbers of worked years and annual salary.
         If user worked for more or equals to 5 years than user is eligible for the bonus,
          otherwise he is not.
           Once user is eligible and salary is larger than 50000 than bonus = 5000, otherwise bonus=3000.
             */

                Scanner work=new Scanner(System.in);
                System.out.println("how many years have you worked?");
                int years = work.nextInt();
                if(years>=5){
                    System.out.println("you are eligible for bonus");
                }else{
                    System.out.println("you are not eligible for bonus");
                }
                System.out.println("what is your annual salary?");
                int Salary= work.nextInt();
                if(Salary>=50000){
                    System.out.println("you approved for 5000 bonus");
                }else{
                    System.out.println("you approved for 3000 bonus");
                }


            }
    }

