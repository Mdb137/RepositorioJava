/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package calculadora_entorno;

import static calculadora_entorno.CalculadoraTest.cal;
import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Alumno Tarde
 */
@RunWith(value = Parameterized.class)
public class CalculadoraParametroTest {

    private int a, b, expected;

    public CalculadoraParametroTest(int a, int b, int expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("beforeClass();");
        cal = new Calculadora();
    }

    @Test
    public void testSuma() {
        Calculadora cal = new Calculadora();
        int result = cal.sumar(a, b);
        assertEquals(expected, result);
    }

    @Parameters
    public static Iterable<Object[]> getData() {
        return Arrays.asList(new Object[][]{
            {2, 1, 3}, {10, 10, 5},{5, 5,10}, {40, 10, 51},{-1, 3, 2}, {40, 15, 55}
                
        });
    }
}
