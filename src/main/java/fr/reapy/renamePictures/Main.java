package fr.reapy.renamePictures;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import fr.reapy.renamePictures.service.FormatPicturesEnumService;
import fr.reapy.renamePictures.service.UtilService;

/**
 * Main class of the software.
 *
 * @author Reapy
 * @version 1.02, 06/20/17
 */
public class Main {

	// Fields

	/**
	 * Path of the directory that contains the pictures to rename.
	 */
	public final static String path = "D:/Pictures/";

	/**
	 * Counts the number of pictures with the same creation date to have a different name for all pictures with the same creation date.
	 */
	private static int id = 1;

	// Methods

	/**
	 * Main method of the software.
	 *
	 * @param args
	 *           not used
	 */
	public static void main(String[] args) {
		/* Opening Pictures directory. */
		File directory = new File(path);

		/* Browsing the files. */
		for (File file : directory.listFiles()) {
			if (!file.isDirectory() && FormatPicturesEnumService.validFormat(UtilService.obtainExtension(file))) {
				/* Getting creation date with the desired format. */
				String date = new SimpleDateFormat("yyyyMMdd_hhmmss").format(new Date(file.lastModified()));

				/* Renaming of the file to the desired format. */
				file.renameTo(new File(path + "IMG_" + date + "_" + id++ + ".jpg"));
			}
		}
	}
}