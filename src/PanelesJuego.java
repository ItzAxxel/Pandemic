import javax.swing.*;
import java.awt.*;


public class PanelesJuego extends JPanel {

    private JPanel MenuPrincipal;


    PanelesJuego () {

        setLayout(new CardLayout());
        createUIComponents();

    }

    // Imagenes

    private void createUIComponents() {
        MenuPrincipal = new PanelPersonalizado(getToolkit().createImage("../assets/Pantalla_Menu.png"));
    }

}