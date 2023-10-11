package dev.bperriol.swingy.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Window extends JFrame {
	
	private final static Window INSTANCE = new Window();

	private Window() {}

	public static Window getInstance() {
		return INSTANCE;
	}

	public void createWindow() {

		// add board game
		// add(new Board_spaceship());
		// setSize(800, 600);

		setResizable(false);
		pack();

		setTitle("My RPG Game");
		setAlwaysOnTop(true);
		setAutoRequestFocus(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		this.addWindowListener(new java.awt.event.WindowAdapter() {
			@Override
			public void windowClosing(java.awt.event.WindowEvent e) {
				if (
					JOptionPane.showConfirmDialog(
					Window.this,
					"Do you want to continue in console mode?",
					"Confirmation",
					JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION
				) {
					System.out.print("Continue in console mode please!");
				}
			}
		});
	}
}
