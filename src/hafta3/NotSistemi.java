package hafta3;

import java.util.Scanner;

/**
 * @file Not Sistemi
 * @description Bu program, vize ve final notunu kullanıcıdan alıp dönem
 * ortalamasını hesaplar ve harf notunu yazdırır.
 * @assignment 3.hafta konuları
 * @date 14.10.2021
 * @author @beyzayildizli10@gmail.com
 */
public class NotSistemi {
  public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Vize notunuzu giriniz: ");
        double vize = s.nextDouble();
        System.out.print("Final notunuzu giriniz: ");
        double finalNotu = s.nextDouble();

        double donemOrt = vize * 0.4 + finalNotu * 0.6;
        System.out.println("Dönem ortalamanız: " + donemOrt);

        if (donemOrt >= 90) {
            System.out.print("Harf notunuz: AA");
        } else if (donemOrt >= 85 && donemOrt <= 89) {
            System.out.print("Harf notunuz: BA");
        } else if (donemOrt >= 80 && donemOrt <= 84) {
            System.out.print("Harf notunuz: BB");
        } else if (donemOrt >= 75 && donemOrt <= 79) {
            System.out.print("Harf notunuz: CB");
        } else if (donemOrt >= 65 && donemOrt <= 74) {
            System.out.print("Harf notunuz: CC");
        } else if (donemOrt >= 60 && donemOrt <= 64) {
            System.out.print("Harf notunuz: DC");
        } else if (donemOrt >= 55 && donemOrt <= 59) {
            System.out.print("Harf notunuz: DD");
        } else if (donemOrt >= 50 && donemOrt <= 54) {
            System.out.print("Harf notunuz: FD");
        } else {
            System.out.print("Harf notunuz: FF");
        }
    }  
}
