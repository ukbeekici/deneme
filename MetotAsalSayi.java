package Metodlar;

import java.util.Scanner;

public class MetotAsalSayi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Bir sayi girininiz: ");
        int n = inp.nextInt();

        if(asal(n) == true) {
            System.out.println("Bu sayi asal deiðildir!");
        } else {
            System.out.println("Bu sayi asaldir!");
        }
    }

    static boolean asal(int n) {

        boolean result = false;

        for(int i = 2; i < n; i++) {
            if (n % i == 0) {
                result = true;
            }
        }

        return result;
    }
}
