import javax.swing.*;
import javax.swing.border.Border;
import org.omg.CORBA.PUBLIC_MEMBER;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

public class MenusDeJuego {

	// EL FRAME DEL JUEGO
	Frame Marco = new Frame();
	Jugador player = new Jugador();
	int[] Datos = new int[4];
	// LOS JPANELS DEL JUEGO
	JPanel panelCont = new JPanel(); // Panel que contiene paneles
	JPanel panelMenu = new JPanel();
	JPanel panelInfo = new JPanel();
	JPanel panelAutores = new JPanel();
	JPanel panelReglas = new JPanel();
	JPanel panelRegistarUsuario = new JPanel();
	JPanel panelMapaJugable = new JPanel();
	JPanel panelMenuPausa = new JPanel();
	JPanel panelConfiguracion = new JPanel();
	JTextArea historial = new JTextArea();

	// LOS JBUTTONS DEL JUEGO

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
	JButton buttonAumento2;
	JButton buttonReduccion2;
	JButton buttonAumento3;
	JButton buttonReduccion3;
	JButton buttonAumento4;
	JButton buttonReduccion4;
	JButton buttonCiudad;
	JButton buttonGuardarConfig;
	JButton buttonGuardarNombreUsuario;
	JButton buttonVacunaRoja = new JButton();
	JButton buttonVacunaAmarilla = new JButton();
	JButton buttonVacunaAzul = new JButton();
	JButton buttonVacunaVerde = new JButton();

	// LABELS TEXT.

	JLabel labelCityInfo;
	JLabel labelCInfectadas;
	JLabel labelCInfectadasRonda;
	JLabel NEDerrota;
	JLabel NBDerrota;

	ArrayList<JButton> BotonesCiudad = new ArrayList<JButton>();
	ArrayList<JLabel> LabelsCiudades = new ArrayList<JLabel>();
	Enfermedades virus = new Enfermedades();
	public JTextField textoRonda;
	int ronda = 0;
	public static MenusDeJuego instance;

	// SE CREA UN OBJETO ES UN MANAGER DE LAYOUTS, EN ESTE CASO CARDLAYOUT
	CardLayout cl = new CardLayout();

