package Giris;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Yılı giriniz : ");
        int year=scanner.nextInt();

        if(year%4==0){
            if(year%100==0 && year%400!=0)
                System.out.println(year+" artık yıl değildir.");
            else
                System.out.println(year+" artık yıldır.");
        }
        else
            System.out.println(year+" artık yıl değildir.");
    }
}
