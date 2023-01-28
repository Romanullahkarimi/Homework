package HomeWork_1;

import java.util.Scanner;

public class ConvertCelsiusToFarhebhit {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("What city are you in");
        String city=scan.next();
        System.out.println("What is the temperature  there in fahrenheit?");
        double temperature=scan.nextDouble();
        System.out.println("The temperature in the city "+(temperature-10)*5/9+" celsius");

    }
}
