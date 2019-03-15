package main;

import background.Background;
import player.Player;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Game{

    //Image background;

  public static void main(String[] args) {

      int HEIGHT = 602;
      int WIDTH = 938;
      Background background = new Background();
      Player player = new Player();
      //player.setBounds(300,300, 100, 100);

      JFrame applecatch = new JFrame("AppleCatch");
      applecatch.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      applecatch.setBounds(0,0,WIDTH,HEIGHT);
      //applecatch.setLayout(null);
      //applecatch.add(new JLabel(new ImageIcon("C:\\Users\\user\\Documents\\Java2\\Projekt1\\src\\background\\Backgroung.png")));
      //background.add(player);
      applecatch.add(background);
      applecatch.add(player);
      //applecatch.setResizable(false)

      player.setOpaque(true);
      background.setOpaque(false);
      applecatch.setVisible(true);
  }

}
