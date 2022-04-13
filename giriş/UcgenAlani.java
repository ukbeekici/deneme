
package Giris;

import java.util.Scanner;

public class UcgenAlani {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a,b,c;
        double u,alan;

        System.out.print("Birinci Kenarı Girin:");
        a=scan.nextInt();
        System.out.print("İkinci Kenarı Girin:");
        b=scan.nextInt();
        System.out.print("Ucuncu Kenarı Girin:");
        c=scan.nextInt();

        u= ((a+b+c)/2.0);
        System.out.println("Ucgenin Cevresi"+2.0*u);

        alan = Math.sqrt(u * ( u - a ) * (u - b) * (u - c));
        System.out.println("Ucgenin alani : " + alan );


    }

}





