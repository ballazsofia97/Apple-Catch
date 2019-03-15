package gameState;

import handlers.Keys;

import java.awt.*;

public class Pause extends GameState{

   private Font font;

   public Pause (StateManager stateManager){

       super(stateManager);

       font = new Font("Calibri", Font.BOLD, 15);
   }

    @Override
    public void init() {
       }

    @Override
    public void update() {

    }

    @Override
    public void draw(Graphics2D g) {
     //what shows when the game is paused
    }

    @Override
    public void handleInput() {

    }

   /* @Override
    public void handleInput() {
        if(Keys.isPressed(Keys.SPACE)){
            stateManager.setPaused(false);
        }
    }*/
}
