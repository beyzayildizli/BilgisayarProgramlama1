package hafta6;

/**
 * @file replace Metodu
 * @description Bu program, bir metindeki istenmeyen karakteri farklı bir
 * karakterle değiştirir.
 * @assignment 6.hafta konuları
 * @date 02.02.2022
 * @author @beyzayildizli10@gmail.com
 */
public class ReplaceMetodu {

    public static void main(String[] args) {
        String isim = "Beyza Yıldızlı";
        char degistir = 'ı';
        char yerineGel = 'i';
        System.out.println("Sonuç: " + replace(isim, degistir, yerineGel));
    }

    public static String replace(String str, char orj, char replace) {
        String sonuc = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == orj) {
                sonuc += replace;
            } else {
                sonuc += str.charAt(i);
            }
        }
        return sonuc;
    }
}
