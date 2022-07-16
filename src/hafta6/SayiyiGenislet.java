package hafta6;

/**
 * @file Sayıyı Genişlet
 * @description Bu program, bir tam sayıyı istenen genişlikte yazabilir. 
 * (örnek: 56'yı 8 rakam genişliğinde yaz -> 00000056)
 * @assignment 6.hafta konuları
 * @date 02.02.2022
 * @author @beyzayildizli10@gmail.com
 */
public class SayiyiGenislet {
   public static void main(String[] args) {
        System.out.println("Sonuç: " + format(56, 8));
    }

    public static String format(int sayi, int genislik) {
        int basamakSayisi = String.valueOf(sayi).length();
        String sonuc = "";
        for (int i = 0; i < (genislik - basamakSayisi); i++) {
            sonuc += 0;
        }
        sonuc += sayi;
        return sonuc;
    } 
}
