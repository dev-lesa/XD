package problemas;
public class StringsEliminarExtremos {
    public static void main(String[] args) {
        String cadena = "Universidad";
        System.out.println(cadena);
        for (int i = 1; i <= cadena.length() / 2; i++) {
            System.out.println(cadena.substring(i, cadena.length() - i));
        }
    }
}