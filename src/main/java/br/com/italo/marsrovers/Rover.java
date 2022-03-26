package br.com.italo.marsrovers;

public class Rover {
	
	private Coordinate coordinate;
	
	private Mars mars;
	
	private CardinalPoint direction;
	
	private static final Coordinate[] moveCoordinate = {
			new Coordinate(0, 1),  // N - North
			new Coordinate(1, 0),  // E - East
			new Coordinate(0, -1), // S - South
			new Coordinate(-1, 0)  // W - West
	};
	
	public Rover(int x, int y, String direction, Mars mars) {
		coordinate = new Coordinate(x, y);
		this.direction = CardinalPoint.valueOf(direction);
		this.mars = mars;
	}
	
	public void doAction(char cAction) {
		if (cAction == 'L') {
			turnLeft();
		} else if (cAction == 'R') {
			turnRight();
		} else if (cAction == 'M') {
			move();
		} else {
			throw new IllegalArgumentException("Unexpected value: " + cAction);
		}
	}
	
	private void turnLeft() {
		direction = direction.getLeft();
	}

	private void turnRight() {
		direction = direction.getRight();
	}

	private void move() {
		Coordinate nextCoordinate = new Coordinate(coordinate.row() + moveCoordinate[direction.ordinal()].row(), coordinate.column() + moveCoordinate[direction.ordinal()].column());
		if (mars.isValid(nextCoordinate)) {
			coordinate = nextCoordinate;
		}
	}
	
	public String getStatus() {
		return String.format("%d %d %s", coordinate.row(), coordinate.column(), direction.toString());
	}
	
}
