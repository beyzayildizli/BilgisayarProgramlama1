package hafta4;

import java.util.Scanner;

/**
 * @file x'e Kadar Olan Fibonaççi Sayılar
 * @description Bu program, kullanıcının girdiği ‘n’ değerine kadar olan tüm
 * fibonaççi sayıları yazar.
 * @assignment 4.hafta konuları
 * @date 10.08.2021
 * @author @beyzayildizli10@gmail.com
 */
public class FibonacciSayilar {
    public static void main(String[] args) {
        System.out.println("İstediğiniz sayıya kadar olan tüm fibonaççi sayılarını söyleyeceğim.");
        System.out.print("Lütfen sayınızı girin: ");

        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        int x = 1;
        int y = 1;

        System.out.print(x + " ");
        System.out.print(y + " ");

        while (y < 9999999) {
            x = x + y;
            if (x >= i) {
                break;
            } else {
                System.out.print(x + " ");
            }

            y = x + y;
            if (y >= i) {
                break;
            } else {
                System.out.print(y + " ");
            }
        }
    }
}
