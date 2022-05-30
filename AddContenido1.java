

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class AddContenido1 extends ObjectOutputStream{

    public AddContenido1(OutputStream out) throws IOException {
        super(out);
    }

    public AddContenido1() throws IOException, SecurityException {
    }
    //Hace un método para que no de sobreescriba el encabezado 
    @Override
    protected void writeStreamHeader() throws IOException {
        reset();
    }
}
