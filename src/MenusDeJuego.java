import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Objects;


public class MenusDeJuego {


    //EL FRAME DEL JUEGO
    Frame Marco = new Frame();

    //LOS JPANELS DEL JUEGO
    JPanel panelCont = new JPanel(); //Panel que contiene paneles
    JPanel panelMenu = new JPanel();
    JPanel panelInfo = new JPanel();
    JPanel panelAutores = new JPanel();
    JPanel panelReglas = new JPanel();
    JPanel panelMapaJugable = new JPanel();
    JPanel panelMenuPausa = new JPanel();


    //LOS JBUTTONS DEL JUEGO

    JButton buttonPartidaNueva = new JButton("Partida Nueva");
    JButton buttonVolverMenu = new JButton("Volver");
    JButton buttonCargarPartida = new JButton("Cargar Partida");
    JButton buttonInformacion = new JButton("Información");
    JButton buttonAutores = new JButton("Autores");
    JButton buttonReglas = new JButton("Reglas");
    JButton buttonVolverInfoA = new JButton("Volver");
    JButton buttonVolverR = new JButton("Volver");
    JButton buttonPausa = new JButton();
    JButton buttonSalir = new JButton("Salir");

    //SE CREA UN OBJETO ES UN MANAGER DE LAYOUTS, EN ESTE CASO CARDLAYOUT
    CardLayout cl = new CardLayout();

