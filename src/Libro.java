public class Libro {
    private String titulo;
    private String autor;
    private String codigoLibro;

    public Libro() {
    }

    public Libro(String titulo, String autor, String codigoLibro) {
        this.titulo = titulo;
        this.autor = autor;
        this.codigoLibro = codigoLibro;
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

    public String getCodigoLibro() {
        return codigoLibro;
    }

    public void setCodigoLibro(String codigoLibro) {
        this.codigoLibro = codigoLibro;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", codigoLibro='" + codigoLibro + '\'' +
                '}';
    }
}

