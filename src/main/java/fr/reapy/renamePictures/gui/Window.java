package fr.reapy.renamePictures.gui;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 * Window of the application.
 * 
 * @author Reapy
 * @version 1.03, 07/28/17
 * @since 1.03
 */
public class Window extends JFrame {
	
	// Classes
	
	class BrowsingButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
	}

	// Fields
	
	/**
	 * Width of the application window.
	 */
	private final static int width = 600;

	/**
	 * Height of the application window.
	 */
	private final static int height = 600;
	
	/**
	 * Title of the application window.
	 */
	private final static String title = "renamePictures";
	
	/**
	 * 
	 */
	private BrowsingButton browsingButton;
	
	/**
	 * Panel for the logs.
	 */
	private TextPanel logTextPanel;
	
	/**
	 * First log.
	 */
	private TextLabel logTextLabel1;
	
	/**
	 * Second log.
	 */
	private TextLabel logTextLabel2;
	
	// Constructors

	/**
	 * Default constructor of this class.
	 */
	public Window() {
		super(title);
		
		/* Components declaration. */
		GridBagLayout gbl = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		browsingButton = new BrowsingButton();
		logTextPanel = new TextPanel();
		logTextLabel1 = new TextLabel("Log 1 : Bon");
		logTextLabel2 = new TextLabel("Log 2 : Tres bon.");

		/* Window properties. */
		this.setVisible(true);
		this.setSize(width, height);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(gbl);
		
		browsingButton.setVisible(true);

		logTextPanel.setPreferredSize(new Dimension(560, 100));
		logTextPanel.setLayout(new GridLayout(3, 1));

		/* Adding components to the window. */
		logTextPanel.add(logTextLabel1);
		logTextPanel.add(logTextLabel2);
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weighty = 100;
		gbc.fill = GridBagConstraints.REMAINDER;
		this.getContentPane().add(browsingButton, gbc);
		
		gbc.gridy = 1;
		gbc.weighty = 5;
		this.getContentPane().add(logTextPanel, gbc);
	}

	// Methods

	// Getters and Setters

}