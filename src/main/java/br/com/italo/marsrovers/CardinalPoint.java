package br.com.italo.marsrovers;

public enum CardinalPoint {
	N,
	E,
	S,
	W;
	
	public CardinalPoint getRight() {
		if (ordinal() == values().length - 1) {
			return CardinalPoint.N;
		}
		return values()[ordinal() + 1];
	}
	
	public CardinalPoint getLeft() {
		if (ordinal() == 0) {
			return CardinalPoint.W;
		}
		return values()[ordinal() - 1];
	}
	
}
