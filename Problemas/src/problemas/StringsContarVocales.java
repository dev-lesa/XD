package problemas;
public class StringsContarVocales {
    public static void main(String[] args) {
        String cadena = "Universidad Tecnica";
        cadena = cadena.toLowerCase();
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            String letra = cadena.substring(i, (i + 1));
            if ("aeiou".contains(letra)) {
                contador++;
            }
        }
        System.out.println("Tiene " + contador + " vocales");
    }
}