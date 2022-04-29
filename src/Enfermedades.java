import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.*;
public class Enfermedades {


    //Atributos

    protected int alfa; //Enfermedad roja
    protected int beta; //Enfermedad azul
    protected int delta; //Enfermedad amarilla
    protected int omega; //Enfermedad verde
    protected boolean infected; //Comprobaar si est� enfermo
    //Constructores

    public Enfermedades(int enfermedadRoja, int enfermedadAzul, int enfermedadAmarilla, int enfermedadVerde, boolean infected) {
        this.alfa = enfermedadRoja;
        this.beta = enfermedadAzul;
        this.delta = enfermedadAmarilla;
        this.omega = enfermedadVerde;
        this.infected = infected;
    }

    public Enfermedades() {
        this.alfa = 0;
        this.beta = 0;
        this.delta = 0;
        this.omega = 0;
        this.infected = false;
    }

    //Getters Y setters

    public int getAlfa() {
        return alfa;
    }

    public void setAlfa(int alfa) {
        this.alfa = alfa;
    }

    public int getBeta() {
        return beta;
    }

    public void setBeta(int beta) {
        this.beta = beta;
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    public int getOmega() {
        return omega;
    }

    public void setOmega(int omega) {
        this.omega = omega;
    }

    public boolean getInfected() {
        return this.infected;

    }

    public void setInfected(boolean infected) {
        this.infected = infected;
    }

    //Metodos

    public int InfectarAlfa(String nombreCiudad, boolean infected) {
        System.out.println("�" + nombreCiudad + " ha sido infectada por el virus Alfa!");
        infected = true;
        return alfa + 1;
    }

    public int removerAlfa(String nombreCiudad, boolean infected) {
        System.out.println("�" + nombreCiudad + " se ha removido 1 de infecci�n del virus Alfa!");
        infected = true;
        return alfa - 1;
    }

    public int curarAlfa(String nombreCiudad, boolean infected) {
        System.out.println("�" + nombreCiudad + " se ha curado al completo del virus Alfa!");
        infected = false;
        return alfa = 0;
    }

    public void aleatorios() {

        Random aleatorio1 = new Random();

        int aleatorioVirus = aleatorio1.nextInt(4) + 1;

        Random aleatorio2 = new Random();

        int aleatoriociudades = aleatorio2.nextInt(48 ) + 1;


        String documento = "ciudades.txt";

        String s;

        String[] Arrayciudades = new String[50];

        int cont = 0;

        boolean detector = true;

        try {
            FileReader fr = new FileReader(documento);
            BufferedReader br = new BufferedReader(fr);
            do {
                cont++;
                s = br.readLine();
                if (s != null && cont <= aleatoriociudades) {


                    String[] dividir = s.split(";");

                    Arrayciudades[cont] = dividir[0];
                    
                } else {
                    detector = false;
                }

            } while (detector);
            System.out.println("Numero aleatorio: " + aleatoriociudades);
            System.out.println(Arrayciudades[aleatoriociudades]);
        } catch (IOException e) {
            System.out.println("error");
        }

    }



}



