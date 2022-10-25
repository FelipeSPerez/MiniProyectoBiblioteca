
public class Estudiante extends Usuario implements Persona {
    //ESTUDIANTE - REQUIERE DATOS POR HERENCIA y ATRIBUTOS PROPIOS

    private String escuelaProcedencia;
    private String numeroDeControl;

    //CONSTRUCTORES.....
    //CONSTRUCTOR 01 - Todos los datos...
    public Estudiante(String nombre, byte edad, String telefonoFijo, String telefonoPersonal, String domicilio, String correoElectronico, String escuelaProcedencia, String numeroDeControl) {
        super(nombre, edad, telefonoFijo, telefonoPersonal, domicilio, correoElectronico);
        this.escuelaProcedencia = escuelaProcedencia;
        this.numeroDeControl = numeroDeControl;
    }

    //CONSTRUCTOR 02 - Todos los datos menos correo electronico...
    public Estudiante(String nombre, byte edad, String telefonoFijo, String telefonoPersonal, String domicilio, String escuelaProcedencia, String numeroDeControl) {
        super(nombre, edad, telefonoFijo, telefonoPersonal, domicilio);
        this.escuelaProcedencia = escuelaProcedencia;
        this.numeroDeControl = numeroDeControl;
    }

    //CONSTRUCTOR 01 - Todos los datos menos telefono personal y correo....
    public Estudiante(String nombre, byte edad, String telefonoFijo, String domicilio, String escuelaProcedencia, String numeroDeControl) {
        super(nombre, edad, telefonoFijo, domicilio);
        this.escuelaProcedencia = escuelaProcedencia;
        this.numeroDeControl = numeroDeControl;
    }

    //CONSTRUCTOR 01 - Todos los datos menos telefono personal...
    public Estudiante(byte edad, String nombre, String domicilio, String telefonoFijo, String correoElectronico, String escuelaProcedencia, String numeroDeControl) {
        super(edad, nombre, domicilio, telefonoFijo, correoElectronico);
        this.escuelaProcedencia = escuelaProcedencia;
        this.numeroDeControl = numeroDeControl;
    }

    //Getters...
    public String getEscuelaProcedencia() {
        return escuelaProcedencia;
    }

    public String getNumeroDeControl() {
        return numeroDeControl;
    }

    //METODO - Imprime los datos por herencia y los atributos propios de la clase...
    @Override
    public String getDatos() {
        return super.getDatos() + escuelaProcedencia + "," + numeroDeControl;
    }

}