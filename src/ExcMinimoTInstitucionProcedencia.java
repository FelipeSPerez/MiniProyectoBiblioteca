
import javax.swing.JOptionPane;

public class ExcMinimoTInstitucionProcedencia extends Exception {

    public void mensajeExc() {
        JOptionPane.showMessageDialog(null, "Error:\nNo se puede registrar una institucion con un nombre menor a 3 caracteres.", "INSTITUCION INVALIDA", JOptionPane.ERROR_MESSAGE);
    }

}
