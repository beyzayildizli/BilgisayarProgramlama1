package hafta3;

import java.util.Scanner;

/**
 * @file İki harf arasında kaç harf var
 * @description Bu program, verilen iki harf arasında kaç adet harf olduğunu
 * bulur.
 * @assignment 3.hafta konuları
 * @date 14.10.2021
 * @author @beyzayildizli10@gmail.com
 */
public class IkiHarfArasindaKacHarfVar {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Bir harf giriniz: ");
        char ilkHarf = s.nextLine().charAt(0);
        System.out.print("Bir harf giriniz: ");
        char ikinciHarf = s.nextLine().charAt(0);

        int harfSayisi = ikinciHarf - ilkHarf - 1;
        if (harfSayisi < 0) { //sonra gelen harfi önce yazıldıysa (önce d sonra a yazmak gibi)
            harfSayisi = ilkHarf - ikinciHarf - 1;
            System.out.println(ikinciHarf + " ve " + ilkHarf + " arasında " + harfSayisi + " adet harf var.");
        } else {
            System.out.println(ilkHarf + " ve " + ikinciHarf + " arasında " + harfSayisi + " adet harf var.");
        }
    }
}
