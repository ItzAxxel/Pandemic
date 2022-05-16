/**
 * The type Usuario.
 */
public class Usuario {
	protected String nombre;
	protected int puntos;

    /**
     * Instantiates a new Usuario.
     */
    public Usuario() {

	}

    /**
     * Instantiates a new Usuario.
     *
     * @param nombre the nombre
     */
    public Usuario(String nombre) {
		super();
		this.nombre = nombre;
	}

    /**
     * Instantiates a new Usuario.
     *
     * @param puntos the puntos
     */
    public Usuario(int puntos) {
		super();
		this.puntos = puntos;

	}

    /**
     * Gets nombre.
     *
     * @return the nombre
     */
    public String getNombre() {
		return nombre;
	}

    /**
     * Sets nombre.
     *
     * @param nombre the nombre
     */
    public void setNombre(String nombre) {
		this.nombre = nombre;
	}

    /**
     * Gets puntos.
     *
     * @return the puntos
     */
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
