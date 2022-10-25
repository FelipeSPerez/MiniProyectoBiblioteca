

import javax.swing.JOptionPane;
import java.util.regex.Pattern;

public class CapturaDeDatos {

    private boolean error = false;
    private boolean salir = false;

    public Comun getComun() {
        //Ciclo para confirmacion
        do {

            //Lectura de los datos
            String nombre = leerNombre("usuario");
            byte edad = leerEdad("usuario");
            String telefonoFijo = leerTelefonoFijo("usuario");
            String telefonoPersonal = leerTelefonoPersonal("usuario");
            String domicilio = leerDomicilio("usuario");
            String correoElectronico = leerCorreoElectronico("usuario");

            //Pregunta para confirmar los datos ingresados, en caso de darle "No" vuelve a pedir todos los datos,
            //en caso de decir si sigue con la ejecucion y retorna el objeto
            int dialogResult = JOptionPane.showConfirmDialog(null, "OJO: Datos a registrar:\n\nNombre: " + nombre + "\nEdad: " + edad + "\nTelefono fijo: " + telefonoFijo + "\nTelefono personal: " + telefonoPersonal + "\nDomicilio: " + domicilio + "\nCorreo electronico: " + correoElectronico + "\n\n¿DESEA CONTINUAR?", "CONFIRMACION", JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.NO_OPTION) {
                salir = false;
            } else {
                salir = true;
                //Casos para retornar los diferentes tipos de objetos
                //Caso con el telefono y correo vacios
                if (telefonoPersonal.isBlank() && correoElectronico.isBlank()) {
                    Comun c = new Comun(nombre, edad, telefonoFijo, domicilio);
                    return c;
                }
                //Caso con el telefono personal vacio
                if (telefonoPersonal.isBlank() && (!correoElectronico.isBlank())) {
                    Comun c = new Comun(edad, nombre, domicilio, telefonoFijo, correoElectronico);
                    return c;
                }
                //Caso con el correo personal vacio
                if ((!telefonoPersonal.isBlank()) && correoElectronico.isBlank()) {
                    Comun c = new Comun(nombre, edad, telefonoFijo, telefonoPersonal, domicilio);
                    return c;
                }
                //Caso con todos los datos
                Comun c = new Comun(nombre, edad, telefonoFijo, telefonoPersonal, domicilio, correoElectronico);
                return c;
            }

        } while (!salir);

        //Este return no sirve de nada, solo es para que java no se asuste, al parecer el IDE
        //piensa que hay forma en que el programa no retorne nada.
        //Los valores guardados son para detectar ese posible camino que retorne este objeto (Pero no deberia pasar)
        return new Comun("EL IDE TENIA RAZON", (byte) -1, "EL IDE TENIA RAZON", "EL IDE TENIA RAZON");
    }

    public Estudiante getEstudiante() {
        //Ciclo para confirmacion
        do {

            //Lectura de los datos
            String nombre = leerNombre("estudiante");
            byte edad = leerEdad("estudiante");
            String telefonoFijo = leerTelefonoFijo("estudiante");
            String telefonoPersonal = leerTelefonoPersonal("estudiante");
            String domicilio = leerDomicilio("estudiante");
            String correoElectronico = leerCorreoElectronico("estudiante");
            String escuelaProcedencia = leerEscuelaProcedencia();
            String numeroDeControl = leerNumeroDeControl();

            //Pregunta para confirmar los datos ingresados, en caso de darle "No" vuelve a pedir todos los datos,
            //en caso de decir si sigue con la ejecucion y retorna el objeto
            int dialogResult = JOptionPane.showConfirmDialog(null, "OJO: Datos a registrar:\n\nNombre: " + nombre + "\nEdad: " + edad + "\nTelefono fijo: " + telefonoFijo + "\nTelefono personal: " + telefonoPersonal + "\nDomicilio: " + domicilio + "\nCorreo electronico: " + correoElectronico + "\nEscuela de procedencia: " + escuelaProcedencia + "\nNumero de control: " + numeroDeControl + "\n\n¿DESEA CONTINUAR?", "CONFIRMACION", JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.NO_OPTION) {
                salir = false;
            } else {
                salir = true;
                //Casos para retornar los diferentes tipos de objetos
                //Caso con el telefono y correo vacios
                if (telefonoPersonal.isBlank() && correoElectronico.isBlank()) {
                    Estudiante e = new Estudiante(nombre, edad, telefonoFijo, domicilio, escuelaProcedencia, numeroDeControl);
                    return e;
                }
                //Caso con el telefono personal vacio
                if (telefonoPersonal.isBlank() && (!correoElectronico.isBlank())) {
                    Estudiante e = new Estudiante(edad, nombre, domicilio, telefonoFijo, correoElectronico, escuelaProcedencia, numeroDeControl);
                    return e;
                }
                //Caso con el correo personal vacio
                if ((!telefonoPersonal.isBlank()) && correoElectronico.isBlank()) {
                    Estudiante e = new Estudiante(nombre, edad, telefonoFijo, telefonoPersonal, domicilio, escuelaProcedencia, numeroDeControl);
                    return e;
                }
                //Caso con todos los datos
                Estudiante e = new Estudiante(nombre, edad, telefonoFijo, telefonoPersonal, domicilio, correoElectronico, escuelaProcedencia, numeroDeControl);
                return e;
            }

        } while (!salir);

        //Este return no sirve de nada, solo es para que java no se asuste, al parecer el IDE
        //piensa que hay forma en que el programa no retorne nada.
        //Los valores guardados son para detectar ese posible camino que retorne este objeto (Pero no deberia pasar)
        return new Estudiante("EL IDE TENIA RAZON", (byte) -1, "EL IDE TENIA RAZON", "EL IDE TENIA RAZON", "EL IDE TENIA RAZON", "EL IDE TENIA RAZON");
    }

