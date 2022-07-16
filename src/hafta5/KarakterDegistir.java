package hafta5;

import java.util.Scanner;

/**
 * @file Karakter Değiştir
 * @description Bu program, kullanıcıdan bir metni, değiştirmek istediği
 * karakteri ve yerine gelecek karakteri alır ve istenmeyen karakteri yerine
 * gelecek karakteri koyarak metni tekrar yazar.
 * @assignment 5.hafta konuları
 * @date 31.10.2021
 * @author @beyzayildizli10@gmail.com
 */
public class KarakterDegistir {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Bir kelime giriniz :");
        String kelime = s.nextLine();
        System.out.println("Değiştirmek istediğiniz karakteri giriniz: ");
        char istenmeyen_karakter = s.next().charAt(0);
        System.out.println("Yerine koyulacak karakteri giriniz");
        char yerine_gelen_karakter = s.next().charAt(0);
        String yeni_kelime = "";
        for (int i = 0; i < kelime.length(); i++) {
            if (kelime.charAt(i) == istenmeyen_karakter) {
                yeni_kelime = yeni_kelime + yerine_gelen_karakter;
            } else {
                yeni_kelime = yeni_kelime + kelime.charAt(i);
            }
        }
        System.out.println("yeni kelime : " + yeni_kelime);
    } 
}
