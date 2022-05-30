public class Prestamo {
    
    private Usuario user;
    private Empleado employee;
    private short cantidadLibrosAPrestar;
    private String fechaInicioPrestamo;
    private String fechaEsperadaRetorno;

    //CONSTRUCTORES
    public Prestamo(Usuario user, Empleado employee, short cantidadLibrosAPrestar, String fechaInicioPrestamo, String fechaEsperadaRetorno) {
        this.user = user;
        this.employee = employee;
        this.cantidadLibrosAPrestar = cantidadLibrosAPrestar;
        this.fechaInicioPrestamo = fechaInicioPrestamo;
        this.fechaEsperadaRetorno = fechaEsperadaRetorno;
    }
    
    //GETTERS

    public Usuario getUser() {
        return user;
    }

    public Empleado getEmployee() {
        return employee;
    }

    public short getCantidadLibrosAPrestar() {
        return cantidadLibrosAPrestar;
    }

    public String getFechaInicioPrestamo() {
        return fechaInicioPrestamo;
    }

    public String getFechaEsperadaRetorno() {
        return fechaEsperadaRetorno;
    }
    
    //TOSTRING

    public String GetPrestamo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Prestamo{");
        sb.append("user=").append(user);
        sb.append(", employee=").append(employee);
        sb.append(", cantidadLibrosAPrestar=").append(cantidadLibrosAPrestar);
        sb.append(", fechaInicioPrestamo=").append(fechaInicioPrestamo);
        sb.append(", fechaEsperadaRetorno=").append(fechaEsperadaRetorno);
        sb.append('}');
        return sb.toString();
    }

    public String EntradaPrestamo() {
        return user.getNombre() + "," + employee.getNombre() + "," + cantidadLibrosAPrestar + "," + fechaInicioPrestamo + "," + fechaEsperadaRetorno;
    }
    
    
}