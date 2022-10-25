
import javax.swing.JOptionPane;

public class ExcMinimoTTelefono extends Exception {
    
        public void mensajeExc() {
        JOptionPane.showMessageDialog(null, "Error:\nEl numero de telefono DEBE SER DE exactamente 10 DIGITOS.", "TELEFONO INVALIDO", JOptionPane.ERROR_MESSAGE);
    }
    
}
