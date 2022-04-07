
import javax.swing.*;

public class Marco extends JFrame {

    PanelesJuego panelJuego;

    Marco() {
        setBounds(0,0,1920,1080);//Tamaño Marco
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Posibilita cerrar marco
        setTitle("PANDEMIC");//Le da un nombre
        PanelesJuego panelJuego = new PanelesJuego();//Crea un objeto panelJuego
        add(panelJuego);//Añade Panel al Marco
        setVisible(true);//Lo hace visible



    }


}
