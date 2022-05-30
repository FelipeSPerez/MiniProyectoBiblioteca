
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ProcesarLibro {
    PrintWriter OutputStream;
    Scanner inputStream;
    String fileName;
    File f;

    public ProcesarLibro(String fileName) {
        super();
        String header = "titulo,nombreAutor,isbn,editorial,condicion";
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
                JOptionPane.showMessageDialog(null,linea); 
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Tipo Excepcion: " + ex.getClass().getSimpleName());
        }
    }
    
    public void agregarLibro(Libro l){
        try {  
            OutputStream = new PrintWriter(new FileOutputStream(fileName, true));
            OutputStream.print(l.getDatos());
        } catch (FileNotFoundException ex) {
            
        }
        OutputStream.close();
    }   
}