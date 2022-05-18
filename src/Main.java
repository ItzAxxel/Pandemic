import java.awt.FontFormatException;
import java.io.IOException;

/**
 * La clcase main
 */
public class Main {

    public static void main(String[] args) throws IOException, FontFormatException {

        MenusDeJuego.instance = new MenusDeJuego();
    }
}

