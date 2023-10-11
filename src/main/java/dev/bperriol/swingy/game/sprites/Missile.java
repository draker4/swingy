package dev.bperriol.swingy.game.sprites;

import dev.bperriol.swingy.window.Window;

public class Missile extends Sprite {
	
	private final int MISSILE_SPEED = 2;
	private final int MAX = Window.getInstance().getHeight();

	public Missile(int x, int y) {
		super(x, y);
		initMissile();
	}

	private void initMissile() {
		loadImage("src/resources/missile.png");
		getImageDimensions();
	}

	public void move() {
		x += MISSILE_SPEED;
		if (x > MAX)
			visible = false;
	}
}
