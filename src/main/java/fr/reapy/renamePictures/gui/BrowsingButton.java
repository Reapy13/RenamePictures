package fr.reapy.renamePictures.gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Browsing button of the application.
 * 
 * @author Reapy
 * @version 1.03, 07/28/17
 * @since 1.03
 */
public class BrowsingButton extends JButton implements ActionListener {

	// Fields

	// Constructors

	public BrowsingButton() {
		super("Parcourir...");
		addActionListener(this);
	}

	// Methods

	@Override
	public void actionPerformed(ActionEvent e) {
		JFrame window = new JFrame();
		BrowsingDirectory fileChooser = new BrowsingDirectory();

		window.setVisible(true);
		window.setSize(600, 600);
		window.setLocationRelativeTo(null);
		window.setLayout(new BorderLayout());
		window.setAlwaysOnTop(true);
		window.getContentPane().add(fileChooser, BorderLayout.CENTER);
	}

	// Getters adn Setters
}