package main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class StartMenu extends JPanel {
    private JButton startButton;
    private JButton marketplaceButton;
    private JButton settingsButton;
    private JButton exitButton;

    public StartMenu(Game game) {
        startButton = new JButton("Start");
        marketplaceButton = new JButton("Marketplace"); //for later
        settingsButton = new JButton("Settings"); // for later
        exitButton = new JButton("Exit");
        
        //display game modes
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                game.showModesMenu();
            }
        });

        //exit the game
        exitButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
        });

        add(startButton);
        add(marketplaceButton);
        add(settingsButton);
        add(exitButton);
    }
}

