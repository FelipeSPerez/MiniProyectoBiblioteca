
import javax.swing.JOptionPane;

public class ExcMinimoEdadUsuario extends Exception {

    public void mensajeExc() {
        JOptionPane.showMessageDialog(null, "Error:\nLa edad minima para registrarse como usuario es de 12 años.", "EDAD INVALIDA", JOptionPane.ERROR_MESSAGE);
    }

}
