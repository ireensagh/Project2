import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ScreenCapture {

	public static void main(String[] args) throws AWTException, IOException {
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    Robot robot = new Robot();
	    BufferedImage image = robot.createScreenCapture(
	    		new Rectangle (
	    		(int) screenSize.getWidth(), 
	    		(int) screenSize.getHeight()
	    		));
	    ImageIO.write(image, "jpeg", new File(System.currentTimeMillis() +
	    		".jpeg"));

	    System.out.println("screen captured!");
	    
	}

}
