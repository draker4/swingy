package dev.bperriol.swingy;

import java.awt.EventQueue;

import javax.swing.JFrame;

import dev.bperriol.swingy.view.Window;

public class SwingyApplication {

	public static void main(String[] args) {

		// try {
		
			EventQueue.invokeLater(() -> {
				Window window = Window.getInstance();
				window.createWindow();
				window.setVisible(true);
				System.out.println("yess = " + JFrame.getWindows().length);
				window.dispose();
				System.out.println("no = " + JFrame.getWindows().length);
			});

		// }
		// catch (CustomException e) {
		// 	System.err.println(e.getMessage());
		// }
	}

}
