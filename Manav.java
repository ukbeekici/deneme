package Giris;

import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        Scanner veri = new Scanner(System.in);


        double Armut,ArmutK, Elma, ElmaK, Domates, DomatesK, Muz, MuzK, Patlıcan, PatlıcanK, toplam;

        Armut = 2.14;
        Elma = 3.67;
        Domates = 1.11;
        Muz = 0.95;
        Patlıcan = 5.00;



        System.out.print("Armut Kaç Kilo : ");
        ArmutK = veri.nextDouble();
        System.out.print("Elma Kaç Kilo : ");
        ElmaK = veri.nextDouble();
        System.out.print("Domates Kaç Kilo : ");
        DomatesK = veri.nextDouble();
        System.out.print("Muz Kaç Kilo : ");
        MuzK = veri.nextDouble();
        System.out.print("Patlıcan Kaç Kilo : ");
        PatlıcanK = veri.nextDouble();

        toplam = (Armut * ArmutK) + (Elma * ElmaK) + (Domates * DomatesK) + (Muz * MuzK) + (Patlıcan * PatlıcanK);
        System.out.print("Toplam Tutar : " + toplam);

    }
}
