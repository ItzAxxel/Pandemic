import java.awt.FontFormatException;
import java.io.IOException;

/**
 * The type Main.
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     * @throws IOException         the io exception
     * @throws FontFormatException the font format exception
     */
    public static void main(String[] args) throws IOException, FontFormatException {

        MenusDeJuego.instance = new MenusDeJuego();
    }
}

