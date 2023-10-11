package dev.bperriol.swingy.game.sprites;

public class Alien extends Sprite {
	
	private final int INITIAL_X = 1000;

	public Alien(int x, int y) {
		super(x, y);
		initAlien();
	}

	private void initAlien() {
		loadImage("src/resources/alien.png");
		getImageDimensions();
	}

	public void move() {
		if (x < 1) {
			x = INITIAL_X;
		}

		x -= 1;
	}
}
