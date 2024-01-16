package Giris;

import java.util.Scanner;

public class KdvHesapla {


    public static void main(String[] args) {

    Scanner scn = new Scanner(System.in);

        double para,kdvOran;
        System.out.print("Para değeri : ");
        para = scn.nextDouble();

        if(para<1000){
            kdvOran=0.18;
        }
        else{
            kdvOran=0.08;
        }
        double kdvToplam = para+kdvOran*para;

        System.out.println("kdv oranı : "+kdvOran);
        System.out.println("kdv tutarı : "+kdvOran*para);
        System.out.println("kdv li tutar : "+kdvToplam);




    }


}
