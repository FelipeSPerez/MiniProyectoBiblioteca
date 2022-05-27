package version01;

public class Informativo extends Libro {
    
    private String fechaPublicacion;

    public Informativo(String titulo, String nombreAutor, String isbn, String editorial, String condicion, String fechaPublicacion) {
        super(titulo, nombreAutor, isbn, editorial, condicion);
        this.fechaPublicacion = fechaPublicacion;
    }
    
}
