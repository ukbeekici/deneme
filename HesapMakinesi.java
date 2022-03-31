package Giris;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner hesap = new Scanner(System.in);


        int n1, n2, select;
        System.out.print("Birinci sayıyı giriniz : ");
        n1 = hesap.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        n2 = hesap.nextInt();


        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz : ");
        select = hesap.nextInt();

        switch (select) {
            case 1:
                System.out.print("Toplam : " + (n1 + n2));
                break;
            case 2:
                System.out.print("Çıkarma : " + (n1 - n2));
                break;
            case 3:
                System.out.print("Çarpma : " + (n1 * n2));
                break;
            case 4:
                if ( n2 == 0) {
                    System.out.println("Sayı sıfıra bölünemez");
                } else
                    System.out.print("Bölme : " + (n1 / n2));
                break;
            default:
                System.out.print("Tekrar deneyiniz ");
                break;
        }
    }
}
