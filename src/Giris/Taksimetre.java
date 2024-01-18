package Giris;

import java.util.Scanner;

public class Taksimetre {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double tl=10.0,km;
        System.out.println("Açılış ücreti : "+tl);
        System.out.print("Kilometreyi girin : ");
        km =sc.nextDouble();

        tl += km *2.2;

        tl = (tl<=20) ? 20 : tl;


        System.out.println("Ödencek tutar : "+tl);




    }
}
