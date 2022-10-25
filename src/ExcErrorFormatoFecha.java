
import javax.swing.JOptionPane;

public class ExcErrorFormatoFecha extends Exception {

    public void mensajeExc() {
        JOptionPane.showMessageDialog(null, "Error:\nEl formato de la fecha introducido es incorrecto.", "FECHA MAL INTRODUCIDA", JOptionPane.ERROR_MESSAGE);
    }

}
