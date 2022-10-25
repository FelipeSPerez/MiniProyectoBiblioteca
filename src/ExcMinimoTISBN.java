

import javax.swing.JOptionPane;

public class ExcMinimoTISBN extends Exception {

    public void mensajeExc() {
        JOptionPane.showMessageDialog(null, "Error:\nEl ISBN solo puede ser de 10 o 13 caracteres.", "ISBN INVALIDO", JOptionPane.ERROR_MESSAGE);
    }

}
