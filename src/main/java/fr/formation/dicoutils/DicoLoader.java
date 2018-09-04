package fr.formation.dicoutils;

/**
 * Définition d'une méthode capable de charger un fichier texte.
 */
public interface DicoLoader {

	/**
	 * Lecture ligne par ligne du fichier au chemin donné et renvoi des
	 * informations lues.
	 * 
	 * @param path le chemin vers le fichier à charger.
	 * @return String[] un tableau contenant toutes les lignes du fichier. 
	 */
	public String[] loadFile(String path);
}
