package hafta3;

import java.util.Scanner;

/**
 * @file İki basamaklı integerı ters çevir
 * @description Bu program, klavyeden girilen iki basamaklı bir int değişkenin
 * rakamlarını terse çevirir.
 * @assignment 3.hafta konuları
 * @date 14.10.2021
 * @author @beyzayildizli10@gmail.com
 */
public class IkiBasamakliIntegeriTersCevir {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sayi;
        System.out.println("İki basamaklı bir tam sayı giriniz.");
        sayi = s.nextInt();
        int birler = sayi % 10;
        int onlar = sayi / 10;
        System.out.println("Sayınızın rakamları tersi: " + (birler*10 + onlar));
    }
}
