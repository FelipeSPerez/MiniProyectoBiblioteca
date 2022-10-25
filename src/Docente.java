

public class Docente extends Usuario implements Persona {
    //DOCENTE - REQUIERE DATOS POR HERENCIA y ATRIBUTOS PROPIOS

    private String institucionProcedencia;
    private String matricula;
    private String departamento;

    //CONSTRUCTORES....
    //CONTRUCTOR 01 - Todos los datos por herencia y los atributos propios...
    public Docente(String nombre, byte edad, String telefonoFijo, String telefonoPersonal, String domicilio, String correoElectronico, String institucionProcedencia, String matricula, String departamento) {
        super(nombre, edad, telefonoFijo, telefonoPersonal, domicilio, correoElectronico);
        this.institucionProcedencia = institucionProcedencia;
        this.matricula = matricula;
        this.departamento = departamento;
    }

    //CONSTRUCTOR 02 - Atributos propios y por herencia menos correo...
    public Docente(String nombre, byte edad, String telefonoFijo, String telefonoPersonal, String domicilio, String institucionProcedencia, String matricula, String departamento) {
        super(nombre, edad, telefonoFijo, telefonoPersonal, domicilio);
        this.institucionProcedencia = institucionProcedencia;
        this.matricula = matricula;
        this.departamento = departamento;
    }

    //CONSTRUCTOR 03 - Atributos propios y por herencia menos telefono personal y correo...
    public Docente(String nombre, byte edad, String telefonoFijo, String domicilio, String institucionProcedencia, String matricula, String departamento) {
        super(nombre, edad, telefonoFijo, domicilio);
        this.institucionProcedencia = institucionProcedencia;
        this.matricula = matricula;
        this.departamento = departamento;
    }

    //CONSTRUCTOR 04 - Atributos propios y por herencia menos telefono personal...
    public Docente(byte edad, String nombre, String domicilio, String telefonoFijo, String correoElectronico, String institucionProcedencia, String matricula, String departamento) {
        super(edad, nombre, domicilio, telefonoFijo, correoElectronico);
        this.institucionProcedencia = institucionProcedencia;
        this.matricula = matricula;
        this.departamento = departamento;
    }

    //Getters
    public String getInstitucionProcedencia() {
        return institucionProcedencia;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getDepartamento() {
        return departamento;
    }

    //METODO - Imprime los datos por herencia y los atributos propios de la clase...
    @Override
    public String getDatos() {
        return super.getDatos() + institucionProcedencia + "," + matricula + "," + departamento;
    }

}
