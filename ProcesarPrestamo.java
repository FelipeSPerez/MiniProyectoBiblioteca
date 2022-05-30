
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
        String header = "NombreUsuario,NombreEmpleado,cantidadLibrosAPrestar,fechaInicioPrestamo,fechaEsperadaRetorno,Titulo,NombreAutor,getTitulo,NombreAutor,Titulo,NombreAutor,Titulo,NombreAutor,Titulo,NombreAutor,Titulo,NombreAutor,Titulo,NombreAutor";
        this.fileName = fileName;
        f = new File(fileName);

        try {
            if (!f.exists()) {
                OutputStream = new PrintWriter(new FileOutputStream(fileName, true));
                OutputStream.println(header);
                OutputStream.close();
                JOptionPane.showMessageDialog(null,"Se creó archivo: "+f.getName());
            } else {
                JOptionPane.showMessageDialog(null,"Ya existe el archivo: "+f.getName());
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Tipo Excepcion: " + ex.getClass().getSimpleName());
        }
    }
    
    public void leerArchivo(){
        String linea;
        try {
            inputStream = new Scanner(new File(fileName));
            linea = inputStream.nextLine();
            JOptionPane.showMessageDialog(null,linea);
            while(inputStream.hasNextLine()){
                linea = inputStream.nextLine();
                JOptionPane.showMessageDialog(null,linea+"\n"); 
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Tipo Excepcion: " + ex.getClass().getSimpleName());
        }
    }
    
    public void agregarPrestamo(Prestamo p){
        try {  
            OutputStream = new PrintWriter(new FileOutputStream(fileName, true));
            OutputStream.print(p.EntradaPrestamo());
        } catch (FileNotFoundException ex) {
            
        }
        OutputStream.close();
    }   
}