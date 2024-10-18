import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Metodos metodos = new Metodos(); // Crear una instancia de Metodos

        System.out.println("¿Qué deseas hacer?\n" +
                "1. Agregar Libro\n" +
                "2. Eliminar Libro\n" +
                "3. Ver Libro\n" +
                "4. Ver todos los libros\n" +
                "5. Actualizar Libro");

        int decision = scanner.nextInt();

        switch (decision) {
            case 1:
                metodos.agregar();
                break;
            case 2:
                metodos.eliminar();
                break;
            case 3:
                metodos.VerLibro();
                break;
            case 4:
                metodos.VerTodos();
                break;
            case 5:
                metodos.ActualizarLibro();
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }
}
