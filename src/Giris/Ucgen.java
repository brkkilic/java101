package Giris;

import java.util.Scanner;

public class Ucgen {


    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int a,b,c;
        System.out.print("1. kenar girin : ");
        a= scn.nextInt();

        System.out.print("2. kenar girin : ");
        b= scn.nextInt();


        System.out.print("3. kenar girin : ");
        c= scn.nextInt();


        double u = (a+b+c) / 2;

        System.out.println("Üçgenin Çevresi : "+2*u);

        double alan = Math.sqrt(u * (u-a)* (u-b) * (u-c));
        System.out.println("Üçgenin Alanı : "+alan);





    }
}
