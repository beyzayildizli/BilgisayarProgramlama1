package hafta6;

import java.util.Scanner;

/**
 * @file Şifre Oluşturucu
 * @description Bu program, en az altı karakterden oluşma, en az iki rakam, en
 * az üç özel karakter (_, ?, !) ve bir büyük harf içerme şartlarına uygun olan
 * bir parola yazmamızı sağlar.
 * @assignment 6.hafta konuları
 * @date 02.02.2022
 * @author @beyzayildizli10@gmail.com
 */
public class SifreOlusturucu {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Bir şifre giriniz :");
        String sifre = s.nextLine();
        while (true) {
            if (gecerliParolaMi(sifre) == true) {
                System.out.println("Şifreniz geçerlidir.");
                break;
            } else {
                System.out.println("Şifre geçersiz. Farklı bir bir şifre giriniz :");
                sifre = s.nextLine();
            }
        }
    }

    public static boolean gecerliParolaMi(String parola) {
        boolean durum = false;
        if (kackarakterIceriyor(parola) > 5 && kacRakamIceriyor(parola) > 1 && kacOzelKarakterIceriyor(parola) > 2 && kacBuyukHarfIceriyor(parola) == 1) {
            durum = true;
        }
        return durum;

    }

    public static int kackarakterIceriyor(String metin) {
        return metin.length();
    }

    public static int kacRakamIceriyor(String metin) {
        int rakamSayisi = 0;
        for (int i = 0; i < metin.length(); i++) {
            if (metin.charAt(i) < 58 && metin.charAt(i) > 47) {
                rakamSayisi++;
            }
        }
        return rakamSayisi;
    }

    public static int kacOzelKarakterIceriyor(String metin) {
        int ozelKarakterSayisi = 0;
        for (int i = 0; i < metin.length(); i++) {
            if (metin.charAt(i) == '-' || metin.charAt(i) == '_' || metin.charAt(i) == '!') {
                ozelKarakterSayisi++;
            }
        }
        return ozelKarakterSayisi;
    }

    public static int kacBuyukHarfIceriyor(String metin) {
        int buyukHarfSayisi = 0;
        for (int i = 0; i < metin.length(); i++) {
            if (metin.charAt(i) < 91 && metin.charAt(i) > 64) {
                buyukHarfSayisi++;
            }
        }
        return buyukHarfSayisi;
    }

}
