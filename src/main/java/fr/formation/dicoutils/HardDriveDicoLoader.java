package fr.formation.dicoutils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Implémentation de {@link DicoLoader} par lecture sur le disque dur.
 */
public class HardDriveDicoLoader implements DicoLoader {

	/**
	 * {@inheritDoc} Chargement du fichier avec chemin absolu sur le disque dur.
	 */
	@Override
	public String[] loadFile(String path) {
		Collection<String> lines = new ArrayList<>();
		BufferedReader buffer;
		try {
			FileReader reader = new FileReader(path);
			buffer = new BufferedReader(reader);
			// Lecture de la première ligne.
			String line = buffer.readLine();
			while (line != null) {
				lines.add(line);
				// Préparation de la ligne suivante.
				line = buffer.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lines.toArray(new String[0]);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