    public Docente getDocente() {
        //Ciclo para confirmacion
        do {

            String nombre = leerNombre("docente");
            byte edad = leerEdad("docente");
            String telefonoFijo = leerTelefonoFijo("docente");
            String telefonoPersonal = leerTelefonoPersonal("docente");
            String domicilio = leerDomicilio("docente");
            String correoElectronico = leerCorreoElectronico("docente");
            String institucionProcedencia = leerInstitucionProcedencia();
            String matricula = leerMatricula();
            String departamento = leerDepartamento();

            //Pregunta para confirmar los datos ingresados, en caso de darle "No" vuelve a pedir todos los datos,
            //en caso de decir si sigue con la ejecucion y retorna el objeto
            int dialogResult = JOptionPane.showConfirmDialog(null, "OJO: Datos a registrar:\n\nNombre: " + nombre + "\nEdad: " + edad + "\nTelefono fijo: " + telefonoFijo + "\nTelefono personal: " + telefonoPersonal + "\nDomicilio: " + domicilio + "\nCorreo electronico: " + correoElectronico + "\nInstitucion de procedencia: " + institucionProcedencia + "\nMatricula: " + matricula + "\nDepartamento: " + departamento + "\n\n¿DESEA CONTINUAR?", "CONFIRMACION", JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.NO_OPTION) {
                salir = false;
            } else {
                salir = true;
                //Casos para retornar los diferentes tipos de objetos
                //Caso con el telefono y correo vacios
                if (telefonoPersonal.isBlank() && correoElectronico.isBlank()) {
                    Docente d = new Docente(nombre, edad, telefonoFijo, domicilio, institucionProcedencia, matricula, departamento);
                    return d;
                }
                //Caso con el telefono personal vacio
                if (telefonoPersonal.isBlank() && (!correoElectronico.isBlank())) {
                    Docente d = new Docente(edad, nombre, domicilio, telefonoFijo, correoElectronico, institucionProcedencia, matricula, departamento);
                    return d;
                }
                //Caso con el correo personal vacio
                if ((!telefonoPersonal.isBlank()) && correoElectronico.isBlank()) {
                    Docente d = new Docente(nombre, edad, telefonoFijo, telefonoPersonal, domicilio, institucionProcedencia, matricula, departamento);
                    return d;
                }
                //Caso con todos los datos
                Docente d = new Docente(nombre, edad, telefonoFijo, telefonoPersonal, domicilio, correoElectronico, institucionProcedencia, matricula, departamento);
                return d;
            }

        } while (!salir);

        //Este return no sirve de nada, solo es para que java no se asuste, al parecer el IDE
        //piensa que hay forma en que el programa no retorne nada.
        //Los valores guardados son para detectar ese posible camino que retorne este objeto (Pero no deberia pasar)
        return new Docente("EL IDE TENIA RAZON", (byte) -1, "EL IDE TENIA RAZON", "EL IDE TENIA RAZON", "EL IDE TENIA RAZON", "EL IDE TENIA RAZON", "EL IDE TENIA RAZON");
    }

    public Literario getLiterario() {
        //Ciclo para confirmacion
        do {

            //Lectura de los datos
            String titulo = leerTitulo();
            String nombreAutor = leerNombreAutor();
            String isbn = leerISBN();
            String editorial = leerEditorial();
            String condicion = leerCondicion();
            String genero = leerGenero();
            String clasificacion = leerClasificacion();

            //Pregunta para confirmar los datos ingresados, en caso de darle "No" vuelve a pedir todos los datos,
            //en caso de decir si sigue con la ejecucion y retorna el objeto
            int dialogResult = JOptionPane.showConfirmDialog(null, "OJO: Datos a registrar:\n\nTitulo: " + titulo + "\nAutor: " + nombreAutor + "\nISBN: " + isbn + "\nEditorial: " + editorial + "\nCondicion: " + condicion + "\nGenero: " + genero + "\nClasificacion: " + clasificacion + "\n\n¿DESEA CONTINUAR?", "CONFIRMACION", JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.NO_OPTION) {
                salir = false;
            } else {
                salir = true;
                Literario l = new Literario(titulo, nombreAutor, isbn, editorial, condicion, genero, clasificacion);
                return l;
            }

        } while (!salir);

        //Este return no sirve de nada, solo es para que java no se asuste, al parecer el IDE
        //piensa que hay forma en que el programa no retorne nada.
        //Los valores guardados son para detectar ese posible camino que retorne este objeto (Pero no deberia pasar)
        return new Literario("EL IDE TENIA RAZON", "EL IDE TENIA RAZON", "EL IDE TENIA RAZON", "EL IDE TENIA RAZON", "EL IDE TENIA RAZON", "EL IDE TENIA RAZON", "EL IDE TENIA RAZON");
    }

    public Informativo getInformativo() {
        //Ciclo para confirmacion
        do {

            //Lectura de los datos
            String titulo = leerTitulo();
            String nombreAutor = leerNombreAutor();
            String isbn = leerISBN();
            String editorial = leerEditorial();
            String condicion = leerCondicion();
            String fechaPublicacion = leerFechaPublicacion();

            //Validacion fechaPublicacion
            //Pregunta para confirmar los datos ingresados, en caso de darle "No" vuelve a pedir todos los datos,
            //en caso de decir si sigue con la ejecucion y retorna el objeto
            int dialogResult = JOptionPane.showConfirmDialog(null, "OJO: Datos a registrar:\n\nTitulo: " + titulo + "\nAutor: " + nombreAutor + "\nISBN: " + isbn + "\nEditorial: " + editorial + "\nCondicion: " + condicion + "\nFecha de publicacion: " + fechaPublicacion + "\n\n¿DESEA CONTINUAR?", "CONFIRMACION", JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.NO_OPTION) {
                salir = false;
            } else {
                salir = true;
                Informativo i = new Informativo(titulo, nombreAutor, isbn, editorial, condicion, fechaPublicacion);
                return i;
            }

        } while (!salir);

        //Este return no sirve de nada, solo es para que java no se asuste, al parecer el IDE
        //piensa que hay forma en que el programa no retorne nada.
        //Los valores guardados son para detectar ese posible camino que retorne este objeto (Pero no deberia pasar)
        return new Informativo("EL IDE TENIA RAZON", "EL IDE TENIA RAZON", "EL IDE TENIA RAZON", "EL IDE TENIA RAZON", "EL IDE TENIA RAZON", "EL IDE TENIA RAZON");
    }

    public Empleado getEmpleado() {
        //Ciclo para validacion final
        do {

            //Lectura de los datos
            String nombre = leerNombre("empleado");
            String puesto = leerPuesto();
            String turno = leerTurno();

            //Pregunta para confirmar los datos ingresados, en caso de darle "No" vuelve a pedir todos los datos,
            //en caso de decir si sigue con la ejecucion y retorna el objeto
            int dialogResult = JOptionPane.showConfirmDialog(null, "OJO: Datos a registrar:\n\nNombre: " + nombre + "\nPuesto: " + puesto + "\nTurno: " + turno + "\n\n¿DESEA CONTINUAR?", "CONFIRMACION", JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.NO_OPTION) {
                salir = false;
            } else {
                salir = true;
                Empleado e = new Empleado(nombre, puesto, turno);
                return e;
            }

        } while (!salir);

        //Este return no sirve de nada, solo es para que java no se asuste, al parecer el IDE
        //piensa que hay forma en que el programa no retorne nada.
        //Los valores guardados son para detectar ese posible camino que retorne este objeto (Pero no deberia pasar)
        return new Empleado("EL IDE TENIA RAZON", "EL IDE TENIA RAZON", "EL IDE TENIA RAZON");
    }

