package javaClass6;

public class whileLoppOddNumber2 {
    public static void main(String[] args) {
       boolean workday= true;
       int day = 1;
       while (workday){
           System.out.println("i need a day off");
           if(day==6) {
               workday=false;
               System.out.println("i don't a day off");
           }
           day++;

           }



    }
}