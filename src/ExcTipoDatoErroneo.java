
import javax.swing.JOptionPane;

public class ExcTipoDatoErroneo extends Exception {

    public void mensajeExc(String msg, String titulo) {
        JOptionPane.showMessageDialog(null, msg, titulo, JOptionPane.ERROR_MESSAGE);
    }

}
