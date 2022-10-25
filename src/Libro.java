
public abstract class Libro {
    //Atributos 
    private String titulo;
    private String nombreAutor;
    private String isbn;
    private String editorial;
    private String condicion;

    //Constructor que tiene todos los atributos 
    public Libro(String titulo, String nombreAutor, String isbn, String editorial, String condicion) {
        this.titulo = titulo;
        this.nombreAutor = nombreAutor;
        this.isbn = isbn;
        this.editorial = editorial;
        this.condicion = condicion;
    }

    //Getter
    public String getTitulo() {
        return titulo;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getCondicion() {
        return condicion;
    }

    //Apartado que se utiliza de Header
    public String getDatos() {
        return titulo + "," + nombreAutor +","+ isbn + "," + editorial + "," + condicion;
    }                
}