package Giris;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {

    int km;
    double perKm = 2.20, total, startPrice = 10;

        Scanner taksimetre = new Scanner(System.in);

        System.out.print("Mesafeyi Giriniz : " );
        km = taksimetre.nextInt();

        total = (km + perKm);
        total += startPrice;

        total = (total < 20) ? 20 : total;
        System.out.print("Toplam Tutar : " + total);


    }
}