    public MenusDeJuego() throws IOException {

        //SE ESTABLECE EL TIPO DE LAYOUT EN EL PANEL DE CONTENIDO
        panelCont.setLayout(cl);

        //ELEMENTOS MENÚ

        JLabel fondoMenu = new JLabel(new ImageIcon(Objects.requireNonNull(getClass().getResource("assets/Pantalla_Menu.png"))));//Imagen de FONDO
        fondoMenu.setLayout(null);//Ningún Layout en Especial

        //Botones en el JLabel que producen cambios entre Cards de JPanels

        fondoMenu.add(buttonPartidaNueva);//Se añade el botón al label FondoMenu
        buttonPartidaNueva.setBounds(100, 300, 387, 73);//Se establece su posición y tamaño
        buttonPartidaNueva.setBackground(Color.decode("#312E2E"));
        buttonPartidaNueva.setForeground(Color.WHITE);
        buttonPartidaNueva.setFont(new Font("Arial", Font.BOLD, 50));
        buttonPartidaNueva.setBorder(null);


        fondoMenu.add(buttonCargarPartida);//Se añade el botón al label FondoMenu
        buttonCargarPartida.setBounds(100, 500, 387, 73);//Se establece su posición y tamaño
        buttonCargarPartida.setBackground(Color.decode("#312E2E"));
        buttonCargarPartida.setForeground(Color.WHITE);
        buttonCargarPartida.setFont(new Font("Arial", Font.BOLD, 50));
        buttonCargarPartida.setBorder(null);


        fondoMenu.add(buttonInformacion);//Se añade el botón al label FondoMenu
        buttonInformacion.setBounds(100, 700, 387, 73);//Se establece su posición y tamaño
        buttonInformacion.setBackground(Color.decode("#312E2E"));
        buttonInformacion.setForeground(Color.WHITE);
        buttonInformacion.setFont(new Font("Arial", Font.BOLD, 50));
        buttonInformacion.setBorder(null);

        fondoMenu.add(buttonSalir);//Se añade el botón al label FondoMenu
        buttonSalir.setBounds(100, 900, 387, 73);//Se establece su posición y tamaño
        buttonSalir.setBackground(Color.decode("#312E2E"));
        buttonSalir.setForeground(Color.WHITE);
        buttonSalir.setFont(new Font("Arial", Font.BOLD, 50));
        buttonSalir.setBorder(null);


        panelMenu.add(fondoMenu);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //ELEMENTOS MENÚ MAPA JUGABLE

        JLabel fondoMenuMapaJugable = new JLabel(new ImageIcon(Objects.requireNonNull(getClass().getResource("assets/Mapa_Jugable.png"))));//Imagen de FONDO
        fondoMenuMapaJugable.setLayout(null);//Ningún Layout en Especial
        fondoMenuMapaJugable.add(buttonPausa);
        ImageIcon ImagenPausa = new ImageIcon("Boton_Pausa.png");
        buttonPausa.setIcon(ImagenPausa);
        panelMapaJugable.add(fondoMenuMapaJugable);
        buttonPausa.setLocation(200, 200);
        //buttonPausa.setBounds(0, 0, 500, 300);


        //ELEMENTOS MENÚ DE INFORMACIÓN

        JLabel fondoMenuInfo = new JLabel(new ImageIcon(Objects.requireNonNull(getClass().getResource("assets/Pantalla_Menu.png"))));//Imagen de FONDO
        fondoMenuInfo.setLayout(null);//Ningún Layout en Especial

        fondoMenuInfo.add(buttonVolverMenu);
        buttonVolverMenu.setBounds(100, 300, 387, 73);
        buttonVolverMenu.setBackground(Color.decode("#312E2E"));
        buttonVolverMenu.setForeground(Color.WHITE);
        buttonVolverMenu.setFont(new Font("Arial", Font.BOLD, 50));
        buttonVolverMenu.setBorder(null);

        fondoMenuInfo.add(buttonAutores);
        buttonAutores.setBounds(100, 500, 387, 73);
        buttonAutores.setBackground(Color.decode("#312E2E"));
        buttonAutores.setForeground(Color.WHITE);
        buttonAutores.setFont(new Font("Arial", Font.BOLD, 50));
        buttonAutores.setBorder(null);

        fondoMenuInfo.add(buttonReglas);
        buttonReglas.setBounds(100, 700, 387, 73);
        buttonReglas.setBackground(Color.decode("#312E2E"));
        buttonReglas.setForeground(Color.WHITE);
        buttonReglas.setFont(new Font("Arial", Font.BOLD, 50));
        buttonReglas.setBorder(null);

        panelInfo.add(fondoMenuInfo);

        //ELEMENTOS DEL MENÚ DE AUTORES

        JLabel fondoMenuAutores = new JLabel(new ImageIcon(Objects.requireNonNull(getClass().getResource("assets/Autores.png"))));//Imagen de FONDO
        fondoMenuAutores.setLayout(null);//Ningún Layout en Especial

        fondoMenuAutores.add(buttonVolverInfoA);
        buttonVolverInfoA.setBounds(90, 850, 387, 73);
        buttonVolverInfoA.setBackground(Color.decode("#312E2E"));
        buttonVolverInfoA.setForeground(Color.WHITE);
        buttonVolverInfoA.setFont(new Font("Arial", Font.BOLD, 50));
        buttonVolverInfoA.setBorder(null);

        panelAutores.add(fondoMenuAutores);

        //BOTONES MENÚ REGLAS

        JLabel fondoMenuReglas = new JLabel(new ImageIcon(Objects.requireNonNull(getClass().getResource("assets/Reglas de Juego.png"))));//Imagen de FONDO
        fondoMenuReglas.setLayout(null);//Ningún Layout en Especial

        fondoMenuReglas.add(buttonVolverR);
        buttonVolverR.setBounds(90, 850, 387, 73);
        buttonVolverR.setBackground(Color.decode("#312E2E"));
        buttonVolverR.setForeground(Color.WHITE);
        buttonVolverR.setFont(new Font("Arial", Font.BOLD, 50));
        buttonVolverR.setBorder(null);

        panelReglas.add(fondoMenuReglas);

        // C O L O R E S  PROVICIONALES  D E  L O S   P A N E L E S //
        // panelMenu.setBackground(Color.BLUE);
        //panelInfo.setBackground(Color.GREEN);
        panelAutores.setBackground(Color.RED);
        panelReglas.setBackground(Color.YELLOW);


        // JPANELES EN EL PANEL DE CONTENIDO
        panelCont.add(panelMenu, "Menu");
        panelCont.add(panelInfo, "Info");
        panelCont.add(panelAutores, "Autores");
        panelCont.add(panelReglas, "Reglas");
        panelCont.add(panelMapaJugable, "MapaJugable");
        panelCont.add(panelMenuPausa, "MenuPausa");
        //CARD LAYOUT EMPIEZA POR MOSTRAR EL PANEL 1 - MENÚ PRINCIPAL
        cl.show(panelCont, "Menu");


        // L O S   B O T O N E S   Y   S U S   A C C I O N E S //


        buttonPartidaNueva.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                cl.show(panelCont, "MapaJugable");

            }
        });

        buttonInformacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                cl.show(panelCont, "Info");
            }
        });

        buttonSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                System.exit(0);
            }
        });


        buttonVolverMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                cl.show(panelCont, "Menu");
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


        buttonPausa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                cl.show(panelCont, "Info");
            }
        });


        Marco.add(panelCont);
        Marco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Marco.setVisible(true);

        //FONDOS DE LOS MENÚS


    }
}