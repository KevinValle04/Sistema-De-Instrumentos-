import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        Scanner sc = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Agregar instrumento");
            System.out.println("2. Eliminar instrumento");
            System.out.println("3. Mostrar instrumentos");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Clave: ");
                    String clave = sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Tipo (identificar/manejar): ");
                    String tipo = sc.nextLine();
                    System.out.print("Condición (ansiedad/estrés): ");
                    String condicion = sc.nextLine();
                    System.out.print("Autor: ");
                    String autor = sc.nextLine();

                    Instrumento i = new Instrumento(clave, nombre, tipo, condicion, autor);
                    sistema.agregarInstrumento(i);
                    break;

                case 2:
                    System.out.print("Clave del instrumento a eliminar: ");
                    String claveEliminar = sc.nextLine();
                    sistema.eliminarInstrumento(claveEliminar);
                    break;

                case 3:
                    sistema.mostrarInstrumentos();
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);

        sc.close();
    }
}
