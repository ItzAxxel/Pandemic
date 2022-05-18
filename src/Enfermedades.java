import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * La clase Enfermedades sirve para gestionar las enfermedades
 */
public class Enfermedades {

	// Atributos

	protected int alfa; // Enfermedad roja

	protected int beta; // Enfermedad azul

	protected int delta; // Enfermedad amarilla

	protected int gamma; // Enfermedad verde

	protected boolean infected; // Comprobaar si est� enfermo

	// Constructores

	public Enfermedades() {

	}

	/**
	 * Iniciamos el constructor.
	 *
	 * @param VirusAlfa  el virus alfa
	 * @param VirusBeta  el virus beta
	 * @param VirusGamma el virus gamma
	 * @param VirusDelta el virus delta
	 */
	public Enfermedades(int VirusAlfa, int VirusBeta, int VirusGamma, int VirusDelta) {
		this.alfa = VirusAlfa;
		this.beta = VirusBeta;
		this.gamma = VirusGamma;
		this.delta = VirusDelta;
	}

	// Getters Y setters


	public void setAlfa(int VirusAlfa) {
		alfa = VirusAlfa;
	}


	public int getAlfa() {
		return alfa;
	}


	public void setBeta(int VirusBeta) {
		beta = VirusBeta;
	}


	public int getBeta() {
		return beta;
	}


	public void setGamma(int VirusGamma) {
		gamma = VirusGamma;
	}


	public int getGamma() {
		return gamma;
	}

	public void setDelta(int VirusDelta) {
		delta = VirusDelta;
	}

	public int getDelta() {
		return delta;
	}

	public void setInfected(boolean infected) {
		this.infected = infected;
	}

	public boolean getInfected() {
		return this.infected;

	}


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
