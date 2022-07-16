package hafta2;

import java.util.Scanner;

/**
 * @file ArdisikSayilarinKareleriToplami
 * @description Bu program, girilen n sayısına kadar olan ardışık sayıların
 * karelerinin toplamını hesaplar.
 * @assignment 2.hafta konuları
 * @date 8.10.2021
 * @author @beyzayildizli10@gmail.com
 */
public class ArdisikSayilarinKareleriToplami {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sayi;
        System.out.println("Sayı giriniz: ");
        sayi = s.nextInt();
        int toplam;
        toplam = sayi * (sayi + 1) * (2 * sayi + 1) / 6;
        System.out.println(sayi + "'e kadar olan ardısık sayıların karelerinin toplamı: " + toplam);
    }

}
