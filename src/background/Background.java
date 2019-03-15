package background;

import player.Player;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Background extends JPanel{

    public Image img;

    public Background(){

        try{
            img = ImageIO.read(new File("C:\\Users\\user\\Documents\\Java2\\Projekt1\\src\\background\\Backgroung.png"));
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }

    public void paintComponent(Graphics g)
    {
        g.drawImage(img, 0, 0, null);
    }
}
