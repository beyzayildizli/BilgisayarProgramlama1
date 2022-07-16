/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hafta2;

import java.util.Scanner;

/**
 * @file Zam Oranı
 * @description Bu program, eski ve yeni fiyatlarını kulllanıcıdan istediğimiz
 * bir ürünün zam oranını hesaplar.
 * @assignment 2.hafta konuları
 * @date 8.10.2021
 * @author @beyzayildizli10@gmail.com
 */
public class ZamOrani {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double yeni;
        double eski;
        System.out.println("Yeni fiyatı giriniz: ");
        yeni = s.nextDouble();
        System.out.println("Eski fiyatını giriniz: ");
        eski = s.nextDouble();
        System.out.println("Zam oranı: %" + (yeni - eski) / eski * 100);
    }
}
