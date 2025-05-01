package problemas;
import java.util.Scanner;
public class StringsContarCaracter {
    public static void main(String[] args) {
        String cadena = "Universidad Tecnica";
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una letra");
        String letra = entrada.nextLine();
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            String letraPalabra = cadena.substring(i, (i + 1));
            if (letraPalabra.equalsIgnoreCase(letra)) {
                contador++;
            }
        }
        System.out.println("El caracter se repite " + contador + " veces");
    }
}