    public Prestamo getPrestamo(Comun cmn, Empleado emp) {
        //Ciclo para validacion
        do {

            //Lectura de los datos
            byte cantidadLibrosAPrestar = leerCantidadLibrosAPrestar("usuario 'comun'", (byte) 3);
            String fechaInicioPrestamo = leerFechaInicioPrestamo();
            String fechaEsperadaRetorno = leerFechaEsperadaRetorno();
            //Los siguientes objetos deben inicializarse al igual que todas las variables anteriores
            Libro l1 = new Informativo("", "", "", "", "", "");
            Libro l2 = new Informativo("", "", "", "", "", "");
            Libro l3 = new Informativo("", "", "", "", "", "");

            switch (cantidadLibrosAPrestar) {
                case 1:
                    l1 = leerTipoDeLibroYLeerDatos("EL PRIMER Y UNICO LIBRO");
                    break;

                case 2:
                    l1 = leerTipoDeLibroYLeerDatos("EL PRIMER LIBRO");
                    l2 = leerTipoDeLibroYLeerDatos("EL SEGUNDO LIBRO");
                    break;

                case 3:
                    l1 = leerTipoDeLibroYLeerDatos("EL PRIMER LIBRO");
                    l2 = leerTipoDeLibroYLeerDatos("EL SEGUNDO LIBRO");
                    l3 = leerTipoDeLibroYLeerDatos("EL TERCER LIBRO");
                    break;
            }

            //Pregunta para confirmar los datos ingresados, en caso de darle "No" vuelve a pedir todos los datos,
            //en caso de decir si sigue con la ejecucion y retorna el objeto
            int dialogResult = JOptionPane.showConfirmDialog(null, "OJO: Datos a registrar:\n\nUsuario: " + cmn.getNombre() + "\nEmpleado: " + emp.getNombre() + "\nCantidad de libros a prestar: " + cantidadLibrosAPrestar + "\n\n¿DESEA CONTINUAR?", "CONFIRMACION", JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.NO_OPTION) {
                salir = false;
            } else {
                salir = true;
                switch (cantidadLibrosAPrestar) {
                    case 1:
                        Prestamo p = new Prestamo(cmn, emp, cantidadLibrosAPrestar, fechaInicioPrestamo, fechaEsperadaRetorno, l1);
                        return p;
                    case 2:
                        Prestamo p1 = new Prestamo(cmn, emp, cantidadLibrosAPrestar, fechaInicioPrestamo, fechaEsperadaRetorno, l1, l2);
                        return p1;
                    case 3:
                        Prestamo p2 = new Prestamo(cmn, emp, cantidadLibrosAPrestar, fechaInicioPrestamo, fechaEsperadaRetorno, l1, l2, l3);
                        return p2;
                }
            }

        } while (!salir);

        //Este return no sirve de nada, solo es para que java no se asuste, al parecer el IDE
        //piensa que hay forma en que el programa no retorne nada.
        //Los valores guardados son para detectar ese posible camino que retorne este objeto (Pero no deberia pasar)
        return new Prestamo(cmn, emp, (byte) 0, "EL IDE TENIA RAZON", "EL IDE TENIA RAZON", new Informativo("", "", "", "", "", ""));
    }

    public Prestamo getPrestamo(Estudiante est, Empleado emp) {
        //Ciclo para validacion
        do {

            //Validacion para la cantidad de libros a prestar
            byte cantidadLibrosAPrestar = leerCantidadLibrosAPrestar("estudiante", (byte) 5);
            String fechaInicioPrestamo = leerFechaInicioPrestamo();
            String fechaEsperadaRetorno = leerFechaEsperadaRetorno();
            //Los siguientes objetos deben inicializarse como todas las variables anteriores
            Libro l1 = new Informativo("", "", "", "", "", "");
            Libro l2 = new Informativo("", "", "", "", "", "");
            Libro l3 = new Informativo("", "", "", "", "", "");
            Libro l4 = new Informativo("", "", "", "", "", "");
            Libro l5 = new Informativo("", "", "", "", "", "");

            switch (cantidadLibrosAPrestar) {
                case 1:
                    l1 = leerTipoDeLibroYLeerDatos("EL PRIMER Y UNICO LIBRO");
                    break;
                case 2:
                    l1 = leerTipoDeLibroYLeerDatos("EL PRIMER LIBRO");
                    l2 = leerTipoDeLibroYLeerDatos("EL SEGUNDO LIBRO");
                    break;
                case 3:
                    l1 = leerTipoDeLibroYLeerDatos("EL PRIMER LIBRO");
                    l2 = leerTipoDeLibroYLeerDatos("EL SEGUNDO LIBRO");
                    l3 = leerTipoDeLibroYLeerDatos("EL TERCER LIBRO");
                    break;

                case 4:
                    l1 = leerTipoDeLibroYLeerDatos("EL PRIMER LIBRO");
                    l2 = leerTipoDeLibroYLeerDatos("EL SEGUNDO LIBRO");
                    l3 = leerTipoDeLibroYLeerDatos("EL TERCER LIBRO");
                    l4 = leerTipoDeLibroYLeerDatos("EL CUARTO LIBRO");
                    break;
                case 5:
                    l1 = leerTipoDeLibroYLeerDatos("EL PRIMER LIBRO");
                    l2 = leerTipoDeLibroYLeerDatos("EL SEGUNDO LIBRO");
                    l3 = leerTipoDeLibroYLeerDatos("EL TERCER LIBRO");
                    l4 = leerTipoDeLibroYLeerDatos("EL CUARTO LIBRO");
                    l5 = leerTipoDeLibroYLeerDatos("EL QUINTO LIBRO");
                    break;
            }

            //Pregunta para confirmar los datos ingresados, en caso de darle "No" vuelve a pedir todos los datos,
            //en caso de decir si sigue con la ejecucion y retorna el objeto
            int dialogResult = JOptionPane.showConfirmDialog(null, "OJO: Datos a registrar:\n\nUsuario: " + est.getNombre() + "\nEmpleado: " + emp.getNombre() + "\nCantidad de libros a prestar: " + cantidadLibrosAPrestar + "\nLibro 1: " + l1.getTitulo() + "\nLibro 2: " + l2.getTitulo() + "\nLibro 3: " + l3.getTitulo() + "\nLibro 4: " + l4.getTitulo() + "\nLibro 5: " + l5.getTitulo() + "\n\n¿DESEA CONTINUAR?", "CONFIRMACION", JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.NO_OPTION) {
                salir = false;
            } else {
                salir = true;
                switch (cantidadLibrosAPrestar) {
                    case 1:
                        Prestamo p = new Prestamo(est, emp, cantidadLibrosAPrestar, fechaInicioPrestamo, fechaEsperadaRetorno, l1);
                        return p;
                    case 2:
                        Prestamo p1 = new Prestamo(est, emp, cantidadLibrosAPrestar, fechaInicioPrestamo, fechaEsperadaRetorno, l1, l2);
                        return p1;
                    case 3:
                        Prestamo p2 = new Prestamo(est, emp, cantidadLibrosAPrestar, fechaInicioPrestamo, fechaEsperadaRetorno, l1, l2, l3);
                        return p2;
                    case 4:
                        Prestamo p3 = new Prestamo(est, emp, cantidadLibrosAPrestar, fechaInicioPrestamo, fechaEsperadaRetorno, l1, l2, l3, l4);
                        return p3;
                    case 5:
                        Prestamo p4 = new Prestamo(est, emp, cantidadLibrosAPrestar, fechaInicioPrestamo, fechaEsperadaRetorno, l1, l2, l3, l4, l5);
                        return p4;
                }
            }

        } while (!salir);

        //Este return no sirve de nada, solo es para que java no se asuste, al parecer el IDE
        //piensa que hay forma en que el programa no retorne nada.
        //Los valores guardados son para detectar ese posible camino que retorne este objeto (Pero no deberia pasar)
        return new Prestamo(est, emp, (byte) 0, "EL IDE TENIA RAZON", "EL IDE TENIA RAZON", new Informativo("", "", "", "", "", ""), new Informativo("", "", "", "", "", ""), new Informativo("", "", "", "", "", ""), new Informativo("", "", "", "", "", ""), new Informativo("", "", "", "", "", ""));
    }

