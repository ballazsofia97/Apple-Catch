package handlers;

import java.awt.event.KeyEvent;

public class Keys {

    public static final int NUM_KEYS = 3;

    public static boolean keyState[] = new boolean[NUM_KEYS];
    public static boolean prevKeyState[] = new boolean[NUM_KEYS];

    public static int LEFT;
    public static int RIGHT;
    public static int SPACE;

    public static void keySet(int i, boolean state){
        if(i == KeyEvent.VK_LEFT)
            keyState[LEFT] = state;
        else if(i == KeyEvent.VK_RIGHT)
            keyState[RIGHT] = state;
        else if(i == KeyEvent.VK_SPACE)
            keyState[SPACE] = state;
    }

    public static void update(){
        for(int i = 0; i < NUM_KEYS; i++){
            prevKeyState[i] = keyState[i];
        }
    }

    public static boolean isPressed(int i){
        return keyState[i] && !prevKeyState[i];
    }

    public static boolean anyKeyPress(){
        for(int i = 0; i < NUM_KEYS; i++){
            if(keyState[i])
                return true;
        }
        return false;
    }
}
