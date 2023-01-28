package class9HW;

public class Grade {
    public static void main(String[] args) {
       // 1) Create an array of chars and store grades into it: A,B,C,D,E,F. Then print a grade B (use 2 different ways of creating an array).


        char[]grade={'A','B','C','D','E','F'};
        System.out.println("grade: "+grade[0]);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        grade[0]='A';
        grade[1]='B';
        grade[2]='C';
        grade[3]='D';
        grade[4]='E';
        grade[5]='F';
        System.out.println("grade: "+grade[2]);
    }
}
