import java.sql.*;
import java.util.Scanner;

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
		// cierra la conexión
		try {
			con.close();

		} catch (SQLException e) {
			System.out.println("Error closing connection!!" + e);

		}
	}

	public void insertWithStatement() {

		Usuario nombreusuario = new Usuario(nombre);

		Jugador puntosjugador = new Jugador();

		String sql = "INSERT INTO RANKING (nombre, puntosTotales) VALUES ('" + nombreusuario.nombre + "','"
				+ puntosjugador.puntos + "')";

		try {
			Statement statement = (Statement) connection.createStatement();
			statement.execute(sql);
			statement.close();

		} catch (SQLException e) {
			System.out.println("The Insert had problems!! " + e);

		}
	}

}
