package Giris;

import java.util.Scanner;

public class NotOrt {


    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        //Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik

        System.out.print("Matematik notunu gir : ");
        int matNot = scn.nextInt();

        System.out.print("Fizik notunu gir : ");
        int fizNot = scn.nextInt();

        System.out.print("Kimya notunu gir : ");
        int kimNot = scn.nextInt();

        System.out.print("Türkçe notunu gir : ");
        int turkNot = scn.nextInt();

        System.out.print("Tarih notunu gir : ");
        int tarNot = scn.nextInt();

        System.out.print("Müzik notunu gir : ");
        int muzNot = scn.nextInt();


        int ort = (matNot+fizNot+kimNot+turkNot+tarNot+muzNot)/6;


        System.out.println(ort<60 ? "kaldınız" : "geçtiniz");


    }
}
