package player;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Player extends JPanel{

    private Image img;

    public Player(){

    try {
       img = ImageIO.read(new File("C:\\Users\\user\\Documents\\Java2\\Projekt1\\player.png"));
       }
       catch (IOException e){
        e.printStackTrace();
       }

       this.setOpaque(false);
    }

    @Override
    public void paint(Graphics g) {
        //super.paint(g);
        g.drawImage(img, 300,300,this);
    }
}
