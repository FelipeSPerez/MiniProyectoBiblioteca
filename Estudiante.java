package version01;

public class Estudiante extends Usuario {
    
    private String escuelaProcedencia;
    private String numeroDeControl;

    public Estudiante(String nombre, short edad, String telefonoFijo, String telefonoPersonal, String domicilio, String correoElectronico, String escuelaProcedencia, String numeroDeControl) {
        super(nombre, edad, telefonoFijo, telefonoPersonal, domicilio, correoElectronico);
        this.escuelaProcedencia = escuelaProcedencia;
        this.numeroDeControl = numeroDeControl;
    }

    public Estudiante(String nombre, short edad, String telefonoFijo, String telefonoPersonal, String domicilio, String escuelaProcedencia, String numeroDeControl) {
        super(nombre, edad, telefonoFijo, telefonoPersonal, domicilio);
        this.escuelaProcedencia = escuelaProcedencia;
        this.numeroDeControl = numeroDeControl;
    }

    public Estudiante(String nombre, short edad, String telefonoFijo, String domicilio, String escuelaProcedencia, String numeroDeControl) {
        super(nombre, edad, telefonoFijo, domicilio);
        this.escuelaProcedencia = escuelaProcedencia;
        this.numeroDeControl = numeroDeControl;
    }
    
    
    
}
