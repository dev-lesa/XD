package problemas;
import java.util.Scanner;
public class ArreglosSinRepetirOrdenar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] arreglo = new int[10];

        boolean bandera = true;
        int contador = 0;
        int numero;
        while (bandera) {
            System.out.println("ingrese un numero para la posicion " + contador);
            numero = entrada.nextInt();

            if (verificar(arreglo, numero, contador)) {
                arreglo[contador] = numero;
                contador++;
            } else {
                System.out.println("Los numeros no deben repetirse");
            }
            if (contador >= 10) {
                bandera = false;
            }
        }
        presentarArreglo(arreglo);
        int[] arregloOrdenado = ordenarBurbuja(arreglo);
        presentarArreglo(arregloOrdenado);
        
        System.out.println("Ingrese el valor a eliminar:");
        int valorEliminar = entrada.nextInt();
        arregloOrdenado = eliminarValor(arregloOrdenado, valorEliminar);
        System.out.println("Arreglo después de eliminar:");
        presentarArreglo(arregloOrdenado);
        
        System.out.println("Ingrese el valor a sustituir:");
        int valorAntiguo = entrada.nextInt();
        System.out.println("Ingrese el nuevo valor:");
        int valorNuevo = entrada.nextInt();
        arregloOrdenado = sustituirValor(arregloOrdenado, valorAntiguo, valorNuevo);
        
        System.out.println("Arreglo final:");
        presentarArreglo(arregloOrdenado);
    }

    public static boolean verificar(int[] arreglo, int num, int contador) {
        boolean bool = true;
        arreglo[contador] = num;
        for (int i = 0; i < contador; i++) {
            if (arreglo[i] == num) {
                bool = false;
            }
        }
        return bool;
    }

    public static void presentarArreglo(int[] arreglo) {
        System.out.println("valores del arreglo:");

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("arreglo en el indice [" + i + "] = " + arreglo[i]);
        }
        System.out.println("");
    }

    public static int[] ordenarBurbuja(int[] arreglo) {
        int n = arreglo.length;
        boolean intercambio;
        for (int i = 0; i < n - 1; i++) {
            intercambio = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                    intercambio = true;
                }
            }
            if (!intercambio) {
                break;
            }
        }
        return arreglo;
    }
    
    public static int[] eliminarValor(int[] arreglo, int valor) {
        int[] nuevoArreglo = new int[arreglo.length - 1];
        int index = 0;
        boolean encontrado = false;
        
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valor && !encontrado) {
                encontrado = true;
                continue;
            }
            if (index < nuevoArreglo.length) {
                nuevoArreglo[index] = arreglo[i];
                index++;
            }
        }
        
        if (!encontrado) {
            System.out.println("El valor no se encontró en el arreglo.");
            return arreglo;
        }
        
        return nuevoArreglo;
    }
    
    public static int[] sustituirValor(int[] arreglo, int valorAntiguo, int valorNuevo) {
        boolean encontrado = false;
        
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valorAntiguo) {
                arreglo[i] = valorNuevo;
                encontrado = true;
            }
        }
        
        if (!encontrado) {
            System.out.println("El valor a sustituir no se encontró en el arreglo.");
        }
        
        return arreglo;
    }
}