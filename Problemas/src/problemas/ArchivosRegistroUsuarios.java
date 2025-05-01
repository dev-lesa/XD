package problemas;
import java.io.*;
import java.util.Scanner;
public class ArchivosRegistroUsuarios {
    static File archivo = new File("usuarios.txt");
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("===== MENÚ PRINCIPAL =====");
            System.out.println("1. Registrar nuevo usuario");
            System.out.println("2. Mostrar registros");
            System.out.println("3. Salir");
            System.out.println("4. Buscar usuario por nombre");
            System.out.print("Seleccione una opción: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                case 1 -> registrarUsuario();
                case 2 -> mostrarRegistros();
                case 3 -> System.out.println("¡Hasta pronto!");
                case 4 -> buscarUsuarioPorNombre();
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 3);
    }
    public static void registrarUsuario() {
        try {
            if (!archivo.exists()) archivo.createNewFile();
            System.out.print("Ingrese nombre: ");
            String nombre = entrada.nextLine();
            System.out.print("Ingrese correo: ");
            String correo = entrada.nextLine();
            System.out.print("Ingrese dirección: ");
            String direccion = entrada.nextLine();
            FileWriter escribir = new FileWriter(archivo, true);
            PrintWriter linea = new PrintWriter(escribir);
            linea.println(nombre);
            linea.println(correo);
            linea.println(direccion);
            linea.close();
            System.out.println("Usuario registrado correctamente.\n");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo.");
        }
    }
    public static void mostrarRegistros() {
        try {
            if (!archivo.exists()) {
                System.out.println("No existen registros aún.\n");
                return;
            }
            FileReader leer = new FileReader(archivo);
            BufferedReader buffer = new BufferedReader(leer);
            String linea;
            System.out.println("\n===== LISTA DE USUARIOS =====");
            while ((linea = buffer.readLine()) != null) {
                String nombre = linea;
                String correo = buffer.readLine();
                String direccion = buffer.readLine();
                System.out.println("Nombre: " + nombre);
                System.out.println("Correo: " + correo);
                System.out.println("Dirección: " + direccion);
                System.out.println("-----------------------------");
            }
            buffer.close();
            leer.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
        }
    }
    public static void buscarUsuarioPorNombre() {
        try {
            if (!archivo.exists()) {
                System.out.println("No existen registros aún.\n");
                return;
            }
            System.out.print("Ingrese el nombre a buscar: ");
            String nombreBuscado = entrada.nextLine();
            FileReader leer = new FileReader(archivo);
            BufferedReader buffer = new BufferedReader(leer);
            String linea;
            boolean encontrado = false;
            while ((linea = buffer.readLine()) != null) {
                String nombre = linea;
                String correo = buffer.readLine();
                String direccion = buffer.readLine();
                if (nombre.equalsIgnoreCase(nombreBuscado)) {
                    System.out.println("Nombre: " + nombre);
                    System.out.println("Correo: " + correo);
                    System.out.println("Dirección: " + direccion);
                    System.out.println("-----------------------------");
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) System.out.println("Usuario no encontrado.\n");
            buffer.close();
            leer.close();
        } catch (Exception e) {
            System.out.println("Error al leer el archivo.");
        }
    }
}