package Donguler;

import java.util.Scanner;

public class YildizUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen Bir Sayı Girniz : ");
        int num = input.nextInt();
        num /= 2;
        num++;

        for(int i = 0; i<num; i++){

            for(int j = num; j> (i+1); j--)
                System.out.print(" ");

            for(int k = 0; k< (i*2)+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        int temp = 1;
        for(int i = num-1; i> 0; i--){

            for(int j = 0; j< temp; j++)
                System.out.print(" ");
            temp++;

            for(int k=0; k< (i*2)-1; k++)
                System.out.print("*");
            System.out.println();
        }
    }
}
