import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;

public class Menu extends JFrame{

    private JPanel MenuPrincipal;
    private JPanel MenuRaiz;
    private JButton NuevaPartida;
    private JButton Informacion;
    private JButton Salir;
    private JPanel Card;
    private JButton Atras;
    private JButton Autores;
    private JButton ComoJugar;
    private JPanel Grid;
    private JButton CargarPartida;
    private JButton Ranking;
    private JPanel Información;
    private JPanel MenuComoJugar;
    private JButton Atras_2;
    private CardLayout Capas;
    private CardLayout CapasRaiz;


    public Menu() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        setMinimumSize(new Dimension(1920, 1080));
        setVisible(true);
        add(MenuRaiz);
        Capas = (CardLayout) Card.getLayout();
        CapasRaiz = (CardLayout) MenuRaiz.getLayout();


        // Se obtiene un Clip de sonido
        Clip sonido = AudioSystem.getClip();

        // Se carga con un fichero wav
        sonido.open(AudioSystem.getAudioInputStream(new File("assets/Sounds/OST.wav")));

        // Comienza la reproducción
        sonido.start();


        ////////////////// Hover //////////////////


        NuevaPartida.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                NuevaPartida.setIcon(new ImageIcon("assets/Botones/Botón Nueva Partida.png"));
            }
        });



        ////////////////// Funcionalidad //////////////////


        // Botón Información

        Informacion.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Capas.show(Card,"Informacion");

            }

        });


        // Botón salir

        Salir.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.exit(0);
                sonido.close();
            }

        });

        // Botón Como Jugar
        ComoJugar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                CapasRaiz.show(MenuRaiz,"MenuComoJugar");

            }
        });

        // Botón Atrás

        Atras.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Capas.show(Card,"MenuPrincipal");
            }
        });

        Atras_2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Capas.show(Card,"Informacion");
            }
        });
       /* Atras_2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                CapasRaiz.show(MenuRaiz,"Informacion");
            }
        });*/

        //Botón Autores

        Autores.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Capas.show(Card,"Card3");

            }
        });


        Atras_2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Capas.show(Card,"Informacion");
            }
        });
    }

    // Imagenes

    private void createUIComponents() {
        MenuPrincipal = new PanelPersonalizado(getToolkit().createImage("assets/Pantalla_Menu.png"));
        MenuComoJugar = new PanelPersonalizado(getToolkit().createImage("assets/Pantalla_Reglas.png"));
    }
}
