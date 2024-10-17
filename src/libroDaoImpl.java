import java.util.ArrayList;
import java.util.List;

public class libroDaoImpl implements libroDao   {
    private List<libro> libros = new ArrayList<>();

    @Override
    public void insertar(libro libro) {
            libros.add(libro);
    }

    @Override
    public libro obtenerPorId(int id) {
        for(libro libro : libros) {
            if(libro.getId() == id) {
                return libro;
            }
        }
        return null;
    }


    @Override
    public List<libro> obtenerTodos() {
        return new ArrayList<>(libros);
    }

    @Override
    public void actualizar(libro libro) {
        libro libroExistente = obtenerPorId(libro.getId());
        if (libroExistente != null) {
            libroExistente.setTitulo(libro.getTitulo());
            libroExistente.setAutor(libro.getAutor());
            libroExistente.setAnoPublication(libro.getAnoPublication());
            System.out.println("Libro actualizado: " + libro);
        } else {
            System.out.println("El libro con ID " + libro.getId() + " no fue encontrado.");
        }

    }

    @Override
    public void eliminar(int id) {

    }
}
