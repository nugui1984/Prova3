/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myutils;

import static myutils.MyUtils.edat;
import static myutils.MyUtils.factorial;
import static myutils.MyUtils.inverteix;

public class Test {

    public static void main(String[] args) {
        int edat = edat(31, 1, 1992); // Exemple ús en el main
        String cadena = "Tutankamon";
        double numero = 23;
        System.out.println(inverteix(cadena));
        System.out.println("La edat és: " + edat);
        System.out.println(factorial(numero));
    }

}
