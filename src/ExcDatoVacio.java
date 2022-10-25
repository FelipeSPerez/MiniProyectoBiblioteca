

import javax.swing.JOptionPane;

public class ExcDatoVacio extends Exception {

    public void mensajeExc() {
        JOptionPane.showMessageDialog(null, "Error:\nNo puedes dejar este dato en blanco.", "DATO VACIO", JOptionPane.ERROR_MESSAGE);
    }

}
