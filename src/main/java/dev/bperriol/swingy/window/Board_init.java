package dev.bperriol.swingy.window;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Board_init extends JPanel{
	
	private Image image;

	public Board_init() {
		initBoard();
	}

	private void initBoard() {

		loadImage();

		int w = image.getWidth(this);
		int h = image.getHeight(this);
		setPreferredSize(new Dimension(w, h));
	}

	private void loadImage() {
		ImageIcon ii = new ImageIcon("src/resources/wallpaper.png");
		image = ii.getImage();
	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(image, 0, 0, null);
	}
}
