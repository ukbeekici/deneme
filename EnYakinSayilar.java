package Diziler;

import java.util.Arrays;
import java.util.Scanner;

public class EnYakinSayilar {
    static void closestNumbers(int[] array, int a){
        int min = 0, max = 0;
        for (int i =0; i< array.length; i++){

            if (array[i] <= a){
                if (array[i]!=a) min = array[i];
            }
            else if (array[i] >= a){
                if (array[i]!=a) {
                    max = array[i];
                    break;
                }
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + max);
    }

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç elemanlı dizi olacak : ");
        int a = inp.nextInt();
        int[] list = new int[a];
        for (int i = 0; i<a;i++){
            System.out.print((i+1) + ". dizi elemanı  girin: ");
            list[i] = inp.nextInt();
        }
        System.out.println("Dizi oluşturuldu : " + Arrays.toString(list) +"\n");
        System.out.println("Program dizideki elemanların içinden girilen sayıya göre küçük en yakın ve en büyük en yakın sayıyı bulacak\n");
        System.out.print("Kriter sayıyı giriniz : ");
        a = inp.nextInt();
        Arrays.sort(list);
        closestNumbers(list, a);
    }
}
