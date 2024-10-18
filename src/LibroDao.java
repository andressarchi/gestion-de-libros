import java.util.List;

    public interface LibroDao {
        void insertar(Libro libro);
        Libro obtenerPorId(int id);
        List<Libro> obtenerTodos();
        void actualizar(Libro libro);
        void eliminar(int id);
    }
