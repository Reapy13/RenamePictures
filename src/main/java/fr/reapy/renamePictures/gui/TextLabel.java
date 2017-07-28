package fr.reapy.renamePictures.gui;

import javax.swing.JLabel;

/**
 * TextLabel of the application.
 * 
 * @author Reapy
 * @version 1.03, 07/28/17
 * @since 1.03
 */
public class TextLabel extends JLabel {

	// Constructors
	
	/**
	 * Default constructor of this class.
	 */
	public TextLabel() {
		super();
	}
	
	/**
	 * Constructor which defines a content for the TextLabel.
	 * 
	 * @param text
	 *           content of the TextLabel
	 */
	public TextLabel(String text) {
		super(text);
	}
}