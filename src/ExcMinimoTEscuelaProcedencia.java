

import javax.swing.JOptionPane;

public class ExcMinimoTEscuelaProcedencia extends Exception {

    public void mensajeExc() {
        JOptionPane.showMessageDialog(null, "Error:\nNo se puede registrar una escuela con un nombre menor a 15 caracteres.", "ESCUELA INVALIDA", JOptionPane.ERROR_MESSAGE);
    }

}
