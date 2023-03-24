/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myutils;

import java.time.LocalDate;
import java.time.Period;
import static myutils.MyUtils.factorial;

public class MyUtils {

    public static String inverteix(String cadena) {
        String cadenaInvertida = "";
        for (int x = cadena.length() - 1; x >= 0; x--) {
            cadenaInvertida = cadenaInvertida + cadena.charAt(x);
        }
        return cadenaInvertida;
    }

    public static int edat(int day, int month, int year) {
        LocalDate naixement = LocalDate.of(year, month, day);
        LocalDate avui = LocalDate.now();
        Period period = Period.between(naixement, avui);
        return period.getYears();
    }

    public static double factorial(double numero) {
        double factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial = factorial * i;
        }
        return numero = factorial;

    }
}
