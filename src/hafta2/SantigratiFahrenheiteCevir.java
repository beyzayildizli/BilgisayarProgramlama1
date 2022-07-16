package hafta2;

import java.util.Scanner;

/**
 * @file Santigratın Fahreheit karşılığı
 * @description Bu program, santigratın Fahreheit karşılığını hesaplar.
 * @assignment 2.hafta konuları
 * @date 8.10.2021
 * @author @beyzayildizli10@gmail.com
 */
public class SantigratiFahrenheiteCevir {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double C; //Santigrat
        System.out.println("Santigrat:");
        C = s.nextDouble();
        System.out.println(C + " santigrat " + (C * (9 / 5.0) + 32) + " Fahrenheite eşittir.");
    }
}
