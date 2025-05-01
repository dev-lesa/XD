package problemas;
import java.util.Scanner;
public class RecursividadFibonacci {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el límite de la serie fibonacci");
        int numero = entrada.nextInt();
        System.out.println("Serie Fibonacci:");
        for (int i = 0; i < numero; i++) {
            System.out.println(serieFibonacci(i));
        }
        entrada.close();
    }
    public static int serieFibonacci(int numero) {
        if (numero == 0 || numero == 1) return numero;
        else return serieFibonacci(numero - 1) + serieFibonacci(numero - 2);
    }
}