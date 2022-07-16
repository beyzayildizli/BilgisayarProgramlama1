package hafta6;

/**
 * @file Şifre Üret
 * @description Bu program, beliren aralaıkta sayı ve karakter üreterek
 * örnekteki gibi 10 basamaklı bir şifre üretir. (örnek: 1a2s9f5z8n)
 * @assignment 6.hafta konuları
 * @date 02.02.2022
 * @author @beyzayildizli10@gmail.com
 */
public class SifreUret {
    public static void main(String[] args) {
        String metin = "";
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                metin += rastgeleKarakterUret('c', 'f');
            } else {
                metin += rastgeleSayiUret(1, 3);
            }
        }
        System.out.println("Şifre: " + metin);
    }

    public static int rastgeleSayiUret(int baslangic, int bitis) {
        int sayi = (int) (baslangic + Math.random() * (bitis - baslangic + 1));
        return sayi;
    }

    public static char rastgeleKarakterUret(char baslangic, char bitis) {
        char karakter = (char) (baslangic + (Math.random() * (bitis - baslangic + 1)));
        return karakter;
    }
}
