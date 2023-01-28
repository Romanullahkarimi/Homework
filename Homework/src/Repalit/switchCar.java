package Repalit;

import java.util.Scanner;

public class switchCar {
    public static void main(String[] args) {
       Scanner scan =new Scanner(System.in);
        System.out.println("pleae enter your favorite car make");
        String carOrigin=scan.next();



        switch (carOrigin){
            case "BMW":
                System.out.println("german car");
                break;
            case "Toyota":
                System.out.println("japanese car");
                break;
            case "Maserati":
                System.out.println("italian car");
                break;
            default:
                System.out.println("unknown");


        }
    }





}

