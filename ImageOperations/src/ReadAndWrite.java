import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class ReadAndWrite {
	
	public static void main(String[] args) {
		BufferedImage img = null; 
		
		try {
			   // load image
	           img = ImageIO.read(new File("input.png"));
	       } catch (IOException e) {
	    	   e.printStackTrace();
	       }
		
		File output = new File("output.png");
		
		try {
			// write image
			ImageIO.write(img, "png", output);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
