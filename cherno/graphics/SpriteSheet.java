package cherno.graphics;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.IOException;

public class SpriteSheet {

	private String path;

	public final int SIZE;
	public int[] pixels;

	//public static SpriteSheet tiles = new SpriteSheet("/textures/spritesheet.png");

	public SpriteSheet (String path, int size) {
		this.path = path;
		this.SIZE = size;
		pixels = new int[SIZE * SIZE];
		load();
	}

	private void load() {
		try {
			BufferedImage image = ImageIO.read(SpriteSheet.class.getResource(path));
			int w = image.getWidth();
			int h = image.getHeight();
			image.getRGB(0, 0, w, h, pixels, 0, w);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}