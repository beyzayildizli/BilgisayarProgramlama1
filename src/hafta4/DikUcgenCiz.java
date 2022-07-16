package hafta4;

import java.util.Scanner;

/**
 * @file Dik üçgen çiz
 * @description Bu program, verilen satır büyüklüğünde bir dik üçgen çıktısı verir.
 * @assignment 4.hafta konuları
 * @date 20.10.2021
 * @author @beyzayildizli10@gmail.com
 */
public class DikUcgenCiz {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Satir sayisini giriniz: ");
        int satirSayisi = s.nextInt();
        for (int satir = 0; satir < satirSayisi; satir++) {
            for (int bosluk = 0; bosluk < satirSayisi - (satir + 1); bosluk++) {
                System.out.print(" ");
            }
            for (int yildiz = 0; yildiz < satir + 1; yildiz++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
