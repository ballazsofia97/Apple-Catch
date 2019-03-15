package gameState;

import java.awt.*;

public abstract class GameState {

     protected StateManager stateManager;

     public GameState(StateManager stateManager)
     {
         this.stateManager = stateManager;
     }

     public abstract void init();
     public abstract void update();
     public abstract void draw(Graphics2D g);
     public abstract void handleInput();
}
