
import javax.swing.JOptionPane;

public class ExcLimiteLibros extends Exception {

    public void mensajeExc(String msg) {
        JOptionPane.showMessageDialog(null, msg, "LIMITE DE LIBROS", JOptionPane.ERROR_MESSAGE);
    }

}
