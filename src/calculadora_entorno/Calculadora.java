/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora_entorno;

/**
 *
 * @author Alumno Tarde
 */
public class Calculadora {

    private int ans;
    
    public Calculadora() {
        ans = 0;
    }

    public int sumar(int a, int b) {
        ans = a + b;
        return ans;
    }

    public int restar(int a, int b) {
        ans = a - b;
        return ans;
    }

    public int dividir(int a, int b) {

        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por 0");
        }
        ans = a / b;
        return ans;
    }

    public void operacionOptima() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
    }
    public void clear(){
    ans=0;
    }
}
