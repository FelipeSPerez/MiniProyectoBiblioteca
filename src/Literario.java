

public class Literario extends Libro {
    //Atributos
    private String genero;
    private String clasificacion;

    //CONSTRUCTORES
    public Literario(String titulo, String nombreAutor, String isbn, String editorial, String condicion, String genero, String clasificacion) {
        super(titulo, nombreAutor, isbn, editorial, condicion);
        this.genero = genero;
        this.clasificacion = clasificacion;
    }

    //GETTERS
    public String getGenero() {
        return genero;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    //TOSTRING
    public String displayLibros() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getDatos());
        sb.append("Literario{");
        sb.append("genero=").append(genero);
        sb.append(", clasificacion=").append(clasificacion);
        sb.append('}');
        return sb.toString();
    }

    public String EntradaLibros() {
        return super.getDatos() + "," + genero + "," + clasificacion ;
    }
    
}