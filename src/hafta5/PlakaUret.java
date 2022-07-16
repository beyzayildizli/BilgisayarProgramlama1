package hafta5;

/**
 * @file Plaka Üret
 * @description Bu program, aşağıdaki koşulları sağlayan plaka üretir.
 * Koşullar:
 * İlk iki karakter tam sayı.
 * 3,4,5. karakterler büyük harf. 
 * 6,7,8,9. karakterler tam sayı.
 * @assignment 5.hafta konuları
 * @date 31.10.2021
 * @author @beyzayildizli10@gmail.com
 */
public class PlakaUret {
    public static void main(String[] args) {
        int ilk = 10 + (int) (Math.random() * 90);
        char ikinci = (char) (65 + ((int) (Math.random() * (90 - 65 + 1))));
        char ucuncu = (char) (65 + ((int) (Math.random() * (90 - 65 + 1))));
        char dorduncu = (char) (65 + ((int) (Math.random() * (90 - 65 + 1))));
        int besinci = 1000 + (int) (Math.random() * 9000);
        System.out.println("" + ilk + ikinci + ucuncu + dorduncu + besinci);
    }
}
