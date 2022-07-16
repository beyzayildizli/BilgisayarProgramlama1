package hafta4;

import java.util.Scanner;

/**
 * @file Amstrong sayı mı
 * @description Bu program, kullanıcının girdiği ‘n’ basamaklı tam sayının
 * Armstrong sayı olup olmadığını bulur.
 * @assignment 4.hafta konuları
 * @date 20.10.2021
 * @author @beyzayildizli10@gmail.com
 */
public class AmstrongSayiMi {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz:");
        int sayi = s.nextInt();

        int basamakSayisi = 0;
        int girilenSayi = sayi;

        //Basamak sayısı hesapla
        int işlemYapilacakSayi = sayi;
        while (işlemYapilacakSayi != 0) {
            işlemYapilacakSayi /= 10;
            basamakSayisi++;
        }

        int toplam = 0;
        for (int i = 0; i < basamakSayisi; i++) {
            int sonRakam = sayi % 10;
            toplam += Math.pow(sonRakam, basamakSayisi);
            sayi /= 10;
        }
        if (girilenSayi == toplam) {
            System.out.println("Armstrong Sayı");
        } else {
            System.out.println("Armstrong Sayı Değil");
        }
    }
}
