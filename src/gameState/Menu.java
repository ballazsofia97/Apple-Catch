package gameState;

import handlers.Keys;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class Menu extends GameState{

    //valahol egy draw string press space to start

    private BufferedImage background;
    private BufferedImage playerFront;


    public Menu(StateManager stateManager)
    {
        super(stateManager);
        try{
            background = ImageIO.read(new File("path"));
        }
        catch (Exception e){ System.out.println("Background image not found"); }

        try{
            playerFront = ImageIO.read(new File("path"));
        }
        catch (Exception e){ System.out.println("Player image not found"); }
    }

    @Override
    public void init() {}

    @Override
    public void update() {
     handleInput();
    }

    @Override
    public void draw(Graphics2D g) {
     //draw the menustate
    }

    @Override
    public void handleInput() {

    }

    /*@Override
    public void handleInput() {
        if(Keys.isPressed(Keys.SPACE){
            StateManager.setState(StateManager.START);
        }
    }*/

}


