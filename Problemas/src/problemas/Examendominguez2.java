/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problemas;

/**
 *
 * @author Luis
 */
public class Examendominguez2 {
    public static int multiplicar(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n no puede ser negativo o cero.");
        }
        if (n == 1) {
            return 1;
        }
        return n * multiplicar(n - 1);
    }

    // Ejemplo de uso
    public static void main(String[] args) {
        int n = 4;
        System.out.println("Resultado: " + multiplicar(n)); // Salida: 24
    }
}
