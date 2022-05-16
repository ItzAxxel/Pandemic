import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * The type Guardar partida.
 */
public class GuardarPartida {
	private static final String USER = "PND_HORRIBLES20";
	private static final String PWD = "JAXS123";
	private static final String URL = "jdbc:oracle:thin:@192.168.3.26:1521:xe";
	private static String nombre;
	protected static int puntos;
	protected static int rondas;
    /**
     * The Connection.
     */
    static Connection connection = null;

    /**
     * Instantiates a new Guardar partida.
     *
     * @param nombreUsuario the nombre usuario
     * @param Puntos        the puntos
     * @param Rondas        the rondas
     */
    public GuardarPartida(String nombreUsuario, int Puntos, int Rondas) {
		nombre = nombreUsuario;
		puntos = Puntos;
		rondas = Rondas;
		connection = makeConnection();

	}

	public static int getPuntos() {
		return puntos;
	}

	public static void setPuntos(int puntos) {
		GuardarPartida.puntos = puntos;
	}

	public static int getRondas() {
		return rondas;
	}

	public static void setRondas(int rondas) {
		GuardarPartida.rondas = rondas;
	}

	public GuardarPartida() {

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

		String sql = "INSERT INTO guardarPartida (nombre_jugador, rondas, puntos) VALUES ('" + nombreusuario.nombre
				+ "','" + rondas + "','" + puntos + "')";

		try {
			Statement statement = (Statement) connection.createStatement();
			statement.execute(sql);
			statement.close();

		} catch (SQLException e) {
			System.out.println("The Insert had problems!! " + e);

		}
	}

}