    public Prestamo getPrestamo(Docente dct, Empleado emp) {
        //Ciclo para validacion
        do {

            byte cantidadLibrosAPrestar = leerCantidadLibrosAPrestar("docente", (byte) 7);
            String fechaInicioPrestamo = leerFechaInicioPrestamo();
            String fechaEsperadaRetorno = leerFechaEsperadaRetorno();
            //Los siguientes objetos deben inicializarse como todas las variables anteriores
            Libro l1 = new Informativo("", "", "", "", "", "");
            Libro l2 = new Informativo("", "", "", "", "", "");
            Libro l3 = new Informativo("", "", "", "", "", "");
            Libro l4 = new Informativo("", "", "", "", "", "");
            Libro l5 = new Informativo("", "", "", "", "", "");
            Libro l6 = new Informativo("", "", "", "", "", "");
            Libro l7 = new Informativo("", "", "", "", "", "");

            switch (cantidadLibrosAPrestar) {
                case 1:
                    l1 = leerTipoDeLibroYLeerDatos("EL PRIMER Y UNICO LIBRO");
                    break;
                case 2:
                    l1 = leerTipoDeLibroYLeerDatos("EL PRIMER LIBRO");
                    l2 = leerTipoDeLibroYLeerDatos("EL SEGUNDO LIBRO");
                    break;
                case 3:
                    l1 = leerTipoDeLibroYLeerDatos("EL PRIMER LIBRO");
                    l2 = leerTipoDeLibroYLeerDatos("EL SEGUNDO LIBRO");
                    l3 = leerTipoDeLibroYLeerDatos("EL TERCER LIBRO");
                    break;

                case 4:
                    l1 = leerTipoDeLibroYLeerDatos("EL PRIMER LIBRO");
                    l2 = leerTipoDeLibroYLeerDatos("EL SEGUNDO LIBRO");
                    l3 = leerTipoDeLibroYLeerDatos("EL TERCER LIBRO");
                    l4 = leerTipoDeLibroYLeerDatos("EL CUARTO LIBRO");
                    break;
                case 5:
                    l1 = leerTipoDeLibroYLeerDatos("EL PRIMER LIBRO");
                    l2 = leerTipoDeLibroYLeerDatos("EL SEGUNDO LIBRO");
                    l3 = leerTipoDeLibroYLeerDatos("EL TERCER LIBRO");
                    l4 = leerTipoDeLibroYLeerDatos("EL CUARTO LIBRO");
                    l5 = leerTipoDeLibroYLeerDatos("EL QUINTO LIBRO");
                    break;
                case 6:
                    l1 = leerTipoDeLibroYLeerDatos("EL PRIMER LIBRO");
                    l2 = leerTipoDeLibroYLeerDatos("EL SEGUNDO LIBRO");
                    l3 = leerTipoDeLibroYLeerDatos("EL TERCER LIBRO");
                    l4 = leerTipoDeLibroYLeerDatos("EL CUARTO LIBRO");
                    l5 = leerTipoDeLibroYLeerDatos("EL QUINTO LIBRO");
                    l6 = leerTipoDeLibroYLeerDatos("EL SEXTO LIBRO");
                    break;
                case 7:
                    l1 = leerTipoDeLibroYLeerDatos("EL PRIMER LIBRO");
                    l2 = leerTipoDeLibroYLeerDatos("EL SEGUNDO LIBRO");
                    l3 = leerTipoDeLibroYLeerDatos("EL TERCER LIBRO");
                    l4 = leerTipoDeLibroYLeerDatos("EL CUARTO LIBRO");
                    l5 = leerTipoDeLibroYLeerDatos("EL QUINTO LIBRO");
                    l6 = leerTipoDeLibroYLeerDatos("EL SEXTO LIBRO");
                    l7 = leerTipoDeLibroYLeerDatos("EL SEPTIMO LIBRO");
                    break;
            }

            //Pregunta para confirmar los datos ingresados, en caso de darle "No" vuelve a pedir todos los datos,
            //en caso de decir si sigue con la ejecucion y retorna el objeto
            int dialogResult = JOptionPane.showConfirmDialog(null, "OJO: Datos a registrar:\n\nUsuario: " + dct.getNombre() + "\nEmpleado: " + emp.getNombre() + "\nCantidad de libros a prestar: " + cantidadLibrosAPrestar + "\nLibro 1: " + l1.getTitulo() + "\nLibro 2: " + l2.getTitulo() + "\nLibro 3: " + l3.getTitulo() + "\nLibro 4: " + l4.getTitulo() + "\nLibro 5: " + l5.getTitulo() + "\nLibro 6: " + l6.getTitulo() + "\nLibro 7: " + l7.getTitulo() + "\n\n¿DESEA CONTINUAR?", "CONFIRMACION", JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.NO_OPTION) {
                salir = false;
            } else {
                salir = true;
                switch (cantidadLibrosAPrestar) {
                    case 1:
                        Prestamo p = new Prestamo(dct, emp, cantidadLibrosAPrestar, fechaInicioPrestamo, fechaEsperadaRetorno, l1);
                        return p;
                    case 2:
                        Prestamo p1 = new Prestamo(dct, emp, cantidadLibrosAPrestar, fechaInicioPrestamo, fechaEsperadaRetorno, l1, l2);
                        return p1;
                    case 3:
                        Prestamo p2 = new Prestamo(dct, emp, cantidadLibrosAPrestar, fechaInicioPrestamo, fechaEsperadaRetorno, l1, l2, l3);
                        return p2;
                    case 4:
                        Prestamo p3 = new Prestamo(dct, emp, cantidadLibrosAPrestar, fechaInicioPrestamo, fechaEsperadaRetorno, l1, l2, l3, l4);
                        return p3;
                    case 5:
                        Prestamo p4 = new Prestamo(dct, emp, cantidadLibrosAPrestar, fechaInicioPrestamo, fechaEsperadaRetorno, l1, l2, l3, l4, l5);
                        return p4;
                    case 6:
                        Prestamo p5 = new Prestamo(dct, emp, cantidadLibrosAPrestar, fechaInicioPrestamo, fechaEsperadaRetorno, l1, l2, l3, l4, l5, l6);
                        return p5;
                    case 7:
                        Prestamo p6 = new Prestamo(dct, emp, cantidadLibrosAPrestar, fechaInicioPrestamo, fechaEsperadaRetorno, l1, l2, l3, l4, l5, l6, l7);
                        return p6;
                }
            }

        } while (!salir);

        //Este return no sirve de nada, solo es para que java no se asuste, al parecer el IDE
        //piensa que hay forma en que el programa no retorne nada.
        //Los valores guardados son para detectar ese posible camino que retorne este objeto (Pero no deberia pasar)
        return new Prestamo(dct, emp, (byte) 0, "EL IDE TENIA RAZON", "EL IDE TENIA RAZON", new Informativo("", "", "", "", "", ""), new Informativo("", "", "", "", "", ""), new Informativo("", "", "", "", "", ""), new Informativo("", "", "", "", "", ""), new Informativo("", "", "", "", "", ""), new Informativo("", "", "", "", "", ""), new Informativo("", "", "", "", "", ""));
    }

