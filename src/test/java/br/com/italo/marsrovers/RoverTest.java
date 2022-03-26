package br.com.italo.marsrovers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class RoverTest {

	@Test
	public void standardInput() {
		Mars mars = new Mars(5, 5);
		Rover rover1 = new Rover(1, 2, "N", mars);
		rover1.doAction('L');
		rover1.doAction('M');
		rover1.doAction('L');
		rover1.doAction('M');
		rover1.doAction('L');
		rover1.doAction('M');
		rover1.doAction('L');
		rover1.doAction('M');
		rover1.doAction('M');
		assertEquals("1 3 N", rover1.getStatus());
		Rover rover2 = new Rover(3, 3, "E", mars);
		rover2.doAction('M');
		rover2.doAction('M');
		rover2.doAction('R');
		rover2.doAction('M');
		rover2.doAction('M');
		rover2.doAction('R');
		rover2.doAction('M');
		rover2.doAction('R');
		rover2.doAction('R');
		rover2.doAction('M');
		assertEquals("5 1 E", rover2.getStatus());
	}
	
	@Test
	public void ifHasInvalidAction() {
		Mars mars = new Mars(5, 5);
		Rover rover1 = new Rover(1, 2, "N", mars);
		Exception exception = assertThrows(IllegalArgumentException.class, () -> rover1.doAction('B'));
		assertEquals("Unexpected value: B", exception.getMessage());
	}
	
	@Test
	public void ifCollides() {
		Mars mars = new Mars(5, 5);
		Rover rover = new Rover(5, 5, "N", mars);
		rover.doAction('M');
		assertEquals("5 5 N", rover.getStatus());
	}
	
}
