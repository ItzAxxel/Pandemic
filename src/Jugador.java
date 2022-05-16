/**
 * The type Jugador.
 */
public class Jugador {

    /**
     * The Acciones.
     */
    protected int acciones;
    /**
     * The Nombre jugador.
     */
    protected String nombreJugador;
    /**
     * The Lvl vacuna roja.
     */
    protected int lvlVacunaRoja = 0;
    /**
     * The Lvl vacuna amarilla.
     */
    protected int lvlVacunaAmarilla = 0;
    /**
     * The Lvl vacuna azul.
     */
    protected int lvlVacunaAzul = 0;
    /**
     * The Puntos.
     */
    protected int puntos = 0;

    /**
     * Gets lvl vacuna roja.
     *
     * @return the lvl vacuna roja
     */
    public int getLvlVacunaRoja() {
		return lvlVacunaRoja;
	}

    /**
     * Sets lvl vacuna roja.
     *
     * @param lvlVacunaRoja the lvl vacuna roja
     */
    public void setLvlVacunaRoja(int lvlVacunaRoja) {
		this.lvlVacunaRoja = lvlVacunaRoja;
	}

    /**
     * Gets lvl vacuna amarilla.
     *
     * @return the lvl vacuna amarilla
     */
    public int getLvlVacunaAmarilla() {
		return lvlVacunaAmarilla;
	}

    /**
     * Sets lvl vacuna amarilla.
     *
     * @param lvlVacunaAmarilla the lvl vacuna amarilla
     */
    public void setLvlVacunaAmarilla(int lvlVacunaAmarilla) {
		this.lvlVacunaAmarilla = lvlVacunaAmarilla;
	}

    /**
     * Gets lvl vacuna azul.
     *
     * @return the lvl vacuna azul
     */
    public int getLvlVacunaAzul() {
		return lvlVacunaAzul;
	}

    /**
     * Sets lvl vacuna azul.
     *
     * @param lvlVacunaAzul the lvl vacuna azul
     */
    public void setLvlVacunaAzul(int lvlVacunaAzul) {
		this.lvlVacunaAzul = lvlVacunaAzul;
	}

    /**
     * Gets lvl vacuna verde.
     *
     * @return the lvl vacuna verde
     */
    public int getLvlVacunaVerde() {
		return lvlVacunaVerde;
	}

    /**
     * Sets lvl vacuna verde.
     *
     * @param lvlVacunaVerde the lvl vacuna verde
     */
    public void setLvlVacunaVerde(int lvlVacunaVerde) {
		this.lvlVacunaVerde = lvlVacunaVerde;
	}

    /**
     * The Lvl vacuna verde.
     */
    protected int lvlVacunaVerde = 0;

    /**
     * Instantiates a new Jugador.
     */
    public Jugador() {
		this.acciones = 4;
		this.nombreJugador = nombreJugador;
	}

    /**
     * Gets acciones.
     *
     * @return the acciones
     */
    public int getAcciones() {
		return acciones;
	}

    /**
     * Sets acciones.
     *
     * @param acciones the acciones
     */
    public void setAcciones(int acciones) {
		this.acciones = acciones;
		if (acciones == 0) {
			MenusDeJuego.instance.textoRonda.setText("RONDA: " + ++MenusDeJuego.instance.ronda);
		}
	}

    /**
     * Gets nombre jugador.
     *
     * @return the nombre jugador
     */
    public String getNombreJugador() {
		return nombreJugador;
	}

    /**
     * Sets nombre jugador.
     *
     * @param nombreJugador the nombre jugador
     */
    public void setNombreJugador(String nombreJugador) {
		this.nombreJugador = nombreJugador;
	}

    /**
     * Investigar vacuna roja int.
     *
     * @return the int
     */
    public int InvestigarVacunaRoja() {
		lvlVacunaRoja = lvlVacunaRoja + 1;
		if (lvlVacunaRoja == 12) {
			setPuntos(puntos++);
		}
		return lvlVacunaRoja;
	}

    /**
     * Investigar vacuna amarilla int.
     *
     * @return the int
     */
    public int InvestigarVacunaAmarilla() {
		lvlVacunaAmarilla = lvlVacunaAmarilla + 1;
		return lvlVacunaAmarilla;
	}

    /**
     * Investigar vacuna azul int.
     *
     * @return the int
     */
    public int InvestigarVacunaAzul() {
		lvlVacunaAzul = lvlVacunaAzul + 1;
		return lvlVacunaAzul;
	}

    /**
     * Investigar vacuna verde int.
     *
     * @return the int
     */
    public int InvestigarVacunaVerde() {
		lvlVacunaVerde = lvlVacunaVerde + 1;
		return lvlVacunaVerde;
	}

    /**
     * Gets puntos.
     *
     * @return the puntos
     */
    public int getPuntos() {
		return puntos;
	}

    /**
     * Sets puntos.
     *
     * @param puntos the puntos
     */
    public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

}
