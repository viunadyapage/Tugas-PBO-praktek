/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg23142_Nadya_Praktikum_Tugas3;

/**
 *
 * @author kukib
 */
public class MatematikaInheritance {
    public static void main(String[] args) {
        Matematika2 matematika = new Matematika2();

        System.out.println("Pertambahan: " + matematika.pertambahan(20, 10));
        System.out.println("Pengurangan: " + matematika.pengurangan(10, 5));
        System.out.println("Perkalian: " + matematika.perkalian(10, 3));
        System.out.println("Pembagian: " + matematika.pembagian(21, 2));
        System.out.println("Modulus: " + matematika.modulus(21, 2));
    }
}
