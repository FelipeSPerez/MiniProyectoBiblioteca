package version01;

public abstract class Libro {
    
    private String titulo;
    private String nombreAutor;
    private String isbn;
    private String editorial;
    private String condicion;

    public Libro(String titulo, String nombreAutor, String isbn, String editorial, String condicion) {
        this.titulo = titulo;
        this.nombreAutor = nombreAutor;
        this.isbn = isbn;
        this.editorial = editorial;
        this.condicion = condicion;
    }
    
    
    
}
