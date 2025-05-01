package problemas;
import java.util.Scanner;
public class RecursividadContarNumeroArreglo {
    static int posicion = 0;
    static int numeroBuscado;
    static int contador;
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese cuantos numeros quiere que tenga el arreglo");
        int n = entrada.nextInt();
        int[] arreglo = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("ingrese el numero para el indice " + i);
            arreglo[i] = entrada.nextInt();
        }
        System.out.println("ingrese el numero que desea saber cuantas veces está en el arreglo");
        numeroBuscado = entrada.nextInt();
        contadorNum(arreglo);
        System.out.println("el numero " + numeroBuscado + " sale " + contador + " veces");
    }
    public static void contadorNum(int[] arreglo) {
        if (posicion < arreglo.length) {
            if (arreglo[posicion] == numeroBuscado) contador++;
            posicion++;
            contadorNum(arreglo);
        }
    }
}