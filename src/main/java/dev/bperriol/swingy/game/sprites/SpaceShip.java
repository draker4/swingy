package dev.bperriol.swingy.game.sprites;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import dev.bperriol.swingy.window.Window;

public class SpaceShip extends Sprite {
	
	private int dx;
	private int dy;
	private List<Missile> missiles;
	private long lastFireTime = 0;

	public SpaceShip(int x, int y) {
		super(x, y);
		initSpaceShip();
	}

	private void initSpaceShip() {
		missiles = new ArrayList<>();
		loadImage("src/resources/spaceship.png");
		getImageDimensions();
	}

	public void move(Set<Integer> pressedKeys) {
		if (pressedKeys.contains(KeyEvent.VK_LEFT)) {
			dx = -2;
		}
		if (pressedKeys.contains(KeyEvent.VK_RIGHT)) {
			dx = 2;
		}
		if (pressedKeys.contains(KeyEvent.VK_UP)) {
			dy = -2;
		}
		if (pressedKeys.contains(KeyEvent.VK_DOWN)) {
			dy = 2;
		}
		if (pressedKeys.contains(KeyEvent.VK_SPACE)) {
			fire();
		}
		x += dx;
		y += dy;

		if (x < 1)
			x = 1;
		else if (x > Window.getInstance().getWidth() - width * 3)
			x = Window.getInstance().getWidth() - width * 3;
		if (y < 1)
			y = 1;
		else if (y > Window.getInstance().getHeight() - height * 2 - 1)
			y = Window.getInstance().getHeight() - height * 2 - 1;
	}
	
	public List<Missile> getMissiles() {
		return missiles;
	}

	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();

		switch(key) {
			case KeyEvent.VK_LEFT:
				dx = 0;
				break;
			case KeyEvent.VK_RIGHT:
				dx = 0;
				break;
			case KeyEvent.VK_UP:
				dy = 0;
				break;
			case KeyEvent.VK_DOWN:
				dy = 0;
				break;
		}
	}

	public void fire() {
		long currentTime = System.currentTimeMillis();

		if (currentTime - lastFireTime >= 500) {
			missiles.add(new Missile(x + width, y + height / 4));
			lastFireTime = currentTime;
		}
	}
}
