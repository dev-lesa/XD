package problemas;
public class StringsPalindromo {
    public static void main(String[] args) {
        String cadena = "Anita lava la tina";
        String cadenaSinEspacio = cadena.replaceAll(" ", "").toLowerCase();
        String cadenaInvertida = "";
        for (int i = cadenaSinEspacio.length() - 1; i >= 0; i--) {
            cadenaInvertida += cadenaSinEspacio.substring(i, (i + 1));
        }
        System.out.println(cadenaInvertida.equals(cadenaSinEspacio) ? "Si es" : "No es");
    }
}