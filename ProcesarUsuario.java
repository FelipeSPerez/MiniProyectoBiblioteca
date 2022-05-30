
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class ProcesarUsuario{
    //Atributos
    PrintWriter OutputStream;
    Scanner inputStream;
    String fileName;
    File f;

    public ProcesarUsuario(String fileName) {
        super();
        String header = "nombre,edad,telefonoFijo,telefonoPersonal,domicilio,correoElectronico";
        this.fileName = fileName;
        f = new File(fileName);

        try {
            if (!f.exists()) {
                OutputStream = new PrintWriter(new FileOutputStream(fileName, true));
                OutputStream.print(header);
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
        String cadena = "";
        try {
            inputStream = new Scanner(new File(fileName));
            linea = inputStream.nextLine();
            JOptionPane.showMessageDialog(null,linea);
            while(inputStream.hasNextLine()){
                linea = inputStream.nextLine();
                cadena += linea+"\n";
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Tipo Excepcion: " + ex.getClass().getSimpleName());
        }
        JOptionPane.showMessageDialog(null, cadena);
        JOptionPane.showMessageDialog(null,"Se termino de leer el archivo: "+this.fileName);// Se cierra el flujo de muestreo de datos en el archivo 
    }
    
    public void agregar(Usuario u){
        try {  
            OutputStream = new PrintWriter(new FileOutputStream(fileName, true));
            OutputStream.print(u.getDatos());
        } catch (FileNotFoundException ex) {
            
        }
        OutputStream.close();
    }    
}

