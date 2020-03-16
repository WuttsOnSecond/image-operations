import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Grayscale {
	public static void main(String[] args) {
		BufferedImage img = null; 
		
		try {
	           img = ImageIO.read(new File("input.png"));
	       } catch (IOException e) {
	    	   e.printStackTrace();
	       }
		
		int w = img.getWidth();
		int h = img.getHeight();
		
		for (int y = 0; y < w; y++) {
			for (int x = 0; x < h; x++) {
				Color c = new Color(img.getRGB(y, x));
				int r = (int) (c.getRed() * 0.2126);
                int g = (int) (c.getGreen() * 0.7152);
                int b = (int) (c.getBlue() * 0.0722);
                Color newColor = new Color(
                        r + g + b,
                        r + g + b,
                        r + g + b);
                img.setRGB(y, x, newColor.getRGB());
			}
		}
		
		File output = new File("output.png");
		
		try {
			ImageIO.write(img, "png", output);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

