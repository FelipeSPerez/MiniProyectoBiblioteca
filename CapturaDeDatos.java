package version01;

import javax.swing.JOptionPane;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapturaDeDatos {

    //Metodo para obtener
    public Comun getComun() {
        boolean error = false, salir = false;
        String nombre = "";
        byte edad = 0;
        String telefonoFijo = "";
        String telefonoPersonal = "";
        String domicilio = "";
        String correoElectronico = "";

        //Ciclo para confirmacion
        do {

            //Validacion nombre
            do {
                try {
                    nombre = leerCadena("Introduce el nombre del usuario (OBLIGATORIO):");
                    if (nombre.isBlank()) {
                        error = true;
                        throw new ExcDatoVacio();
                    }
                    if (nombre.length() < 10) {
                        error = true;
                        throw new ExcMinimoTNombre();
                    }
                    String regex = ".*\\d+.*";
                    Pattern pattern = Pattern.compile(regex);
                    if (pattern.matcher(nombre).matches()) {
                        error = true;
                        throw new ExcTipoDatoErroneo();
                    }
                    error = false;
                } catch (ExcDatoVacio e) {
                    e.mensajeExc();
                } catch (ExcMinimoTNombre e) {
                    nombre = "";
                    e.mensajeExc();
                } catch (ExcTipoDatoErroneo e) {
                    nombre = "";
                    e.mensajeExc("Error:\nEstas registrando numeros en el nombre del usuario", "DATO ERRONEO");
                } catch (Exception e) {
                    nombre = "";
                    error = true;
                    JOptionPane.showMessageDialog(null, "Eror de tipo: " + e.getClass().getSimpleName(), "Excepcion de java", JOptionPane.ERROR_MESSAGE);
                }
            } while (error);

            //Validacion edad
            do {
                try {
                    edad = leerByte("Introduce la edad del usuario (OBLIGATORIO):");
                    if (edad == 0) {
                        error = true;
                        throw new ExcDatoVacio();
                    }
                    if (edad < 12) {
                        error = true;
                        throw new ExcMinimoEdadUsuario();
                    }
                    error = false;
                } catch (ExcDatoVacio e) {
                    e.mensajeExc();
                } catch (ExcMinimoEdadUsuario e) {
                    edad = 0;
                    e.mensajeExc();
                } catch (Exception e) {
                    edad = 0;
                    error = true;
                    JOptionPane.showMessageDialog(null, "Eror de tipo: " + e.getClass().getSimpleName() + "\nEstas ingresando letras donde solo deberias ingresar numeros.", "Excepcion de java", JOptionPane.ERROR_MESSAGE);
                }
            } while (error);

            //Validacion telefono fijo
            do {
                try {
                    telefonoFijo = leerCadena("Introduce el numero telefonico fijo del usuario (OBLIGATORIO):");
                    if (telefonoFijo.isBlank()) {
                        error = true;
                        throw new ExcDatoVacio();
                    }
                    if (telefonoFijo.length() != 10) {
                        error = true;
                        throw new ExcMinimoTTelefono();
                    }
                    try {
                        Long.parseLong(telefonoFijo);
                        error = false;
                    } catch (NumberFormatException excepcion) {
                        error = true;
                        throw new ExcTipoDatoErroneo();
                    }
                    error = false;
                } catch (ExcDatoVacio e) {
                    e.mensajeExc();
                } catch (ExcMinimoTTelefono e) {
                    telefonoFijo = "";
                    e.mensajeExc();
                } catch (ExcTipoDatoErroneo e) {
                    telefonoFijo = "";
                    e.mensajeExc("Error:\nEstas registrando letras o simbolos en el telefono fijo del usuario", "DATO ERRONEO");
                } catch (Exception e) {
                    telefonoFijo = "";
                    error = true;
                    JOptionPane.showMessageDialog(null, "Eror de tipo: " + e.getClass().getSimpleName(), "Excepcion de java", JOptionPane.ERROR_MESSAGE);
                }
            } while (error);

            //Validacion telefono personal
            do {
                try {
                    telefonoPersonal = leerCadena("Introduce el numero de telefono personal del usuario (OPCIONAL):");
                    if (telefonoPersonal.length() != 10 && !(telefonoPersonal.equals(""))) {
                        error = true;
                        throw new ExcMinimoTTelefono();
                    } else if (telefonoPersonal.length() == 10) {
                        try {
                            Long.parseLong(telefonoPersonal);
                            error = false;
                        } catch (NumberFormatException excepcion) {
                            telefonoPersonal = "";
                            error = true;
                            throw new ExcTipoDatoErroneo();
                        }
                    }
                    error = false;
                } catch (ExcMinimoTTelefono e) {
                    telefonoFijo = "";
                    e.mensajeExc();
                } catch (ExcTipoDatoErroneo e) {
                    telefonoPersonal = "";
                    e.mensajeExc("Error:\nEstas registrando letras o simbolos en el telefono personal del usuario", "DATO ERRONEO");
                } catch (Exception e) {
                    error = true;
                    JOptionPane.showMessageDialog(null, "Eror de tipo: " + e.getClass().getSimpleName(), "Excepcion de java", JOptionPane.ERROR_MESSAGE);
                }
            } while (error);

            //Validacion domicilio
            do {
                try {
                    domicilio = leerCadena("Introduce el domicilio completo del usuario (OBLIGATORIO):");
                    if (domicilio.isBlank()) {
                        error = true;
                        throw new ExcDatoVacio();
                    }
                    if (domicilio.length() < 20) {
                        error = true;
                        throw new ExcMinimoTDomicilio();
                    }
                    error = false;
                } catch (ExcDatoVacio e) {
                    e.mensajeExc();
                } catch (ExcMinimoTDomicilio e) {
                    domicilio = "";
                    e.mensajeExc();
                } catch (Exception e) {
                    error = true;
                    domicilio = "";
                    JOptionPane.showMessageDialog(null, "Eror de tipo: " + e.getClass().getSimpleName(), "Excepcion de java", JOptionPane.ERROR_MESSAGE);
                }
            } while (error);

            //Validacion correo electronico
            do {
                try {
                    correoElectronico = leerCadena("Introduce el correo electronico del usuario (OPCIONAL):");
                    error = false;
                } catch (Exception e) {
                    correoElectronico = "";
                    error = true;
                    JOptionPane.showMessageDialog(null, "Eror de tipo: " + e.getClass().getSimpleName(), "Excepcion de java", JOptionPane.ERROR_MESSAGE);
                }
            } while (error);

            //Pregunta para confirmar los datos ingresados, en caso de darle "No" vuelve a pedir todos los datos,
            //en caso de decir si sigue con la ejecucion y retorna el objeto
            int dialogResult = JOptionPane.showConfirmDialog(null, "OJO: Datos a registrar:\n\n" + "Nombre: " + nombre + "\nEdad: " + edad + "\nTelefono fijo: " + telefonoFijo + "\nTelefono personal: " + telefonoPersonal + "\nDomicilio: " + domicilio + "\nCorreo electronico: " + correoElectronico + "\n\n¿DESEA CONTINUAR?", "CONFIRMACION", JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.NO_OPTION) {
                salir = false;
            } else {
                salir = true;
                //Casos para retornar los diferentes tipos de objetos
                //Caso con el telefono y correo vacios
                if (telefonoPersonal.isBlank() && correoElectronico.isBlank()) {
                    Comun c = new Comun(nombre, edad, telefonoFijo, domicilio);
                    return c;
                }
                //Caso con el telefono personal vacio
                if (telefonoPersonal.isBlank() && (!correoElectronico.isBlank())) {
                    Comun c = new Comun(edad, nombre, domicilio, telefonoFijo, correoElectronico);
                    return c;
                }
                //Caso con el correo personal vacio
                if ((!telefonoPersonal.isBlank()) && correoElectronico.isBlank()) {
                    Comun c = new Comun(nombre, edad, telefonoFijo, telefonoPersonal, domicilio);
                    return c;
                }
                //Caso con todos los datos
                Comun c = new Comun(nombre, edad, telefonoFijo, telefonoPersonal, domicilio, correoElectronico);
                return c;
            }
        } while (!salir);

        //Este return no sirve de nada, solo es para que java no se asuste, al parecer el IDE
        //piensa que hay forma en que el programa no retorne nada.
        //Los valores guardados son para detectar ese posible camino que retorne este objeto (Pero no deberia pasar)
        return new Comun("EL IDE TENIA RAZON", (byte) -1, "EL IDE TENIA RAZON", "EL IDE TENIA RAZON");
    }

    public Estudiante getEstudiante() {
        boolean error = false, salir = false;
        String nombre = "";
        byte edad = 0;
        String telefonoFijo = "";
        String telefonoPersonal = "";
        String domicilio = "";
        String correoElectronico = "";
        String escuelaProcedencia = "";
        String numeroDeControl = "";

        //Ciclo para confirmacion
        do {

            //Validacion nombre
            do {
                try {
                    nombre = leerCadena("Introduce el nombre del estudiante (OBLIGATORIO):");
                    if (nombre.isBlank()) {
                        error = true;
                        throw new ExcDatoVacio();
                    }
                    if (nombre.length() < 10) {
                        error = true;
                        throw new ExcMinimoTNombre();
                    }
                    String regex = ".*\\d+.*";
                    Pattern pattern = Pattern.compile(regex);
                    if (pattern.matcher(nombre).matches()) {
                        error = true;
                        throw new ExcTipoDatoErroneo();
                    }
                    error = false;
                } catch (ExcDatoVacio e) {
                    e.mensajeExc();
                } catch (ExcMinimoTNombre e) {
                    nombre = "";
                    e.mensajeExc();
                } catch (ExcTipoDatoErroneo e) {
                    nombre = "";
                    e.mensajeExc("Error:\nEstas registrando numeros en el nombre del estudiante", "DATO ERRONEO");
                } catch (Exception e) {
                    nombre = "";
                    error = true;
                    JOptionPane.showMessageDialog(null, "Eror de tipo: " + e.getClass().getSimpleName(), "Excepcion de java", JOptionPane.ERROR_MESSAGE);
                }
            } while (error);

            //Validacion edad
            do {
                try {
                    edad = leerByte("Introduce la edad del estudiante (OBLIGATORIO):");
                    if (edad == 0) {
                        error = true;
                        throw new ExcDatoVacio();
                    }
                    if (edad < 12) {
                        error = true;
                        throw new ExcMinimoEdadUsuario();
                    }
                    error = false;
                } catch (ExcDatoVacio e) {
                    e.mensajeExc();
                } catch (ExcMinimoEdadUsuario e) {
                    edad = 0;
                    e.mensajeExc();
                } catch (Exception e) {
                    edad = 0;
                    error = true;
                    JOptionPane.showMessageDialog(null, "Eror de tipo: " + e.getClass().getSimpleName() + "\nEstas ingresando letras donde solo deberias ingresar numeros.", "Excepcion de java", JOptionPane.ERROR_MESSAGE);
                }
            } while (error);

            //Validacion telefono fijo
            do {
                try {
                    telefonoFijo = leerCadena("Introduce el numero telefonico fijo del estudiante (OBLIGATORIO):");
                    if (telefonoFijo.isBlank()) {
                        error = true;
                        throw new ExcDatoVacio();
                    }
                    if (telefonoFijo.length() != 10) {
                        error = true;
                        throw new ExcMinimoTTelefono();
                    }
                    try {
                        Long.parseLong(telefonoFijo);
                        error = false;
                    } catch (NumberFormatException excepcion) {
                        error = true;
                        throw new ExcTipoDatoErroneo();
                    }
                    error = false;
                } catch (ExcDatoVacio e) {
                    e.mensajeExc();
                } catch (ExcMinimoTTelefono e) {
                    telefonoFijo = "";
                    e.mensajeExc();
                } catch (ExcTipoDatoErroneo e) {
                    telefonoFijo = "";
                    e.mensajeExc("Error:\nEstas registrando letras o simbolos en el telefono fijo del estudiante", "DATO ERRONEO");
                } catch (Exception e) {
                    telefonoFijo = "";
                    error = true;
                    JOptionPane.showMessageDialog(null, "Eror de tipo: " + e.getClass().getSimpleName(), "Excepcion de java", JOptionPane.ERROR_MESSAGE);
                }
            } while (error);

            //Validacion telefono personal
            do {
                try {
                    telefonoPersonal = leerCadena("Introduce el numero de telefono personal del estudiante (OPCIONAL):");
                    if (telefonoPersonal.length() != 10 && !(telefonoPersonal.equals(""))) {
                        error = true;
                        throw new ExcMinimoTTelefono();
                    } else if (telefonoPersonal.length() == 10) {
                        try {
                            Long.parseLong(telefonoPersonal);
                            error = false;
                        } catch (NumberFormatException excepcion) {
                            telefonoPersonal = "";
                            error = true;
                            throw new ExcTipoDatoErroneo();
                        }
                    }
                    error = false;
                } catch (ExcMinimoTTelefono e) {
                    telefonoFijo = "";
                    e.mensajeExc();
                } catch (ExcTipoDatoErroneo e) {
                    telefonoPersonal = "";
                    e.mensajeExc("Error:\nEstas registrando letras o simbolos en el telefono personal del estudiante", "DATO ERRONEO");
                } catch (Exception e) {
                    error = true;
                    JOptionPane.showMessageDialog(null, "Eror de tipo: " + e.getClass().getSimpleName(), "Excepcion de java", JOptionPane.ERROR_MESSAGE);
                }
            } while (error);

            //Validacion domicilio
            do {
                try {
                    domicilio = leerCadena("Introduce el domicilio completo del estudiante (OBLIGATORIO):");
                    if (domicilio.isBlank()) {
                        error = true;
                        throw new ExcDatoVacio();
                    }
                    if (domicilio.length() < 20) {
                        error = true;
                        throw new ExcMinimoTDomicilio();
                    }
                    error = false;
                } catch (ExcDatoVacio e) {
                    e.mensajeExc();
                } catch (ExcMinimoTDomicilio e) {
                    domicilio = "";
                    e.mensajeExc();
                } catch (Exception e) {
                    domicilio = "";
                    error = true;
                    JOptionPane.showMessageDialog(null, "Eror de tipo: " + e.getClass().getSimpleName(), "Excepcion de java", JOptionPane.ERROR_MESSAGE);
                }
            } while (error);

            //Validacion correo electronico
            do {
                try {
                    correoElectronico = leerCadena("Introduce el correo electronico del estudiante (OPCIONAL):");
                    error = false;
                } catch (Exception e) {
                    correoElectronico = "";
                    error = true;
                    JOptionPane.showMessageDialog(null, "Eror de tipo: " + e.getClass().getSimpleName(), "Excepcion de java", JOptionPane.ERROR_MESSAGE);
                }
            } while (error);

            //Validacion escuela de procedencia
            do {
                try {
                    escuelaProcedencia = leerCadena("Introduce la escuela de procedencia del estudiante (OBLIGATORIO):");
                    if (escuelaProcedencia.isBlank()) {
                        error = true;
                        throw new ExcDatoVacio();
                    }
                    if (escuelaProcedencia.length() < 15) {
                        error = true;
                        throw new ExcMinimoTEscuelaProcedencia();
                    }
                    error = false;
                } catch (ExcDatoVacio e) {
                    e.mensajeExc();
                } catch (ExcMinimoTEscuelaProcedencia e) {
                    escuelaProcedencia = "";
                    e.mensajeExc();
                } catch (Exception e) {
                    escuelaProcedencia = "";
                    error = true;
                    JOptionPane.showMessageDialog(null, "Eror de tipo: " + e.getClass().getSimpleName(), "Excepcion de java", JOptionPane.ERROR_MESSAGE);
                }
            } while (error);

            //Validacion numero de control
            do {
                try {
                    numeroDeControl = leerCadena("Introduce la matricula/numero de control del estudiante (OBLIGATORIO):");
                    if (numeroDeControl.isBlank()) {
                        error = true;
                        throw new ExcDatoVacio();
                    }
                    if (numeroDeControl.length() < 6) {
                        error = true;
                        throw new ExcMinimoTNumeroControl();
                    }
                    error = false;
                } catch (ExcDatoVacio e) {
                    e.mensajeExc();
                } catch (ExcMinimoTNumeroControl e) {
                    numeroDeControl = "";
                    e.mensajeExc();
                } catch (Exception e) {
                    numeroDeControl = "";
                    error = true;
                    JOptionPane.showMessageDialog(null, "Eror de tipo: " + e.getClass().getSimpleName(), "Excepcion de java", JOptionPane.ERROR_MESSAGE);
                }
            } while (error);

            //Pregunta para confirmar los datos ingresados, en caso de darle "No" vuelve a pedir todos los datos,
            //en caso de decir si sigue con la ejecucion y retorna el objeto
            int dialogResult = JOptionPane.showConfirmDialog(null, "OJO: Datos a registrar:\n\n" + "Nombre: " + nombre + "\nEdad: " + edad + "\nTelefono fijo: " + telefonoFijo + "\nTelefono personal: " + telefonoPersonal + "\nDomicilio: " + domicilio + "\nCorreo electronico: " + correoElectronico + "\nEscuela de procedencia: " + escuelaProcedencia + "\nNumero de control: " + numeroDeControl + "\n\n¿DESEA CONTINUAR?", "CONFIRMACION", JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.NO_OPTION) {
                salir = false;
            } else {
                salir = true;
                //Casos para retornar los diferentes tipos de objetos
                //Caso con el telefono y correo vacios
                if (telefonoPersonal.isBlank() && correoElectronico.isBlank()) {
                    Estudiante e = new Estudiante(nombre, edad, telefonoFijo, domicilio, escuelaProcedencia, numeroDeControl);
                    return e;
                }
                //Caso con el telefono personal vacio
                if (telefonoPersonal.isBlank() && (!correoElectronico.isBlank())) {
                    Estudiante e = new Estudiante(edad, nombre, domicilio, telefonoFijo, correoElectronico, escuelaProcedencia, numeroDeControl);
                    return e;
                }
                //Caso con el correo personal vacio
                if ((!telefonoPersonal.isBlank()) && correoElectronico.isBlank()) {
                    Estudiante e = new Estudiante(nombre, edad, telefonoFijo, telefonoPersonal, domicilio, escuelaProcedencia, numeroDeControl);
                    return e;
                }
                //Caso con todos los datos
                Estudiante e = new Estudiante(nombre, edad, telefonoFijo, telefonoPersonal, domicilio, correoElectronico, escuelaProcedencia, numeroDeControl);
                return e;

            }

        } while (!salir);

        //Este return no sirve de nada, solo es para que java no se asuste, al parecer el IDE
        //piensa que hay forma en que el programa no retorne nada.
        //Los valores guardados son para detectar ese posible camino que retorne este objeto (Pero no deberia pasar)
        return new Estudiante("EL IDE TENIA RAZON", (byte) -1, "EL IDE TENIA RAZON", "EL IDE TENIA RAZON", "EL IDE TENIA RAZON", "EL IDE TENIA RAZON");
    }

    public Docente getDocente() {
        boolean error = false, salir = false;
        String nombre = "";
        byte edad = 0;
        String telefonoFijo = "";
        String telefonoPersonal = "";
        String domicilio = "";
        String correoElectronico = "";
        String institucionProcedencia = "";
        String matricula = "";
        String departamento = "";

        //Ciclo para confirmacion
        do {

            //Validacion nombre
            do {
                try {
                    nombre = leerCadena("Introduce el nombre del docente (OBLIGATORIO):");
                    if (nombre.isBlank()) {
                        error = true;
                        throw new ExcDatoVacio();
                    }
                    if (nombre.length() < 10) {
                        error = true;
                        throw new ExcMinimoTNombre();
                    }
                    String regex = ".*\\d+.*";
                    Pattern pattern = Pattern.compile(regex);
                    if (pattern.matcher(nombre).matches()) {
                        error = true;
                        throw new ExcTipoDatoErroneo();
                    }
                    error = false;
                } catch (ExcDatoVacio e) {
                    e.mensajeExc();
                } catch (ExcMinimoTNombre e) {
                    nombre = "";
                    e.mensajeExc();
                } catch (ExcTipoDatoErroneo e) {
                    nombre = "";
                    e.mensajeExc("Error:\nEstas registrando numeros en el nombre del docente", "DATO ERRONEO");
                } catch (Exception e) {
                    nombre = "";
                    error = true;
                    JOptionPane.showMessageDialog(null, "Eror de tipo: " + e.getClass().getSimpleName(), "Excepcion de java", JOptionPane.ERROR_MESSAGE);
                }
            } while (error);

            //Validacion edad
            do {
                try {
                    edad = leerByte("Introduce la edad del docente (OBLIGATORIO):");
                    if (edad == 0) {
                        error = true;
                        throw new ExcDatoVacio();
                    }
                    if (edad < 12) {
                        error = true;
                        throw new ExcMinimoEdadUsuario();
                    }
                    error = false;
                } catch (ExcDatoVacio e) {
                    e.mensajeExc();
                } catch (ExcMinimoEdadUsuario e) {
                    edad = 0;
                    e.mensajeExc();
                } catch (Exception e) {
                    edad = 0;
                    error = true;
                    JOptionPane.showMessageDialog(null, "Eror de tipo: " + e.getClass().getSimpleName() + "\nEstas ingresando letras donde solo deberias ingresar numeros.", "Excepcion de java", JOptionPane.ERROR_MESSAGE);
                }
            } while (error);

            //Validacion telefono fijo
            do {
                try {
                    telefonoFijo = leerCadena("Introduce el numero telefonico fijo del docente (OBLIGATORIO):");
                    if (telefonoFijo.isBlank()) {
                        error = true;
                        throw new ExcDatoVacio();
                    }
                    if (telefonoFijo.length() != 10) {
                        error = true;
                        throw new ExcMinimoTTelefono();
                    }
                    try {
                        Long.parseLong(telefonoFijo);
                        error = false;
                    } catch (NumberFormatException excepcion) {
                        error = true;
                        throw new ExcTipoDatoErroneo();
                    }
                    error = false;
                } catch (ExcDatoVacio e) {
                    e.mensajeExc();
                } catch (ExcMinimoTTelefono e) {
                    telefonoFijo = "";
                    e.mensajeExc();
                } catch (ExcTipoDatoErroneo e) {
                    telefonoFijo = "";
                    e.mensajeExc("Error:\nEstas registrando letras o simbolos en el telefono fijo del docente", "DATO ERRONEO");
                } catch (Exception e) {
                    telefonoFijo = "";
                    error = true;
                    JOptionPane.showMessageDialog(null, "Eror de tipo: " + e.getClass().getSimpleName(), "Excepcion de java", JOptionPane.ERROR_MESSAGE);
                }
            } while (error);

            //Validacion telefono personal
            do {
                try {
                    telefonoPersonal = leerCadena("Introduce el numero de telefono personal del docente (OPCIONAL):");
                    if (telefonoPersonal.length() != 10 && !(telefonoPersonal.equals(""))) {
                        error = true;
                        throw new ExcMinimoTTelefono();
                    } else if (telefonoPersonal.length() == 10) {
                        try {
                            Long.parseLong(telefonoPersonal);
                            error = false;
                        } catch (NumberFormatException excepcion) {
                            telefonoPersonal = "";
                            error = true;
                            throw new ExcTipoDatoErroneo();
                        }
                    }
                    error = false;
                } catch (ExcMinimoTTelefono e) {
                    telefonoFijo = "";
                    e.mensajeExc();
                } catch (ExcTipoDatoErroneo e) {
                    telefonoPersonal = "";
                    e.mensajeExc("Error:\nEstas registrando letras o simbolos en el telefono personal del docente", "DATO ERRONEO");
                } catch (Exception e) {
                    error = true;
                    JOptionPane.showMessageDialog(null, "Eror de tipo: " + e.getClass().getSimpleName(), "Excepcion de java", JOptionPane.ERROR_MESSAGE);
                }
            } while (error);

            //Validacion domicilio
            do {
                try {
                    domicilio = leerCadena("Introduce el domicilio completo del docente (OBLIGATORIO):");
                    if (domicilio.isBlank()) {
                        error = true;
                        throw new ExcDatoVacio();
                    }
                    if (domicilio.length() < 20) {
                        error = true;
                        throw new ExcMinimoTDomicilio();
                    }
                    error = false;
                } catch (ExcDatoVacio e) {
                    e.mensajeExc();
                } catch (ExcMinimoTDomicilio e) {
                    domicilio = "";
                    e.mensajeExc();
                } catch (Exception e) {
                    domicilio = "";
                    error = true;
                    JOptionPane.showMessageDialog(null, "Eror de tipo: " + e.getClass().getSimpleName(), "Excepcion de java", JOptionPane.ERROR_MESSAGE);
                }
            } while (error);

            //Validacion correo electronico
            do {
                try {
                    correoElectronico = leerCadena("Introduce el correo electronico del docente (OPCIONAL):");
                    error = false;
                } catch (Exception e) {
                    correoElectronico = "";
                    error = true;
                    JOptionPane.showMessageDialog(null, "Eror de tipo: " + e.getClass().getSimpleName(), "Excepcion de java", JOptionPane.ERROR_MESSAGE);
                }
            } while (error);

            //Validacion institucion de procedencia
            do {
                try {
                    institucionProcedencia = leerCadena("Introduce la institucion de procedencia del docente (OBLIGATORIO):");
                    if (institucionProcedencia.isBlank()) {
                        error = true;
                        throw new ExcDatoVacio();
                    }
                    if (institucionProcedencia.length() < 3) {
                        error = true;
                        throw new ExcMinimoTInstitucionProcedencia();
                    }
                    error = false;
                } catch (ExcDatoVacio e) {
                    e.mensajeExc();
                } catch (ExcMinimoTInstitucionProcedencia e) {
                    institucionProcedencia = "";
                    e.mensajeExc();
                } catch (Exception e) {
                    institucionProcedencia = "";
                    error = true;
                    JOptionPane.showMessageDialog(null, "Eror de tipo: " + e.getClass().getSimpleName(), "Excepcion de java", JOptionPane.ERROR_MESSAGE);
                }
            } while (error);

            //Validacion matricula
            do {
                try {
                    matricula = leerCadena("Introduce la matricula del docente (OBLIGATORIO):");
                    if (matricula.isBlank()) {
                        error = true;
                        throw new ExcDatoVacio();
                    }
                    if (matricula.length() < 6) {
                        error = true;
                        throw new ExcMinimoTMatricula();
                    }
                    error = false;
                } catch (ExcDatoVacio e) {
                    e.mensajeExc();
                } catch (ExcMinimoTMatricula e) {
                    matricula = "";
                    e.mensajeExc();
                } catch (Exception e) {
                    matricula = "";
                    error = true;
                    JOptionPane.showMessageDialog(null, "Eror de tipo: " + e.getClass().getSimpleName(), "Excepcion de java", JOptionPane.ERROR_MESSAGE);

                }
            } while (error);

            //Validacion departamento
            do {
                try {
                    departamento = leerCadena("Introduce el departamento al que pertenece el docente (OBLIGATORIO):");
                    if (departamento.isBlank()) {
                        error = true;
                        throw new ExcDatoVacio();
                    }
                    if (departamento.length() < 5) {
                        error = true;
                        throw new ExcMinimoTDepartamento();
                    }
                    error = false;
                } catch (ExcDatoVacio e) {
                    e.mensajeExc();
                } catch (ExcMinimoTDepartamento e) {
                    departamento = "";
                    e.mensajeExc();
                } catch (Exception e) {
                    departamento = "";
                    error = true;
                    JOptionPane.showMessageDialog(null, "Eror de tipo: " + e.getClass().getSimpleName(), "Excepcion de java", JOptionPane.ERROR_MESSAGE);

                }
            } while (error);

            //Pregunta para confirmar los datos ingresados, en caso de darle "No" vuelve a pedir todos los datos,
            //en caso de decir si sigue con la ejecucion y retorna el objeto
            int dialogResult = JOptionPane.showConfirmDialog(null, "OJO: Datos a registrar:\n\n" + "Nombre: " + nombre + "\nEdad: " + edad + "\nTelefono fijo: " + telefonoFijo + "\nTelefono personal: " + telefonoPersonal + "\nDomicilio: " + domicilio + "\nCorreo electronico: " + correoElectronico + "\nInstitucion de procedencia: " + institucionProcedencia + "\nMatricula: " + matricula + "\nDepartamento: " + departamento + "\n\n¿DESEA CONTINUAR?", "CONFIRMACION", JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.NO_OPTION) {
                salir = false;
            } else {
                salir = true;
                //Casos para retornar los diferentes tipos de objetos
                //Caso con el telefono y correo vacios
                if (telefonoPersonal.isBlank() && correoElectronico.isBlank()) {
                    Docente d = new Docente(nombre, edad, telefonoFijo, domicilio, institucionProcedencia, matricula, departamento);
                    return d;
                }
                //Caso con el telefono personal vacio
                if (telefonoPersonal.isBlank() && (!correoElectronico.isBlank())) {
                    Docente d = new Docente(edad, nombre, domicilio, telefonoFijo, correoElectronico, institucionProcedencia, matricula, departamento);
                    return d;
                }
                //Caso con el correo personal vacio
                if ((!telefonoPersonal.isBlank()) && correoElectronico.isBlank()) {
                    Docente d = new Docente(nombre, edad, telefonoFijo, telefonoPersonal, domicilio, institucionProcedencia, matricula, departamento);
                    return d;
                }
                //Caso con todos los datos
                Docente d = new Docente(nombre, edad, telefonoFijo, telefonoPersonal, domicilio, correoElectronico, institucionProcedencia, matricula, departamento);
                return d;

            }

        } while (!salir);

        //Este return no sirve de nada, solo es para que java no se asuste, al parecer el IDE
        //piensa que hay forma en que el programa no retorne nada.
        //Los valores guardados son para detectar ese posible camino que retorne este objeto (Pero no deberia pasar)
        return new Docente("EL IDE TENIA RAZON", (byte) -1, "EL IDE TENIA RAZON", "EL IDE TENIA RAZON", "EL IDE TENIA RAZON", "EL IDE TENIA RAZON", "EL IDE TENIA RAZON");

    }

    private byte leerByte(String msg) {
        return Byte.parseByte(JOptionPane.showInputDialog(msg));
    }

    private int leerEntero(String msg) {
        return Integer.parseInt(JOptionPane.showInputDialog(msg));
    }

    private String leerCadena(String msg) {
        return JOptionPane.showInputDialog(msg);
    }

    private double leerDoble(String msg) {
        return Double.parseDouble(JOptionPane.showInputDialog(msg));
    }

}
