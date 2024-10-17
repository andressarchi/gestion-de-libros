public class libro {
    public int id ;
    public  String titulo ;
    public  String autor ;
    public  int anoPublication;

    public libro(String titulo,String autor ,int anoPublication){
        this.titulo = titulo ;
        this.autor = autor;
        this.anoPublication =anoPublication;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublication() {
        return anoPublication;
    }

    public void setAnoPublication(int anoPublication) {
        this.anoPublication = anoPublication;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "libro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublication=" + anoPublication +
                '}';
    }
}
