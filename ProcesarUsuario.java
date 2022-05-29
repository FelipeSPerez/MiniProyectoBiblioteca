
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import javax.swing.JOptionPane;

public class ProcesarUsuario{
    private String fileName;
    
    //Este es el contructor Principal el cual dice si esta el archivo binario o no si es así lo creá
    public ProcesarUsuario(String fileName) {
        super();
        this.fileName = fileName;
        File f = new File(this.fileName);
        ObjectOutputStream outputstream = null;//Se abre flujo 
        try {
            //Esta sentencia de abajo dice si existe o no lo crea o muestra que existe 
            if(!f.exists()){
                outputstream = new ObjectOutputStream(new FileOutputStream(this.fileName));
                outputstream.close();//Se cierra flujo 
                JOptionPane.showMessageDialog(null,"Se creo el archivo: "+this.fileName);
            }else{
                JOptionPane.showMessageDialog(null,"El archivo: "+this.fileName+"Ya existe");
                }
        } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null,"Tipo de Excepcion: "+ex.getClass().getSimpleName());
        } catch (IOException ex) {
                JOptionPane.showMessageDialog(null,"Tipo de Excepcion: "+ex.getClass().getSimpleName());
        }
    }
    
    //Este método lee el archivo en pantalla 
    public void leerArchivoUser(){
        ObjectInputStream intputstream = null;//Aquí se abre el flujo de muestreo de datos en archivo 
        Comun c;
        Docente d;
        Estudiante e;
        try {
            intputstream = new ObjectInputStream(new FileInputStream(this.fileName));
            while(true){
                    c = (Comun) intputstream.readObject();//Aquí se lee el objeto a mostrar en pantalla
                    d = (Docente) intputstream.readObject();
                    e = (Estudiante) intputstream.readObject();
                    JOptionPane.showMessageDialog(null, d.getDatos());
                    JOptionPane.showMessageDialog(null, c.getDatos());
                    JOptionPane.showMessageDialog(null, e.getDatos());
            }
        } catch (FileNotFoundException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Tipo de Excepcion: "+ex.getClass().getSimpleName());
        } catch(IOException ex){
            JOptionPane.showMessageDialog(null,"Se termino de leer el archivo: "+this.fileName);// Se cierra el flujo de muestreo de datos en el archivo 
        }       
    }   
    
    //metodo que agrega datos al archivo binario
    public void agregarUsuarios(Comun c){
        AddContenido outputStream;
        try {
            outputStream = new AddContenido(new FileOutputStream(this.fileName, true));// se abre el flujo de ingreso de datos 
            outputStream.writeObject(c); // se sobreescribe el objeto en el archivo binario 
            outputStream.close();// Se cierra el flujo de ingreso de datos en el archivo binario 
        } catch (FileNotFoundException ex) {
           JOptionPane.showMessageDialog(null,"Tipo de Excepcion: "+ex.getClass().getSimpleName());
        } catch (IOException ex) {
           JOptionPane.showMessageDialog(null,"Tipo de Excepcion: "+ex.getClass().getSimpleName());
        }       
    } 
    
    public void agregarUsuarios(Docente d){
        AddContenido outputStream;
        try {
            outputStream = new AddContenido(new FileOutputStream(this.fileName, true));// se abre el flujo de ingreso de datos 
            outputStream.writeObject(d); // se sobreescribe el objeto en el archivo binario 
            outputStream.close();// Se cierra el flujo de ingreso de datos en el archivo binario 
        } catch (FileNotFoundException ex) {
           JOptionPane.showMessageDialog(null,"Tipo de Excepcion: "+ex.getClass().getSimpleName());
        } catch (IOException ex) {
           JOptionPane.showMessageDialog(null,"Tipo de Excepcion: "+ex.getClass().getSimpleName());
        }       
    }
    
    public void agregarUsuarios(Estudiante e){
        AddContenido outputStream;
        try {
            outputStream = new AddContenido(new FileOutputStream(this.fileName, true));// se abre el flujo de ingreso de datos 
            outputStream.writeObject(e); // se sobreescribe el objeto en el archivo binario 
            outputStream.close();// Se cierra el flujo de ingreso de datos en el archivo binario 
        } catch (FileNotFoundException ex) {
           JOptionPane.showMessageDialog(null,"Tipo de Excepcion: "+ex.getClass().getSimpleName());
        } catch (IOException ex) {
           JOptionPane.showMessageDialog(null,"Tipo de Excepcion: "+ex.getClass().getSimpleName());
        }       
    }
}

