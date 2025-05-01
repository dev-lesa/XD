package problemas;
public class RecursividadImpresionIndirecta {
    public static void main(String[] args) {
        PrintNum(4);
        System.out.println("Fin");
    }
    public static void PrintNum(int n) {
        PrintNum2(n);
        System.out.println(n);
    }
    public static void PrintNum2(int n) {
        System.out.println(n);
        if (n > 1) PrintNum(n - 1);
    }
}