package hafta5;

import java.util.Scanner;

/**
 * @file Öğrenci No
 * @description Bu program, kullanıcıdan öğrenci numarasını alır ve kayıt yılını
 * ve bölümünü yazdırır. (122: Bilgisayar Mühendisliği, 123: Biyomedikal
 * Mühendisliği, 124: Elektrik-Elektronik Mühendisliği) 
 * Örnek-> 
 * Öğrenci no:191221122 -> 2019'da kayıt olmuş. Bilgisayar Mühendisliği
 * Öğrenci no:204326124 -> 2020'de kayıt olmuş. Elektrik-Elektronik Mühendisliği
 *
 * @assignment 5.hafta konuları
 * @date 31.10.2021
 * @author @beyzayildizli10@gmail.com
 */
public class OgrenciNo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Öğrenci Numarası Giriniz: ");
        String num = s.nextLine();
        String yil = "";
        String bolum = "";
        for (int i = 0; i < 2; i++) {
            yil += num.charAt(i);
        }
        for (int i = 2; i < 5; i++) {
            bolum += num.charAt(i);
        }
        int bolumu = Integer.parseInt(bolum);
        System.out.println("Kayıt Yılı: " + (20 + yil));
        switch (bolumu) {
            case 122:
                System.out.println("Bölüm: Bilgisayar Mühendisliği");
                break;
            case 123:
                System.out.println("Bölüm: Biyomedikal Mühendisliği");
                break;
            case 124:
                System.out.println("Bölüm: Elektrik-Elektronik Mühendisliği");
                break;
            default:
                break;
        }
    }
}
