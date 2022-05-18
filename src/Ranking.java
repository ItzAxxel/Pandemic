import javax.swing.*;
import java.awt.FontFormatException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.*;
import java.util.Objects;
import java.util.Scanner;

/**
 * La clase ranking sirve para hacer ranking
 */
public class Ranking {

	private static final String USER = "PND_HORRIBLES20";
	private static final String PWD = "JAXS123";
	private static final String URL = "jdbc:oracle:thin:@192.168.3.26:1521:xe";
	private static String nombre;
	private static int puntos;

	static Connection connection = null;


	public Ranking(String nombreUsuario, int Puntos) {
		nombre = nombreUsuario;
		puntos = Puntos;
		connection = makeConnection();

	}


	public Ranking(){

	}

	public static Connection makeConnection() {

		System.out.println("Connecting database...");

		Connection con = null;
		// intentamos la conexion a la base de datos
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(URL, USER, PWD);

			System.out.println("Database connected!");

		} catch (SQLException e) {
			throw new IllegalStateException("Cannot connect the database! ", e);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// devolvemos el valor de la conexion
		return con;
	}

	public static void closeConnection(Connection con) {
		// cierra la conexi�n
		try {
			con.close();

		} catch (SQLException e) {
			System.out.println("Error closing connection!!" + e);

		}
	}

	/**
	 * El insert para poner el usuario dentro del ranking
	 */
	public void insertWithStatement() {

		Usuario nombreusuario = new Usuario(nombre);

		System.out.println(nombreusuario);

		String sql = "INSERT INTO RANKING (nombre, puntosTotales) VALUES ('" + nombreusuario.nombre + "','" + puntos
				+ "')";

		try {
			Statement statement = (Statement) connection.createStatement();
			statement.execute(sql);
			statement.close();

		} catch (SQLException e) {
			System.out.println("The Insert had problems!! " + e);

		}
	}

	/**
	 * Insert para hacer un update en la parte de ranking
	 */
	public void insertWithStatement2() {

		Usuario nombreusuario = new Usuario(nombre);
		
		Usuario puntosusuario = new Usuario(puntos);

		System.out.println(nombreusuario);

		String sql = "UPDATE RANKING SET puntosTotales = '" + puntosusuario.puntos + "'WHERE nombre = '" + nombreusuario.nombre
				+ "'";

		try {
			Statement statement = (Statement) connection.createStatement();
			statement.execute(sql);
			statement.close();

		} catch (SQLException e) {
			System.out.println("The Insert had problems!! " + e);

		}

	}

	/**
	 * Hacemos el select del ranking para mostrarlo.
	 *
	 * @param con devuelve la conexión
	 */
	public static void selectWithStatement(Connection con) {


		String sql = "SELECT nombre, puntostotales FROM RANKING ORDER BY puntostotales DESC";


		Statement st = null;

		try {
			st = con.createStatement();

			ResultSet rs = st.executeQuery(sql);

			while (rs.next())
			{
				String nombre = rs.getString("nombre");
				int puntostotales = rs.getInt("puntostotales");
				System.out.println(" Nombre:" + nombre + " Puntuacion:" + puntostotales);

			}

			st.close();

		} catch (SQLException e) {
			System.out.println("The SELECT had problems!! " + e);

		}
	}


}
