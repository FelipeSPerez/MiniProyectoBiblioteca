
import javax.swing.JOptionPane;

public class ExcMinimoTNombre extends Exception {

    public void mensajeExc() {
        JOptionPane.showMessageDialog(null, "Error:\nNo se puede registrar un nombre menor a 10 caracteres.", "NOMBRE INVALIDO", JOptionPane.ERROR_MESSAGE);
    }

}
