package br.com.italo.marsrovers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;
import java.net.URISyntaxException;

import org.junit.jupiter.api.Test;

public class MarsRoversTest {

	@Test
	public void standardInput() throws IOException, URISyntaxException {
		MarsRovers marsRovers = new MarsRovers("inputTest");
    	marsRovers.solveProblem();
	}
	
	@Test
	public void ifHasCollision() throws IOException, URISyntaxException {
		MarsRovers marsRovers = new MarsRovers("inputTest2");
    	marsRovers.solveProblem();
	}
	
	@Test
	public void fileNotFind() {
		Exception exception = assertThrows(IllegalArgumentException.class, () -> new MarsRovers("Non-Existent File"));
		assertEquals("File Not Find: Non-Existent File", exception.getMessage());
	}
	
	
}
