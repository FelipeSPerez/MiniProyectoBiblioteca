
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ProcesarPrestamo {

    //Atributos
    PrintWriter OutputStream;
    Scanner inputStream;
    String fileName;
    File f;

    public ProcesarPrestamo(String fileName) {
        super();
        String header = "NombreUsuario,NombreEmpleado,cantidadLibrosAPrestar,fechaInicioPrestamo,fechaEsperadaRetorno,Titulo1,NombreAutor1,getTitulo2,NombreAutor2,Titulo3,NombreAutor3,Titulo4,NombreAutor4,Titulo5,NombreAutor5,Titulo6,NombreAutor6,Titulo7,NombreAutor7";
        this.fileName = fileName;
        f = new File(fileName);

        try {
            if (!f.exists()) {
                OutputStream = new PrintWriter(new FileOutputStream(fileName, true));
                OutputStream.println(header);
                OutputStream.close();
                JOptionPane.showMessageDialog(null, "Se creó archivo: " + f.getName());
            } else {
                JOptionPane.showMessageDialog(null, "Ya existe el archivo: " + f.getName());
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Tipo Excepcion: " + ex.getClass().getSimpleName());
        }
    }

    public void leerArchivo() {
        String linea;
        try {
            inputStream = new Scanner(new File(fileName));
            linea = inputStream.nextLine();
            JOptionPane.showMessageDialog(null, linea);
            while (inputStream.hasNextLine()) {
                linea = inputStream.nextLine();
                JOptionPane.showMessageDialog(null, linea + "\n");
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Tipo Excepcion: " + ex.getClass().getSimpleName());
        }
    }

    public void agregarPrestamo(Prestamo p) {
        try {
            OutputStream = new PrintWriter(new FileOutputStream(fileName, true));
            OutputStream.print(p.EntradaPrestamo());
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Tipo Excepcion: " + ex.getClass().getSimpleName());
        }
        OutputStream.close();
    }
}
