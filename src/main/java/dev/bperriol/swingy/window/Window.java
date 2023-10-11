package dev.bperriol.swingy.window;

// import javax.swing.JButton;
import javax.swing.JFrame;
// import javax.swing.JMenu;
// import javax.swing.JMenuBar;
// import javax.swing.JMenuItem;
// import javax.swing.JPanel;
// import javax.swing.JTextField;

// import java.awt.BorderLayout;
// import java.awt.CardLayout;
// import java.awt.Color;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

public class Window extends JFrame {

	private static final Window INSTANCE = new Window();

	// private JMenuBar menuBar = new JMenuBar();
	// private JMenu menu = new JMenu("File");
	// private JMenu menu2 = new JMenu("Edit");
	// private JMenu menu3 = new JMenu("Help");
	// private JMenuItem menuItem = new JMenuItem("Next Panel");

	private Window() {}
	
	// public void create() {
	// 	setTitle("My RPG Game");
	// 	setSize(400, 300);
	// 	setResizable(true);
	// 	setAlwaysOnTop(true);
	// 	setAutoRequestFocus(true);
	// 	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	// 	setLocationRelativeTo(null);

	// 	CardLayout cardL = new CardLayout();
	// 	JPanel content = new JPanel();

	// 	// add menu
	// 	menuBar.add(menu);
	// 	menuBar.add(menu2);
	// 	menuBar.add(menu3);

	// 	// add listener for sub menu
	// 	menuItem.addActionListener(new ActionListener() {
	// 		@Override
	// 		public void actionPerformed(ActionEvent e) {
	// 			cardL.next(content);
	// 		}
	// 	});

	// 	// add sub menu
	// 	menu.add(menuItem);

	// 	// add menuBar
	// 	setJMenuBar(menuBar);

	// 	// create two panels
	// 	JPanel pan1 = new JPanel();
	// 	JPanel pan2 = new JPanel();

	// 	pan1.add(new JTextField("I am panel 1"));
	// 	pan2.add(new JTextField("I am panel 2"));

	// 	pan1.setBackground(Color.DARK_GRAY);
	// 	pan2.setBackground(Color.GREEN);

	// 	JPanel buttonPanel = new JPanel();


	// 	JButton button = new JButton("Next =>");
	// 	button.addActionListener(new ActionListener() {
	// 		@Override
	// 		public void actionPerformed(ActionEvent e) {
	// 			cardL.next(content);
	// 		}
	// 	});
	// 	buttonPanel.add(button);

	// 	content.setLayout(cardL);

	// 	content.add(pan1);
	// 	content.add(pan2);

	// 	getContentPane().add(buttonPanel, BorderLayout.NORTH);
	// 	getContentPane().add(content, BorderLayout.CENTER);
	// }

	public void create() {
		add(new Board_spaceship());
		// setSize(800, 600);

		setResizable(false);
		pack();

		setTitle("My RPG Game");
		setAlwaysOnTop(true);
		setAutoRequestFocus(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	public static Window getInstance() {
		return INSTANCE;
	}
}
