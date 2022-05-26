package version01;

public class Docente extends Usuario {
    
    private String institucionProcedencia;
    private String matricula;
    private String departamento;

    public Docente(String nombre, short edad, String telefonoFijo, String telefonoPersonal, String domicilio, String correoElectronico, String institucionProcedencia, String matricula, String departamento) {
        super(nombre, edad, telefonoFijo, telefonoPersonal, domicilio, correoElectronico);
        this.institucionProcedencia = institucionProcedencia;
        this.matricula = matricula;
        this.departamento = departamento;
    }

    public Docente(String nombre, short edad, String telefonoFijo, String telefonoPersonal, String domicilio, String institucionProcedencia, String matricula, String departamento) {
        super(nombre, edad, telefonoFijo, telefonoPersonal, domicilio);
        this.institucionProcedencia = institucionProcedencia;
        this.matricula = matricula;
        this.departamento = departamento;
    }

    public Docente(String nombre, short edad, String telefonoFijo, String domicilio, String institucionProcedencia, String matricula, String departamento) {
        super(nombre, edad, telefonoFijo, domicilio);
        this.institucionProcedencia = institucionProcedencia;
        this.matricula = matricula;
        this.departamento = departamento;
    }
    
}
