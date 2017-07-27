package fr.reapy.renamePictures.service;

import fr.reapy.renamePictures.enumeration.FormatPicturesEnum;
import fr.reapy.renamePictures.enumeration.FormatVideosEnum;

/**
 * Service for the FormatEnumeration.
 *
 * @author Reapy
 * @version 1.02, 07/27/17
 */
public abstract class FormatEnumService {

	// Methods

	/**
	 * Returns true if the extension is valid, false otherwise.
	 *
	 * @param name
	 *           String of the extension
	 * @return true if the extension is valid, false otherwise
	 */
	public static boolean validPicturesFormat(String name) {
		try {
			FormatPicturesEnum.valueOf(name.toUpperCase());
			return true;
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * Returns true if the extension is valid, false otherwise.
	 * 
	 * @param name
	 *           String of the extension
	 * @return true if the extension is valid, false otherwise.
	 * @since 1.02
	 */
	public static boolean validVideosFormat(String name) {
		try {
			FormatVideosEnum.valueOf(name.toUpperCase());
			return true;
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			return false;
		}
	}
}