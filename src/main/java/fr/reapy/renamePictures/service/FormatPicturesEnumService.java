package fr.reapy.renamePictures.service;

import fr.reapy.renamePictures.enumeration.FormatPicturesEnum;

/**
 * Service for the FormatPictureEnum.
 *
 * @author Reapy
 * @version 1.01, 06/20/17
 */
public abstract class FormatPicturesEnumService {

	// Methods

	/**
	 * Returns true if the extension is valid, false otherwise.
	 *
	 * @param name
	 *           String of the extension
	 * @return true if the extension is valid, false otherwise
	 */
	public static boolean validFormat(String name) {
		try {
			FormatPicturesEnum.valueOf(name.toUpperCase());
			return true;
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			return false;
		}
	}
}