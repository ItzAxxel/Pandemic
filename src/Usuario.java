/**
 * La clase usuario sirve para gestionar el nomobre del usuario y los puntos
 */
public class Usuario {

	protected String nombre;

	protected int puntos;

	public Usuario() {

	}

	/**
	 * Iniciamos el constuctor de usuario
	 *
	 * @param nombre el nombre del usuario
	 */
	public Usuario(String nombre) {
		super();
		this.nombre = nombre;
	}

	/**
	 * Iniciamos el constructor de usuario
	 *
	 * @param puntos los puntos
	 */
	public Usuario(int puntos) {
		super();
		this.puntos = puntos;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	
	@Override
	public String toString() {
		return "El usuario se llama " + this.nombre;
	}

}
