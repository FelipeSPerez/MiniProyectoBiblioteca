package version01;

public class Comun extends Usuario {

    public Comun(String nombre, short edad, String telefonoFijo, String telefonoPersonal, String domicilio, String correoElectronico) {
        super(nombre, edad, telefonoFijo, telefonoPersonal, domicilio, correoElectronico);
    }

    public Comun(String nombre, short edad, String telefonoFijo, String telefonoPersonal, String domicilio) {
        super(nombre, edad, telefonoFijo, telefonoPersonal, domicilio);
    }

    public Comun(String nombre, short edad, String telefonoFijo, String domicilio) {
        super(nombre, edad, telefonoFijo, domicilio);
    }

}
