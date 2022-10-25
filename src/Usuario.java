


import java.io.Serializable;

public abstract class Usuario implements Serializable{
    //Atributos 
    private String nombre;
    private byte edad;
    private String telefonoFijo;
    private String telefonoPersonal;
    private String domicilio;
    private String correoElectronico;

    //CONSTRUCTORES.....
    //ONSTRUCTOR 01 - Todos los datos del usurio.
    public Usuario(String nombre, byte edad, String telefonoFijo, String telefonoPersonal, String domicilio, String correoElectronico) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefonoFijo = telefonoFijo;
        this.telefonoPersonal = telefonoPersonal;
        this.domicilio = domicilio;
        this.correoElectronico = correoElectronico;
    }

    //CONSTRUCTOR 02 - Datos sin el correo.
    public Usuario(String nombre, byte edad, String telefonoFijo, String telefonoPersonal, String domicilio) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefonoFijo = telefonoFijo;
        this.telefonoPersonal = telefonoPersonal;
        this.domicilio = domicilio;
    }

    //CONTRUCTOR 03 - Datos sin el telefono personal y correo electronico.
    public Usuario(String nombre, byte edad, String telefonoFijo, String domicilio) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefonoFijo = telefonoFijo;
        this.domicilio = domicilio;
    }

    //CONTRUCTOR 04 - Datos sin telefono personal.
    public Usuario(byte edad, String nombre, String domicilio, String telefonoFijo, String correoElectronico) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefonoFijo = telefonoFijo;
        this.domicilio = domicilio;

        //Getters....
    }

    public String getNombre() {
        return nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public String getTelefonoFijo() {
        return telefonoFijo;
    }

    public String getTelefonoPersonal() {
        return telefonoPersonal;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    //METODO - Metdo tipo String para la impresion de Datos....
    public String getDatos() {
        return nombre + "," + edad + "," + telefonoFijo + "," + telefonoPersonal + "," + domicilio + "," + correoElectronico;
    }

}
