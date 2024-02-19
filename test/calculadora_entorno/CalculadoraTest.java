/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package calculadora_entorno;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;

/**
 *
 * @author Alumno Tarde
 */
public class CalculadoraTest {

    static Calculadora cal;

    public CalculadoraTest() {
    }
    @BeforeClass
    public static void before() {
        System.out.println("before();");
        cal = new Calculadora();
    }

    @Test
    public void testSumar() {
        System.out.println("sumar");
        int a = 2;
        int b = 3;
        int expResult = 5;
        int result = cal.sumar(a, b);
        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
    }

    @Test
    public void testRestar() {
        System.out.println("restar");
        int a = 2;
        int b = 1;
        int expResult = 1;
        int result = cal.restar(a, b);
        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
    }

    @Test(expected = ArithmeticException.class)
    public void testDividir() {
        System.out.println("dividir");
        int a = 10;
        int b = 0;
        int expResult = 2;
        int result = cal.dividir(a, b);
        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
    }

    @Test(timeout = 2200)
    public void testOperacionOptima() {
        System.out.println("operacionOptima");
        cal.operacionOptima();
//        fail("The test case is a prototype.");
    }

    @Test
    public void testClear() {
        System.out.println("clear");
        Calculadora instance = new Calculadora();
        instance.clear();
//        fail("The test case is a prototype.");
    }

}
