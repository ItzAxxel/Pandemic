import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
    JPanel panelConfiguracion = new JPanel();


    //LOS JBUTTONS DEL JUEGO

    JButton buttonPartidaNueva = new JButton("Partida Nueva");
    JButton buttonConfiguracion = new JButton("Configuración");
    JButton buttonCargarPartida = new JButton("Cargar Partida");
    JButton buttonInformacion = new JButton("Información");
    JButton buttonAutores = new JButton("Autores");
    JButton buttonReglas = new JButton("Reglas");
    JButton buttonVolverMenu = new JButton("Volver");
    JButton buttonVolverInfoA = new JButton("Volver");
    JButton buttonVolverR = new JButton("Volver");
    JButton buttonVolverC = new JButton("Volver");
    JButton buttonPausa = new JButton("||");
    JButton buttonSalir = new JButton("Salir");
    JButton buttonGuardarPartida = new JButton("Guardar Partida");
    JButton buttonContinuarPartida = new JButton("Continuar");
    JButton buttonSalirMenu = new JButton("Salir");

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
        buttonCargarPartida.setBounds(100, 400, 387, 73);//Se establece su posición y tamaño
        buttonCargarPartida.setBackground(Color.decode("#312E2E"));
        buttonCargarPartida.setForeground(Color.WHITE);
        buttonCargarPartida.setFont(new Font("Arial", Font.BOLD, 50));
        buttonCargarPartida.setBorder(null);

        fondoMenu.add(buttonConfiguracion);//Se añade el botón al label FondoMenu
        buttonConfiguracion.setBounds(100, 500, 387, 73);//Se establece su posición y tamaño
        buttonConfiguracion.setBackground(Color.decode("#312E2E"));
        buttonConfiguracion.setForeground(Color.WHITE);
        buttonConfiguracion.setFont(new Font("Arial", Font.BOLD, 50));
        buttonConfiguracion.setBorder(null);

        fondoMenu.add(buttonInformacion);//Se añade el botón al label FondoMenu
        buttonInformacion.setBounds(100, 600, 387, 73);//Se establece su posición y tamaño
        buttonInformacion.setBackground(Color.decode("#312E2E"));
        buttonInformacion.setForeground(Color.WHITE);
        buttonInformacion.setFont(new Font("Arial", Font.BOLD, 50));
        buttonInformacion.setBorder(null);

        fondoMenu.add(buttonSalir);//Se añade el botón al label FondoMenu
        buttonSalir.setBounds(100, 700, 387, 73);//Se establece su posición y tamaño
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
        buttonPausa.setBounds(0, 0, 100, 80);//Se establece su posición y tamaño
        buttonPausa.setBackground(Color.decode("#312E2E"));
        buttonPausa.setForeground(Color.WHITE);
        buttonPausa.setFont(new Font("Arial", Font.BOLD, 50));
        buttonPausa.setBorder(null);
        panelMapaJugable.add(fondoMenuMapaJugable);

        //ELEMENTOS MENÚ PAUSA

        JLabel fondoMenuPausa = new JLabel(new ImageIcon(Objects.requireNonNull(getClass().getResource("assets/MapaPausa.png"))));
        fondoMenuPausa.setLayout(null);//Ningún Layout en Especial
        fondoMenuPausa.add(buttonGuardarPartida);
        fondoMenuPausa.add(buttonContinuarPartida);
        fondoMenuPausa.add(buttonSalirMenu);

        buttonGuardarPartida.setBounds(750, 450, 387, 73);
        buttonGuardarPartida.setForeground(Color.WHITE);
        buttonGuardarPartida.setOpaque(false);
        buttonGuardarPartida.setContentAreaFilled(false);
        buttonGuardarPartida.setBorderPainted(false);
        buttonGuardarPartida.setFont(new Font("Arial", Font.BOLD, 50));
        buttonGuardarPartida.setBorder(null);

        buttonContinuarPartida.setBounds(750, 550, 387, 73);
        buttonContinuarPartida.setOpaque(false);
        buttonContinuarPartida.setContentAreaFilled(false);
        buttonContinuarPartida.setBorderPainted(false);
        buttonContinuarPartida.setForeground(Color.WHITE);
        buttonContinuarPartida.setFont(new Font("Arial", Font.BOLD, 50));
        buttonContinuarPartida.setBorder(null);

        buttonSalirMenu.setBounds(750, 650, 387, 73);
        buttonSalirMenu.setOpaque(false);
        buttonSalirMenu.setContentAreaFilled(false);
        buttonSalirMenu.setBorderPainted(false);
        buttonSalirMenu.setForeground(Color.WHITE);
        buttonSalirMenu.setFont(new Font("Arial", Font.BOLD, 50));
        buttonSalirMenu.setBorder(null);


        panelMenuPausa.add(fondoMenuPausa);

        //ELEMENTOS MENÚ CONFIGURACIÓN

        JLabel fondoMenuConfiguracion = new JLabel(new ImageIcon(Objects.requireNonNull(getClass().getResource("assets/Configuracion.png"))));
        fondoMenuConfiguracion.setLayout(null);//Ningún Layout en Especial

        fondoMenuConfiguracion.add(buttonVolverC);
        buttonVolverC.setBounds(800, 800, 387, 73);
        buttonVolverC.setOpaque(false);
        buttonVolverC.setContentAreaFilled(false);
        buttonVolverC.setBorderPainted(false);
        buttonVolverC.setForeground(Color.WHITE);
        buttonVolverC.setFont(new Font("Arial", Font.BOLD, 50));
        buttonVolverC.setBorder(null);


        panelConfiguracion.add(fondoMenuConfiguracion);

        //ELEMENTOS MENÚ DE INFORMACIÓN

        JLabel fondoMenuInfo = new JLabel(new ImageIcon(Objects.requireNonNull(getClass().getResource("assets/Pantalla_Menu.png"))));//Imagen de FONDO
        fondoMenuInfo.setLayout(null);//Ningún Layout en Especial

        fondoMenuInfo.add(buttonVolverMenu);
        buttonVolverMenu.setBounds(100, 300, 387, 73);
        buttonVolverMenu.setOpaque(false);
        buttonVolverMenu.setContentAreaFilled(false);
        buttonVolverMenu.setBorderPainted(false);
        buttonVolverMenu.setForeground(Color.WHITE);
        buttonVolverMenu.setFont(new Font("Arial", Font.BOLD, 50));
        buttonVolverMenu.setBorder(null);

        fondoMenuInfo.add(buttonAutores);
        buttonAutores.setBounds(100, 500, 387, 73);
        buttonAutores.setOpaque(false);
        buttonAutores.setContentAreaFilled(false);
        buttonAutores.setBorderPainted(false);
        buttonAutores.setForeground(Color.WHITE);
        buttonAutores.setFont(new Font("Arial", Font.BOLD, 50));
        buttonAutores.setBorder(null);

        fondoMenuInfo.add(buttonReglas);
        buttonReglas.setBounds(100, 700, 387, 73);
        buttonReglas.setOpaque(false);
        buttonReglas.setContentAreaFilled(false);
        buttonReglas.setBorderPainted(false);
        buttonReglas.setForeground(Color.WHITE);
        buttonReglas.setFont(new Font("Arial", Font.BOLD, 50));
        buttonReglas.setBorder(null);

        panelInfo.add(fondoMenuInfo);

        //ELEMENTOS DEL MENÚ DE AUTORES

        JLabel fondoMenuAutores = new JLabel(new ImageIcon(Objects.requireNonNull(getClass().getResource("assets/Autores.png"))));//Imagen de FONDO
        fondoMenuAutores.setLayout(null);//Ningún Layout en Especial

        fondoMenuAutores.add(buttonVolverInfoA);
        buttonVolverInfoA.setBounds(90, 850, 387, 73);
        buttonVolverInfoA.setOpaque(false);
        buttonVolverInfoA.setContentAreaFilled(false);
        buttonVolverInfoA.setBorderPainted(false);
        buttonVolverInfoA.setForeground(Color.WHITE);
        buttonVolverInfoA.setFont(new Font("Arial", Font.BOLD, 50));
        buttonVolverInfoA.setBorder(null);

        panelAutores.add(fondoMenuAutores);

        //BOTONES MENÚ REGLAS

        JLabel fondoMenuReglas = new JLabel(new ImageIcon(Objects.requireNonNull(getClass().getResource("assets/Reglas de Juego.png"))));//Imagen de FONDO
        fondoMenuReglas.setLayout(null);//Ningún Layout en Especial

        fondoMenuReglas.add(buttonVolverR);
        buttonVolverR.setBounds(800, 850, 387, 73);
        buttonVolverR.setOpaque(false);
        buttonVolverR.setContentAreaFilled(false);
        buttonVolverR.setBorderPainted(false);
        buttonVolverR.setForeground(Color.WHITE);
        buttonVolverR.setFont(new Font("Arial", Font.BOLD, 50));
        buttonVolverR.setBorder(null);

        panelReglas.add(fondoMenuReglas);

        // C O L O R E S  PROVICIONALES  D E  L O S   P A N E L E S //

        panelMenu.setBackground(Color.decode("#312E2E"));
        panelInfo.setBackground(Color.decode("#312E2E"));
        panelAutores.setBackground(Color.decode("#312E2E"));
        panelReglas.setBackground(Color.decode("#312E2E"));
        panelMapaJugable.setBackground(Color.decode("#312E2E"));
        panelMenuPausa.setBackground(Color.decode("#312E2E"));


        // JPANELES EN EL PANEL DE CONTENIDO

        panelCont.add(panelMenu, "Menu");
        panelCont.add(panelInfo, "Info");
        panelCont.add(panelAutores, "Autores");
        panelCont.add(panelReglas, "Reglas");
        panelCont.add(panelMapaJugable, "MapaJugable");
        panelCont.add(panelMenuPausa, "MenuPausa");
        panelCont.add(panelConfiguracion,"Configuracion");


        //CARD LAYOUT EMPIEZA POR MOSTRAR EL PANEL 1 - MENÚ PRINCIPAL

        cl.show(panelCont, "Menu");


        // L O S   B O T O N E S   Y   S U S   A C C I O N E S //

        buttonPartidaNueva.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                cl.show(panelCont, "MapaJugable");

            }
        });

        buttonConfiguracion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                cl.show(panelCont, "Configuracion");

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

        buttonContinuarPartida.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                cl.show(panelCont, "MapaJugable");
            }
        });

        buttonSalirMenu.addActionListener(new ActionListener() {
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

        buttonVolverC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                cl.show(panelCont, "Menu");
            }
        });

        buttonPausa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                cl.show(panelCont, "MenuPausa");
            }
        });

        Marco.add(panelCont);
        Marco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Marco.setVisible(true);

            //FONDOS DE LOS MENÚS

    }
}