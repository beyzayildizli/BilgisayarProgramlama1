package hafta4;

import java.util.Scanner;

/**
 * @file Double sayıda noktadan sonraki sayıyı bulma
 * @description Bu program, Klavyeden girilen double bir sayının noktadan
 * sonraki bölümünü ekrana yazdırır.
 * @assignment 4.hafta konuları
 * @date 20.10.2021
 * @author @beyzayildizli10@gmail.com
 */
public class NoktadanSonrakiSayi {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Double bir sayı giriniz: ");
        double sayi = s.nextDouble();

        String sayiMetin = sayi + "";  //Sayıyı Stringe çevirdik.
        String yeniMetin = ""; //Virgulden sonraki sayının String hali
        for (int i = 0; i < sayiMetin.length(); i++) {
            if (sayiMetin.charAt(i) == '.') {
                int virguldenSonrakiBasamakSayisi = sayiMetin.length() - (i + 1);
                for (int b = 0; b < virguldenSonrakiBasamakSayisi; b++) {
                    i++;
                    yeniMetin += sayiMetin.charAt(i);
                }
                break;
            }
        }

        int virguldenSonrakiSayi = Integer.parseInt(yeniMetin); //Stringi int e çevirdik.
        System.out.println("Virgülden sonraki sayınız: " + virguldenSonrakiSayi);
    }
}
