package hafta3;

import java.util.Scanner;

/**
 * @file Yeni maaş hesapla
 * @description Bu program, kullanıcıdan maaş ve çalışma yılı bilgilerini alıp
 * aşağıdaki şartlara göre yeni maaşı hesaplar.
 *
 * (Çalışma yılı <= 5 -> %10 zam uygula 5 < Çalışma yılı <= 10 -> %15 zam uygula
 * 10 < Çalışma yılı -> %20 zam uygula Zam uygulandıktan sonra herhangi bir
 * kişinin maaşı; 10> Çalışma yılı ve yeni maaş <10bin TL ise ekstra olarak %5
 * daha zam uygula)
 *
 * @assignment 3.hafta konuları
 * @date 14.10.2021
 * @author @beyzayildizli10@gmail.com
 */
public class YeniMaasHesapla {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Maaaşınızı giriniz: ");
        double maas = s.nextDouble();
        System.out.print("Çalışma yılınızı giriniz: ");
        int yil = s.nextInt();

        double zamli;
        if (yil <= 5) {
            zamli = maas + (0.1 * maas);
        } else if (yil <= 10 && yil > 5) {
            zamli = maas + (0.15 * maas);
        } else {
            zamli = maas + (0.2 * maas);
        }

        if (yil > 10 && maas < 10000) {
            zamli = zamli + (0.05 * zamli);
        }

        System.out.println("Yeni maaş: " + zamli);
    }
}
