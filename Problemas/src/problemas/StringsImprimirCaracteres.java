package problemas;
import java.util.Scanner;
public class StringsImprimirCaracteres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String palabra = entrada.nextLine();
        for (int i = 0; i < palabra.length(); i++) {
            System.out.print(palabra.substring(i, (i + 1)) + " ");
        }
    }
}