    private String leerNombre(String tipo) {
        String nombre = "";
        do {
            try {
                nombre = leerCadena("Introduce el nombre del " + tipo + " (OBLIGATORIO):");
                if (nombre.isBlank()) {
                    error = true;
                    throw new ExcDatoVacio();
                }
                if (nombre.length() < 10) {
                    error = true;
                    throw new ExcMinimoTNombre();
                }
                String regex = ".*\\d+.*";
                Pattern pattern = Pattern.compile(regex);
                if (pattern.matcher(nombre).matches()) {
                    error = true;
                    throw new ExcTipoDatoErroneo();
                }
                error = false;
            } catch (ExcDatoVacio e) {
                e.mensajeExc();
            } catch (ExcMinimoTNombre e) {
                nombre = "";
                e.mensajeExc();
            } catch (ExcTipoDatoErroneo e) {
                nombre = "";
                e.mensajeExc("Error:\nEstas registrando numeros en el nombre del usuario", "DATO ERRONEO");
            } catch (Exception e) {
                nombre = "";
                error = true;
                JOptionPane.showMessageDialog(null, "Error de tipo: " + e.getClass().getSimpleName(), "Excepcion de java", JOptionPane.ERROR_MESSAGE);
            }
        } while (error);
        return nombre;
    }

    private byte leerEdad(String tipo) {
        byte edad = 0;
        do {
            try {
                edad = leerByte("Introduce la edad del " + tipo + " (OBLIGATORIO):");
                if (edad == 0) {
                    error = true;
                    throw new ExcDatoVacio();
                }
                if (edad < 12) {
                    error = true;
                    throw new ExcMinimoEdadUsuario();
                }
                error = false;
            } catch (ExcDatoVacio e) {
                e.mensajeExc();
            } catch (ExcMinimoEdadUsuario e) {
                edad = 0;
                e.mensajeExc();
            } catch (Exception e) {
                edad = 0;
                error = true;
                JOptionPane.showMessageDialog(null, "Error de tipo: " + e.getClass().getSimpleName() + "\nEstas ingresando letras donde solo deberias ingresar numeros.", "Excepcion de java", JOptionPane.ERROR_MESSAGE);
            }
        } while (error);
        return edad;
    }

    private String leerTelefonoFijo(String tipo) {
        String telefonoFijo = "";
        do {
            try {
                telefonoFijo = leerCadena("Introduce el numero telefonico fijo del " + tipo + " (OBLIGATORIO):");
                if (telefonoFijo.isBlank()) {
                    error = true;
                    throw new ExcDatoVacio();
                }
                if (telefonoFijo.length() != 10) {
                    error = true;
                    throw new ExcMinimoTTelefono();
                }
                try {
                    Long.parseLong(telefonoFijo);
                    error = false;
                } catch (NumberFormatException excepcion) {
                    error = true;
                    throw new ExcTipoDatoErroneo();
                }
                error = false;
            } catch (ExcDatoVacio e) {
                e.mensajeExc();
            } catch (ExcMinimoTTelefono e) {
                telefonoFijo = "";
                e.mensajeExc();
            } catch (ExcTipoDatoErroneo e) {
                telefonoFijo = "";
                e.mensajeExc("Error:\nEstas registrando letras o simbolos en el telefono fijo del " + tipo + ".", "DATO ERRONEO");
            } catch (Exception e) {
                telefonoFijo = "";
                error = true;
                JOptionPane.showMessageDialog(null, "Error de tipo: " + e.getClass().getSimpleName(), "Excepcion de java", JOptionPane.ERROR_MESSAGE);
            }
        } while (error);
        return telefonoFijo;
    }

    private String leerTelefonoPersonal(String tipo) {
        String telefonoPersonal = "";
        do {
            try {
                telefonoPersonal = leerCadena("Introduce el numero de telefono personal del " + tipo + " (OPCIONAL):");
                if (telefonoPersonal.length() != 10 && !(telefonoPersonal.equals(""))) {
                    error = true;
                    throw new ExcMinimoTTelefono();
                } else if (telefonoPersonal.length() == 10) {
                    try {
                        Long.parseLong(telefonoPersonal);
                        error = false;
                    } catch (NumberFormatException excepcion) {
                        telefonoPersonal = "";
                        error = true;
                        throw new ExcTipoDatoErroneo();
                    }
                }
                error = false;
            } catch (ExcMinimoTTelefono e) {
                telefonoPersonal = "";
                e.mensajeExc();
            } catch (ExcTipoDatoErroneo e) {
                telefonoPersonal = "";
                e.mensajeExc("Error:\nEstas registrando letras o simbolos en el telefono personal del " + tipo + ".", "DATO ERRONEO");
            } catch (Exception e) {
                error = true;
                JOptionPane.showMessageDialog(null, "Error de tipo: " + e.getClass().getSimpleName(), "Excepcion de java", JOptionPane.ERROR_MESSAGE);
            }
        } while (error);
        return telefonoPersonal;
    }

