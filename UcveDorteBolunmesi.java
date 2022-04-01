package Giris;

import java.util.Scanner;

public class UcveDorteBolunmesi {
    public static void main(String[] args) {
        int sayi;

        Scanner veri = new Scanner(System.in);
        System.out.print("Lütfen Bir Sayı Giriniz : ");
        sayi = veri.nextInt();

        for (int i = 0; i <= sayi; i++ )
        {
            if (i % 12 == 0)
            {
                System.out.println(i);
            }
        }
    }
}
