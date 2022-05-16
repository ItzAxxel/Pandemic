public class Usuario {
	protected String nombre;
	protected int puntos;
	public Usuario() {

	}

	public Usuario(String nombre) {
		super();
		this.nombre = nombre;
	}
	
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
