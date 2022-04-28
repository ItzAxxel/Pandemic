import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Ciudad {

    //Atributos
    protected String nombreCiudad;
    protected String ciudadesColindantes;
    protected int virusRojo;
    protected int virusAmarillo;
    protected int virusAzul;
    protected int virusVerde;
    protected int coordenadaX;
    protected int coordenadaY;

    //Constructor

    public Ciudad(String nombreCiudad, String ciudadesColindantes, int virusAmarillo, int virusRojo, int virusVerde, int virusAzul, int coordenadaX, int coordenadaY){
        this.nombreCiudad = nombreCiudad;
        this.ciudadesColindantes = ciudadesColindantes;
        this.virusAmarillo = virusAmarillo;
        this.virusRojo = virusRojo;
        this.virusVerde = virusVerde;
        this.virusAzul = virusAzul;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }

    //Gett y setter

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public String getCiudadesColindantes() {
        return ciudadesColindantes;
    }

    public void setCiudadesColindantes(String ciudadesColindantes) {
        this.ciudadesColindantes = ciudadesColindantes;
    }

    public int getVirusRojo() {
        return virusRojo;
    }

    public void setVirusRojo(int virusRojo) {
        this.virusRojo = virusRojo;
    }

    public int getVirusAmarillo() {
        return virusAmarillo;
    }

    public void setVirusAmarillo(int virusAmarillo) {
        this.virusAmarillo = virusAmarillo;
    }

    public int getVirusAzul() {
        return virusAzul;
    }

    public void setVirusAzul(int virusAzul) {
        this.virusAzul = virusAzul;
    }

    public int getVirusVerde() {
        return virusVerde;
    }

    public void setVirusVerde(int virusVerde) {
        this.virusVerde = virusVerde;
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    //Métodos




}
