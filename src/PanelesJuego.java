import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageProducer;
import java.io.*;


public class PanelesJuego extends JPanel {

    private JPanel MenuPrincipal;


    PanelesJuego () {

        Fondo = new MenuPrincipal(getToolkit().createImage((ImageProducer) new File("Pantalla_Menu.png")));
        setLayout( new CardLayout());
    }


}