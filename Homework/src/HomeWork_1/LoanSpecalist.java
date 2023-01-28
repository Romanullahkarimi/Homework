package HomeWork_1;
import java.util.Scanner;
public class LoanSpecalist {
    public static void main(String[] args) {
       Scanner roman=new Scanner(System.in);
        System.out.println("how much money do need for loan");
        int amount=roman.nextInt();
        if(amount<=200000){
            System.out.println("i will give you loan");
        }else{
            System.out.println("sorry, i can't give you that much money.because you will not give me back");
        }
    }
}
