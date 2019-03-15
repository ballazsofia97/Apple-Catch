package gameState;

import java.awt.*;

public class StateManager {

    /*private GameState[] gameStates;
    private int currentState;

    private Pause pauseState;
    private boolean paused;

    private End endState;
    private boolean gameOver;

    public static final int NUMGAMESTATES = 2;
    public static final int MENU = 0;
    public static final int START = 1;
    public static final int END = -1;

    private void updateState(int state){

        if (state == MENU)
            gameStates[state] = new Menu(this);

        if (state == START)
            gameStates = new Started(this);

    }

    public StateManager(){
        gameStates = new StateManager[NUMGAMESTATES];

        pauseState = new Pause(this);
        paused = false;

        endState = new End(this);
        gameOver = false;

        currentState = MENU;

        updateState(currentState);
    }

    private void unloadState(int state){
        gameStates[state] = null;
    }

    public void setState(int state){
        unloadState(currentState);
        currentState = state;
        updateState(currentState);
    }

    public void setPaused(boolean paused) {
        this.paused = paused;
    }

    public void setGameEnded(boolean gameEnded){
        this.gameOver = gameEnded;
    }

    /*public void setScore(int score){
        endGameState.setScore(score);
    }

    public void update(){
        if(paused){
            pauseState.update();
            return;
        }
        if(gameOver){
            endState.update();
            return;
        }
        if(gameStates[currentState] != null){
            gameStates[currentState].update();
        }
    }

    public void draw(Graphics2D g){
        if(paused){
            pauseState.draw(g);
            return;
        }
        if(gameOver){
            endState.draw(g);
            return;
        }
        if(gameStates[currentState] != null){
            gameStates[currentState].draw(g);
        }else{
            //ez meg nemtom mi
            g.setColor(Color.BLACK);
            g.fillRect(0, 0, GamePanel.WIDTH, GamePanel.HEIGHT);
        }
    }*/
}
