package hafta2;

import static java.lang.Math.PI;
import java.util.Scanner;

/**
 * @file DaireninAlanVeCevresi
 * @description Bu program, yarıçapını kullanıcıdan aldığı dairenin alanını ve
 * çevresini hesaplar.
 * @assignment 2.hafta konuları
 * @date 8.10.2021
 * @author @beyzayildizli10@gmail.com
 */
public class DaireninAlaniVeCevresi {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double r;
        System.out.println("Yarıçapı giriniz:");
        r = s.nextDouble();
        System.out.println("Alanı: " + PI * r * r);
        System.out.println("Çevresi: " + 2 * PI * r);
    }
}
