

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        boolean salir = false;
        Prestamo prestamo = new Prestamo(new Comun("", (byte) 0, "", ""), new Empleado("", "", ""), (byte) 0, "", "", new Literario("", "", "", "", "", "", ""));

        Usuario usuario = new Comun("", (byte) 0, "", "");
        Comun cmn = new Comun("", (byte) 0, "", "");
        Estudiante est = new Estudiante("", (byte) 0, "", "", "", "");
        Docente dct = new Docente("", (byte) 0, "", "", "", "", "");

        Empleado empleado = new Empleado("", "", "");
        Libro libro = new Literario("", "", "", "", "", "", "");
        ProcesarEmpleado pe;
        ProcesarUsuario pu;
        ProcesarPrestamo pp;
        ProcesarLibro pl;
        String[] opcionesMenuPrincipal = {"Hacer un prestamo", "Registrar usuario", "Registrar empleado", "Registrar libro", "SALIR"};
        String[] opcionesSubMenuRegistrarUsuario = {"Usuario comun", "Estudiante", "Docente", "Regresar"};
        String[] opcionesSubMenuRegistrarLibro = {"Literario", "Informativo", "Regresar"};
        String[] opcionesSubMenuPrestamoUsuario = {"Usuario comun", "Estudiante", "Docente"};

        do {
            int opcionSeleccionada = JOptionPane.showOptionDialog(null, "Has click en la opcion deseada:", "MENU PRINCIPAL", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcionesMenuPrincipal, opcionesMenuPrincipal[0]);
            switch (opcionSeleccionada) {
                case 0:
                    int opcionSeleccionadaUsuario0 = JOptionPane.showOptionDialog(null, "Has click en la opcion deseada:", "SUBMENU REGISTRAR USUARIO PARA PRESTAMO", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcionesSubMenuPrestamoUsuario, opcionesSubMenuPrestamoUsuario[0]);
                    if (opcionSeleccionadaUsuario0 == 0) {
                        usuario = new CapturaDeDatos().getComun();
                        pu = new ProcesarUsuario(usuario.getNombre() + ".bin");
                        pu.agregarUsuarios(usuario);
                    }
                    if (opcionSeleccionadaUsuario0 == 1) {
                        usuario = new CapturaDeDatos().getEstudiante();
                        pu = new ProcesarUsuario(usuario.getNombre() + ".bin");
                        pu.agregarUsuarios(usuario);
                    }
                    if (opcionSeleccionadaUsuario0 == 2) {
                        usuario = new CapturaDeDatos().getDocente();
                        pu = new ProcesarUsuario(usuario.getNombre() + ".bin");
                        pu.agregarUsuarios(usuario);
                    }
                    empleado = new CapturaDeDatos().getEmpleado();
                    pe = new ProcesarEmpleado(empleado.getNombre() + ".bin");
                    pe.agregarEmpleados(empleado);
                    if (usuario.getClass().getSimpleName().equals("Comun")) {
                        cmn = (Comun) usuario;
                        prestamo = new CapturaDeDatos().getPrestamo(cmn, empleado);
                    }
                    if (usuario.getClass().getSimpleName().equals("Estudiante")) {
                        est = (Estudiante) usuario;
                        prestamo = new CapturaDeDatos().getPrestamo(est, empleado);
                    }
                    if (usuario.getClass().getSimpleName().equals("Docente")) {
                        dct = (Docente) usuario;
                        prestamo = new CapturaDeDatos().getPrestamo(dct, empleado);
                    }
                    pp = new ProcesarPrestamo(usuario.getNombre() + "-" + prestamo.getFechaInicioPrestamo() + ".csv");
                    pp.agregarPrestamo(prestamo);
                    break;
                case 1:
                    int opcionSeleccionadaUsuario = JOptionPane.showOptionDialog(null, "Has click en la opcion deseada:", "SUBMENU REGISTRAR USUARIO", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcionesSubMenuRegistrarUsuario, opcionesSubMenuRegistrarUsuario[0]);
                    if (opcionSeleccionadaUsuario == 0) {
                        usuario = new CapturaDeDatos().getComun();
                        pu = new ProcesarUsuario(usuario.getNombre() + ".bin");
                        pu.agregarUsuarios(usuario);
                    }
                    if (opcionSeleccionadaUsuario == 1) {
                        usuario = new CapturaDeDatos().getEstudiante();
                        pu = new ProcesarUsuario(usuario.getNombre() + ".bin");
                        pu.agregarUsuarios(usuario);
                    }
                    if (opcionSeleccionadaUsuario == 2) {
                        usuario = new CapturaDeDatos().getDocente();
                        pu = new ProcesarUsuario(usuario.getNombre() + ".bin");
                        pu.agregarUsuarios(usuario);
                    }
                    break;
                case 2:
                    empleado = new CapturaDeDatos().getEmpleado();
                    pe = new ProcesarEmpleado(empleado.getNombre() + ".bin");
                    pe.agregarEmpleados(empleado);
                    break;
                case 3:
                    int opcionSeleccionadaLibro = JOptionPane.showOptionDialog(null, "Has click en la opcion deseada:", "SUBMENU REGISTRAR LIBRO", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcionesSubMenuRegistrarLibro, opcionesSubMenuRegistrarLibro[0]);
                    if (opcionSeleccionadaLibro == 0) {
                        libro = new CapturaDeDatos().getLiterario();
                        pl = new ProcesarLibro(libro.getTitulo() + ".csv");
                        pl.agregarLibro(libro);
                    }
                    if (opcionSeleccionadaLibro == 1) {
                        libro = new CapturaDeDatos().getInformativo();
                        pl = new ProcesarLibro(libro.getTitulo() + ".csv");
                        pl.agregarLibro(libro);
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        } while (!salir);

    }
}
