package fr.formation.dicoutils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
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
	public String[] loadFile(InputStream inputStream) {
		Collection<String> lines = new ArrayList<>();
		BufferedReader buffer;
		try {
			Reader reader = new InputStreamReader(inputStream);
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
