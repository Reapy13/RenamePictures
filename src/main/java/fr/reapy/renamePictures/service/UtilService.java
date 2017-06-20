package fr.reapy.renamePictures.service;

import java.io.File;

/**
 * This class provides methods working on files.
 *
 * @author Reapy
 * @version 1.01, 06/20/17
 */
public abstract class UtilService {

	// Methods

	/**
	 * Returns the extension of the file.
	 *
	 * @param file
	 *           File we want to obtain the extension
	 * @return String of the file extension
	 */
	public static String obtainExtension(File file) {
		char[] path = file.getAbsolutePath().toCharArray();
		char[] extension = new char[5];
		int pathSize = path.length;

		try {
			/* Browsing the path from the end to keep the extension. */
			for (int i = pathSize - 1; path[i] != '.'; i--) {
				extension[3 - (pathSize - 1 - i)] = path[i];
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("L'extension fait plus de 4 caractères.");
			e.printStackTrace();
			return "error";
		}

		return new String(extension).trim();
	}
}