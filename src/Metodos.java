import java.util.Scanner;

public class Metodos {
    Scanner scanner = new Scanner(System.in);
    LibroDao libroDao = new LibroDaoImpl(); // Crear una instancia de LibroDaoImpl

    public void agregar() {

        System.out.println("Ingresa el ID:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea restante


        System.out.println("Ingresa el título:");
        String titulo = scanner.nextLine();


        System.out.println("Ingresa el autor:");
        String autor = scanner.nextLine();


        System.out.println("Ingresa el año de publicación:");
        int ano = scanner.nextInt();
        scanner.nextLine();

        Libro libro = new Libro(id, titulo, autor, ano);
        libroDao.insertar(libro);

        System.out.println("libro agregado con exito");
    }

    public void VerLibro (){
        System.out.println("ingresa el di del libro que deseas ver");
        int id = scanner.nextInt();
        libroDao.obtenerPorId(id);
    }
    public void VerTodos(){
        libroDao.obtenerTodos();
    }

    public void ActualizarLibro() {
        // Leer el ID del libro que se desea actualizar
        System.out.println("Ingresa el ID del libro que quieres actualizar:");
        int id = scanner.nextInt();
        scanner.nextLine();

        // Buscar el libro existente en la lista
        Libro libroExistente = libroDao.obtenerPorId(id);
        System.out.println("Ingresa el nuevo título del libro (actual: " + libroExistente.getTitulo() + "):");
        String titulo = scanner.nextLine();
        if (libroExistente == null) {
            System.out.println("No se encontró un libro con el ID especificado.");
            return; // Salir si el libro no existe
        }



        System.out.println("Ingresa el nuevo autor del libro (actual: " + libroExistente.getAutor() + "):");
        String autor = scanner.nextLine();

        System.out.println("Ingresa el nuevo año de publicación del libro (actual: " + libroExistente.getAnoPublication() + "):");
        int ano = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea restante

        // Actualizar los atributos del libro existente
        libroExistente.setTitulo(titulo);
        libroExistente.setAutor(autor);
        libroExistente.setAnoPublication(ano);

        // Llamar al método actualizar del DAO para confirmar los cambios
        libroDao.actualizar(libroExistente);
        System.out.println("El libro ha sido actualizado con éxito.");
    }
    public void eliminar (){
        System.out.println("ingresa el id del libro a eliminar");
        int id = scanner.nextInt();
        libroDao.eliminar(id);
    }

}
