public class Jugador {

    protected int acciones;
    protected String nombreJugador;
    protected int lvlVacunaRoja = 0;
    protected int lvlVacunaAmarilla = 0;
    protected int lvlVacunaAzul = 0;

    public int getLvlVacunaRoja() {
        return lvlVacunaRoja;
    }

    public void setLvlVacunaRoja(int lvlVacunaRoja) {
        this.lvlVacunaRoja = lvlVacunaRoja;
    }

    public int getLvlVacunaAmarilla() {
        return lvlVacunaAmarilla;
    }

    public void setLvlVacunaAmarilla(int lvlVacunaAmarilla) {
        this.lvlVacunaAmarilla = lvlVacunaAmarilla;
    }

    public int getLvlVacunaAzul() {
        return lvlVacunaAzul;
    }

    public void setLvlVacunaAzul(int lvlVacunaAzul) {
        this.lvlVacunaAzul = lvlVacunaAzul;
    }

    public int getLvlVacunaVerde() {
        return lvlVacunaVerde;
    }

    public void setLvlVacunaVerde(int lvlVacunaVerde) {
        this.lvlVacunaVerde = lvlVacunaVerde;
    }

    protected int lvlVacunaVerde = 0;

    public Jugador() {
        this.acciones = 4;
        this.nombreJugador = nombreJugador;
    }

    public int getAcciones() {
        return acciones;
    }

    public void setAcciones(int acciones) {
        this.acciones = acciones;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public int InvestigarVacunaRoja () {
        lvlVacunaRoja = lvlVacunaRoja +1;
        return lvlVacunaRoja;
    }
    public int InvestigarVacunaAmarilla () {
        lvlVacunaAmarilla = lvlVacunaAmarilla +1;
        return lvlVacunaAmarilla;
    }
    public int InvestigarVacunaAzul () {
        lvlVacunaAzul = lvlVacunaAzul +1;
        return lvlVacunaAzul;
    }
    public int InvestigarVacunaVerde () {
        lvlVacunaVerde = lvlVacunaVerde +1;
        return lvlVacunaVerde;
    }


}
