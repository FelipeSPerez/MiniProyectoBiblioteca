

import javax.swing.JOptionPane;

public class ExcTurnoEmpleado extends Exception {

    public void mensajeExc() {
        JOptionPane.showMessageDialog(null, "Error:\nLos unicos turnos validos son: Matutino y Vespertino.", "TURNO INCORRECTO", JOptionPane.ERROR_MESSAGE);
    }

}
