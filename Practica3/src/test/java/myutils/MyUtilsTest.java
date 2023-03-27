/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package myutils;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyUtilsTest {

    public MyUtilsTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testInverteix() {
        System.out.println("Invertir cadena1");
        String cadena = "Hola";
        String cadenaInvertida = "aloH";
        assertEquals(cadenaInvertida, MyUtils.inverteix(cadena));
    }


   public void testInverteix1() {
        System.out.println("Invertir cadena2");
        String cadena1 = "";
        String cadenaInvertida1 = "";
        assertEquals(cadenaInvertida1, MyUtils.inverteix(cadena1));
    }


    public void testInverteix2() {
        System.out.println("Invertir cadena3");
         String cadena2 = "re322";
        String cadenaInvertida2 = "223er";
        assertEquals(cadenaInvertida2, MyUtils.inverteix(cadena2));
    }

    @Test
      public void testedat() {
         System.out.println("edat1");
        int day = 22;
        int month = 3;
        int year = 1990;
        int edadEsperada = 33;
        assertEquals(edadEsperada, MyUtils.edat(day, month, year));
    }


    public void testedat1() {
         System.out.println("edat2");
         int day = 22;
        int month = 3;
        int year = 2025;
        int edadEsperada = 0;
        assertEquals(edadEsperada, MyUtils.edat(day, month, year));
    }

    public void testedat2() {
        System.out.println("edat3");
        int day = 22;
        int month = 13;
        int year = 1990;
        int edadEsperada = 0;
        assertEquals(edadEsperada, MyUtils.edat(day, month, year));
    }

    public void testedat3() {
        System.out.println("edat4");
        int day = 32;
        int month = 3;
        int year = 2011;
        int expResult = 0;
        int result = MyUtils.edat(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void testfactorial() {
        System.out.println("factorial");
        double numero = 23;
        double expResult = 2.585201673888498E22;
        double result = MyUtils.factorial(numero);
        assertEquals(expResult, result);
    }

    public void testfactorial1() {
        System.out.println("factorial2");
        double numero = -2;
        double expResult = 1;
        double result = MyUtils.factorial(numero);
        assertEquals(expResult, result, 0);
    }
    public void testfactorial2() {
        System.out.println("factorial3");
        double numero = 0;
        double expResult = 1;
        double result = MyUtils.factorial(numero);
        assertEquals(expResult, result);
    }
}
