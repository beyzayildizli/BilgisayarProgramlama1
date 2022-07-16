package hafta4;

import java.util.Scanner;

/**
 * @file Sayı Tahmin Oyunu
 * @description Bu program, kullanıcının bilgisayarın tuttuğu sayıyı bulmaya
 * çalışmasını sağlar. Doğru cevabı bulana kadar kullanıcıya "Daha büyük" yada
 * "Daha küçük" gibi ipuçları verir.
 * @assignment 4.hafta konuları
 * @date 20.10.2021
 * @author @beyzayildizli10@gmail.com
 */
public class SayiTahminOyunu {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tahmin;
        int bil = (int) (1 + (int) (Math.random() * 99));
        System.out.println("1-100 arasından bilgisayarın tuttuğu sayıyı tahmin et:");
        tahmin = s.nextInt();
        do {
            if (bil < tahmin) {
                System.out.println("Bilgisayar daha küçük bir sayı tuttu.");
            } else if (bil > tahmin) {
                System.out.println("Bilgisayar daha büyük bir sayı tuttu.");
            }
            System.out.println("Yeniden dene: ");
            tahmin = s.nextInt();
        } while (tahmin != bil);
        System.out.println("Doğru bildin.");
    }
}
