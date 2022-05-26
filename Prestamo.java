package version01;

public class Prestamo {
    
    private Usuario user;
    private Empleado employee;
    private short cantidadLibrosAPrestar;
    private String fechaInicioPrestamo;
    private String fechaEsperadaRetorno;

    public Prestamo(Usuario user, Empleado employee, short cantidadLibrosAPrestar, String fechaInicioPrestamo, String fechaEsperadaRetorno) {
        this.user = user;
        this.employee = employee;
        this.cantidadLibrosAPrestar = cantidadLibrosAPrestar;
        this.fechaInicioPrestamo = fechaInicioPrestamo;
        this.fechaEsperadaRetorno = fechaEsperadaRetorno;
    }
    
    
}
