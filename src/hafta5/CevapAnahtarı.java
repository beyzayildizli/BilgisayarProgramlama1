package hafta5;

import java.util.Scanner;

/**
 * @file Cevap Anahtarı
 * @description Bu program, girilen cevapları girilen cevap anahtarıyla
 * karşılaştırır ve doğru yanlış sayısını yazdırır.
 * @assignment 5.hafta konuları
 * @date 31.10.2021
 * @author @beyzayildizli10@gmail.com
 */
public class CevapAnahtarı {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Kendi cevaplarınızı giriniz :");
        String kullanici_cevaplari = s.nextLine();
        System.out.println("Cevap anahtarını giriniz: ");
        String cevap_anahtari = s.nextLine();

        int dogruSayisi = 0;
        int yanlisSayisi = 0;
        int bosSayisi = 0;
        for (int i = 0; i < cevap_anahtari.length(); i++) {
            char kullanici = kullanici_cevaplari.charAt(i);
            char anahtar = cevap_anahtari.charAt(i);
            if (kullanici == anahtar) {
                dogruSayisi++;
            } else if (kullanici == ' ') {
                bosSayisi++;
            } else {
                yanlisSayisi++;
            }
        }
        System.out.println("Doğru cevap sayısı: " + dogruSayisi + "\nYanlış cevap sayısı: " + yanlisSayisi);
    }
}
