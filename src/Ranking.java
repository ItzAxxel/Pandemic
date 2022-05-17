import java.awt.FontFormatException;
import java.io.IOException;
import java.sql.*;
import java.util.Scanner;

/**
 * The type Ranking.
 */
public class Ranking {

	private static final String USER = "PND_HORRIBLES20";
	private static final String PWD = "JAXS123";
	private static final String URL = "jdbc:oracle:thin:@192.168.3.26:1521:xe";
	private static String nombre;
	private static int puntos;
    /**
     * The Connection.
     */
    static Connection connection = null;

    /**
     * Instantiates a new Ranking.
     *
     * @param nombreUsuario the nombre usuario
     * @param Puntos        the puntos
     */
    public Ranking(String nombreUsuario, int Puntos) {
		nombre = nombreUsuario;
		puntos = Puntos;
		connection = makeConnection();

	}

    /**
     * Make connection connection.
     *
     * @return the connection
     */
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

    /**
     * Close connection.
     *
     * @param con the con
     */
    public static void closeConnection(Connection con) {
		// cierra la conexi�n
		try {
			con.close();

		} catch (SQLException e) {
			System.out.println("Error closing connection!!" + e);

		}
	}

    /**
     * Insert with statement.
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
     * Insert with statement 2.
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

	/*public void insertWithStatement3() {



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

	}*/

}
