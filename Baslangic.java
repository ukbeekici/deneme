package Giris;

import java.io.Console;
import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {

        int Matematik;
        int Fizik;
        int Kimya;
        int Edebiyat;
        int Biyoloji;
        int Tarih;
        int Muzik;
        int Toplam;
        double Ortalama;

        Scanner yazdir = new Scanner(System.in);

        System.out.println("Lütfen Matematik Notunu Giriniz : ");
        Matematik = yazdir.nextInt();

        System.out.println("Lütfen Fizik Notunu Giriniz : ");
        Fizik = yazdir.nextInt();

        System.out.println("Lütfen Kimya Notunu Giriniz : ");
        Kimya = yazdir.nextInt();

        System.out.println("Lütfen Edebiyat Notunu Giriniz : ");
        Edebiyat = yazdir.nextInt();

        System.out.println("Lütfen Biyoloji Notunu Giriniz : ");
        Biyoloji = yazdir.nextInt();

        System.out.println("Lütfen Tarih Notunu Giriniz : ");
        Tarih = yazdir.nextInt();

        System.out.println("Lütfen Muzik Notunu Giriniz : ");
        Muzik = yazdir.nextInt();

        Toplam =  (Matematik + Fizik + Kimya + Edebiyat + Biyoloji + Tarih + Muzik);
        Ortalama = Toplam / 7;
        System.out.println("Ortalamanız : " + Ortalama);

        int Sonuc;


        String sonuc = (Ortalama > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı.";
        System.out.println(sonuc);
    }
}
