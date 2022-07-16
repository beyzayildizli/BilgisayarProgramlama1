/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hafta3;

import java.util.Scanner;

/**
 * @file Üç basamaklı sayı palindrome sayı mı
 * @description Bu program, kullanıcının girdiği 3 basamaklı sayının palindrome
 * sayı olup olmadığını bulur.
 * @assignment 3.hafta konuları
 * @date 14.10.2021
 * @author @beyzayildizli10@gmail.com
 */
public class UcBasamakliSayiPalindromeSayiMi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sayi;
        int tersSayi = 0;
        
        System.out.print("3 basamaklı bir Sayı Giriniz: ");
        sayi = s.nextInt();
        int girilenSayi = sayi;
        
        tersSayi = (tersSayi * 10) + (sayi % 10);
        sayi /= 10;
        tersSayi = (tersSayi * 10) + (sayi % 10);
        sayi /= 10;
        tersSayi = (tersSayi * 10) + (sayi % 10);
        sayi /= 10;

        if (tersSayi == girilenSayi) {
            System.out.println("Sayınız palindrome sayıdır");
        } else {
            System.out.println("Sayınız palindrome sayı değildir.");
        }
    }
}
