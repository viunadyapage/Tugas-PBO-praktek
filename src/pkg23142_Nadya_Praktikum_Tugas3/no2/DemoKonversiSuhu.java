/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg23142_Nadya_Praktikum_Tugas3.no2;

/**
 *
 * @author kukib
 */
public class DemoKonversiSuhu {
    public static void main(String[] args) {
        KonversiSuhu2 konversi = new KonversiSuhu2();

        double celcius = 25.0;
        System.out.println("Celcius ke Fahrenheit: " + konversi.celciusToFahrenheit(celcius));
        System.out.println("Celcius ke Reamur: " + konversi.celciusToReamur(celcius));
        
        double fahrenheit = 77.0;
        System.out.println("Fahrenheit ke Reamur: " + konversi.fahrenheitToReamur(fahrenheit));
    }
}
