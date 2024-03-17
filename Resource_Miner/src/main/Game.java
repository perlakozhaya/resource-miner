package main;

import modes.GamePanel;

import javax.swing.*;


public class Game {
    private JFrame window;
    
    // game conponents
    private StartMenu startMenu;
    private ModesMenu modesMenu;
    private GamePanel currentPanel;

    public Game() {
        window = new JFrame("Resource Miner"); //create game window with title
        
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit if pressed close window control button

        window.setSize(GamePanel.screenWidth, GamePanel.screenHeight); //set the size of the window, will be changed later
        
        window.setLocationRelativeTo(null); // set the screen in the center 
        
        window.setResizable(false); //unable to maximize and minimize the window screen

        startMenu = new StartMenu(this);
        modesMenu = new ModesMenu(this);

        window.add(startMenu);
    }

    public void start() {
        window.setVisible(true);
    }

    public void showModesMenu() {
        window.getContentPane().removeAll(); // remove all the contents of currentPanel
        window.add(modesMenu);
        window.revalidate(); //update the layout
        window.repaint(); //pain modesMenu 
    }

    public void showStartMenu() {
        window.getContentPane().removeAll();
        window.add(startMenu);
        window.revalidate();
        window.repaint();
    }

    public void startGame(GamePanel gamePanel) {
        window.getContentPane().removeAll();
        window.add(gamePanel);
        window.revalidate();
        window.repaint();
        currentPanel = gamePanel;
        currentPanel.startGame();
    }

    // You can add more methods as needed for managing game flow
}

