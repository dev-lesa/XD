package problemas;
import java.util.Scanner;
public class ArreglosBusquedaOrdenamiento {
    public static void main(String[] args) {
        String[] peliculas = {"Inception", "Avatar", "Titanic", "Matrix", "Gladiator"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la película a buscar:");
        String peliculaBuscada = scanner.nextLine();
        int posicion = busquedaSecuencial(peliculas, peliculaBuscada);
        if (posicion != -1) System.out.println("Película encontrada en posición: " + posicion);
        else System.out.println("Película no encontrada");
        ordenarAlfabeticamente(peliculas);
        System.out.println("\nPelículas ordenadas:");
        for (String pelicula : peliculas) System.out.println(pelicula);
        scanner.close();
    }
    public static int busquedaSecuencial(String[] arr, String elemento) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(elemento)) return i;
        }
        return -1;
    }
    public static void ordenarAlfabeticamente(String[] arr) {
        boolean intercambiado;
        int n = arr.length;
        do {
            intercambiado = false;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i].compareToIgnoreCase(arr[i + 1]) > 0) {
                    String temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    intercambiado = true;
                }
            }
            n--;
        } while (intercambiado);
    }
}