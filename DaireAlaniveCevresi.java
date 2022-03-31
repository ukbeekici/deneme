/*Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
𝜋 sayısını = 3.14 alınız.
Formül : (𝜋 * (r*r) * 𝛼) / 360*/

package Giris;

import java.util.Scanner;
public class DaireAlaniveCevresi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double pi = 3.14, alan;
        int r,aci;

        System.out.print("Dairenin alanının hesaplanması için yarıçap giriniz : ");
        r = scan.nextInt();
        System.out.print("Dairenin alanının hesaplanması için açı giriniz : ");
        aci = scan.nextInt();


        alan = (pi * (r*r)) * aci / 360;

        System.out.println("Yarıçapı : " + r + " açısı : " + aci + "° olan dairenin alanı : " + alan);




    }
}