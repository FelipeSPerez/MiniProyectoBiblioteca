
import javax.swing.JOptionPane;

public class ExcMinimoTDomicilio extends Exception {

    public void mensajeExc() {
        JOptionPane.showMessageDialog(null, "Error:\nNo se puede registrar un domicilio menor a 20 caracteres.", "DOMICILIO INVALIDO", JOptionPane.ERROR_MESSAGE);
    }

}
