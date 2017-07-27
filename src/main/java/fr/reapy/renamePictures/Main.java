package fr.reapy.renamePictures;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import fr.reapy.renamePictures.service.FormatEnumService;
import fr.reapy.renamePictures.service.UtilService;

/**
 * Main class of the software.
 *
 * @author Reapy
 * @version 1.02, 07/27/17
 */
public class Main {

	// Fields

	/**
	 * Path of the directory that contains the pictures to rename.
	 */
//	private final static String picturesPath = "D:/Pictures/";
	private final static String picturesPath = "C:/Users/hfauchery/Desktop";
	
	/**
	 * Path of the directory that contains the videos to rename.
	 */
//	private final static String videosPath = "D:/Videos/";
	private final static String videosPath = "C:/Users/hfauchery/Desktop";

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
		/* Opening pictures directory. */
		File directory = new File(picturesPath);

		/* Date Format for the name. */
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd_HHmmss");
		
		/* Browsing the files. */
		for (File file : directory.listFiles()) {
			String extension = UtilService.obtainExtension(file);
			if (!file.isDirectory() && FormatEnumService.validPicturesFormat(extension)) {
				/* Getting creation date with the desired format. */
				String date = sdf.format(new Date(file.lastModified()));

				/* Renaming the file to the desired format. */
				file.renameTo(new File(picturesPath + "IMG_" + date + "-" + id++ + "." + extension.toLowerCase()));
			}
		}
		
		/* Opening videos directory. */
		directory = new File(videosPath);
		
		/* Browsing the files. */
		for (File file : directory.listFiles()) {
			String extension = UtilService.obtainExtension(file);
			if (!file.isDirectory() && FormatEnumService.validVideosFormat(extension)) {
				/* Getting creation date with the desired format. */
				String date = sdf.format(new Date(file.lastModified()));
			
				/* Renaming the file to the desired format. */
				file.renameTo(new File(videosPath + "IMG_" + date + "-" + id++ + "." + extension.toLowerCase()));
			}
		}
	}
}