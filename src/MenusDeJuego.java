import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
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

    JButton buttonPartidaNueva;
    JButton buttonConfiguracion;
    JButton buttonCargarPartida;
    JButton buttonInformacion;
    JButton buttonAutores;
    JButton buttonReglas;
    JButton buttonVolverMenu;
    JButton buttonVolverInfoA;
    JButton buttonVolverR;
    JButton buttonVolverC;
    JButton buttonPausa;
    JButton buttonSalir;
    JButton buttonGuardarPartida;
    JButton buttonContinuarPartida;
    JButton buttonSalirMenu;
    JButton buttonAumento;
    JButton buttonReduccion;

    //SE CREA UN OBJETO ES UN MANAGER DE LAYOUTS, EN ESTE CASO CARDLAYOUT
    CardLayout cl = new CardLayout();


    public MenusDeJuego() throws IOException, FontFormatException {


        //SE ESTABLECE EL TIPO DE LAYOUT EN EL PANEL DE CONTENIDO
        panelCont.setLayout(cl);

        //ELEMENTOS MENÚ

        JLabel fondoMenu = new JLabel(new ImageIcon(Objects.requireNonNull(getClass().getResource("assets/Pantalla_Menu.png"))));//Imagen de FONDO
        fondoMenu.setLayout(null);//Ningún Layout en Especial

        //Botones en el JLabel que producen cambios entre Cards de JPanels

        //Creamos los botones con la funcion crearBoton() [Ver linea 429]

        buttonPartidaNueva = crearBoton(100, 300, 387, 73, "Nueva Partida");
        fondoMenu.add(buttonPartidaNueva);//Se añade el botón al label FondoMenu


        buttonCargarPartida = crearBoton(100, 400, 387, 73, "Cargar Partida");
        fondoMenu.add(buttonCargarPartida);//Se añade el botón al label FondoMenu

        buttonConfiguracion = crearBoton(100, 500, 387, 73, "Configuración");
        fondoMenu.add(buttonConfiguracion);//Se añade el botón al label FondoMenu

        buttonInformacion = crearBoton(100, 600, 387, 73, "Información");
        fondoMenu.add(buttonInformacion);//Se añade el botón al label FondoMenu

        buttonSalir = crearBoton(100, 700, 387, 73, "Salir");
        fondoMenu.add(buttonSalir);//Se añade el botón al label FondoMenu


        panelMenu.add(fondoMenu);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //ELEMENTOS MENÚ MAPA JUGABLE

        JLabel fondoMenuMapaJugable = new JLabel(new ImageIcon(Objects.requireNonNull(getClass().getResource("assets/Mapa_Jugable.png"))));//Imagen de FONDO
        fondoMenuMapaJugable.setLayout(null);//Ningún Layout en Especial
        buttonPausa = crearBoton(0, 0, 100, 80, "||");
        fondoMenuMapaJugable.add(buttonPausa);

        panelMapaJugable.add(fondoMenuMapaJugable);

        //ELEMENTOS MENÚ PAUSA

        JLabel fondoMenuPausa = new JLabel(new ImageIcon(Objects.requireNonNull(getClass().getResource("assets/MapaPausa.png"))));
        fondoMenuPausa.setLayout(null);//Ningún Layout en Especial
        buttonGuardarPartida = crearBoton(750, 450, 387, 73, "Guardar Partida");
        buttonContinuarPartida = crearBoton(750, 550, 387, 73, "Continuar");
        buttonSalirMenu = crearBoton(750, 650, 387, 73, "Salir");
        fondoMenuPausa.add(buttonGuardarPartida);
        fondoMenuPausa.add(buttonContinuarPartida);
        fondoMenuPausa.add(buttonSalirMenu);

        panelMenuPausa.add(fondoMenuPausa);

        //ELEMENTOS MENÚ CONFIGURACIÓN

        JLabel fondoMenuConfiguracion = new JLabel(new ImageIcon(Objects.requireNonNull(getClass().getResource("assets/Configuracion.png"))));
        fondoMenuConfiguracion.setLayout(null);//Ningún Layout en Especial

        buttonVolverC = crearBoton(800, 800, 387, 73, "Volver");
        fondoMenuConfiguracion.add(buttonVolverC);

        buttonAumento = crearBoton(100, 100, 100, 100, "+");
        fondoMenuConfiguracion.add(buttonAumento);

        buttonReduccion = crearBoton(300, 300, 100, 100, "-");
        fondoMenuConfiguracion.add(buttonReduccion);

        panelConfiguracion.add(fondoMenuConfiguracion);

        //ELEMENTOS MENÚ DE INFORMACIÓN

        JLabel fondoMenuInfo = new JLabel(new ImageIcon(Objects.requireNonNull(getClass().getResource("assets/Pantalla_Menu.png"))));//Imagen de FONDO
        fondoMenuInfo.setLayout(null);//Ningún Layout en Especial

        buttonReglas = crearBoton(100, 300, 387, 73, "Cómo jugar");
        fondoMenuInfo.add(buttonReglas);

        buttonAutores = crearBoton(100, 500, 387, 73, "Autores");
        fondoMenuInfo.add(buttonAutores);


        buttonVolverMenu = crearBoton(100, 700, 387, 73, "Volver");
        fondoMenuInfo.add(buttonVolverMenu);

        panelInfo.add(fondoMenuInfo);

        //ELEMENTOS DEL MENÚ DE AUTORES

        JLabel fondoMenuAutores = new JLabel(new ImageIcon(Objects.requireNonNull(getClass().getResource("assets/Autores.png"))));//Imagen de FONDO
        fondoMenuAutores.setLayout(null);//Ningún Layout en Especial

        buttonVolverInfoA = crearBoton(90, 850, 387, 73, "Volver");
        fondoMenuAutores.add(buttonVolverInfoA);

        panelAutores.add(fondoMenuAutores);

        //BOTONES MENÚ REGLAS

        JLabel fondoMenuReglas = new JLabel(new ImageIcon(Objects.requireNonNull(getClass().getResource("assets/Reglas de Juego.png"))));//Imagen de FONDO
        fondoMenuReglas.setLayout(null);//Ningún Layout en Especial

        buttonVolverR = crearBoton(800, 850, 387, 73, "Volver");
        fondoMenuReglas.add(buttonVolverR);
        buttonVolverR.setBounds(800, 850, 387, 73);

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
        panelCont.add(panelConfiguracion, "Configuracion");


        //CARD LAYOUT EMPIEZA POR MOSTRAR EL PANEL 1 - MENÚ PRINCIPAL

        cl.show(panelCont, "Menu");


        // L O S   B O T O N E S   Y   S U S   A C C I O N E S //

        buttonPartidaNueva.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                cl.show(panelCont, "MapaJugable");

            }
        });

        buttonPartidaNueva.addMouseListener(new java.awt.event.MouseAdapter() { //Cambia el color de las letras en el momento que el ratón pasa encima
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonPartidaNueva.setForeground(Color.decode("#60B13A"));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) { //Vuelve al color original una vez el ratón se quita del texto
                buttonPartidaNueva.setForeground(Color.WHITE);
            }
        });

        buttonCargarPartida.addMouseListener(new java.awt.event.MouseAdapter() { //Cambia el color de las letras en el momento que el ratón pasa encima
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonCargarPartida.setForeground(Color.decode("#60B13A"));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) { //Vuelve al color original una vez el ratón se quita del texto
                buttonCargarPartida.setForeground(Color.WHITE);
            }
        });

        buttonConfiguracion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                cl.show(panelCont, "Configuracion");

            }
        });

        buttonConfiguracion.addMouseListener(new java.awt.event.MouseAdapter() { //Cambia el color de las letras en el momento que el ratón pasa encima
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonConfiguracion.setForeground(Color.decode("#60B13A"));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) { //Vuelve al color original una vez el ratón se quita del texto
                buttonConfiguracion.setForeground(Color.WHITE);
            }
        });

        buttonInformacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                cl.show(panelCont, "Info");
            }
        });

        buttonInformacion.addMouseListener(new java.awt.event.MouseAdapter() { //Cambia el color de las letras en el momento que el ratón pasa encima
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonInformacion.setForeground(Color.decode("#60B13A"));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) { //Vuelve al color original una vez el ratón se quita del texto
                buttonInformacion.setForeground(Color.WHITE);
            }
        });

        buttonSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {

                System.exit(0);

            }
        });

        buttonSalir.addMouseListener(new java.awt.event.MouseAdapter() { //Cambia el color de las letras en el momento que el ratón pasa encima
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonSalir.setForeground(Color.decode("#60B13A"));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) { //Vuelve al color original una vez el ratón se quita del texto
                buttonSalir.setForeground(Color.WHITE);
            }
        });

        buttonInformacion.addMouseListener(new java.awt.event.MouseAdapter() { //Cambia el color de las letras en el momento que el ratón pasa encima
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonInformacion.setForeground(Color.decode("#60B13A"));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) { //Vuelve al color original una vez el ratón se quita del texto
                buttonInformacion.setForeground(Color.WHITE);
            }
        });

        buttonContinuarPartida.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                cl.show(panelCont, "MapaJugable");
            }
        });

        buttonContinuarPartida.addMouseListener(new java.awt.event.MouseAdapter() { //Cambia el color de las letras en el momento que el ratón pasa encima
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonContinuarPartida.setForeground(Color.decode("#60B13A"));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) { //Vuelve al color original una vez el ratón se quita del texto
                buttonContinuarPartida.setForeground(Color.WHITE);
            }
        });

        buttonSalirMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                cl.show(panelCont, "Menu");
            }
        });

        buttonSalirMenu.addMouseListener(new java.awt.event.MouseAdapter() { //Cambia el color de las letras en el momento que el ratón pasa encima
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonSalirMenu.setForeground(Color.decode("#60B13A"));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) { //Vuelve al color original una vez el ratón se quita del texto
                buttonSalirMenu.setForeground(Color.WHITE);
            }
        });


        buttonVolverMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                cl.show(panelCont, "Menu");
            }
        });

        buttonVolverMenu.addMouseListener(new java.awt.event.MouseAdapter() { //Cambia el color de las letras en el momento que el ratón pasa encima
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonVolverMenu.setForeground(Color.decode("#60B13A"));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) { //Vuelve al color original una vez el ratón se quita del texto
                buttonVolverMenu.setForeground(Color.WHITE);
            }
        });


        buttonAutores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                cl.show(panelCont, "Autores");
            }
        });

        buttonAutores.addMouseListener(new java.awt.event.MouseAdapter() { //Cambia el color de las letras en el momento que el ratón pasa encima
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonAutores.setForeground(Color.decode("#60B13A"));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) { //Vuelve al color original una vez el ratón se quita del texto
                buttonAutores.setForeground(Color.WHITE);
            }
        });

        buttonReglas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                cl.show(panelCont, "Reglas");
            }
        });

        buttonReglas.addMouseListener(new java.awt.event.MouseAdapter() { //Cambia el color de las letras en el momento que el ratón pasa encima
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonReglas.setForeground(Color.decode("#60B13A"));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) { //Vuelve al color original una vez el ratón se quita del texto
                buttonReglas.setForeground(Color.WHITE);
            }
        });

        buttonVolverInfoA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                cl.show(panelCont, "Info");
            }
        });

        buttonVolverInfoA.addMouseListener(new java.awt.event.MouseAdapter() { //Cambia el color de las letras en el momento que el ratón pasa encima
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonVolverInfoA.setForeground(Color.decode("#60B13A"));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) { //Vuelve al color original una vez el ratón se quita del texto
                buttonVolverInfoA.setForeground(Color.WHITE);
            }
        });

        buttonVolverR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                cl.show(panelCont, "Info");
            }
        });

        buttonVolverR.addMouseListener(new java.awt.event.MouseAdapter() { //Cambia el color de las letras en el momento que el ratón pasa encima
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonVolverR.setForeground(Color.decode("#60B13A"));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) { //Vuelve al color original una vez el ratón se quita del texto
                buttonVolverR.setForeground(Color.WHITE);
            }
        });

        buttonVolverC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                cl.show(panelCont, "Menu");
            }
        });

        buttonVolverC.addMouseListener(new java.awt.event.MouseAdapter() { //Cambia el color de las letras en el momento que el ratón pasa encima
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonVolverC.setForeground(Color.decode("#60B13A"));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) { //Vuelve al color original una vez el ratón se quita del texto
                buttonVolverC.setForeground(Color.WHITE);
            }
        });

        buttonPausa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                cl.show(panelCont, "MenuPausa");
            }
        });

        buttonGuardarPartida.addMouseListener(new java.awt.event.MouseAdapter() { //Cambia el color de las letras en el momento que el ratón pasa encima
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonGuardarPartida.setForeground(Color.decode("#60B13A"));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) { //Vuelve al color original una vez el ratón se quita del texto
                buttonGuardarPartida.setForeground(Color.WHITE);
            }
        });

        Marco.add(panelCont);
        Marco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Marco.setVisible(true);

        //FONDOS DE LOS MENÚS

    }

    //Le pasamos los parametros necesarios para crear un boton
    public JButton crearBoton(int x, int y, int width, int height, String text) throws IOException, FontFormatException {


        JButton button = new JButton(text); //Texto
        button.setFont(Font.createFont(Font.TRUETYPE_FONT, new File("src/assets/font/PostNoBillsColombo-ExtraBold.ttf"))); //Añadimos fuente personalizada
        button.setFont(button.getFont().deriveFont(Font.PLAIN, 50)); //Añadimos el tamaño de la fuente
        button.setBounds(x, y, width, height);//Se establece su posición y tamaño
        button.setForeground(Color.WHITE); //Color del texto
        button.setBorder(null); //Seteamos el borde a null
        button.setOpaque(false); //No lo ponemos opaco
        button.setContentAreaFilled(false); //No ponemos el contenido del area
        button.setBorderPainted(false); //Seteamos el borde en false


        return button;

    }
}