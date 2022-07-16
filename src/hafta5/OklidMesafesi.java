/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hafta5;

import java.util.Scanner;

/**
 * @file Öklid Mesafesi
 * @description Bu program, x1,y1,x2,y2 değerlerini kullanıcıdan alır ve öklid
 * mesafesini hesaplar.
 * @assignment 5.hafta konuları
 * @date 31.10.2021
 * @author @beyzayildizli10@gmail.com
 */
public class OklidMesafesi {
 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("X1: ");
        int x1 = s.nextInt();
        System.out.print("Y1: ");
        int y1 = s.nextInt();
        System.out.print("X2: ");
        int x2 = s.nextInt();
        System.out.print("Y2: ");
        int y2 = s.nextInt();
        double oklidMesafesi = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        System.out.println("Öklid mesafesi: " + oklidMesafesi);
    }   
}
