package main;

import modes.*;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class ModesMenu extends JPanel {
    private JButton runOfTimeButton;
    private JButton iWillSurviveButton;
    private JButton customButton;
    private JButton backButton;

    public ModesMenu(Game game) {
        runOfTimeButton = new JButton("Run of Time");
        iWillSurviveButton = new JButton("I Will Survive"); // for later
        customButton = new JButton("Custom"); // for later
        backButton = new JButton("Back");
        
        //start time mode
        runOfTimeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                game.startGame(new RunOfTime());
            }
        });
        
        //start lives mode
        iWillSurviveButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				game.startGame(new IWillSurvive());
			}
        });
        
        //start custom mode
        customButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				game.startGame(new Custom());
				
			}
        	
        });
        
        //back go start menu
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                game.showStartMenu();
            }
        });
        
        add(runOfTimeButton);
        add(iWillSurviveButton);
        add(customButton);
        add(backButton);
    }
}
