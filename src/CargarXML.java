import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.util.EventObject;
import java.util.Scanner;

/**
 * La clase Cargar XML sirve para cargar los datos del archivo XML
 */
public class CargarXML {

	/**
	 * Editar.
	 *
	 * @param texto                         El texto del xml
	 * @param hijo                          El hijo
	 * @param numCiudadesInfectadasInicio  	El número de ciudades que se infectan en un inicio
	 * @param numCuidadesInfectadasRonda    El número de ciudades que se infectarán por ronda
	 * @param numEnfermedadesActivasDerrota El número de enfermedades activas para la derrota
	 * @param numBrotesDerrota              El número de brotes para la derrota
	 */
	public static void editar(Document texto, Node hijo, String numCiudadesInfectadasInicio,
			String numCuidadesInfectadasRonda, String numEnfermedadesActivasDerrota, String numBrotesDerrota) {

		try {

			Node nodo1 = texto.getElementsByTagName("numCiudadesInfectadasInicio").item(0);

			nodo1.setTextContent(numCiudadesInfectadasInicio);

			Node nodo2 = texto.getElementsByTagName("numCuidadesInfectadasRonda").item(0);

			nodo2.setTextContent(numCuidadesInfectadasRonda);

			Node nodo3 = texto.getElementsByTagName("numEnfermedadesActivasDerrota").item(0);

			nodo3.setTextContent(numEnfermedadesActivasDerrota);

			Node nodo4 = texto.getElementsByTagName("numBrotesDerrota").item(0);

			nodo4.setTextContent(numBrotesDerrota);

			TransformerFactory TF = TransformerFactory.newInstance();

			Transformer T = TF.newTransformer();

			T.transform(new DOMSource(texto), new StreamResult("src/assets/parametros.xml"));

			System.out.println(hijo.getNodeName() + " = " + hijo.getTextContent());

		} catch (TransformerException e) {

			e.printStackTrace();

		}

	}

	/**
	 * Obtener datos xml int [ ].
	 *
	 * @return devuelve el array de int [ ]
	 */
	public int[] ObtenerDatosXML() {
		int[] Datos = new int[4];

		Scanner tec = new Scanner(System.in);

		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();

			Document texto = db.parse(new File("src/assets/parametros.xml"));

			NodeList listaparametros = texto.getElementsByTagName("parametros");

			System.out.println("Parametros actuales: \n");

			for (int i = 0; i < listaparametros.getLength(); i++) {

				Node nodo = listaparametros.item(i);

				if (nodo.getNodeType() == Node.ELEMENT_NODE) {

					Element e = (Element) nodo;
					NodeList hijos = e.getChildNodes();

					for (int j = 0; j < hijos.getLength(); j++) {

						Node hijo = hijos.item(j);

						if (hijo.getNodeType() == Node.ELEMENT_NODE) {
							Element eHijo = (Element) hijo;

							if (hijo.getNodeName() == "numCiudadesInfectadasInicio") {
								Datos[0] = Integer.parseInt(hijo.getTextContent());
							}
							if (hijo.getNodeName() == "numCuidadesInfectadasRonda") {
								Datos[1] = Integer.parseInt(hijo.getTextContent());

							}
							if (hijo.getNodeName() == "numEnfermedadesActivasDerrota") {
								Datos[2] = Integer.parseInt(hijo.getTextContent());
							}
							if (hijo.getNodeName() == "numBrotesDerrota") {
								Datos[3] = Integer.parseInt(hijo.getTextContent());
							}

						}
					}
				}
			}

		} catch (ParserConfigurationException | SAXException | IOException ex) {

		}

		return Datos;
	}


	/**
	 * Pre cargar datos xml.
	 *
	 * @param D1 El primer dato
	 * @param D2 El segundo dato
	 * @param D3 El tercer dato
	 * @param D4 El cuarto dato
	 */
	public void preCargarDatosXML(String D1, String D2, String D3, String D4) {

		String numCiudadesInfectadasInicio = null;

		String numCuidadesInfectadasRonda = null;

		String numEnfermedadesActivasDerrota = null;

		String numBrotesDerrota = null;

		try {

			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();

			Document texto = db.parse(new File("src/assets/parametros.xml"));

			NodeList listaparametros = texto.getElementsByTagName("parametros");

			numCiudadesInfectadasInicio = D1;

			numCuidadesInfectadasRonda = D2;

			numEnfermedadesActivasDerrota = D3;

			numBrotesDerrota = D4;

			for (int i = 0; i < listaparametros.getLength(); i++) {

				Node nodo = listaparametros.item(i);

				if (nodo.getNodeType() == Node.ELEMENT_NODE) {

					Element e = (Element) nodo;
					NodeList hijos = e.getChildNodes();

					for (int j = 0; j < hijos.getLength(); j++) {

						Node hijo = hijos.item(j);

						if (hijo.getNodeType() == Node.ELEMENT_NODE) {
							Element eHijo = (Element) hijo;

							editar(texto, hijo, numCiudadesInfectadasInicio, numCuidadesInfectadasRonda,
									numEnfermedadesActivasDerrota, numBrotesDerrota);

						}

					}
				}
			}

		} catch (ParserConfigurationException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		} catch (SAXException e) {
			throw new RuntimeException(e);
		}
	}

}
