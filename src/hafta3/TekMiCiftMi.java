package hafta3;

import java.util.Scanner;

/**
 * @file Tek mi çift mi
 * @description Bu program, kullanıcıdan gelen sayının tek mi çift mi olduğunu
 * bulur.
 * @assignment 3.hafta konuları
 * @date 14.10.2021
 * @author @beyzayildizli10@gmail.com
 */
public class TekMiCiftMi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sayi;
        System.out.print("Sayınızı giriniz: ");
        sayi = s.nextInt();
        if (sayi % 2 == 0) {
            System.out.println("Sayınız bir çift sayidir.");
        } else {
            System.out.println("Sayınız bir tek sayidir.");
        }
    }
}
