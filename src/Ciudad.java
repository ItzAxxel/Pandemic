import javafx.scene.control.Tooltip;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Ciudad {

	// Atributos
	protected String nombreCiudad;
	protected String[] ciudadesColindantes;
	protected int coordenadaX;
	protected int coordenadaY;

	// Constructor

	public Ciudad(String nombreCiudad, String[] ciudadesColindantes, int virusAmarillo, int virusRojo, int virusVerde,
			int virusAzul, int coordenadaX, int coordenadaY) {
		this.nombreCiudad = nombreCiudad;
		this.ciudadesColindantes = ciudadesColindantes;
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
	}

	public Ciudad() {
		this.nombreCiudad = nombreCiudad;
		this.ciudadesColindantes = ciudadesColindantes;
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
	}

	// Gett y setter

	public String getNombreCiudad() {
		return nombreCiudad;
	}

	public void setNombreCiudad(String nombreCiudad) {
		this.nombreCiudad = nombreCiudad;
	}

	public String[] getCiudadesColindantes() {
		return ciudadesColindantes;
	}

	public void setCiudadesColindantes(String[] arrayvecinas) {
		this.ciudadesColindantes = arrayvecinas;
	}

	public int getCoordenadaX() {
		return coordenadaX;
	}

	public void setCoordenadaX(int coordenadaX) {
		this.coordenadaX = coordenadaX;
	}

	public int getCoordenadaY() {
		return coordenadaY;
	}

	public void setCoordenadaY(int coordenadaY) {
		this.coordenadaY = coordenadaY;
	}

	// Métodos

	/* Metodo para las ciudades que se infectaran al inicio */
	public String aleatorioCiudadesInicio() {

		Enfermedades virus = new Enfermedades();

		CargarXML virusinicio = new CargarXML();

		Random aleatorio = new Random();

		int aleatoriociudades = aleatorio.nextInt(48) + 1;

		String documento = "ciudades.txt";

		String s;

		String[] Arrayciudades = new String[49];

		int cont = 0;

		boolean detector = true;

		try {
			FileReader fr = new FileReader(documento);
			BufferedReader br = new BufferedReader(fr);
			do {
				cont++;
				s = br.readLine();
				if (s != null && cont <= aleatoriociudades) {

					String[] dividir = s.split(";");

					Arrayciudades[cont] = dividir[0];

				} else {
					detector = false;
				}

			} while (detector);
			int aleatorioenfermedades = aleatorio.nextInt(4);

			String[] Arrayvirus = { "Alfa", "Beta", "Gamma", "Delta" };

			int contadorAlfa = 0;

			int contadorBeta = 0;

			int contadorGamma = 0;

			int contadorDelta = 0;

			if (aleatorioenfermedades == 0) {
				contadorAlfa++;
				virus.setAlfa(contadorAlfa);

			} else if (aleatorioenfermedades == 1) {
				contadorBeta++;
				virus.setBeta(contadorBeta);
			} else if (aleatorioenfermedades == 2) {
				contadorGamma++;
				virus.setGamma(contadorGamma);
			} else {
				contadorDelta++;
				virus.setDelta(contadorDelta);

			}

			return "La ciudad: " + Arrayciudades[aleatoriociudades] + " sera infectada con el virus: "
					+ Arrayvirus[aleatorioenfermedades];

		} catch (IOException e) {
			System.out.println("error: " + e);
		}

		return null;
	}

	/* Metodo para las ciudades que se infectaran por ronda */

	public void aleatorioCiudadesContinuar() {

		CargarXML virusinicio = new CargarXML();

		Random aleatorio = new Random();

		ArrayList<String> mostrarTexto = new ArrayList<String>();

		int aleatoriociudades = aleatorio.nextInt(48) + 1;

		int aleatorioenfermedades = aleatorio.nextInt(4);

		String documento = "ciudades.txt";

		String s;

		String[] Arrayciudades = new String[49];

		int cont = 0;

		boolean detector = true;

		try {
			FileReader fr = new FileReader(documento);
			BufferedReader br = new BufferedReader(fr);
			do {
				cont++;
				s = br.readLine();
				if (s != null && cont <= aleatoriociudades) {

					String[] dividir = s.split(";");

					Arrayciudades[cont] = dividir[0];

				} else {
					detector = false;
				}

			} while (detector);

			String[] Arrayvirus = { "Alfa", "Beta", "Gamma", "Delta" };

			mostrarTexto.add("La ciudad: " + Arrayciudades[aleatoriociudades] + " sera infectada con el virus: "
					+ Arrayvirus[aleatorioenfermedades]);

		} catch (IOException e) {
			System.out.println("error");
		}

	}
	/**/

	public static JButton crearBotonCiudad(int coordenadaX, int coordenadaY, int width, int height, String nombreCiudad)
			throws IOException, FontFormatException {

		Enfermedades virus = new Enfermedades();

		JButton button = new JButton(nombreCiudad);
		button.setToolTipText(nombreCiudad + " Virus Alfa: " + virus.getAlfa() + " Virus Beta: " + virus.getBeta()
				+ " Virus Gamma: " + virus.getGamma() + " Virus Delta: " + virus.getDelta());
		button.setFont(button.getFont().deriveFont(Font.BOLD, 15)); // AÃ±adimos el tamaÃ±o de la fuente
		button.setBounds(coordenadaX, coordenadaY, width, height);// Se establece su posiciÃ³n y tamaÃ±o
		button.setForeground(Color.WHITE); // Color del texto
		button.setBorder(null); // Seteamos el borde a null
		button.setOpaque(false); // No lo ponemos opaco
		button.setContentAreaFilled(false); // No ponemos el contenido del area
		button.setBorderPainted(false); // Seteamos el borde en false

		return button;

	}

	/*
	 * import java.io.BufferedReader; import java.io.FileReader; import
	 * java.io.IOException; import java.util.ArrayList; import java.util.Random;
	 * 
	 * public class CIUDAD {
	 * 
	 * //Atributos protected String nombreCiudad; protected int virusRojo; protected
	 * int virusAmarillo; protected int virusAzul; protected int virusVerde;
	 * protected int coordenadaX; protected int coordenadaY; protected String[]
	 * NombresCiudadesColindantesX; public ArrayList<CIUDAD> ArrayCiudades = new
	 * ArrayList<>();
	 * 
	 * 
	 * //CONSTRUCTOR HECHO POR LA MAQUINA. ESTA FORMA SE DEBE A QUE LOS VALORES POR
	 * DEFECTO LOS PRODUCE UN BUCLE MAS ABAJO EN EL CODIGO public CIUDAD(String
	 * nombreCiudade, int coordX, int i, int i1, int i2, int i3, int i4, String[]
	 * nombresCiudadesColindantesX) { }
	 * 
	 * 
	 * // ¡ESTO SON LOS GETTER Y LOS SETTERS DE ESTA CLASEEEEEE!
	 * 
	 * public String getNombreCiudad() { return nombreCiudad; }
	 * 
	 * public void setNombreCiudad(String nombreCiudad) { this.nombreCiudad =
	 * nombreCiudad; }
	 * 
	 * public int getVirusRojo() { return virusRojo; }
	 * 
	 * public void setVirusRojo(int virusRojo) { this.virusRojo = virusRojo; }
	 * 
	 * public int getVirusAmarillo() { return virusAmarillo; }
	 * 
	 * public void setVirusAmarillo(int virusAmarillo) { this.virusAmarillo =
	 * virusAmarillo; }
	 * 
	 * public int getVirusAzul() { return virusAzul; }
	 * 
	 * public void setVirusAzul(int virusAzul) { this.virusAzul = virusAzul; }
	 * 
	 * public int getVirusVerde() { return virusVerde; }
	 * 
	 * public void setVirusVerde(int virusVerde) { this.virusVerde = virusVerde; }
	 * 
	 * public int getCoordenadaX() { return coordenadaX; }
	 * 
	 * public void setCoordenadaX(int coordenadaX) { this.coordenadaX = coordenadaX;
	 * }
	 * 
	 * public int getCoordenadaY() { return coordenadaY; }
	 * 
	 * public void setCoordenadaY(int coordenadaY) { this.coordenadaY = coordenadaY;
	 * }
	 * 
	 * public String[] getNombresCiudadesColindantesX() { return
	 * NombresCiudadesColindantesX; }
	 * 
	 * public void setNombresCiudadesColindantesX(String[]
	 * nombresCiudadesColindantesX) { NombresCiudadesColindantesX =
	 * nombresCiudadesColindantesX; }
	 * 
	 * public ArrayList<CIUDAD> getArrayCiudades() { return ArrayCiudades; }
	 * 
	 * public void setArrayCiudades(ArrayList<CIUDAD> arrayCiudades) { ArrayCiudades
	 * = arrayCiudades; }
	 * 
	 * 
	 * 
	 * 
	 * //¡ESTE ES EL MALDITO METODO QUE SE ENCARGA DE CREAR LAS CIUDADES Y QUE SOL
	 * SE LLAMARÁ UNA PUTA VEZ!
	 * 
	 * 
	 * public ArrayList getCiudadesArray() {
	 * 
	 * Random ran = new Random();
	 * 
	 * 
	 * String documento = "ObjetosPrueba.txt";
	 * 
	 * String s;
	 * 
	 * String[] NombreCiudades = new String[48];
	 * 
	 * String[] ParteCoord;
	 * 
	 * String[] coord = new String[48];
	 * 
	 * String[] ParteVirus;
	 * 
	 * String[] virus = new String[48];
	 * 
	 * int[] virusRojo = new int[48];
	 * 
	 * int[] virusAmarillo = new int[48];
	 * 
	 * int[] virusAzul = new int[48];
	 * 
	 * int[] virusVerde = new int[48];
	 * 
	 * int[] coordX = new int[48];
	 * 
	 * int[] coordY = new int[48];
	 * 
	 * String[] Prueba;
	 * 
	 * String[] NombresCiudadesColindantesX;
	 * 
	 * 
	 * int cont = 0; int contP = 0;
	 * 
	 * boolean detector = true;
	 * 
	 * try { FileReader fr = new FileReader(documento); BufferedReader br = new
	 * BufferedReader(fr); do {
	 * 
	 * s = br.readLine();
	 * 
	 * if (s != null) {
	 * 
	 * 
	 * String[] ParteTxT = s.split(";");//Guarda toda la String del TxT dividida en
	 * ;
	 * 
	 * NombreCiudades[cont] = ParteTxT[0];//Recibe el Nombre y lo guarga en un Array
	 * de Nombres Ciudad
	 * 
	 * 
	 * coord[cont] = ParteTxT[1];//Recibe las coordenadas y las pasa a un Array
	 * Coordenadas
	 * 
	 * ParteCoord = coord[cont].split(",");//Divide las coordenadas del Array
	 * Coordenadas y las pas al dividir2
	 * 
	 * coordY[cont] = Integer.parseInt(ParteCoord[0]);//Guarda en el Array
	 * Coordenadas X la coordenada X
	 * 
	 * coordX[cont] = Integer.parseInt(ParteCoord[1]);//Guarda en el Array
	 * Coordenadas Y la coordenada Y
	 * 
	 * 
	 * virus[cont] = ParteTxT[2]; //Recibe los 4 virus
	 * 
	 * ParteVirus = virus[cont].split("-");
	 * 
	 * virusRojo[cont] = Integer.parseInt(ParteVirus[0]); virusAmarillo[cont] =
	 * Integer.parseInt(ParteVirus[1]); virusAzul[cont] =
	 * Integer.parseInt(ParteVirus[2]); virusVerde[cont] =
	 * Integer.parseInt(ParteVirus[3]);
	 * 
	 * 
	 * NombresCiudadesColindantesX = ParteTxT[3].split(",");
	 * 
	 * CIUDAD ciudad = new CIUDAD(NombreCiudades[cont], coordX[cont], coordY[cont],
	 * virusRojo[0], virusAmarillo[1], virusAzul[2], virusVerde[3],
	 * NombresCiudadesColindantesX); System.out.println(ciudad.getNombreCiudad() +
	 * " " + ciudad.getCoordenadaX() + " " + ciudad.getCoordenadaY() + " " +
	 * ciudad.getVirusRojo() + " " + ciudad.getVirusAmarillo() + " " +
	 * ciudad.getVirusAzul() + " " + ciudad.getVirusVerde() + " " +
	 * ciudad.getNombresCiudadesColindantesX()); ArrayCiudades.add(ciudad); cont++;
	 * 
	 * 
	 * } else { detector = false; }
	 * 
	 * 
	 * } while (detector);
	 * 
	 * } catch (IOException e) { System.out.println("ERROR " + e); }
	 * 
	 * return ArrayCiudades;
	 * 
	 * }
	 */

}
