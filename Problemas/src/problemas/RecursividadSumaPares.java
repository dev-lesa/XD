package problemas;
import java.util.Scanner;
public class RecursividadSumaPares {
    static int cont = 0;
    static int sumafinal = 0;
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros pares que desea sumar");
        int n = entrada.nextInt();
        int par = 0;
        sumaPares(n, par);
        System.out.println("= " + sumafinal);
    }
    public static void sumaPares(int n, int par) {
        if (cont < n) {
            par += 2;
            cont++;
            System.out.print(par + " + ");
            sumaPares(n, par);
            sumafinal += par;
        }
    }
}