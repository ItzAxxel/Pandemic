import javax.swing.*;
import java.awt.*;

public class PanelPersonalizado extends JPanel {
    public Image imagen;

    public PanelPersonalizado(Image imagen){
        this.imagen = imagen;
    }

    @Override
    public void paintComponent(Graphics grafica) {

        grafica.drawImage(imagen, 0, 0, this);
    }

}
