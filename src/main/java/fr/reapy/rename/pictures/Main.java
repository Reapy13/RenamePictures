package fr.reapy.rename.pictures;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import fr.reapy.rename.pictures.gui.Window;
import fr.reapy.rename.pictures.util.FileUtil;
import fr.reapy.rename.pictures.util.FormatEnumUtil;

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
	private final static String PICTURES_PATH = "C:/Users/hfauchery/Desktop/";

	/**
	 * Path of the directory that contains the videos to rename.
	 */
	//	private final static String videosPath = "D:/Videos/";
	private final static String VIDEOS_PATH = "C:/Users/hfauchery/Desktop/";

	/**
	 *  Date Format for the file name.
	 */
	private final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyyMMdd-HHmmss");

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
		Window window = new Window();
//		renamePictures();
//		renameVideos();
	}
	
	/**
	 * Rename the pictures.
	 */
	public void renamePictures() {
		/* Opening pictures directory. */
		File directory = new File(PICTURES_PATH);
		
		int id = 1;
		
		/* Browsing the files. */
		for (File file : directory.listFiles()) {
			String extension = FileUtil.obtainExtension(file.getName());
			if (!file.isDirectory() && FormatEnumUtil.validPicturesFormat(extension)) {
				/* Getting creation date with the desired format. */
				String date = DATE_FORMAT.format(new Date(file.lastModified()));

				/* Renaming the file to the desired format. */
				boolean hasSuccedded = file.renameTo(new File(PICTURES_PATH + "IMG_" + date + "-" + id++ + "." + extension.toLowerCase()));
				
				if (!hasSuccedded) {
					LOGGER.warning("The file " + file.getPath() + " has not been renamed.");
				}
				
				LOGGER.log(Level.INFO, "Renommage du fichier " + file.getName() + ".");
			}
		}
	}
	
	/**
	 * Rename the videos.
	 */
	public void renameVideos() {
		/* Opening videos directory. */
		File directory = new File(VIDEOS_PATH);

		int id = 1;
		
		/* Browsing the files. */
		for (File file : directory.listFiles()) {
			String extension = FileUtil.obtainExtension(file.getName());
			if (!file.isDirectory() && FormatEnumUtil.validVideosFormat(extension)) {
				/* Getting creation date with the desired format. */
				String date = DATE_FORMAT.format(new Date(file.lastModified()));

				/* Renaming the file to the desired format. */
				file.renameTo(new File(VIDEOS_PATH + "IMG_" + date + "-" + id++ + "." + extension.toLowerCase()));
				LOGGER.log(Level.INFO, "Renommage du fichier " + file.getName() + ".");
			}
		}
	}
}