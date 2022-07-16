package hafta6;

/**
 * @file Palindromik Olmayan Asal Sayılar
 * @description Bu program, 1-400 arasında palindromik olmayan asal sayıları
 * gösterir. (Bir sayının kendisi asal ise aynı zamanda tersi de asal ise ve bu
 * sayının kendisi palindromik değil ise bu sayıya palindromik olmayan asal sayı
 * denir.)
 * @assignment 6.hafta konuları
 * @date 02.02.2022
 * @author @beyzayildizli10@gmail.com
 */
public class PalindromikOlmayanAsalSayilar {
    public static void main(String[] args) {
        palindromikOlmayanAsalSayilariYazdir();
    }

    public static int tersCevir(int sayi) {
        String sayiMetin = sayi + "";
        String tersSayiMetin = "";

        for (int i = (sayiMetin.length() - 1); i >= 0; i--) {
            tersSayiMetin += sayiMetin.charAt(i);
        }
        int tersSayi = Integer.parseInt(tersSayiMetin);
        return tersSayi;
    }

    public static boolean palindromeSayiMi(int sayi) {
        boolean sonuc = false;
        int girilenSayi = sayi;

        //Basamak sayısı hesapla
        int basamakSayisi = 0;
        int işlemYapilacakSayi = sayi;
        while (işlemYapilacakSayi != 0) {
            işlemYapilacakSayi /= 10;
            basamakSayisi++;
        }

        int tersSayi = 0;
        for (int i = 0; i < basamakSayisi; i++) {
            tersSayi = (tersSayi * 10) + (sayi % 10);
            sayi /= 10;
        }

        if (tersSayi == girilenSayi) {
            sonuc = true;
        }

        return sonuc;
    }

    public static boolean asalSayiMi(int sayi) {
        boolean sonuc;
        if (sayi == 1 || sayi < 1) {
            sonuc = false;
        } else {
            sonuc = true;
            for (int i = 2; i < sayi - 2; i++) {
                if (sayi % i == 0) {
                    sonuc = false;
                    break;
                }
            }
        }

        return sonuc;
    }

    public static void palindromikOlmayanAsalSayilariYazdir() {
        for (int i = 0; i < 400; i++) {
            if (asalSayiMi(i) == true && asalSayiMi(tersCevir(i)) == true && palindromeSayiMi(i) == false) {
                System.out.print(i + ", ");
            }
        }
    }
}
