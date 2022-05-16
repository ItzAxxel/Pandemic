import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * The type Enfermedades.
 */
public class Enfermedades {

	// Atributos

    /**
     * The Alfa.
     */
    protected int alfa; // Enfermedad roja
    /**
     * The Beta.
     */
    protected int beta; // Enfermedad azul
    /**
     * The Delta.
     */
    protected int delta; // Enfermedad amarilla
    /**
     * The Gamma.
     */
    protected int gamma; // Enfermedad verde
    /**
     * The Infected.
     */
    protected boolean infected; // Comprobaar si est� enfermo

	// Constructores

    /**
     * Instantiates a new Enfermedades.
     */
    public Enfermedades() {

	}

    /**
     * Instantiates a new Enfermedades.
     *
     * @param VirusAlfa  the virus alfa
     * @param VirusBeta  the virus beta
     * @param VirusGamma the virus gamma
     * @param VirusDelta the virus delta
     */
    public Enfermedades(int VirusAlfa, int VirusBeta, int VirusGamma, int VirusDelta) {
		this.alfa = VirusAlfa;
		this.beta = VirusBeta;
		this.gamma = VirusGamma;
		this.delta = VirusDelta;
	}

	// Getters Y setters

    /**
     * Sets alfa.
     *
     * @param VirusAlfa the virus alfa
     */
    public void setAlfa(int VirusAlfa) {
		alfa = VirusAlfa;
	}

    /**
     * Gets alfa.
     *
     * @return the alfa
     */
    public int getAlfa() {
		return alfa;
	}

    /**
     * Sets beta.
     *
     * @param VirusBeta the virus beta
     */
    public void setBeta(int VirusBeta) {
		beta = VirusBeta;
	}

    /**
     * Gets beta.
     *
     * @return the beta
     */
    public int getBeta() {
		return beta;
	}

    /**
     * Sets gamma.
     *
     * @param VirusGamma the virus gamma
     */
    public void setGamma(int VirusGamma) {
		gamma = VirusGamma;
	}

    /**
     * Gets gamma.
     *
     * @return the gamma
     */
    public int getGamma() {
		return gamma;
	}

    /**
     * Sets delta.
     *
     * @param VirusDelta the virus delta
     */
    public void setDelta(int VirusDelta) {
		delta = VirusDelta;
	}

    /**
     * Gets delta.
     *
     * @return the delta
     */
    public int getDelta() {
		return delta;
	}

    /**
     * Sets infected.
     *
     * @param infected the infected
     */
    public void setInfected(boolean infected) {
		this.infected = infected;
	}

    /**
     * Gets infected.
     *
     * @return the infected
     */
    public boolean getInfected() {
		return this.infected;

	}

    /**
     * Aleatorio ciudades inicio string.
     *
     * @return the string
     */
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

			for (int i = 0; i < documento.length(); i++) {
				switch (aleatorioenfermedades) {
				case 0:
					virus.setAlfa(virus.getAlfa() + 1);
				case 1:
					virus.setBeta(virus.getBeta() + 1);
				case 2:
					virus.setGamma(virus.getGamma() + 1);
				case 3:
					virus.setDelta(virus.getDelta() + 1);
				}
			}

			return "La ciudad: " + Arrayciudades[aleatoriociudades] + " sera infectada con el virus: "
					+ Arrayvirus[aleatorioenfermedades];

		} catch (IOException e) {
			System.out.println("error: " + e);
		}

		return null;
	}

	/* Metodo para las ciudades que se infectaran por ronda */

    /**
     * Aleatorio ciudades continuar.
     */
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
}
