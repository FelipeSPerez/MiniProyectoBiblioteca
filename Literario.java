package version01;

public class Literario extends Libro {
    
    private String genero;
    private String clasificacion;

    public Literario(String titulo, String nombreAutor, String isbn, String editorial, String condicion, String genero, String clasificacion) {
        super(titulo, nombreAutor, isbn, editorial, condicion);
        this.genero = genero;
        this.clasificacion = clasificacion;
    }
    
    
    
}
