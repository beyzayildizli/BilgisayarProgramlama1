package hafta6;

/**
 * @file EBOB Hesapla
 * @description Bu program, verilen iki sayının en büyük ortak bölenini
 * hesaplar.
 * @assignment 6.hafta konuları
 * @date 02.02.2022
 * @author @beyzayildizli10@gmail.com
 */
public class EbobHesapla {
    public static void main(String[] args) {
        System.out.println(ebob(24, 24));
    }

    public static int ebob(int sayi1, int sayi2) {
        int buyukSayi;
        int kucukSayi;
        if (sayi1 < sayi2) {
            buyukSayi = sayi2;
            kucukSayi = sayi1;
        } else {
            buyukSayi = sayi1;
            kucukSayi = sayi2;
        }
        
        int ebob = 0;
        for (int i = 1; i < buyukSayi+1; i++) {
            if (buyukSayi % i == 0 && kucukSayi % i == 0) {
                ebob = i;
            }
        }
        return ebob;
    }
}
