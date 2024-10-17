import java.util.List;

    public interface libroDao {
        void insertar(libro libro);
        libro obtenerPorId(int id);
        List<libro> obtenerTodos();
        void actualizar(libro libro);
        void eliminar(int id);
    }
