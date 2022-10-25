

public class Prestamo {

    //Atributos
    private Usuario user;
    private Empleado employee;
    private byte cantidadLibrosAPrestar;
    private String fechaInicioPrestamo;
    private String fechaEsperadaRetorno;
    private Libro l1;
    private Libro l2;
    private Libro l3;
    private Libro l4;
    private Libro l5;
    private Libro l6;
    private Libro l7;

    //CONSTRUCTORES
    //Caso 01. solo se pide un libro
    public Prestamo(Usuario user, Empleado employee, byte cantidadLibrosAPrestar, String fechaInicioPrestamo, String fechaEsperadaRetorno, Libro l1) {
        this.user = user;
        this.employee = employee;
        this.cantidadLibrosAPrestar = cantidadLibrosAPrestar;
        this.fechaInicioPrestamo = fechaInicioPrestamo;
        this.fechaEsperadaRetorno = fechaEsperadaRetorno;
        this.l1 = l1;
    }

    //Caso 02. Se piden dos libros
    public Prestamo(Usuario user, Empleado employee, byte cantidadLibrosAPrestar, String fechaInicioPrestamo, String fechaEsperadaRetorno, Libro l1, Libro l2) {
        this.user = user;
        this.employee = employee;
        this.cantidadLibrosAPrestar = cantidadLibrosAPrestar;
        this.fechaInicioPrestamo = fechaInicioPrestamo;
        this.fechaEsperadaRetorno = fechaEsperadaRetorno;
        this.l1 = l1;
        this.l2 = l2;
    }

