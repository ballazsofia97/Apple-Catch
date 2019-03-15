package gameState;

import handlers.Keys;

import java.awt.*;

public class End extends GameState{

    private Font font;
    private int score;

    public End(StateManager stateManager){
        super(stateManager);
        font = new Font("Calibri", Font.BOLD, 15);
    }

   /* public void setScore(int score){
        this.score = score;
    }*/

    @Override
    public void init() {
        }

    @Override
    public void draw(Graphics2D g) {
     //picture when the game ended
    }

    @Override
    public void handleInput() {

    }

    @Override
    public void update() {
        handleInput();
    }

    /*@Override
    public void handleInput() {
        if(Keys.isPressed(Keys.SPACE)){
            stateManager.setGameEnded(false);
            stateManager.setState(StateManager.START);
        }
    }*/
}
