package hafta2;

import java.util.Scanner;

/**
 * @file YamugunAlani
 * @description Bu program, a kenarı, b kenarı ve h yüksekliği bilinen bir
 * yamuğun alanını hesaplar.
 * @assignment 2.hafta konuları
 * @date 8.10.2021
 * @author @beyzayildizli10@gmail.com
 */
public class YamuğunAlani {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double alttaban;
        double usttaban;
        double h;
        System.out.println("Alt taban uzunluğunu giriniz: ");
        alttaban = s.nextInt();
        System.out.println("Üst taban uzunluğunu giriniz: ");
        usttaban = s.nextInt();
        System.out.println("Yüksekliğini giriniz: ");
        h = s.nextInt();
        double alan = (alttaban + usttaban) * h / 2;
        System.out.println("Yamuğunuzun alanı: " + alan);
    }
}
