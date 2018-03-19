package fr.reapy.rename.pictures.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFileChooser;

/**
 * Window browsing the directories to select the directory containing the files to rename.
 * 
 * @author Reapy
 * @version 1.03, 07/28/17
 * @since 1.03
 */
public class BrowsingDirectory extends JFileChooser implements ActionListener {

	// Constructors

	/**
	 * Default constructor of this class. Initializes the path to an empty String.
	 */
	public BrowsingDirectory() {
		super();
	}

	// Methods

	@Override
	public void actionPerformed(ActionEvent e) {
	}
}