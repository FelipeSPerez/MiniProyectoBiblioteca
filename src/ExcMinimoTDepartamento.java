

import javax.swing.JOptionPane;

public class ExcMinimoTDepartamento extends Exception {

    public void mensajeExc() {
        JOptionPane.showMessageDialog(null, "Error:\nNo se puede registrar un departamento con un nombre menor a 5 caracteres.", "DEPARTAMENTO INVALIDO", JOptionPane.ERROR_MESSAGE);
    }

}
