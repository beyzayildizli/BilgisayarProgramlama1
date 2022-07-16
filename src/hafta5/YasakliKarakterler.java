package hafta5;

import java.util.Scanner;

/**
 * @file Yasaklı Karakterler
 * @description Bu program, kullanıcıdan bir metin alır ve yasaklı karakterleri
 * silip metni tekrar yazdırır. (Yasaklı karakterler: _ , -, !, ?, ç)
 * @assignment 5.hafta konuları
 * @date 31.10.2021
 * @author @beyzayildizli10@gmail.com
 */
public class YasakliKarakterler {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Bir kelime giriniz :");
        String kelime = s.nextLine();
        String yeni_kelime = "";
        for (int i = 0; i < kelime.length(); i++) {
            if (kelime.charAt(i) == '_' || kelime.charAt(i) == '-' || kelime.charAt(i) == '!' || kelime.charAt(i) == '?' || kelime.charAt(i) == 'ç') {
            } else {
                yeni_kelime = yeni_kelime + kelime.charAt(i);
            }
        }
        System.out.println("yeni kelime : " + yeni_kelime);
    }
}
