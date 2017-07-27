package fr.reapy.renamePictures.util;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class provides methods working on files.
 *
 * @author Reapy
 * @version 1.02, 07/27/17
 */
public abstract class FileUtil {
	
	// Fields
	
	/**
	 * Logger of this class.
	 */
	private final static Logger LOGGER = Logger.getLogger(FileUtil.class.getName());

	// Methods

	/**
	 * Returns the extension of the file.
	 *
	 * @param file
	 *           File we want to obtain the extension
	 * @return String of the file extension
	 */
	public static String obtainExtension(String fileName) {
		final int extensionSize = 5;
		char[] fileNameChars = fileName.toCharArray();
		char[] extension = new char[extensionSize];
		int fileNameSize = fileNameChars.length - 1;

		try {
			/* Browsing the path from the end to keep the extension. */
			for (int i = fileNameSize; fileNameChars[i] != '.'; i--) {
				/* The path is browsing from the end, the extension is adding by the end too. It doesn't matter if the char[] is not full, the return has no spaces before and after the String. */
				extension[extensionSize - (fileNameSize + 1 - i)] = fileNameChars[i];
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			LOGGER.log(Level.INFO, "L'extension du fichier " + fileName + " comporte plus de 5 caractères.");
			return "error";
		}

		return new String(extension).trim();
	}
}