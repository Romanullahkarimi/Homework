package javaClass6;

public class whileLoppOddNumber {
    public static void main(String[] args) {
        int number=0;
        while (number<16){
            if(number % 2 !=0)
                System.out.println(number);
            number++;
        }
    }
}
