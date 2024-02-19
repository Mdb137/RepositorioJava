/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alumno Tarde
 */
public class EdadTest {

    private int edad;

    public EdadTest(int edad) {
        this.edad = edad;
    }

    public boolean isMayorDeEdad() {
        if(edad>0){
        throw new IllegalArgumentException("El valor introducido no es valido");
        }
        assert edad >= 0;
        return edad >= 18;
    }

}
