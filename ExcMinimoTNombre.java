package version01;

import javax.swing.JOptionPane;

public class ExcMinimoTNombre extends Exception {

    public void mensajeExc() {
        JOptionPane.showMessageDialog(null, "Error:\nNo se puede registrar un NOMBRE COMPLETO menor a 10 caracteres.", "NOMBRE INVALIDO", JOptionPane.ERROR_MESSAGE);
    }

}
