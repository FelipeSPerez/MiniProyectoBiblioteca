
public class Comun extends Usuario implements Persona {
    //COMUN - REQUIERE UNICAMENTE DATOS POR HERENCIA

    //CONSTRUCTORES.....
    //CONSTRUCTOR 01 - Todos los datos...
    public Comun(String nombre, byte edad, String telefonoFijo, String telefonoPersonal, String domicilio, String correoElectronico) {
        super(nombre, edad, telefonoFijo, telefonoPersonal, domicilio, correoElectronico);
    }

    //CONSTRUCTOR 02 - Datos sin el correo...
    public Comun(String nombre, byte edad, String telefonoFijo, String telefonoPersonal, String domicilio) {
        super(nombre, edad, telefonoFijo, telefonoPersonal, domicilio);
    }

    //CONTRUCTOR 03 - Datos sin el telefono personal y correo electronico...
    public Comun(String nombre, byte edad, String telefonoFijo, String domicilio) {
        super(nombre, edad, telefonoFijo, domicilio);
    }

    //CONSTRUCTOR 04 - Datos sin el telefono personal...
    public Comun(byte edad, String nombre, String domicilio, String telefonoFijo, String correoElectronico) {
        super(edad, nombre, domicilio, telefonoFijo, correoElectronico);
    }

    //METODO - Impresion de datos comunes del usuario...
    @Override
    public String getDatos() {
        return super.getDatos();
    }

}
