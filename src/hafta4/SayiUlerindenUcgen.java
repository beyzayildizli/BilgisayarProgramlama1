package hafta4;

import java.util.Scanner;

/**
 * @file Sayı üslerinden oluşan üçgen çiz
 * @description Bu program, verilen satır büyüklüğünde sayıların üslerinden
 * oluşan bir üçgen çıktısı verir.
 * @assignment 4.hafta konuları
 * @date 20.10.2021
 * @author @beyzayildizli10@gmail.com
 */
public class SayiUlerindenUcgen {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Satir sayisini giriniz? : ");
        int satirSayisi = s.nextInt();
        for (int satir = 1; satir <= satirSayisi; satir++) {
            for (int sayi = 1; sayi <= satir; sayi++) {
                System.out.print((int) Math.pow(sayi, satir) + " ");
            }
            System.out.println();
        }
    }
}
