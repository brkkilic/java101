package Giris;

import java.util.Scanner;

public class DaireAlanVeCevre {


    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int yaricap;
        int merkezAcisiOlcusu;

        double pi = 3.14;
        System.out.print("daire yaricapi girin : ");
        yaricap = scn.nextInt();

        System.out.print("Merkez açısının ölçüsü : ");
        merkezAcisiOlcusu = scn.nextInt();

        double dilimAlan = (pi*(yaricap*yaricap)*merkezAcisiOlcusu)/360;

        System.out.println("Daire diliminin alanı : "+dilimAlan);

    }
}
