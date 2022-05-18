import javax.swing.*;

/**
 * La clase frame gestiona el frame
 */
public class Frame extends JFrame {

    /**
     * Iniciamos el frame del juego
     */
    Frame() {
        setBounds(0, 0, 1920, 1080);//Tamaño Marco
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Posibilita cerrar marco
        setTitle("PANDEMIC");//Le da un nombre
        setVisible(true);//Lo hace visible

    }

}
