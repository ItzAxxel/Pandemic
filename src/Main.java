import java.awt.*;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, FontFormatException {

        MenusDeJuego menu = new MenusDeJuego();
        Enfermedades prueba = new Enfermedades();

        prueba.InfectarAlfa("prueba", true);
        prueba.curarAlfa("a", true);
        prueba.removerAlfa("b", false);


    }
}

