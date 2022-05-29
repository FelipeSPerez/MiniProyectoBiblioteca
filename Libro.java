package version01;

public abstract class Libro {
    
    private String titulo;
    private String nombreAutor;
    private String isbn;
    private String editorial;
    private String condicion;

    //CONSTRUCTORES
    public Libro(String titulo, String nombreAutor, String isbn, String editorial, String condicion) {
        this.titulo = titulo;
        this.nombreAutor = nombreAutor;
        this.isbn = isbn;
        this.editorial = editorial;
        this.condicion = condicion;
    }
    
    //GETTERS
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
    
    //TOSTRING
    public String displayLibros() {
        StringBuilder sb = new StringBuilder();
        sb.append("Libro{");
        sb.append("titulo=").append(titulo);
        sb.append(", nombreAutor=").append(nombreAutor);
        sb.append(", isbn=").append(isbn);
        sb.append(", editorial=").append(editorial);
        sb.append(", condicion=").append(condicion);
        sb.append('}');
        return sb.toString();
    }

    public String EntradaLibros() {
        return "Libro{" + "titulo=" + titulo + ", nombreAutor=" + nombreAutor + ", isbn=" + isbn + ", editorial=" + editorial + ", condicion=" + condicion + ", ";
    }   
    
}
