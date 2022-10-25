

import java.io.Serializable;

public class Empleado implements Persona, Serializable {

    //Atributos 
    private String nombre;
    private String puesto;
    private String turno;

    //CONSTRUCTOR - Solo con atributos propios...
    public Empleado(String nombre, String puesto, String turno) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.turno = turno;
    }

    //Getters...
    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public String getTurno() {
        return turno;
    }

    //METODO - metodo para la impresion de datos...
    @Override
    public String getDatos() {
        return nombre + "," + puesto + "," + turno;
    }
}