    private String leerDomicilio(String tipo) {
        String domicilio = "";
        do {
            try {
                domicilio = leerCadena("Introduce el domicilio completo del " + tipo + " (OBLIGATORIO):");
                if (domicilio.isBlank()) {
                    error = true;
                    throw new ExcDatoVacio();
                }
                if (domicilio.length() < 20) {
                    error = true;
                    throw new ExcMinimoTDomicilio();
                }
                error = false;
            } catch (ExcDatoVacio e) {
                e.mensajeExc();
            } catch (ExcMinimoTDomicilio e) {
                domicilio = "";
                e.mensajeExc();
            } catch (Exception e) {
                error = true;
                domicilio = "";
                JOptionPane.showMessageDialog(null, "Error de tipo: " + e.getClass().getSimpleName(), "Excepcion de java", JOptionPane.ERROR_MESSAGE);
            }
        } while (error);
        return domicilio;
    }

    private String leerCorreoElectronico(String tipo) {
        String correoElectronico = "";
        do {
            try {
                correoElectronico = leerCadena("Introduce el correo electronico del " + tipo + " (OPCIONAL):");
                error = false;
            } catch (Exception e) {
                correoElectronico = "";
                error = true;
                JOptionPane.showMessageDialog(null, "Error de tipo: " + e.getClass().getSimpleName(), "Excepcion de java", JOptionPane.ERROR_MESSAGE);
            }
        } while (error);
        return correoElectronico;
    }

    private String leerEscuelaProcedencia() {
        String escuelaProcedencia = "";
        do {
            try {
                escuelaProcedencia = leerCadena("Introduce la escuela de procedencia del estudiante (OBLIGATORIO):");
                if (escuelaProcedencia.isBlank()) {
                    error = true;
                    throw new ExcDatoVacio();
                }
                if (escuelaProcedencia.length() < 15) {
                    error = true;
                    throw new ExcMinimoTEscuelaProcedencia();
                }
                error = false;
            } catch (ExcDatoVacio e) {
                e.mensajeExc();
            } catch (ExcMinimoTEscuelaProcedencia e) {
                escuelaProcedencia = "";
                e.mensajeExc();
            } catch (Exception e) {
                escuelaProcedencia = "";
                error = true;
                JOptionPane.showMessageDialog(null, "Error de tipo: " + e.getClass().getSimpleName(), "Excepcion de java", JOptionPane.ERROR_MESSAGE);
            }
        } while (error);
        return escuelaProcedencia;
    }

    private String leerNumeroDeControl() {
        String numeroDeControl = "";
        do {
            try {
                numeroDeControl = leerCadena("Introduce la matricula/numero de control del estudiante (OBLIGATORIO):");
                if (numeroDeControl.isBlank()) {
                    error = true;
                    throw new ExcDatoVacio();
                }
                if (numeroDeControl.length() < 6) {
                    error = true;
                    throw new ExcMinimoTNumeroControl();
                }
                error = false;
            } catch (ExcDatoVacio e) {
                e.mensajeExc();
            } catch (ExcMinimoTNumeroControl e) {
                numeroDeControl = "";
                e.mensajeExc();
            } catch (Exception e) {
                numeroDeControl = "";
                error = true;
                JOptionPane.showMessageDialog(null, "Error de tipo: " + e.getClass().getSimpleName(), "Excepcion de java", JOptionPane.ERROR_MESSAGE);
            }
        } while (error);
        return numeroDeControl;
    }

    private String leerInstitucionProcedencia() {
        String institucionProcedencia = "";
        do {
            try {
                institucionProcedencia = leerCadena("Introduce la institucion de procedencia del docente (OBLIGATORIO):");
                if (institucionProcedencia.isBlank()) {
                    error = true;
                    throw new ExcDatoVacio();
                }
                if (institucionProcedencia.length() < 3) {
                    error = true;
                    throw new ExcMinimoTInstitucionProcedencia();
                }
                error = false;
            } catch (ExcDatoVacio e) {
                e.mensajeExc();
            } catch (ExcMinimoTInstitucionProcedencia e) {
                institucionProcedencia = "";
                e.mensajeExc();
            } catch (Exception e) {
                institucionProcedencia = "";
                error = true;
                JOptionPane.showMessageDialog(null, "Error de tipo: " + e.getClass().getSimpleName(), "Excepcion de java", JOptionPane.ERROR_MESSAGE);
            }
        } while (error);
        return institucionProcedencia;
    }

    private String leerMatricula() {
        String matricula = "";
        do {
            try {
                matricula = leerCadena("Introduce la matricula del docente (OBLIGATORIO):");
                if (matricula.isBlank()) {
                    error = true;
                    throw new ExcDatoVacio();
                }
                if (matricula.length() < 6) {
                    error = true;
                    throw new ExcMinimoTMatricula();
                }
                error = false;
            } catch (ExcDatoVacio e) {
                e.mensajeExc();
            } catch (ExcMinimoTMatricula e) {
                matricula = "";
                e.mensajeExc();
            } catch (Exception e) {
                matricula = "";
                error = true;
                JOptionPane.showMessageDialog(null, "Error de tipo: " + e.getClass().getSimpleName(), "Excepcion de java", JOptionPane.ERROR_MESSAGE);

            }
        } while (error);
        return matricula;
    }

    private String leerDepartamento() {
        String departamento = "";
        do {
            try {
                departamento = leerCadena("Introduce el departamento al que pertenece el docente (OBLIGATORIO):");
                if (departamento.isBlank()) {
                    error = true;
                    throw new ExcDatoVacio();
                }
                if (departamento.length() < 5) {
                    error = true;
                    throw new ExcMinimoTDepartamento();
                }
                error = false;
            } catch (ExcDatoVacio e) {
                e.mensajeExc();
            } catch (ExcMinimoTDepartamento e) {
                departamento = "";
                e.mensajeExc();
            } catch (Exception e) {
                departamento = "";
                error = true;
                JOptionPane.showMessageDialog(null, "Error de tipo: " + e.getClass().getSimpleName(), "Excepcion de java", JOptionPane.ERROR_MESSAGE);

            }
        } while (error);
        return departamento;
    }

