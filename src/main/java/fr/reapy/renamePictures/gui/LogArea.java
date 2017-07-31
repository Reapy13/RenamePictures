package fr.reapy.renamePictures.gui;

import javax.swing.JTextArea;

/**
 * TextLabel of the application.
 * 
 * @author Reapy
 * @version 1.03, 07/28/17
 * @since 1.03
 */
public class LogArea extends JTextArea {

	// Constructors

	/**
	 * Default constructor of this class.
	 */
	public LogArea() {
		super();
	}

	/**
	 * Constructor which defines a content for the TextLabel.
	 * 
	 * @param text
	 *           content of the TextLabel
	 */
	public LogArea(String text) {
		super(text);
	}

	// Methods

	/**
	 * Setter of attribute text.
	 * 
	 * @param text
	 *           new text
	 */
	@Override
	public void setText(String text) {
		super.setText(text);
	}

	/**
	 * Adds a String to the Text in the field.
	 * 
	 * @param t
	 *           text to add
	 */
	public void addText(String t) {
		super.setText(super.getText() + "\n" + t);
	}
}