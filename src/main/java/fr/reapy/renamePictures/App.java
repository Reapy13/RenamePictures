package fr.reapy.renamePictures;

import java.io.File;
import java.nio.file.Path;

public class App {

	// Fields

	public final static String path = "D:/Pictures";

	private static int counter = 0;

	// Methods

	public static void main(String[] args) {
		/* Ouverture du dossier Pictures. */
		File pictures = new File(path);

		/* Parcours des photos. */
		for (File pictureFile : pictures.listFiles()) {
			if (!pictureFile.isDirectory()) {
				/* Transformation en Path pour récupérer la date de création. */
				Path picturePath = pictureFile.toPath();
				/* try { /* Récupération de la date de création. */
				/* FileTime creationTime = (FileTime) Files.getAttribute(picturePath, "basic:creationTime", LinkOption.NOFOLLOW_LINKS); /* Renommage du fichier en utilisant le File et non le
				 * Path. */
				/* pictureFile.renameTo(new File(path + "/IMG_" + String.valueOf(creationTime.toMillis()) + "_" + String.valueOf(++counter) + ".jpg")); } catch (IOException e) {
				 * e.printStackTrace(); } */
			}
		}
	}
}