public class MainP {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan ", "Gerente", "Nocturno");       
        Docente docente = new Docente("cvjbjhvb",(byte)40, "tgfvbjcg", "dfgukykhytdf", "fdgikjhjdgf", "hcvhjkhghfxgch","fyhytydsftyg");
        Comun c = new Comun("cjhbwnkflcm", (byte)40, "cbjwncn", "bciwkncj");
        Estudiante e = new Estudiante("cbkwjnckc", (byte)23, "jhwnckxw", "ncwmckjbwn", "nbjemcklb", "ncjkwmckjnxw");
        Literario l = new Literario("principito","Junior", "cBCJWD","cbwjd", "Good", "terror", "+18");
        
//        //ProcesarEmpleado prosesarEmpleado = new ProcesarEmpleado("empleados.bin");
//        //prosesarEmpleado.agregarEmpleados(empleado);
//        //prosesarEmpleado.leerArchivoEmple();
        ProcesarUsuario procesarUsuario = new ProcesarUsuario("usuarios.bin");
        procesarUsuario.agregar(e);
        procesarUsuario.leerArchivo();

//          Prestamo p = new Prestamo(c, empleado, (short)1, "vjbnw", "nvkjmekfm", l);
//          ProcesarPrestamo procesarPrestamo = new ProcesarPrestamo("prestamos.csv");
//          procesarPrestamo.agregarPrestamo(p);
//          procesarPrestamo.leerArchivo();
            
//            ProcesarLibro procesarLibro = new ProcesarLibro("Libros.csv");
//            procesarLibro.agregarLibro(l);
//            procesarLibro.leerArchivo();
    }
}
