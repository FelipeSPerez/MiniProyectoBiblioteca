
import javax.swing.JOptionPane;

public class ExcTipoLibroIncorrecto extends Exception {

    public void mensajeExc() {
        JOptionPane.showMessageDialog(null, "Error:\nEl tipo de libro es incorrecto, ingrese 1 o 2.", "OPCION INVALIDA", JOptionPane.ERROR_MESSAGE);
    }

}