    private String leerTitulo() {
        String titulo = "";
        do {
            try {
                titulo = leerCadena("Introduce el titulo del libro (OBLIGATORIO):");
                if (titulo.isBlank()) {
                    error = true;
                    throw new ExcDatoVacio();
                }
                error = false;
            } catch (ExcDatoVacio e) {
                e.mensajeExc();
            } catch (Exception e) {
                titulo = "";
                error = true;
                JOptionPane.showMessageDialog(null, "Error de tipo: " + e.getClass().getSimpleName(), "Excepcion de java", JOptionPane.ERROR_MESSAGE);
            }
        } while (error);
        return titulo;
    }

    private String leerNombreAutor() {
        String nombreAutor = "";
        do {
            try {
                nombreAutor = leerCadena("Introduce el nombre del autor del libro (OBLIGATORIO):");
                if (nombreAutor.isBlank()) {
                    error = true;
                    throw new ExcDatoVacio();
                }
                if (nombreAutor.length() < 10) {
                    error = true;
                    throw new ExcMinimoTNombre();
                }
                String regex = ".*\\d+.*";
                Pattern pattern = Pattern.compile(regex);
                if (pattern.matcher(nombreAutor).matches()) {
                    error = true;
                    throw new ExcTipoDatoErroneo();
                }
                error = false;
            } catch (ExcDatoVacio e) {
                e.mensajeExc();
            } catch (ExcMinimoTNombre e) {
                nombreAutor = "";
                e.mensajeExc();
            } catch (ExcTipoDatoErroneo e) {
                nombreAutor = "";
                e.mensajeExc("Error:\nEstas registrando numeros en el nombre del autor del libro", "DATO ERRONEO");
            } catch (Exception e) {
                nombreAutor = "";
                error = true;
                JOptionPane.showMessageDialog(null, "Error de tipo: " + e.getClass().getSimpleName(), "Excepcion de java", JOptionPane.ERROR_MESSAGE);
            }
        } while (error);
        return nombreAutor;
    }

    private String leerISBN() {
        String isbn = "";
        do {
            try {
                isbn = leerCadena("Introduce el ISBN del libro (OBLIGATORIO):");
                if (isbn.isBlank()) {
                    error = true;
                    throw new ExcDatoVacio();
                }
                if (isbn.length() != 10 && isbn.length() != 13) {
                    error = true;
                    throw new ExcMinimoTISBN();
                }
                error = false;
            } catch (ExcDatoVacio e) {
                e.mensajeExc();
            } catch (ExcMinimoTISBN e) {
                isbn = "";
                e.mensajeExc();
            } catch (Exception e) {
                isbn = "";
                error = true;
                JOptionPane.showMessageDialog(null, "Error de tipo: " + e.getClass().getSimpleName(), "Excepcion de java", JOptionPane.ERROR_MESSAGE);
            }
        } while (error);
        return isbn;
    }

    private String leerEditorial() {
        String editorial = "";
        do {
            try {
                editorial = leerCadena("Introduce la editorial del libro (OBLIGATORIO):");
                if (editorial.length() < 5) {
                    error = true;
                    throw new ExcMinimoTEditorial();
                }
                error = false;
            } catch (ExcMinimoTEditorial e) {
                editorial = "";
                e.mensajeExc();
            } catch (Exception e) {
                editorial = "";
                error = true;
                JOptionPane.showMessageDialog(null, "Error de tipo: " + e.getClass().getSimpleName(), "Excepcion de java", JOptionPane.ERROR_MESSAGE);
            }
        } while (error);
        return editorial;
    }

    private String leerCondicion() {
        String condicion = "";
        do {
            try {
                condicion = leerCadena("Introduce la condicion en la que se encuentra el libro (OBLIGATORIO):");
                if (condicion.isBlank()) {
                    error = true;
                    throw new ExcDatoVacio();
                }
                error = false;
            } catch (ExcDatoVacio e) {
                e.mensajeExc();
            } catch (Exception e) {
                condicion = "";
                error = true;
                JOptionPane.showMessageDialog(null, "Error de tipo: " + e.getClass().getSimpleName(), "Excepcion de java", JOptionPane.ERROR_MESSAGE);
            }

        } while (error);
        return condicion;
    }

    private String leerGenero() {
        String genero = "";
        do {
            try {
                genero = leerCadena("Introduce el genero del libro (OBLIGATORIO):");
                if (genero.isBlank()) {
                    error = true;
                    throw new ExcDatoVacio();
                }
                error = false;
            } catch (ExcDatoVacio e) {
                e.mensajeExc();
            } catch (Exception e) {
                genero = "";
                error = true;
                JOptionPane.showMessageDialog(null, "Error de tipo: " + e.getClass().getSimpleName(), "Excepcion de java", JOptionPane.ERROR_MESSAGE);
            }
        } while (error);
        return genero;
    }

    private String leerClasificacion() {
        String clasificacion = "";
        do {
            try {
                clasificacion = leerCadena("Introduce la clasificacion de edad del libro (OBLIGATORIO):");
                if (clasificacion.isBlank()) {
                    error = true;
                    throw new ExcDatoVacio();
                }
                error = false;
            } catch (ExcDatoVacio e) {
                e.mensajeExc();
            } catch (Exception e) {
                clasificacion = "";
                error = true;
                JOptionPane.showMessageDialog(null, "Error de tipo: " + e.getClass().getSimpleName(), "Excepcion de java", JOptionPane.ERROR_MESSAGE);
            }
        } while (error);
        return clasificacion;
    }

    private String leerFechaPublicacion() {
        String fechaPublicacion = "";
        do {
            try {
                fechaPublicacion = leerCadena("Introduce la fecha de publicacion del libro (OBLIGATORIO)\nOJO: Introduce la fecha en el siguiente formato: DD-MM-AAAA:");
                if (fechaPublicacion.isBlank()) {
                    error = true;
                    throw new ExcDatoVacio();
                }
                if (fechaPublicacion.charAt(2) != '-' || fechaPublicacion.charAt(5) != '-') {
                    error = true;
                    throw new ExcErrorFormatoFecha();
                }
                error = false;
            } catch (ExcErrorFormatoFecha e) {
                fechaPublicacion = "";
                e.mensajeExc();
            } catch (ExcDatoVacio e) {
                e.mensajeExc();
            } catch (Exception e) {
                fechaPublicacion = "";
                error = true;
                JOptionPane.showMessageDialog(null, "Error de tipo: " + e.getClass().getSimpleName(), "Excepcion de java", JOptionPane.ERROR_MESSAGE);
            }
        } while (error);
        return fechaPublicacion;
    }

