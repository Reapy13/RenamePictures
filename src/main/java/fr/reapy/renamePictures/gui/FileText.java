package fr.reapy.renamePictures.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

/**
 * Text field to show the selected file.
 * 
 * @author Reapy
 *	@version 1.03, 07/28/17
 * @since 1.03
 */
public class FileText extends JTextField implements ActionListener {

	// Constructor
	
	public FileText() {
		super();
	}
	
	// Methods
	
	@Override
	public void actionPerformed(ActionEvent e) {
		setText(e.paramString());
	}
}