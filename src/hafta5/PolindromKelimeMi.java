package hafta5;

import java.util.Scanner;

/**
 * @file Polindrom Kelime Mi
 * @description Bu program, verilen kelimenin polindrom olup olmadığını
 * gösterir. (örnekler: kek, kapak, makam, takat)
 * @assignment 5.hafta konuları
 * @date 31.10.2021
 * @author @beyzayildizli10@gmail.com
 */
public class PolindromKelimeMi {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Bir kelime giriniz :");
        String kelime = s.nextLine();
        String yeni_kelime = "";

        for (int i = kelime.length() - 1; i >= 0; i--) {
            yeni_kelime += kelime.charAt(i);
        }
        if (kelime.equals(yeni_kelime)) {
            System.out.println("Palindrom kelimedir.");
        } else {
            System.out.println("Palindrom kelime değildir.");
        }
    }
}
