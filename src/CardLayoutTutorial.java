import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutTutorial {

    Frame Marco = new Frame();
    //LOS JPANELS DEL JUEGO
    JPanel panelCont = new JPanel();
    JPanel panelMenu = new JPanel();
    JPanel panelInfo = new JPanel();
    JPanel panelAutores = new JPanel();
    JPanel panelReglas = new JPanel();

    //LOS JBUTTONS DEL JUEGO
    JButton buttonPartidaNueva = new JButton("Partida Nueva");
    JButton buttonVolverMenu = new JButton("Volver");
    JButton buttonCargarPartida = new JButton("Cargar Partida");
    JButton buttonInformacion = new JButton("Información");
    JButton buttonAutores = new JButton("Autores");
    JButton buttonReglas = new JButton("Reglas");
    JButton buttonVolverInfoA = new JButton("Volver");
    JButton buttonVolverR = new JButton("Volver");

    //SE CREA UN OBJETO ES UN MANAGER DE LAYOUTS, EN ESTE CASO CARDLAYOUT
    CardLayout cl = new CardLayout();

    public CardLayoutTutorial() {

        //SE ESTABLECE EL TIPO DE LAYOUT EN EL PANEL DE CONTENIDO
        panelCont.setLayout(cl);

        //BOTONES MENÚ
        panelMenu.add(buttonPartidaNueva);
        panelMenu.add(buttonCargarPartida);
        panelMenu.add(buttonInformacion);

        //BOTONES MENÚ INFO
        panelInfo.add(buttonVolverMenu);
        panelInfo.add(buttonAutores);
        panelInfo.add(buttonReglas);

        //BOTONES MENÚ AUTORES
        panelAutores.add(buttonVolverInfoA);

        //BOTONES MENÚ REGLAS
        panelReglas.add(buttonVolverR);

        // C O L O R E S  PROVICIONALES  D E  L O S   P A N E L E S //
        panelMenu.setBackground(Color.BLUE);
        panelInfo.setBackground(Color.GREEN);
        panelAutores.setBackground(Color.RED);
        panelReglas.setBackground(Color.YELLOW);

        // JPANELES EN EL PANEL DE CONTENIDO
        panelCont.add(panelMenu, "Menu");
        panelCont.add(panelInfo, "Info");
        panelCont.add(panelAutores, "Autores");
        panelCont.add(panelReglas, "Reglas");

        //CARD LAYOUT EMPIEZA POR MOSTRAR EL PANEL 1 - MENÚ PRINCIPAL
        cl.show(panelCont, "Menu");

        buttonPartidaNueva.setIcon(new ImageIcon("Botón Nueva Partida.png"));

        // L O S   B O T O N E S   Y   S U S   A C C I O N E S //


        buttonPartidaNueva.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                cl.show(panelCont, "Menu");

            }
        });

        buttonVolverMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                cl.show(panelCont, "Menu");
            }
        });

        buttonInformacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                cl.show(panelCont, "Info");
            }
        });

        buttonAutores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                cl.show(panelCont, "Autores");
            }
        });

        buttonReglas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                cl.show(panelCont, "Reglas");
            }
        });

        buttonVolverInfoA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                cl.show(panelCont, "Info");
            }
        });

        buttonVolverR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                cl.show(panelCont, "Info");
            }
        });

        Marco.add(panelCont);
        Marco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Marco.setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CardLayoutTutorial();
            }
        });
    }

}