	public MenusDeJuego() throws IOException, FontFormatException {

		
		// SE ESTABLECE EL TIPO DE LAYOUT EN EL PANEL DE CONTENIDO
		panelCont.setLayout(cl);

		// ELEMENTOS MENÚ

		JLabel fondoMenu = new JLabel(
				new ImageIcon(Objects.requireNonNull(getClass().getResource("assets/Pantalla_Menu.png"))));// Imagen de
		// FONDO
		fondoMenu.setLayout(null);// Ningún Layout en Especial

		// Botones en el JLabel que producen cambios entre Cards de JPanels

		buttonPartidaNueva = crearBoton(100, 300, 387, 73, "Nueva Partida");
		fondoMenu.add(buttonPartidaNueva);// Se añade el botón al label FondoMenu

		buttonCargarPartida = crearBoton(100, 400, 387, 73, "Cargar Partida");
		fondoMenu.add(buttonCargarPartida);// Se añade el botón al label FondoMenu

		buttonConfiguracion = crearBoton(100, 500, 387, 73, "Configuracion");
		fondoMenu.add(buttonConfiguracion);// Se añade el botón al label FondoMenu

		buttonInformacion = crearBoton(100, 600, 387, 73, "Informacion");
		fondoMenu.add(buttonInformacion);// Se añade el botón al label FondoMenu

		buttonSalir = crearBoton(100, 700, 387, 73, "Salir");
		fondoMenu.add(buttonSalir);// Se añade el botón al label FondoMenu

		panelMenu.add(fondoMenu);

		////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// ELEMENTOS REGISTRAR USUARIO

		JLabel fondoRegistrarUsuario = new JLabel(
				new ImageIcon(Objects.requireNonNull(getClass().getResource("assets/RegistarUsuario.png")))); // Ponemos
																												// el
																												// fondo
		JTextField introducirNombreUsuario = new JTextField(20); // Creamos la zona de texto donde el usuario deberá
																	// registrarse
		fondoRegistrarUsuario.add(introducirNombreUsuario); // Lo añadimos al fondo
		introducirNombreUsuario.setBounds(750, 450, 450, 30); // Introducimos las coordenadas
		introducirNombreUsuario.setFont(
				Font.createFont(Font.TRUETYPE_FONT, new File("src/assets/font/PostNoBillsColombo-ExtraBold.ttf"))); // Añadimos
																													// fuente
																													// personalizada
		introducirNombreUsuario.setFont(introducirNombreUsuario.getFont().deriveFont(Font.PLAIN, 30)); // Ponemos el
																										// tamañlo de
																										// la fuente
		buttonGuardarNombreUsuario = crearBoton(770, 550, 387, 73, "Continuar"); // Creamos un botón
		fondoRegistrarUsuario.add(buttonGuardarNombreUsuario);// Se añade el botón al label FondoMenu
		panelRegistarUsuario.add(fondoRegistrarUsuario); // Lo añadimos al jpanel

		////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// ELEMENTOS MENÚ MAPA JUGABLE

		JLabel fondoMenuMapaJugable = new JLabel(
				new ImageIcon(Objects.requireNonNull(getClass().getResource("assets/Mapa_Jugable.png"))));// Imagen de
		// FONDO
		fondoMenuMapaJugable.setLayout(null);// Ningún Layout en Especial

		buttonPausa = crearBoton(0, 0, 100, 80, "||");
		fondoMenuMapaJugable.add(buttonPausa);

		// BOTONES VACUNAS

		buttonVacunaRoja.setBounds(427, 817, 127, 123);
		buttonVacunaRoja.setBackground(Color.decode("#9E2F2F"));

		buttonVacunaAmarilla.setBounds(300, 817, 127, 123);
		buttonVacunaAmarilla.setBackground(Color.decode("#DFCC25"));

		buttonVacunaAzul.setBounds(427, 940, 127, 123);
		buttonVacunaAzul.setBackground(Color.decode("#4634B7"));

		buttonVacunaVerde.setBounds(300, 940, 127, 123);
		buttonVacunaVerde.setBackground(Color.decode("#60B13A"));

		fondoMenuMapaJugable.add(buttonVacunaRoja);
		fondoMenuMapaJugable.add(buttonVacunaAmarilla);
		fondoMenuMapaJugable.add(buttonVacunaAzul);
		fondoMenuMapaJugable.add(buttonVacunaVerde);

		// BOTONES Y OBJETOS CIUDAD

		Random ran = new Random();

		ArrayList<Ciudad> ArrayCiudades = new ArrayList<>();

		String documento = "ciudades.txt";

		String s;

		String[] NombreCiudades = new String[48];

		String[] ParteCoord;

		String[] coord = new String[48];

		String[] ParteVirus;

		String[] virus = new String[48];

		int[] virusRojo = new int[48];

		int[] virusAmarillo = new int[48];

		int[] virusAzul = new int[48];

		int[] virusVerde = new int[48];

		int[] coordX = new int[48];

		int[] coordY = new int[48];

		String[] Prueba;

		String[] CiudadesVecinas;

		int cont = 0;
		int contP = 0;

		boolean detector = true;

		try {
			FileReader fr = new FileReader(documento);
			BufferedReader br = new BufferedReader(fr);
			do {

				s = br.readLine();

				if (s != null) {

					String[] ParteTxT = s.split(";");// Guarda toda la String del TxT dividida en ;

					NombreCiudades[cont] = ParteTxT[0];// Recibe el Nombre y lo guarga en un Array de Nombres Ciudad

					// System.out.print(NombreCiudades [cont] + ";");

					coord[cont] = ParteTxT[1];// Recibe las coordenadas y las pasa a un Array Coordenadas

					ParteCoord = coord[cont].split(",");// Divide las coordenadas del Array Coordenadas y las pas al
														// dividir2

					coordY[cont] = Integer.parseInt(ParteCoord[0]);// Guarda en el Array Coordenadas X la coordenada X

					coordX[cont] = Integer.parseInt(ParteCoord[1]);// Guarda en el Array Coordenadas Y la coordenada Y

					// System.out.print(coordX[cont] + "," + coordY[cont] + ";");

					virus[cont] = ParteTxT[2]; // Recibe los 4 virus

					ParteVirus = virus[cont].split("-");

					virusRojo[cont] = Integer.parseInt(ParteVirus[0]);
					virusAmarillo[cont] = Integer.parseInt(ParteVirus[1]);
					virusAzul[cont] = Integer.parseInt(ParteVirus[2]);
					virusVerde[cont] = Integer.parseInt(ParteVirus[3]);

					// System.out.print(virusRojo[cont] + "," + virusAmarillo [cont] + "," +
					// virusAzul [cont] + "," + virusVerde [cont]);
					// System.out.println();

					// CiudadesVecinas.add(ParteTxT[3]);
					CiudadesVecinas = ParteTxT[3].split(",");

					Ciudad ciudad = new Ciudad(NombreCiudades[cont], coordX[cont], coordY[cont], virusRojo[0],
							virusAmarillo[1], virusAzul[2], virusVerde[3], CiudadesVecinas);
					buttonCiudad = Ciudad.crearBotonCiudad(coordX[cont], coordY[cont], 100, 30, NombreCiudades[cont]);
					fondoMenuMapaJugable.add(buttonCiudad);
					System.out.println(ciudad.getNombreCiudad() + " " + ciudad.getCoordenadaX() + " "
							+ ciudad.getCoordenadaY() + " " + ciudad.getVirusRojo() + " " + ciudad.getVirusAmarillo()
							+ " " + ciudad.getVirusAzul() + " " + ciudad.getVirusVerde() + " "
							+ ciudad.getCiudadesVecinas());
					ArrayCiudades.add(ciudad);
					/* CiudadesVecinas.clear(); */
					cont++;

				} else {
					detector = false;
				}

			} while (detector);

		} catch (IOException e) {
			System.out.println("ERROR " + e);
		}

		/////////////////////////////////////////////////////////////////////

		// SISTEMA DE HISTORIAL
		historial.setBounds(428, 817, 700, 246);
		historial.setEditable(false);
		historial.setFont(
				Font.createFont(Font.TRUETYPE_FONT, new File("src/assets/font/PostNoBillsColombo-ExtraBold.ttf"))); // Añadimos
		Border border = BorderFactory.createLineBorder(Color.decode("#60B13A"), 5); // borde // fuente
																					// personalizada
		historial.setFont(historial.getFont().deriveFont(Font.PLAIN, 18)); // Ponemos el tamañlo de la fuente
		historial.setBorder(border);
		historial.setBackground(Color.decode("#3F3E3E"));
		historial.setForeground(Color.white);
		fondoMenuMapaJugable.add(historial);// Lo añadimos en el Fondo
		panelMapaJugable.add(fondoMenuMapaJugable);

		/* Bucle para las cuidades vecinas */

		// SISTEMA DE RONDA (EL TEXTO)


		textoRonda = new JTextField("RONDA: " + ronda); // Creamos el texto
		textoRonda.setBounds(770, 0, 300, 100); // Ponemos las coordenadas
		textoRonda.setBorder(BorderFactory.createEmptyBorder()); // Quitamos los bordes que trae por defecto
		textoRonda.setOpaque(false); // Ponemos en transparente el fondo
		textoRonda.setFont(
				Font.createFont(Font.TRUETYPE_FONT, new File("src/assets/font/PostNoBillsColombo-ExtraBold.ttf"))); // Añadimos
																													// fuente
																													// personalizada
		textoRonda.setFont(textoRonda.getFont().deriveFont(Font.PLAIN, 50)); // Ponemos el tamañlo de la fuente
		textoRonda.setForeground(Color.WHITE); // Ponemos el color de la letra en blanco
		textoRonda.setVisible(true); // Lo ponemos en visible
		textoRonda.setEditable(false); // Hacemos que el usuario no pueda editarlo
		fondoMenuMapaJugable.add(textoRonda);// Lo añadimos en el Fondo
		panelMapaJugable.add(fondoMenuMapaJugable);

		// ELEMENTOS MENU PAUSA

		JLabel fondoMenuPausa = new JLabel(
				new ImageIcon(Objects.requireNonNull(getClass().getResource("assets/MapaPausa.png"))));
		fondoMenuPausa.setLayout(null);// Ningún Layout en Especial
		buttonGuardarPartida = crearBoton(750, 450, 387, 73, "Guardar Partida");
		buttonContinuarPartida = crearBoton(750, 550, 387, 73, "Continuar");
		buttonSalirMenu = crearBoton(750, 650, 387, 73, "Salir");
		fondoMenuPausa.add(buttonGuardarPartida);
		fondoMenuPausa.add(buttonContinuarPartida);
		fondoMenuPausa.add(buttonSalirMenu);

		panelMenuPausa.add(fondoMenuPausa);

		JTextField cajaDeTexto = new JTextField();
		cajaDeTexto.setText("CoDejaVu");
		cajaDeTexto.setBounds(90, 60, 90, 23);

		// ELEMENTOS MENU CONFIGURACION CON MODIFICADOR DE XML

		JLabel fondoMenuConfiguracion = new JLabel(
				new ImageIcon(Objects.requireNonNull(getClass().getResource("assets/Configuracion.png"))));
		fondoMenuConfiguracion.setLayout(null);// Ningun Layout en Especial

		CargarXML xml = new CargarXML();

		Datos = xml.ObtenerDatosXML();

		buttonVolverC = crearBoton(800, 800, 387, 73, "Volver");
		fondoMenuConfiguracion.add(buttonVolverC);

		buttonAumento = crearBoton(900, 347, 100, 73, "+");
		fondoMenuConfiguracion.add(buttonAumento);

		buttonReduccion = crearBoton(800, 347, 100, 73, "-");
		fondoMenuConfiguracion.add(buttonReduccion);

		buttonAumento2 = crearBoton(930, 450, 100, 73, "+");
		fondoMenuConfiguracion.add(buttonAumento2);

		buttonReduccion2 = crearBoton(830, 450, 100, 73, "-");
		fondoMenuConfiguracion.add(buttonReduccion2);

		buttonAumento3 = crearBoton(1050, 550, 100, 73, "+");
		fondoMenuConfiguracion.add(buttonAumento3);

		buttonReduccion3 = crearBoton(950, 550, 100, 73, "-");
		fondoMenuConfiguracion.add(buttonReduccion3);

		buttonAumento4 = crearBoton(920, 650, 100, 73, "+");
		fondoMenuConfiguracion.add(buttonAumento4);

		buttonReduccion4 = crearBoton(820, 650, 100, 73, "-");
		fondoMenuConfiguracion.add(buttonReduccion4);

		buttonGuardarConfig = crearBoton(200, 800, 300, 73, "Guardar");
		fondoMenuConfiguracion.add(buttonGuardarConfig);

		int D1 = Datos[0];
		int D2 = Datos[1];
		int D3 = Datos[2];
		int D4 = Datos[3];

		/**/

		labelCInfectadas = crearLabel(885, 337, 100, 100, Integer.toString(D1));
		fondoMenuConfiguracion.add(labelCInfectadas);
		labelCInfectadasRonda = crearLabel(910, 440, 100, 100, Integer.toString(D2));
		fondoMenuConfiguracion.add(labelCInfectadasRonda);
		NEDerrota = crearLabel(1040, 540, 100, 100, Integer.toString(D3));
		fondoMenuConfiguracion.add(NEDerrota);
		NBDerrota = crearLabel(910, 640, 100, 100, Integer.toString(D4));
		fondoMenuConfiguracion.add(NBDerrota);

		panelConfiguracion.add(fondoMenuConfiguracion);

		// ELEMENTOS MENU DE INFORMACION

		JLabel fondoMenuInfo = new JLabel(
				new ImageIcon(Objects.requireNonNull(getClass().getResource("assets/Pantalla_Menu.png"))));// Imagen de
		// FONDO
		fondoMenuInfo.setLayout(null);// Ningun Layout en Especial

		buttonReglas = crearBoton(100, 300, 387, 73, "Como jugar");
		fondoMenuInfo.add(buttonReglas);

		buttonAutores = crearBoton(100, 500, 387, 73, "Autores");
		fondoMenuInfo.add(buttonAutores);

		buttonVolverMenu = crearBoton(100, 700, 387, 73, "Volver");
		fondoMenuInfo.add(buttonVolverMenu);

		panelInfo.add(fondoMenuInfo);

		// ELEMENTOS DEL MENU DE AUTORES

		JLabel fondoMenuAutores = new JLabel(
				new ImageIcon(Objects.requireNonNull(getClass().getResource("assets/Autores.png"))));// Imagen de FONDO
		fondoMenuAutores.setLayout(null);// Ningun Layout en Especial

		buttonVolverInfoA = crearBoton(90, 850, 387, 73, "Volver");
		fondoMenuAutores.add(buttonVolverInfoA);

		panelAutores.add(fondoMenuAutores);

		// BOTONES MENU REGLAS

		JLabel fondoMenuReglas = new JLabel(
				new ImageIcon(Objects.requireNonNull(getClass().getResource("assets/Reglas de Juego.png"))));// Imagen
		// de
		// FONDO
		fondoMenuReglas.setLayout(null);// Ningun Layout en Especial

		buttonVolverR = crearBoton(800, 850, 387, 73, "Volver");
		fondoMenuReglas.add(buttonVolverR);
		buttonVolverR.setBounds(800, 850, 387, 73);

		panelReglas.add(fondoMenuReglas);

		// C O L O R E S PROVICIONALES D E L O S P A N E L E S //

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
		panelCont.add(panelRegistarUsuario, "RegistrarUsuario");

		// CARD LAYOUT EMPIEZA POR MOSTRAR EL PANEL 1 - MENU PRINCIPAL

		cl.show(panelCont, "Menu");

		// L O S B O T O N E S Y S U S A C C I O N E S //

		buttonVacunaRoja.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (player.getAcciones() > 0) {
					player.InvestigarVacunaRoja();
					player.setAcciones(player.getAcciones() - 1);
					System.out.println("AccionesJugador: " + player.getAcciones());
					System.out.println("NivelVacunaRojo: " + player.getLvlVacunaRoja());
				} else {
					System.out.println("No tienes más acciones.");
					player.setAcciones(3);
				}

			}
		});

		buttonVacunaAmarilla.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {

				if (player.getAcciones() > 0) {
					player.InvestigarVacunaAmarilla();
					player.setAcciones(player.getAcciones() - 1);
					System.out.println("AccionesJugador: " + player.getAcciones());
					System.out.println("NivelVacunaAmarilla: " + player.getLvlVacunaAmarilla());
				} else {

					System.out.println("No tienes más acciones.");
					player.setAcciones(3);

				}
			}
		});

		buttonVacunaAzul.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {

				if (player.getAcciones() > 0) {
					player.InvestigarVacunaAzul();
					player.setAcciones(player.getAcciones() - 1);
					System.out.println("AccionesJugador: " + player.getAcciones());
					System.out.println("NivelVacunaAzul: " + player.getLvlVacunaAzul());
				} else {
					System.out.println("No tienes más acciones.");
					player.setAcciones(3);

				}
			}
		});

		buttonVacunaVerde.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (player.getAcciones() > 0) {
					player.InvestigarVacunaVerde();
					player.setAcciones(player.getAcciones() - 1);
					System.out.println("AccionesJugador: " + player.getAcciones());
					System.out.println("NivelVacunaVerde: " + player.getLvlVacunaVerde());
				} else {
					System.out.println("No tienes más acciones.");
					player.setAcciones(3);

				}
			}
		});

		buttonPartidaNueva.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {

				cl.show(panelCont, "RegistrarUsuario");

			}
		});

		buttonGuardarNombreUsuario.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {

				if (introducirNombreUsuario.getText().isEmpty()) {
					JOptionPane.showMessageDialog(buttonGuardarNombreUsuario, "Introduce tu nombre de usuario.");

				} else {
					String nombreUsuario = introducirNombreUsuario.getText();

					Usuario nombreusuario = new Usuario(nombreUsuario);

					Ranking nombreranking = new Ranking(nombreUsuario);

					nombreranking.insertWithStatement();

					cl.show(panelCont, "MapaJugable");
				}
			}
		});

		buttonPartidaNueva.addMouseListener(new MouseAdapter() { // Cambia el color de las letras en el
			// momento que el raton pasa encima
			public void mouseEntered(MouseEvent evt) {
				buttonPartidaNueva.setForeground(Color.decode("#60B13A"));
			}

			public void mouseExited(MouseEvent evt) { // Vuelve al color original una vez el raton se
				// quita del texto
				buttonPartidaNueva.setForeground(Color.WHITE);
			}
		});

		buttonCargarPartida.addMouseListener(new MouseAdapter() { // Cambia el color de las letras en el
			// momento que el raton pasa encima
			public void mouseEntered(MouseEvent evt) {
				buttonCargarPartida.setForeground(Color.decode("#60B13A"));
			}

			public void mouseExited(MouseEvent evt) { // Vuelve al color original una vez el raton se
				// quita del texto
				buttonCargarPartida.setForeground(Color.WHITE);
			}
		});

		buttonGuardarNombreUsuario.addMouseListener(new MouseAdapter() { // Cambia el color de las letras
																			// en el
			// momento que el raton pasa encima
			public void mouseEntered(MouseEvent evt) {
				buttonGuardarNombreUsuario.setForeground(Color.decode("#60B13A"));
			}

			public void mouseExited(MouseEvent evt) { // Vuelve al color original una vez el raton se
				// quita del texto
				buttonGuardarNombreUsuario.setForeground(Color.WHITE);
			}
		});

		buttonConfiguracion.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cl.show(panelCont, "Configuracion");

			}
		});

		buttonConfiguracion.addMouseListener(new MouseAdapter() { // Cambia el color de las letras en el
			// momento que el raton pasa encima
			public void mouseEntered(MouseEvent evt) {
				buttonConfiguracion.setForeground(Color.decode("#60B13A"));
			}

			public void mouseExited(MouseEvent evt) { // Vuelve al color original una vez el raton se
				// quita del texto
				buttonConfiguracion.setForeground(Color.WHITE);
			}
		});

		buttonInformacion.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cl.show(panelCont, "Info");
			}
		});

		buttonInformacion.addMouseListener(new MouseAdapter() { // Cambia el color de las letras en el
			// momento que el raton pasa encima
			public void mouseEntered(MouseEvent evt) {
				buttonInformacion.setForeground(Color.decode("#60B13A"));
			}

			public void mouseExited(MouseEvent evt) { // Vuelve al color original una vez el raton se
				// quita del texto
				buttonInformacion.setForeground(Color.WHITE);
			}
		});

		buttonSalir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {

				System.exit(0);

			}
		});

		buttonSalir.addMouseListener(new MouseAdapter() { // Cambia el color de las letras en el momento
			// que el raton pasa encima
			public void mouseEntered(MouseEvent evt) {
				buttonSalir.setForeground(Color.decode("#60B13A"));
			}

			public void mouseExited(MouseEvent evt) { // Vuelve al color original una vez el raton se
				// quita del texto
				buttonSalir.setForeground(Color.WHITE);
			}
		});

		buttonInformacion.addMouseListener(new MouseAdapter() { // Cambia el color de las letras en el
			// momento que el raton pasa encima
			public void mouseEntered(MouseEvent evt) {
				buttonInformacion.setForeground(Color.decode("#60B13A"));
			}

			public void mouseExited(MouseEvent evt) { // Vuelve al color original una vez el raton se
				// quita del texto
				buttonInformacion.setForeground(Color.WHITE);
			}
		});

		buttonContinuarPartida.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cl.show(panelCont, "MapaJugable");
			}
		});
		buttonContinuarPartida.addMouseListener(new MouseAdapter() {
			/* Cambia el color de las letras en el momento que el raton pasa por encima */

			public void mouseEntered(MouseEvent evt) {
				buttonContinuarPartida.setForeground(Color.decode("#60B13A"));
			}

			/**/
			/* Vuelve al color original una vez el raton se quita del texto */
			public void mouseExited(MouseEvent evt) {
				buttonContinuarPartida.setForeground(Color.WHITE);
			}
			/**/
		});

		buttonSalirMenu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cl.show(panelCont, "Menu");

			}
		});

		buttonSalirMenu.addMouseListener(new MouseAdapter() { // Cambia el color de las letras en el
			// momento que el raton pasa encima

			public void mouseEntered(MouseEvent evt) {
				buttonSalirMenu.setForeground(Color.decode("#60B13A"));
			}

			public void mouseExited(MouseEvent evt) { // Vuelve al color original una vez el raton se
				// quita del texto
				buttonSalirMenu.setForeground(Color.WHITE);
			}
		});

		buttonVolverMenu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cl.show(panelCont, "Menu");
			}
		});

		buttonVolverMenu.addMouseListener(new MouseAdapter() { // Cambia el color de las letras en el
			// momento que el raton pasa encima
			public void mouseEntered(MouseEvent evt) {
				buttonVolverMenu.setForeground(Color.decode("#60B13A"));
			}

			public void mouseExited(MouseEvent evt) { // Vuelve al color original una vez el raton se
				// quita del texto
				buttonVolverMenu.setForeground(Color.WHITE);
			}
		});

		buttonAutores.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cl.show(panelCont, "Autores");
			}
		});

		buttonAutores.addMouseListener(new MouseAdapter() { // Cambia el color de las letras en el
			// momento que el raton pasa encima
			public void mouseEntered(MouseEvent evt) {
				buttonAutores.setForeground(Color.decode("#60B13A"));
			}

			public void mouseExited(MouseEvent evt) { // Vuelve al color original una vez el raton se
				// quita del texto
				buttonAutores.setForeground(Color.WHITE);
			}
		});

		buttonReglas.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cl.show(panelCont, "Reglas");
			}
		});

		buttonReglas.addMouseListener(new MouseAdapter() { // Cambia el color de las letras en el momento
			// que el raton pasa encima
			public void mouseEntered(MouseEvent evt) {
				buttonReglas.setForeground(Color.decode("#60B13A"));
			}

			public void mouseExited(MouseEvent evt) { // Vuelve al color original una vez el raton se
				// quita del texto
				buttonReglas.setForeground(Color.WHITE);
			}
		});

		buttonVolverInfoA.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cl.show(panelCont, "Info");
			}
		});

		buttonVolverInfoA.addMouseListener(new MouseAdapter() { // Cambia el color de las letras en el
			// momento que el raton pasa encima
			public void mouseEntered(MouseEvent evt) {
				buttonVolverInfoA.setForeground(Color.decode("#60B13A"));
			}

			public void mouseExited(MouseEvent evt) { // Vuelve al color original una vez el raton se
				// quita del texto
				buttonVolverInfoA.setForeground(Color.WHITE);
			}
		});

		buttonVolverR.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cl.show(panelCont, "Info");
			}
		});

		buttonVolverR.addMouseListener(new MouseAdapter() { // Cambia el color de las letras en el
			// momento que el raton pasa encima
			public void mouseEntered(MouseEvent evt) {
				buttonVolverR.setForeground(Color.decode("#60B13A"));
			}

			public void mouseExited(MouseEvent evt) { // Vuelve al color original una vez el raton se
				// quita del texto
				buttonVolverR.setForeground(Color.WHITE);
			}
		});

		buttonVolverC.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cl.show(panelCont, "Menu");
			}
		});

		buttonVolverC.addMouseListener(new MouseAdapter() { // Cambia el color de las letras en el
			// momento que el raton pasa encima
			public void mouseEntered(MouseEvent evt) {
				buttonVolverC.setForeground(Color.decode("#60B13A"));
			}

			public void mouseExited(MouseEvent evt) { // Vuelve al color original una vez el raton se
				// quita del texto
				buttonVolverC.setForeground(Color.WHITE);
			}
		});

		buttonPausa.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cl.show(panelCont, "MenuPausa");
			}
		});

		buttonGuardarPartida.addMouseListener(new MouseAdapter() { // Cambia el color de las letras en el
			// momento que el raton pasa encima
			public void mouseEntered(MouseEvent evt) {
				buttonGuardarPartida.setForeground(Color.decode("#60B13A"));
			}

			public void mouseExited(MouseEvent evt) { // Vuelve al color original una vez el raton se
				// quita del texto
				buttonGuardarPartida.setForeground(Color.WHITE);
			}
		});

		buttonReduccion.addActionListener(new ActionListener() {// Boton para reducirparametro
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int nlabelCInfectadas = Integer.parseInt(labelCInfectadas.getText()) - 1;
				labelCInfectadas.setText(Integer.toString(nlabelCInfectadas));
			}
		});

		buttonAumento.addActionListener(new ActionListener() { // Boton para aumentar parametro
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int nlabelCInfectadas = Integer.parseInt(labelCInfectadas.getText()) + 1;
				labelCInfectadas.setText(Integer.toString(nlabelCInfectadas));
			}
		});

		buttonReduccion2.addActionListener(new ActionListener() {// Botón para reducirrparámetro
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int nlabelCInfectadasRonda = Integer.parseInt(labelCInfectadasRonda.getText()) - 1;
				labelCInfectadasRonda.setText(Integer.toString(nlabelCInfectadasRonda));
			}
		});

		buttonAumento2.addActionListener(new ActionListener() { // Botón para aumentar parámetro
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int nlabelCInfectadasRonda = Integer.parseInt(labelCInfectadasRonda.getText()) + 1;
				labelCInfectadasRonda.setText(Integer.toString(nlabelCInfectadasRonda));
			}
		});

		buttonReduccion3.addActionListener(new ActionListener() {// Botón para reducirrparámetro
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int nNEDerrota = Integer.parseInt(NEDerrota.getText()) - 1;
				NEDerrota.setText(Integer.toString(nNEDerrota));
			}
		});

		buttonAumento3.addActionListener(new ActionListener() { // Botón para aumentar parámetro
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int nNEDerrota = Integer.parseInt(NEDerrota.getText()) + 1;
				NEDerrota.setText(Integer.toString(nNEDerrota));
			}
		});

		buttonReduccion4.addActionListener(new ActionListener() {// Boton para reducir parametro
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int nNBDerrota = Integer.parseInt(NBDerrota.getText()) - 1;
				NBDerrota.setText(Integer.toString(nNBDerrota));
			}
		});

		buttonAumento4.addActionListener(new ActionListener() { // Boton para aumentar parametro
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int nNBDerrota = Integer.parseInt(NBDerrota.getText()) + 1;
				NBDerrota.setText(Integer.toString(nNBDerrota));
			}
		});

		buttonGuardarConfig.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				CargarXML Xml = new CargarXML();
				xml.preCargarDatosXML(labelCInfectadas.getText(), labelCInfectadasRonda.getText(), NEDerrota.getText(),
						NBDerrota.getText());
			}
		});

		Marco.add(panelCont);
		Marco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		Marco.setVisible(true);

		// FONDOS DE LOS MENÚS

	}

	// Le pasamos los parametros necesarios para crear un boton
	public JButton crearBoton(int x, int y, int width, int height, String text)
			throws IOException, FontFormatException {

		JButton button = new JButton(text); // Texto
		button.setFont(
				Font.createFont(Font.TRUETYPE_FONT, new File("src/assets/font/PostNoBillsColombo-ExtraBold.ttf"))); // Añadimos
		// fuente
		// personalizada
		button.setFont(button.getFont().deriveFont(Font.PLAIN, 50)); // Añadimos el tamaño de la fuente
		button.setBounds(x, y, width, height);// Se establece su posición y tamaño
		button.setForeground(Color.WHITE); // Color del texto
		button.setBorder(null); // Seteamos el borde a null
		button.setOpaque(false); // No lo ponemos opaco
		button.setContentAreaFilled(false); // No ponemos el contenido del area
		button.setBorderPainted(false); // Seteamos el borde en false

		return button;

	}

	public JLabel crearLabel(int x, int y, int width, int height, String text) throws IOException, FontFormatException {

		JLabel label = new JLabel(text); // Texto
		label.setFont(
				Font.createFont(Font.TRUETYPE_FONT, new File("src/assets/font/PostNoBillsColombo-ExtraBold.ttf"))); // Añadimos
		// fuente
		// personalizada
		label.setFont(label.getFont().deriveFont(Font.PLAIN, 50)); // Añadimos el tamaño de la fuente
		label.setBounds(x, y, width, height);// Se establece su posición y tamaño
		label.setForeground(Color.WHITE); // Color del texto
		label.setVisible(true);
		// label.setBorder(); //Seteamos el borde a null
		// label.setOpaque(false); //No lo ponemos opaco

		return label;

	}

}
