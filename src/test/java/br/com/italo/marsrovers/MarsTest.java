package br.com.italo.marsrovers;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MarsTest {
	
	@Test
	public void ifValidSquare() {
		Mars mars = new Mars(5, 5);
		assertTrue(mars.isValid(new Coordinate(3, 3)));
	}
	
	@Test
	public void checkCollisionOnTop() {
		Mars mars = new Mars(5, 5);
		assertFalse(mars.isValid(new Coordinate(3, -1)));
	}

	@Test
	public void checkCollisionOnRight() {
		Mars mars = new Mars(5, 5);
		assertFalse(mars.isValid(new Coordinate(6, 3)));
	}
	
	@Test
	public void checkCollisionOnBottom() {
		Mars mars = new Mars(5, 5);
		assertFalse(mars.isValid(new Coordinate(3, 6)));
	}

	@Test
	public void checkCollisionOnLeft() {
		Mars mars = new Mars(5, 5);
		assertFalse(mars.isValid(new Coordinate(-1, 3)));
	}
	
}
