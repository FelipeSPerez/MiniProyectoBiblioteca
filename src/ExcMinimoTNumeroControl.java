

import javax.swing.JOptionPane;

public class ExcMinimoTNumeroControl extends Exception {

    public void mensajeExc() {
        JOptionPane.showMessageDialog(null, "Error:\nNo se puede registrar una matricula/numero de control menor a 6 caracteres\nEn caso de no contar con matricula, ingresar grado y grupo.", "NUMERO DE CONTROL INVALIDO", JOptionPane.ERROR_MESSAGE);
    }

}
