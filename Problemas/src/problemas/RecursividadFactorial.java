package problemas;
public class RecursividadFactorial {
    public static void main(String[] args) {
        int xd = 1;
        fact(5, xd);
        System.out.println("Fin");
    }
    public static void fact(int n, int a) {
        a = a * n;
        if (n > 1) fact(n - 1, a);
        if (n == 1) System.out.println(a);
    }
}