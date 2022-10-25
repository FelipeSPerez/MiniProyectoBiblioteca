
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class AddContenido extends ObjectOutputStream{

    public AddContenido(OutputStream out) throws IOException {
        super(out);
    }

    public AddContenido() throws IOException, SecurityException {
    }
    
    //Hace un método para que no de sobreescriba el encabezado 
    @Override
    protected void writeStreamHeader() throws IOException {
        reset();
    }
}