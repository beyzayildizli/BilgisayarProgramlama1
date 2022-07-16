package hafta4;

import java.util.Scanner;

/**
 * @file Taş Kağıt Makas
 * @description Bu program, kullanıcının bilgisayarla taş kağıt makas oynamasını
 * sağlar. Eğer durum berabere olursa tekrar oynarlar.
 * @assignment 4.hafta konuları
 * @date 20.10.2021
 * @author @beyzayildizli10@gmail.com
 */
public class TasKagitMakas {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean beraberlikVarMi = false;
        do {
            System.out.println("makas (0), taş (1), kağıt (2): ");
            int kullanici = s.nextInt();
            int bil = (int) (Math.random() * 2);
            if (kullanici == 0 && bil == 1) {
                System.out.println("Bilgisayar taşı seçti. Sen makası. Bilgisayar kazandı");
            } else if (kullanici == 0 && bil == 2) {
                System.out.println("Bilgisayar kağıdı seçti. Sen makası. Sen kazandın");
            } else if (kullanici == 1 && bil == 0) {
                System.out.println("Bilgisayar makası seçti. Sen taşı. Sen kazandın");
            } else if (kullanici == 1 && bil == 2) {
                System.out.println("Bilgisayar kağıdı seçti. Sen taşı. Bilgisayar kazandı");
            } else if (kullanici == 2 && bil == 0) {
                System.out.println("Bilgisayar makası seçti. Sen kağıdı. Bilgisayar kazandı");
            } else if (kullanici == 2 && bil == 1) {
                System.out.println("Bilgisayar taşı seçti. Sen kağıdı. Sen kazandın");
            } else if (kullanici == 0 && bil == 0) {
                System.out.println("Bilgisayar da sen de makası seçtiniz. Sonuç berabere.\nHadi tekrar oyna");
                beraberlikVarMi = true;
            } else if (kullanici == 1 && bil == 1) {
                System.out.println("Bilgisayar da sen de taşı seçtiniz. Sonuç berabere.\nHadi tekrar oyna");
                beraberlikVarMi = true;
            } else if (kullanici == 2 && bil == 2) {
                System.out.println("Bilgisayar da sen de kağıdı seçtiniz. Sonuç berabere.\nHadi tekrar oyna");
                beraberlikVarMi = true;
            }
        } while (beraberlikVarMi == true);
    }
}
