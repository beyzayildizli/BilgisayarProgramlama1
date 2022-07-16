package hafta6;

/**
 * @file subString Metodu
 * @description Bu program, bir metnin istenen başlangıç ve bitiş indexleri arasında kalan kısmını yeniden yazdırır.
 * @assignment 6.hafta konuları
 * @date 02.02.2022
 * @author @beyzayildizli10@gmail.com
 */
public class SubStringMetodu {

    public static void main(String[] args) {
        String isim = "Beyza Yıldızlı";
        int baslangic = 2;
        int bitis = 8;
        System.out.println("Sonuç: " + subString(isim, baslangic, bitis));
    }

    public static String subString(String metin, int baslangicIndex, int bitisIndex) {
        String sonuc = "";
        for (int i = baslangicIndex; i < bitisIndex + 1; i++) {
            sonuc += metin.charAt(i);
        }
        return sonuc;
    }
}