    //Caso 03. Se piden tres libros
    public Prestamo(Usuario user, Empleado employee, byte cantidadLibrosAPrestar, String fechaInicioPrestamo, String fechaEsperadaRetorno, Libro l1, Libro l2, Libro l3) {
        this.user = user;
        this.employee = employee;
        this.cantidadLibrosAPrestar = cantidadLibrosAPrestar;
        this.fechaInicioPrestamo = fechaInicioPrestamo;
        this.fechaEsperadaRetorno = fechaEsperadaRetorno;
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    //Caso 04. Se piden cuatros libros
    public Prestamo(Usuario user, Empleado employee, byte cantidadLibrosAPrestar, String fechaInicioPrestamo, String fechaEsperadaRetorno, Libro l1, Libro l2, Libro l3, Libro l4) {
        this.user = user;
        this.employee = employee;
        this.cantidadLibrosAPrestar = cantidadLibrosAPrestar;
        this.fechaInicioPrestamo = fechaInicioPrestamo;
        this.fechaEsperadaRetorno = fechaEsperadaRetorno;
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
        this.l4 = l4;
    }

    //Caso 05. Se piden cinco libros
    public Prestamo(Usuario user, Empleado employee, byte cantidadLibrosAPrestar, String fechaInicioPrestamo, String fechaEsperadaRetorno, Libro l1, Libro l2, Libro l3, Libro l4, Libro l5) {
        this.user = user;
        this.employee = employee;
        this.cantidadLibrosAPrestar = cantidadLibrosAPrestar;
        this.fechaInicioPrestamo = fechaInicioPrestamo;
        this.fechaEsperadaRetorno = fechaEsperadaRetorno;
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
        this.l4 = l4;
        this.l5 = l5;
    }

    //Caso 06. Se piden seis libros
    public Prestamo(Usuario user, Empleado employee, byte cantidadLibrosAPrestar, String fechaInicioPrestamo, String fechaEsperadaRetorno, Libro l1, Libro l2, Libro l3, Libro l4, Libro l5, Libro l6) {
        this.user = user;
        this.employee = employee;
        this.cantidadLibrosAPrestar = cantidadLibrosAPrestar;
        this.fechaInicioPrestamo = fechaInicioPrestamo;
        this.fechaEsperadaRetorno = fechaEsperadaRetorno;
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
        this.l4 = l4;
        this.l5 = l5;
        this.l6 = l6;
    }

    //Caso 07. Se piden siete libros
    public Prestamo(Usuario user, Empleado employee, byte cantidadLibrosAPrestar, String fechaInicioPrestamo, String fechaEsperadaRetorno, Libro l1, Libro l2, Libro l3, Libro l4, Libro l5, Libro l6, Libro l7) {
        this.user = user;
        this.employee = employee;
        this.cantidadLibrosAPrestar = cantidadLibrosAPrestar;
        this.fechaInicioPrestamo = fechaInicioPrestamo;
        this.fechaEsperadaRetorno = fechaEsperadaRetorno;
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
        this.l4 = l4;
        this.l5 = l5;
        this.l6 = l6;
        this.l7 = l7;
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

    //Metodo para guardar los datos en un archivo de texto en la clase ProcesarPrestamo
    public String EntradaPrestamo() {
        switch (this.cantidadLibrosAPrestar) {
            case 1:
                return user.getNombre() + "," + employee.getNombre() + "," + cantidadLibrosAPrestar + "," + fechaInicioPrestamo + "," + fechaEsperadaRetorno + "," + l1.getTitulo() + "," + l1.getNombreAutor();
            case 2:
                return user.getNombre() + "," + employee.getNombre() + "," + cantidadLibrosAPrestar + "," + fechaInicioPrestamo + "," + fechaEsperadaRetorno + "," + l1.getTitulo() + "," + l1.getNombreAutor() + "," + l2.getTitulo() + "," + l2.getNombreAutor();
            case 3:
                return user.getNombre() + "," + employee.getNombre() + "," + cantidadLibrosAPrestar + "," + fechaInicioPrestamo + "," + fechaEsperadaRetorno + "," + l1.getTitulo() + "," + l1.getNombreAutor() + "," + l2.getTitulo() + "," + l2.getNombreAutor() + "," + l3.getTitulo() + "," + l3.getNombreAutor();
            case 4:
                return user.getNombre() + "," + employee.getNombre() + "," + cantidadLibrosAPrestar + "," + fechaInicioPrestamo + "," + fechaEsperadaRetorno + "," + l1.getTitulo() + "," + l1.getNombreAutor() + "," + l2.getTitulo() + "," + l2.getNombreAutor() + "," + l3.getTitulo() + "," + l3.getNombreAutor() + "," + l4.getTitulo() + "," + l4.getNombreAutor();
            case 5:
                return user.getNombre() + "," + employee.getNombre() + "," + cantidadLibrosAPrestar + "," + fechaInicioPrestamo + "," + fechaEsperadaRetorno + "," + l1.getTitulo() + "," + l1.getNombreAutor() + "," + l2.getTitulo() + "," + l2.getNombreAutor() + "," + l3.getTitulo() + "," + l3.getNombreAutor() + "," + l4.getTitulo() + "," + l4.getNombreAutor() + "," + l5.getTitulo() + "," + l5.getNombreAutor();
            case 6:
                return user.getNombre() + "," + employee.getNombre() + "," + cantidadLibrosAPrestar + "," + fechaInicioPrestamo + "," + fechaEsperadaRetorno + "," + l1.getTitulo() + "," + l1.getNombreAutor() + "," + l2.getTitulo() + "," + l2.getNombreAutor() + "," + l3.getTitulo() + "," + l3.getNombreAutor() + "," + l4.getTitulo() + "," + l4.getNombreAutor() + "," + l5.getTitulo() + "," + l5.getNombreAutor() + "," + l6.getTitulo() + "," + l6.getNombreAutor();
            case 7:
                return user.getNombre() + "," + employee.getNombre() + "," + cantidadLibrosAPrestar + "," + fechaInicioPrestamo + "," + fechaEsperadaRetorno + "," + l1.getTitulo() + "," + l1.getNombreAutor() + "," + l2.getTitulo() + "," + l2.getNombreAutor() + "," + l3.getTitulo() + "," + l3.getNombreAutor() + "," + l4.getTitulo() + "," + l4.getNombreAutor() + "," + l5.getTitulo() + "," + l5.getNombreAutor() + "," + l6.getTitulo() + "," + l6.getNombreAutor() + "," + l7.getTitulo() + "," + l7.getNombreAutor();
            default:
                return "error";
        }
    }

}
