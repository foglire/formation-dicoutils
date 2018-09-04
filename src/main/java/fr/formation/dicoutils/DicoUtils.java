package fr.formation.dicoutils;

import java.util.Scanner;

import org.apache.log4j.Logger;

/**
 * Classe principale de l'application comportant le point d'entrée (méthode
 * statique main) et la méthode d'exécution des traitements (run).
 */
public class DicoUtils implements Runnable {

	/**
	 * Déclaration du logger associé à cette classe.
	 */
	private static final Logger LOG = Logger.getLogger(DicoUtils.class);

	/**
	 * Point d'entrée de l'application. Création d'une instance et appel de la
	 * méthode qui lance les traitements.
	 * 
	 * @param args
	 *            les arguments du programme.
	 */
	public static void main(String[] args) {
		LOG.debug("Lancement du programme !");
		new DicoUtils().run();
	}

	private final Scanner scanner;
	private final DicoLoader loader;
	private String[] words;

	public DicoUtils() {
		this.scanner = new Scanner(System.in);
		this.loader = new ClasspathDicoLoader();
	}

	@Override
	public void run() {
		LOG.debug("Exécution de la méthode run !");
		String action = null;
		this.words = this.readDico();
		LOG.debug("Nombre de mots dans le dictionnaire : "
				+ this.words.length);
		while (!"exit".equals(action)) {
			this.displayMenu();
			action = this.readAction();
			switch (action) {
			case "A":
				LOG.info("Vous avez choisi l'action A");
				break;
			case "B":
				LOG.info("Vous avez choisi l'action B");
				break;
			case "exit":
				break;
			default:
				LOG.error("L'action '" + action + "' n'est pas reconnue.");
			}
		}
	}

	private String[] readDico() {
		return this.loader.loadFile("./dictionnaire.txt");
	}

	/**
	 * Méthode permettant d'afficher le menu.
	 */
	private void displayMenu() {
		LOG.info("Menu :");
		LOG.info("\tA - Chercher un mot exact");
		LOG.info("\tB - Chercher par le début d'un mot");
		LOG.info("\texit - Quitter l'application");
	}

	/**
	 * Méthode permettant de lire une saisie utilisateur.
	 */
	private String readAction() {
		String result = null;
		while (result == null) {
			String input = this.scanner.nextLine();
			if (input.length() > 0 && input.matches("A|B|exit")) {
				result = input;
			} else {
				LOG.error("L'action saisie n'est pas valide, "
						+ "veuillez choisir une action du menu.");
			}
		}
		return result;
	}

}
