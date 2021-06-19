package com.company;
import java.util.Scanner;
public class CBSE_Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Write Studetn Name -");

        String Name = sc.nextLine();
        System.out.println("Studetn Name is -" +Name);

        System.out.print("Write Subject 1 no Science =");
        float S1 = sc.nextFloat();
        System.out.print("Write Subject 2 no Maths =");
        float S2 = sc.nextFloat();
        System.out.print("Write Subject 3 no SSC =");
        float S3 = sc.nextFloat();
        System.out.print("Write Subject 4 no Hindi = ");
        float S4 = sc.nextFloat();
        System.out.print("Write Subject 5 no English ");
        float S5 = sc.nextFloat();
        System.out.print("Write Subject 6 no Sanskrit ");
        float S6 = sc.nextFloat();
        System.out.print("Sum of all marks =");

        float TNS = S1+S2+S3+S4+S5+S6;
        System.out.println(TNS);
        System.out.println("Out of all the subject :- ");
        float OUT = sc.nextInt();

        float PERS = TNS*100/OUT;
        System.out.println("Persentage of student = "+PERS);


    }
}
