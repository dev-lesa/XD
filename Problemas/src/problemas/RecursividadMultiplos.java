package problemas;
public class RecursividadMultiplos {
    public static void main(String[] args) {
        multiploIterativo(3);
        System.out.println("");
        multiploRecursivo(3);
    }
    public static void multiploIterativo(int n) {
        while (n < 30) {
            System.out.println(n);
            n += 3;
        }
    }
    public static void multiploRecursivo(int n) {
        if (n < 30) {
            System.out.println(n);
            multiploRecursivo(n + 3);
        }
    }
}