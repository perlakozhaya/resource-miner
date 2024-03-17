package modes;

import javax.swing.*;

@SuppressWarnings("serial")
public abstract class GamePanel extends JPanel {
	private final static int originalTileSize = 16; // 16 x 16 pixels
	private final static int scale = 3;
	
	private final static int tileSize = originalTileSize * scale; // 48 x 48 pixels
	
	//aspect ratio 3 x 4
	private final static int maxScreenCol = 20;
	private final static int maxScreenRow = 15;
	
	public static final int screenWidth = tileSize * maxScreenCol; // width = 786 pixels
	public static final int screenHeight = tileSize * maxScreenRow; // height = 576 pixels
	
	public GamePanel() {
		this.setDoubleBuffered(true); // improve game rendering performance
	}
	
    public abstract void startGame();
}
