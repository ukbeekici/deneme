package Giris;

import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        String password = "12345", name = "ukbe", userName, userPassword;
        int pickPw;

        System.out.print("Kullanıcı Adınızı giriniz : ");
        userName = scan.nextLine();

        System.out.print("Şifrenizi giriniz : ");
        userPassword = scan.nextLine();

        if ( userName.equals(name) && password.equals(userPassword) ){
            System.out.println("Şifre geçerli!");
        }else{
            System.out.println("Girilen şifre hatalı! / Şifrenizi sıfırlamak ister misiniz?");
            System.out.println("1-Evet / 2- Hayır");
            pickPw = scan.nextInt();

            switch (pickPw){
                case (1):
                    System.out.print("Yeni şifreyi giriniz : ");
                    String pwNew = scan1.nextLine();

                    if(pwNew.equals(password)){
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    }else{
                        System.out.println("Şifre değiştirildi.");
                    }
                    break;
                case (2):
                    System.out.println("Şifre değiştirilmedi.");
                    break;
            }
        }
    }
}
