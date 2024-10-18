import java.util.ArrayList;
import java.util.List;

public class LibroDaoImpl implements LibroDao {
    private List<Libro> Libros = new ArrayList<>();

    @Override
    public void insertar(Libro libro) {
            Libros.add(libro);
    }

    @Override
    public Libro obtenerPorId(int id) {
        for(Libro libro : Libros) {
            if(libro.getId() == id) {
                return libro;
            }
        }
        return null;
    }


    @Override
    public List<Libro> obtenerTodos() {
        return new ArrayList<>(Libros);
    }

    @Override
    public void actualizar(Libro libro) {
        Libro libroExistente = obtenerPorId(libro.getId());
        if (libroExistente != null) {
            libroExistente.setTitulo(libro.getTitulo());
            libroExistente.setAutor(libro.getAutor());
            libroExistente.setAnoPublication(libro.getAnoPublication());
            System.out.println("Libro actualizado: " + libro);
        } else {
            System.out.println("El Libro con ID " + libro.getId() + " no fue encontrado.");
        }

    }

    @Override
    public void eliminar(int id) {
        Libros.removeIf(Libro -> Libro.getId() == id);
        System.out.println("\nLibro eliminado con ID: " + id + "\n");
    }

}
