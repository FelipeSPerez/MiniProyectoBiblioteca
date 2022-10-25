

import javax.swing.JOptionPane;

public class ExcMinimoTEditorial extends Exception {

    public void mensajeExc() {
        JOptionPane.showMessageDialog(null, "Error:\nEl nombre de la editorial no puede ser menor a 5 caracteres.", "EDITORIAL INVALIDA", JOptionPane.ERROR_MESSAGE);
    }

}
