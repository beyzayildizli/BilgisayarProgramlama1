/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hafta2;

import java.util.Scanner;

/**
 * @file Faiz hesabı
 * @description Bu program, faiz hesabı yapar.
 * (geri ödeme miktarı = miktar*zaman*oran/100)
 * @assignment 2.hafta konuları
 * @date 8.10.2021
 * @author @beyzayildizli10@gmail.com
 */
public class OrtalamaHesapla {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int miktar;
        int zaman;
        double oran; //faiz oranı
        System.out.println("Miktar giriniz:");
        miktar = s.nextInt();
        System.out.println("Kaç ay olduğunu giriniz:");
        zaman = s.nextInt();
        System.out.println("Faiz oranını giriniz:");
        oran = s.nextDouble();
        System.out.println("Geri ödeme miktarı: " + (miktar * zaman * oran / 100));
    }
}
