
import javax.swing.JOptionPane;

public class ExcCantidadLibrosNegativa extends Exception {

    public void mensajeExc() {
        JOptionPane.showMessageDialog(null, "Error:\nLa cantidad de libros a prestar no puede ser negativa o igual a cero.", "CANTIDAD DE LIBROS INVALIDA", JOptionPane.ERROR_MESSAGE);
    }

}
