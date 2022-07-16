package hafta2;

import java.util.Scanner;

/**
 * @file Son iki rakam toplamı
 * @description Bu program, kullanıcıdan alınan iki tam sayı değerin son iki
 * rakamlarının toplamını hesaplar.
 * @assignment 2.hafta konuları
 * @date 8.10.2021
 * @author @beyzayildizli10@gmail.com
 */
public class SonIkiRakamToplami {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int birinciSayi;
        int ikinciSayi;
        System.out.println("Birinci sayıyı giriniz: ");
        birinciSayi = s.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        ikinciSayi = s.nextInt();
        
        //1.sayının birler ve onlar basamağı
        int birler = birinciSayi % 10;
        int onlar = (birinciSayi % 100 - birler) / 10;
        
        //2.sayının birler ve onlar basamağı
        int birler_2 = ikinciSayi % 10;
        int onlar_2 = (ikinciSayi % 100 - birler_2) / 10;

        int toplam = birler + birler_2 + onlar + onlar_2;
        System.out.println("Sayıların son iki basamak toplamı " + toplam + "dir.");
    }
}
