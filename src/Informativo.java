
public class Informativo extends Libro {
    
    private String fechaPublicacion;

    //CONSTRUCTORES
    public Informativo(String titulo, String nombreAutor, String isbn, String editorial, String condicion, String fechaPublicacion) {
        super(titulo, nombreAutor, isbn, editorial, condicion);
        this.fechaPublicacion = fechaPublicacion;
    }
    
    //GETTERS

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }
    
   
    
 //TOSTRING
    public String displayLibros() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getDatos());
        sb.append("Informativo{");
        sb.append("fechaPublicacion=").append(fechaPublicacion);
        sb.append('}');
        return sb.toString();
    }
    
    public String EntradaLibros() {
        return super.getDatos() + "Informativo{" + "fechaPublicacion=" + fechaPublicacion + '}';
    }
    
}
