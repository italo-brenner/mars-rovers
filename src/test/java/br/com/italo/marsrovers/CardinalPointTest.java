package br.com.italo.marsrovers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CardinalPointTest {
	
	@Test
	public void ifTurnedToLeft() {
		CardinalPoint south = CardinalPoint.W.getLeft();
		assertEquals(CardinalPoint.S, south);
	}

	@Test
	public void ifTurnedToRight() {
		CardinalPoint south = CardinalPoint.E.getRight();
		assertEquals(CardinalPoint.S, south);
	}
	
	@Test
	public void if360ToLeft() {
		CardinalPoint cardinalPoint = CardinalPoint.N;
		for (int i = 0; i < 4; i++) {
			cardinalPoint = cardinalPoint.getLeft();
		}
		assertEquals(CardinalPoint.N, cardinalPoint);
	}

	@Test
	public void if360ToRight() {
		CardinalPoint cardinalPoint = CardinalPoint.N;
		for (int i = 0; i < 4; i++) {
			cardinalPoint = cardinalPoint.getRight();
		}
		assertEquals(CardinalPoint.N, cardinalPoint);
	}
	
}
