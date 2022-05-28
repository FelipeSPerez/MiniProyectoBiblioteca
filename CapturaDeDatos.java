package version01;

import javax.swing.JOptionPane;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapturaDeDatos {

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
                    if (edad < 12) {
                        error = true;
                        throw new ExcMinimoEdadUsuario();
                    }
                    error = false;
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
                    telefonoFijo = leerCadena("Introduce el numero telefonico fijo (OBLIGATORIO):");
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
                    if (domicilio.length() < 20) {
                        error = true;
                        throw new ExcMinimoTDomicilio();
                    }
                    error = false;
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
