package problemas;
import java.util.Random;
public class ArreglosManejoBasico {
    public static void main(String[] args) {
        int numeros[] = new int[10];
        Random random = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100);
        }
        System.out.println("Los numeros Aletorios son:");
        imprimirArreglo(numeros);
        System.out.println("");
        int maximo = EncontrarMaximo(numeros);
        int minimo = EncontrarMinimo(numeros);
        System.out.println("\nValor maximo: " + maximo);
        System.out.println("Valor minimo: " + minimo);
        int[] arregloInvertido = ArregloInvertido(numeros);
        System.out.println("\nArreglo invertido:");
        imprimirArreglo(arregloInvertido);
    }
    public static void imprimirArreglo(int numeros[]) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
    }
    public static int EncontrarMaximo(int numeros[]) {
        int maximo = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) maximo = numeros[i];
        }
        return maximo;
    }
    public static int EncontrarMinimo(int numeros[]) {
        int minimo = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < minimo) minimo = numeros[i];
        }
        return minimo;
    }
    public static int[] ArregloInvertido(int[] arreglo) {
        int invertido[] = new int[arreglo.length];
        int j = 0;
        for (int i = arreglo.length - 1; i >= 0; i--) {
            invertido[j] = arreglo[i];
            j++;
        }
        return invertido;
    }
}