package fr.reapy.renamePictures;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import fr.reapy.renamePictures.util.FormatEnumUtil;
import fr.reapy.renamePictures.util.FileUtil;

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
	private final static String picturesPath = "C:/Users/hfauchery/Desktop/";

	/**
	 * Path of the directory that contains the videos to rename.
	 */
	//	private final static String videosPath = "D:/Videos/";
	private final static String videosPath = "C:/Users/hfauchery/Desktop/";

	/**
	 *  Date Format for the file name.
	 */
	private final static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd-HHmmss");

	/**
	 * Logger of this class.
	 */
	private final static Logger LOGGER = Logger.getLogger(Main.class.getName());

	// Methods

	/**
	 * Main method of the software.
	 *
	 * @param args
	 *           not used
	 */
	public static void main(String[] args) {
		renamePictures();
		renameVideos();
	}
	
	/**
	 * Rename the pictures.
	 */
	public static void renamePictures() {
		/* Opening pictures directory. */
		File directory = new File(picturesPath);
		
		int id = 1;
		
		/* Browsing the files. */
		for (File file : directory.listFiles()) {
			String extension = FileUtil.obtainExtension(file.getName());
			if (!file.isDirectory() && FormatEnumUtil.validPicturesFormat(extension)) {
				/* Getting creation date with the desired format. */
				String date = dateFormat.format(new Date(file.lastModified()));

				/* Renaming the file to the desired format. */
				file.renameTo(new File(picturesPath + "IMG_" + date + "-" + id++ + "." + extension.toLowerCase()));
				LOGGER.log(Level.INFO, "Renommage du fichier " + file.getName() + ".");
			}
		}
	}
	
	/**
	 * Rename the videos.
	 */
	public static void renameVideos() {
		/* Opening videos directory. */
		File directory = new File(videosPath);

		int id = 1;
		
		/* Browsing the files. */
		for (File file : directory.listFiles()) {
			String extension = FileUtil.obtainExtension(file.getName());
			if (!file.isDirectory() && FormatEnumUtil.validVideosFormat(extension)) {
				/* Getting creation date with the desired format. */
				String date = dateFormat.format(new Date(file.lastModified()));

				/* Renaming the file to the desired format. */
				file.renameTo(new File(videosPath + "IMG_" + date + "-" + id++ + "." + extension.toLowerCase()));
				LOGGER.log(Level.INFO, "Renommage du fichier " + file.getName() + ".");
			}
		}
	}
}