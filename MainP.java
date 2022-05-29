public class MainP {
    public static void main(String[] args) {
//        Empleado empleado = new Empleado("Juan ", "Gerente", "Nocturno");       
        Docente docente = new Docente("cvjbjhvb",(byte)40, "tgfvbjcg", "dfgukykhytdf", "fdgikjhjdgf", "hcvhjkhghfxgch","fyhytydsftyg");
        Comun c = new Comun("cjhbwnkflcm", (byte)40, "cbjwncn", "bciwkncj");
        Estudiante e = new Estudiante("cbkwjnckc", (byte)23, "jhwnckxw", "ncwmckjbwn", "nbjemcklb", "ncjkwmckjnxw");
        
//        ProcesarEmpleado prosesarEmpleado = new ProcesarEmpleado("empleados.bin");
//        prosesarEmpleado.agregarEmpleados(empleado);
//        prosesarEmpleado.leerArchivoEmple();
        ProcesarUsuario procesarUsuario = new ProcesarUsuario("usuarios.bin");
        //procesarUsuario.agregarUsuarios(docente);
        procesarUsuario.leerArchivoUser();
        procesarUsuario.agregarUsuarios(c);
        procesarUsuario.agregarUsuarios(e);
        
    }
}
