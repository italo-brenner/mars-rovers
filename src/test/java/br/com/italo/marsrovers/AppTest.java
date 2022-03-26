package br.com.italo.marsrovers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;
import java.net.URISyntaxException;

import org.junit.jupiter.api.Test;

public class AppTest {
	
	@Test
	public void standardInput() throws IOException, URISyntaxException {
		App.main(new String[] {"inputTest"});
	}
	
	@Test
	public void ifHasCollision() throws IOException, URISyntaxException {
		App.main(new String[] {"inputTest2"});
	}
	
	@Test
	public void fileNotFind() {
		Exception exception = assertThrows(IllegalArgumentException.class, () -> App.main(new String[] {"Non-Existent File"}));
		assertEquals("File Not Find: Non-Existent File", exception.getMessage());
	}
	
}
