package Giris;


import java.util.Scanner;

public class KDVHesapla {
    public static void main(String[] args) {


        double tutar, kdvOran, kdvTutar, kdvliTutar;



        Scanner giris = new Scanner(System.in);
        System.out.print("Ücret Turarını Giriniz : ");
        tutar = giris.nextDouble();

        if (tutar <= 1000) {
            kdvOran = 0.18;

        }
        else {
            kdvOran = 0.08;


        }
        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;
        System.out.println("KDV'siz Tutar : " + tutar);
        System.out.println("KDV Oranı : " + kdvOran);
        System.out.println("KDV Tutarı : " + kdvTutar);
        System.out.println("KDV'li Tutar : " + kdvliTutar);

    }
}
