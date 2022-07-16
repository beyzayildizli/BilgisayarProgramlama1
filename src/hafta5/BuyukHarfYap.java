package hafta5;

import java.util.Scanner;

/**
 * @file Büyük Harf Yap
 * @description Bu program, kullanıcıdan aldığı metindeki tüm büyük harfleri küçük
 * yapar ve metni tekrar yazar.
 * @assignment 5.hafta konuları
 * @date 31.10.2021
 * @author @beyzayildizli10@gmail.com
 */
public class BuyukHarfYap {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Bir kelime giriniz :");
        String kelime = s.nextLine();
        String kelime2 = "";
        for (int i = 0; i < kelime.length(); i++) {
            if ((int) kelime.charAt(i) <= 90 && (int) kelime.charAt(i) >= 65) {
                int fark = 'a' - 'A';
                kelime2 += (char) (kelime.charAt(i) + fark);
            } else {
                kelime2 += kelime.charAt(i);
            }
        }
        System.out.println("Yeni kelimeniz:" + kelime2);
    }
}
