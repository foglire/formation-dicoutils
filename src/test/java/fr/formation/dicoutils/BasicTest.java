package fr.formation.dicoutils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BasicTest {
	private DicoLoader loader;
	private InputStream is;
	
	@Before
	public void initialize() {
		this.loader = new ClasspathDicoLoader();
		this.is = this.getClass().getResourceAsStream("/dictionnaire.txt");		
	}
	
	public void destroy() throws IOException {
		this.is.close();
	}
	@Test
	public void firstTest() {
		Assert.assertNotNull("le fichier n'existe pas", is);
		String [] results = loader.loadFile(is);
		Assert.assertNotNull("lecture du fichier OK", results);
		Assert.assertEquals("le fichier n'a pas le bon nombre de mots", 336532, results.length);
	}
	
	@Test
	public void advancedTest() {
		if (this.is != null) {
			String [] results = loader.loadFile(is);
			Assert.assertThat("test ", Arrays.asList(Arrays.asList(results)), CoreMatchers.hasItem("super"));
		}
	}
}
