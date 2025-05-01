package problemas;
import java.util.Scanner;
public class RecursividadPalindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una palabra para verificar si es palíndromo");
        String palabra = scanner.nextLine();
        scanner.close();
        System.out.println(esPalindromo(palabra) ? "Es palindromo" : "No es palindromo");
    }
    public static boolean esPalindromo(String palabra) {
        palabra = palabra.toLowerCase();
        return esPalindromoRecursivo(palabra, 0, palabra.length() - 1);
    }
    public static boolean esPalindromoRecursivo(String palabra, int inicio, int fin) {
        if (inicio >= fin) return true;
        if (palabra.charAt(inicio) != palabra.charAt(fin)) return false;
        return esPalindromoRecursivo(palabra, inicio + 1, fin - 1);
    }
}