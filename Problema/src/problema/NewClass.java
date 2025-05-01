/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author utpl
 */
public class NewClass {

    public static boolean continuar = true;

    public static void main(String[] args) {
        int[] numeros = new int[100];
        int cantidad = leerArchivo("numeros.txt", numeros);
        if (continuar) {
            System.out.println("lista original");
            mostrarArreglo(numeros, cantidad);
            int sumaPrimos = sumaPrimosRecursiva(numeros, cantidad - 1);
            System.out.println("suma de numeros primos " + sumaPrimos);
            invertirArregloRecursivo(numeros, 0, cantidad - 1);
            System.out.println("lista invertida");
            mostrarArreglo(numeros, cantidad);
        }
    }

    public static int leerArchivo(String nombreArchivo, int[] arreglo) {
        int contador = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null && contador < arreglo.length) {
                arreglo[contador++] = Integer.parseInt(linea.trim());
            }
            System.out.println("El archvo se leyó correctamente");
        } catch (Exception e) {
            System.out.println("error al leer el archivo\nError del tipo: " + e);
            continuar = false;
        }
        return contador;
    }

    public static void mostrarArreglo(int[] arreglo, int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }

    public static int sumaPrimosRecursiva(int[] arreglo, int indice) {
        if (indice < 0) {
            return 0;
        }
        if (esPrimo(arreglo[indice])) {
            return arreglo[indice] + sumaPrimosRecursiva(arreglo, indice - 1);
        } else {
            return sumaPrimosRecursiva(arreglo, indice - 1);
        }
    }

    public static boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        return esPrimoRecursivo(n, 2);
    }

    public static boolean esPrimoRecursivo(int n, int divisor) {
        if (divisor > Math.sqrt(n)) {
            return true;
        }
        if (n % divisor == 0) {
            return false;
        }
        return esPrimoRecursivo(n, divisor + 1);
    }

    public static void invertirArregloRecursivo(int[] arreglo, int inicio, int fin) {
        if (inicio >= fin) {
            return;
        }
        int temp = arreglo[inicio];
        arreglo[inicio] = arreglo[fin];
        arreglo[fin] = temp;
        invertirArregloRecursivo(arreglo, inicio + 1, fin - 1);
    }
}
