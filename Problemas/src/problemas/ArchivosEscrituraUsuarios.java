package problemas;
import java.io.*;
import java.util.Scanner;
public class ArchivosEscrituraUsuarios {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        File archivo = new File("usuarios.txt");
        FileWriter escribir = null;
        PrintWriter linea = null;
        boolean bandera = true;
        int contador = 1;
        while (bandera) {
            try {
                if (archivo.exists()) {
                    try (Scanner lector = new Scanner(archivo)) {
                        while (lector.hasNextLine()) {
                            String lineaTexto = lector.nextLine();
                            if (lineaTexto.startsWith("Datos usuario")) contador++;
                        }
                    }
                }
                System.out.println("Ingrese nombre");
                String nombre = entrada.nextLine();
                System.out.println("Ingrese correo");
                String correo = entrada.nextLine();
                System.out.println("Ingrese direccion");
                String direccion = entrada.nextLine();
                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);
                linea.println("Datos usuario " + contador);
                linea.println(nombre);
                linea.println(correo);
                linea.println(direccion + "\n");
                System.out.println("datos guardados correctamente");
            } catch (Exception e) {
                System.out.println("ocurrio un error al escribir el archivo");
            } finally {
                System.out.println("desea ingresar otro usuario? escriba \"n\" para salir");
                String respuesta = entrada.nextLine();
                if (respuesta.equals("n")) bandera = false;
                else contador++;
                try {
                    if (linea != null) linea.close();
                    if (escribir != null) escribir.close();
                } catch (Exception e) {
                    System.out.println("ocurrio un error al cerrar el archivo");
                }
            }
        }
    }
}