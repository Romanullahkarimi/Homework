package class9HW;

public class ArrayName {
    public static void main(String[] args) {
      //  2) Create an array of names and store all names of your group. Then print your name from that array.
        //  (use 2 different ways of creating an array).
        String[]name={"Romanullah","Karimi","jan","khan","Ali"};
        System.out.println("This is: "+name[0]);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");

        //another method
        String[]name1=new String[5];
        name1[0]="Romanullah";
        name1[1]="karimi";
        name1[2]="jan";
        name1[3]="khan";
        name1[4]="Ali";
        System.out.println("Name "+name1[0]);


    }
}
