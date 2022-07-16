package hafta3;

import java.util.Scanner;

/**
 * @file Üç basamaklı sayı armstrong sayı mı
 * @description Bu program, kullanıcının girdiği 3 basamaklı sayının armstrong
 * sayı olup olmadığını bulur. 
 * 371: (3 ^ 3 + 7 ^ 3 + 1 ^ 3) -> 371 -> Armstrong sayı 
 * 154: (1 ^ 3 + 5 ^ 3 + 4 ^ 3) -> 190 -> Armstrong sayı değil
 * @assignment 3.hafta konuları
 * @date 14.10.2021
 * @author @beyzayildizli10@gmail.com
 */
public class UcBasamakliSayiAmstrongSayiMi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("3 basamaklı bir sayı giriniz:");
        int sayi = s.nextInt();
        int armstrongKontrol = 0;
        int birlerBasamagindaki = sayi % 10;
        int onlarBasamagindaki = (sayi % 100 - sayi % 10) / 10;
        int yüzlerBasamagindaki = sayi / 100;
        armstrongKontrol += birlerBasamagindaki * birlerBasamagindaki * birlerBasamagindaki + onlarBasamagindaki * onlarBasamagindaki * onlarBasamagindaki + yüzlerBasamagindaki * yüzlerBasamagindaki * yüzlerBasamagindaki;
        if (sayi == armstrongKontrol) {
            System.out.println("Sayınız armstrong sayıdır.");
        } else {
            System.out.println("Sayınız armstrong sayı değildir.");
        }
    }
}
