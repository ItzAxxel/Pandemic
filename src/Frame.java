import javax.swing.*;

/**
 * The type Frame.
 */
public class Frame extends JFrame {

    /**
     * Instantiates a new Frame.
     */
    Frame() {
        setBounds(0, 0, 1920, 1080);//Tamaño Marco
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Posibilita cerrar marco
        setTitle("PANDEMIC");//Le da un nombre
        setVisible(true);//Lo hace visible

    }

}
