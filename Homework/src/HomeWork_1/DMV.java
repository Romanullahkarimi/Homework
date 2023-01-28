package HomeWork_1;

import java.util.Scanner;

public class DMV {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = scan.nextInt();

        if(age>=18){
            System.out.println("you can get driver licence!");
        }else{
            System.out.println("Sorry!you are not eligible for it");
        }






    }
}