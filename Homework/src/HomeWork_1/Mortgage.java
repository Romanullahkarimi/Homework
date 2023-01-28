package HomeWork_1;

public class Mortgage {
    public static void main(String[] args) {
        double rate=4.5;
        int house=180000;
        if(rate<6.5){
            System.out.println("you will not buy a house");
        }else{
            System.out.println("you will consider buying");
        }if(house<200000){
            System.out.println("you will take a loan");
        }else{
            System.out.println("you will pay cash");
        }
    }
}