    private String leerPuesto() {
        String puesto = "";
        do {
            try {
                puesto = leerCadena("Introduce el puesto del empleado (OBLIGATORIO):");
                if (puesto.isBlank()) {
                    error = true;
                    throw new ExcDatoVacio();
                }
                error = false;
            } catch (ExcDatoVacio e) {
                e.mensajeExc();
            } catch (Exception e) {
                puesto = "";
                error = true;
                JOptionPane.showMessageDialog(null, "Error de tipo: " + e.getClass().getSimpleName(), "Excepcion de java", JOptionPane.ERROR_MESSAGE);
            }
        } while (error);
        return puesto;
    }

    private String leerTurno() {
        String turno = "";
        do {
            try {
                turno = leerCadena("Introduce el turno en el que trabaja el empleado (OBLIGATORIO):");
                if (turno.isBlank()) {
                    error = true;
                    throw new ExcDatoVacio();
                }
                if (!(turno.equalsIgnoreCase("matutino") || turno.equalsIgnoreCase("vespertino"))) {
                    error = true;
                    throw new ExcTurnoEmpleado();
                }
                error = false;
            } catch (ExcDatoVacio e) {
                e.mensajeExc();
            } catch (ExcTurnoEmpleado e) {
                turno = "";
                e.mensajeExc();
            } catch (Exception e) {
                turno = "";
                error = true;
                JOptionPane.showMessageDialog(null, "Error de tipo: " + e.getClass().getSimpleName(), "Excepcion de java", JOptionPane.ERROR_MESSAGE);
            }
        } while (error);
        return turno;
    }

    private byte leerCantidadLibrosAPrestar(String tipo, byte cantidadMaxima) {
        byte cantidadLibrosAPrestar = 0;
        do {
            try {
                cantidadLibrosAPrestar = leerByte("Introduce la cantidad de libros a prestar (OBLIGATORIO):");
                if (cantidadLibrosAPrestar == 0) {
                    error = true;
                    throw new ExcDatoVacio();
                }
                if (cantidadLibrosAPrestar < 1) {
                    error = true;
                    throw new ExcCantidadLibrosNegativa();
                }
                if (cantidadLibrosAPrestar > cantidadMaxima) {
                    error = true;
                    throw new ExcLimiteLibros();
                }
                error = false;
            } catch (ExcDatoVacio e) {
                e.mensajeExc();
            } catch (ExcCantidadLibrosNegativa e) {
                cantidadLibrosAPrestar = 0;
                e.mensajeExc();
            } catch (ExcLimiteLibros e) {
                cantidadLibrosAPrestar = 0;
                e.mensajeExc("Error:\nUn " + tipo + " solo puede pedir un maximo de " + cantidadMaxima + " libros.");
            } catch (Exception e) {
                cantidadLibrosAPrestar = 0;
                error = true;
                JOptionPane.showMessageDialog(null, "Error de tipo: " + e.getClass().getSimpleName() + "\nEs probable que estes ingresando letras o simbolos en la cantidad de libros", "Excepcion de java", JOptionPane.ERROR_MESSAGE);
            }
        } while (error);
        return cantidadLibrosAPrestar;
    }

    private String leerFechaInicioPrestamo() {
        String fechaInicioPrestamo = "";
        do {
            try {
                fechaInicioPrestamo = leerCadena("Introduce la fecha de incio del prestamo (OBLIGATORIO)\nOJO: Introduce la fecha en el siguiente formato: DD-MM-AAAA:");
                if (fechaInicioPrestamo.isBlank()) {
                    error = true;
                    throw new ExcDatoVacio();
                }
                if (fechaInicioPrestamo.length() != 10) {
                    error = true;
                    throw new ExcErrorFormatoFecha();
                }
                if (fechaInicioPrestamo.charAt(2) != '-' || fechaInicioPrestamo.charAt(5) != '-') {
                    error = true;
                    throw new ExcErrorFormatoFecha();
                }
                error = false;
            } catch (ExcDatoVacio e) {
                e.mensajeExc();
            } catch (ExcErrorFormatoFecha e) {
                fechaInicioPrestamo = "";
                e.mensajeExc();
            } catch (Exception e) {
                fechaInicioPrestamo = "";
                error = true;
                JOptionPane.showMessageDialog(null, "Error de tipo: " + e.getClass().getSimpleName(), "Excepcion de java", JOptionPane.ERROR_MESSAGE);
            }
        } while (error);
        return fechaInicioPrestamo;
    }

    private String leerFechaEsperadaRetorno() {
        String fechaEsperadaRetorno = "";
        do {
            try {
                fechaEsperadaRetorno = leerCadena("Introduce la fecha de retorno esperado del libro (OBLIGATORIO)\nOJO: Introduce la fecha en el siguiente formato: DD-MM-AAAA:");
                if (fechaEsperadaRetorno.isBlank()) {
                    error = true;
                    throw new ExcDatoVacio();
                }
                if (fechaEsperadaRetorno.length() != 10) {
                    error = true;
                    throw new ExcErrorFormatoFecha();
                }
                if (fechaEsperadaRetorno.charAt(2) != '-' || fechaEsperadaRetorno.charAt(5) != '-') {
                    error = true;
                    throw new ExcErrorFormatoFecha();
                }
                error = false;
            } catch (ExcDatoVacio e) {
                e.mensajeExc();
            } catch (ExcErrorFormatoFecha e) {
                fechaEsperadaRetorno = "";
                e.mensajeExc();
            } catch (Exception e) {
                fechaEsperadaRetorno = "";
                error = true;
                JOptionPane.showMessageDialog(null, "Error de tipo: " + e.getClass().getSimpleName(), "Excepcion de java", JOptionPane.ERROR_MESSAGE);
            }
        } while (error);
        return fechaEsperadaRetorno;
    }

    private Libro leerTipoDeLibroYLeerDatos(String numeroLibro) {
        String[] opciones = {"Literario", "Informativo"};
        Libro l = new Informativo("", "", "", "", "", "");
        do {
            try {
            int opcionSeleccionada = JOptionPane.showOptionDialog(null, "¿Que tipo de libro es " + numeroLibro + " a registrar?\n\nHas click en la opcion deseada:", "SELECCIONAR TIPO DE LIBRO", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
            if (opcionSeleccionada == 0) {
                l = getLiterario();
            }
            if(opcionSeleccionada == 1) {
                l = getInformativo();
            }
            error = false;
            } catch (Exception e) {
                error = true;
                JOptionPane.showMessageDialog(null, "Error de tipo: " + e.getClass().getSimpleName() + "\nEs probable que hayas ingresado letras o simbolos en la opcion de libro.", "Excepcion de java", JOptionPane.ERROR_MESSAGE);
            }
        } while (error);
        return l;
    }

    private byte leerByte(String msg) {
        return Byte.parseByte(JOptionPane.showInputDialog(msg));
    }

    private String leerCadena(String msg) {
        return JOptionPane.showInputDialog(msg);
    }

}
