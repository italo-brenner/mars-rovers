package br.com.italo.marsrovers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.File;
import java.io.IOException;
import java.nio.file.NoSuchFileException;

import org.junit.jupiter.api.Test;

public class AppTest {
	
	@Test
	public void standardInput() throws IOException {
		App.main(new String[] {"src/test/resources/inputTest"});
	}
	
	@Test
	public void ifHasCollision() throws IOException {
		App.main(new String[] {"src/test/resources/inputTest2"});
	}
	
	@Test
	public void fileNotFind() {
		Exception exception = assertThrows(NoSuchFileException.class, () -> App.main(new String[] {"src/test/resources/Non-Existent File"}));
		assertEquals("src" + File.separator + "test" + File.separator + "resources" + File.separator + "Non-Existent File", exception.getMessage());
	}
	
}
