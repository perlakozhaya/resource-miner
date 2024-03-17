package modes;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class Custom extends GamePanel{
	private String label = "Custom your own level";
	
	public Custom(){
		super();
		this.setBackground(Color.darkGray);
	}
	
	@Override
	public void startGame() {
//		System.out.println("runing");
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g); // Ensure the panel is properly painted

        // Set font and color for the label
        g.setFont(new Font("Arial", Font.PLAIN, 20));
        g.setColor(Color.WHITE);

        // Calculate the position to center the label
        int labelWidth = g.getFontMetrics().stringWidth(label);
        int x = (getWidth() - labelWidth) / 2;
        int y = getHeight() / 2;

        // Draw the label
        g.drawString(label, x, y);
    }

}
