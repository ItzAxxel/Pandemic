/*import javafx.scene.control.Tooltip;

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
*/
// M�todos

/* Metodo para las ciudades que se infectaran al inicio 
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
*/
/* Metodo para las ciudades que se infectaran por ronda */
/*
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
	*/
/**/

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 * The type Ciudad.
 */
public class Ciudad {

    /**
     * The Ran.
     */
    Random ran = new Random();

    /**
     * The Nombre ciudad.
     */
// Atributos
    protected String nombreCiudad;
    /**
     * The Virus rojo.
     */
    protected int virusRojo;
    /**
     * The Virus amarillo.
     */
    protected int virusAmarillo;
    /**
     * The Virus azul.
     */
    protected int virusAzul;
    /**
     * The Virus verde.
     */
    protected int virusVerde;
    /**
     * The Coordenada x.
     */
    protected int coordenadaX;
    /**
     * The Coordenada y.
     */
    protected int coordenadaY;
    /**
     * The Ciudades vecinas.
     */
    protected String[] CiudadesVecinas;
    /**
     * The Array ciudades.
     */
    public ArrayList<Ciudad> ArrayCiudades = new ArrayList<>();

    // CONSTRUCTOR HECHO POR LA MAQUINA. ESTA FORMA SE DEBE A QUE LOS VALORES POR

    /**
     * Instantiates a new Ciudad.
     */
    public Ciudad() {

    }

    /**
     * Instantiates a new Ciudad.
     *
     * @param nombreCiudad    the nombre ciudad
     * @param coordX          the coord x
     * @param coordY          the coord y
     * @param Rojo            the rojo
     * @param Amarillo        the amarillo
     * @param Azul            the azul
     * @param Verde           the verde
     * @param CiudadesVecinas the ciudades vecinas
     */
    public Ciudad(String nombreCiudad, int coordX, int coordY, int Rojo, int Amarillo, int Azul, int Verde, String[] CiudadesVecinas) {
        this.nombreCiudad = nombreCiudad;
        this.coordenadaX = coordX;
        this.coordenadaY = coordY;
        this.virusRojo = Rojo;
        this.virusAmarillo = Amarillo;
        this.virusAzul = Azul;
        this.virusVerde = Verde;
        this.CiudadesVecinas = CiudadesVecinas;
    }

    // �ESTO SON LOS GETTER Y LOS SETTERS DE ESTA CLASEEEEEE!

    /**
     * Gets nombre ciudad.
     *
     * @return the nombre ciudad
     */
    public String getNombreCiudad() {
        return nombreCiudad;
    }

    /**
     * Sets nombre ciudad.
     *
     * @param nombreCiudad the nombre ciudad
     */
    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    /**
     * Gets virus rojo.
     *
     * @return the virus rojo
     */
    public int getVirusRojo() {
        return virusRojo;
    }

    /**
     * Sets virus rojo.
     *
     * @param virusRojo the virus rojo
     */
    public void setVirusRojo(int virusRojo) {
        this.virusRojo = virusRojo;
    }

    /**
     * Gets virus amarillo.
     *
     * @return the virus amarillo
     */
    public int getVirusAmarillo() {
        return virusAmarillo;
    }

    /**
     * Sets virus amarillo.
     *
     * @param virusAmarillo the virus amarillo
     */
    public void setVirusAmarillo(int virusAmarillo) {
        this.virusAmarillo = virusAmarillo;
    }

    /**
     * Gets virus azul.
     *
     * @return the virus azul
     */
    public int getVirusAzul() {
        return virusAzul;
    }

    /**
     * Sets virus azul.
     *
     * @param virusAzul the virus azul
     */
    public void setVirusAzul(int virusAzul) {
        this.virusAzul = virusAzul;
    }

    /**
     * Gets virus verde.
     *
     * @return the virus verde
     */
    public int getVirusVerde() {
        return virusVerde;
    }

    /**
     * Sets virus verde.
     *
     * @param virusVerde the virus verde
     */
    public void setVirusVerde(int virusVerde) {
        this.virusVerde = virusVerde;
    }

    /**
     * Gets coordenada x.
     *
     * @return the coordenada x
     */
    public int getCoordenadaX() {
        return coordenadaX;
    }

    /**
     * Sets coordenada x.
     *
     * @param coordenadaX the coordenada x
     */
    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    /**
     * Gets coordenada y.
     *
     * @return the coordenada y
     */
    public int getCoordenadaY() {
        return coordenadaY;
    }

    /**
     * Sets coordenada y.
     *
     * @param coordenadaY the coordenada y
     */
    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    /**
     * Get ciudades vecinas string [ ].
     *
     * @return the string [ ]
     */
    public String[] getCiudadesVecinas() {
        return CiudadesVecinas;
    }

    /**
     * Sets ciudades vecinas.
     *
     * @param CiudadesVecinas the ciudades vecinas
     */
    public void setCiudadesVecinas(String[] CiudadesVecinas) {
        CiudadesVecinas = CiudadesVecinas;
    }

    /**
     * Gets array ciudades.
     *
     * @return the array ciudades
     */
    public ArrayList<Ciudad> getArrayCiudades() {
        return ArrayCiudades;
    }

    /**
     * Sets array ciudades.
     *
     * @param arrayCiudades the array ciudades
     */
    public void setArrayCiudades(ArrayList<Ciudad> arrayCiudades) {
        ArrayCiudades = arrayCiudades;
    }


    // M�todos para poder modificar las enfermedades


    /**
     * Crear boton ciudad j button.
     *
     * @param coordenadaX  the coordenada x
     * @param coordenadaY  the coordenada y
     * @param width        the width
     * @param height       the height
     * @param nombreCiudad the nombre ciudad
     * @return the j button
     * @throws IOException the io exception
     */
    public static JButton crearBotonCiudad(int coordenadaX, int coordenadaY, int width, int height, String nombreCiudad)
            throws IOException {

		Enfermedades virus = new Enfermedades();
        Ciudad ciudad = new Ciudad();

        JButton button = new JButton(nombreCiudad);
        button.setToolTipText("Virus Alfa: " + ciudad.getVirusRojo() + " Virus Beta: " + ciudad.getVirusVerde() + " Virus Gamma: " + ciudad.getVirusAzul() + " Virus Delta: " + ciudad.getVirusAmarillo());
        button.setFont(button.getFont().deriveFont(Font.BOLD, 15)); // Añadimos el tamaño de la fuente
        button.setBounds(coordenadaX, coordenadaY, width, height);// Se establece su posición y tamaño
        button.setForeground(Color.WHITE); // Color del texto
        button.setBorder(null); // Seteamos el borde a null
        button.setOpaque(false); // No lo ponemos opaco
        button.setContentAreaFilled(false); // No ponemos el contenido del area
        button.setBorderPainted(false); // Seteamos el borde en false
        System.out.println("Virus Alfa: " + ciudad.getVirusRojo() + " Virus Beta: " + ciudad.getVirusVerde() + " Virus Gamma: " + ciudad.getVirusAzul() + " Virus Delta: " + ciudad.getVirusAmarillo());
        return button;

    }

}
