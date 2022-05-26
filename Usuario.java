package version01;

public abstract class Usuario {

    private String nombre;
    private short edad;
    private String telefonoFijo;
    private String telefonoPersonal;
    private String domicilio;
    private String correoElectronico;

    //CONSTRUCTORES
    public Usuario(String nombre, short edad, String telefonoFijo, String telefonoPersonal, String domicilio, String correoElectronico) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefonoFijo = telefonoFijo;
        this.telefonoPersonal = telefonoPersonal;
        this.domicilio = domicilio;
        this.correoElectronico = correoElectronico;
    }

    public Usuario(String nombre, short edad, String telefonoFijo, String telefonoPersonal, String domicilio) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefonoFijo = telefonoFijo;
        this.telefonoPersonal = telefonoPersonal;
        this.domicilio = domicilio;
    }

    public Usuario(String nombre, short edad, String telefonoFijo, String domicilio) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefonoFijo = telefonoFijo;
        this.domicilio = domicilio;
    }

}
