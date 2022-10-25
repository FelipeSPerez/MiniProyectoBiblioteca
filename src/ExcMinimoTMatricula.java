
import javax.swing.JOptionPane;

public class ExcMinimoTMatricula extends Exception {

    public void mensajeExc() {
        JOptionPane.showMessageDialog(null, "Error:\nNo se puede registrar una matricula a 6 caracteres.", "MATRICULA INVALIDA", JOptionPane.ERROR_MESSAGE);
    }

}
