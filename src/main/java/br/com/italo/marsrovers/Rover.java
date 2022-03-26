package br.com.italo.marsrovers;

public class Rover {
	
	private Coordinate coordinate;
	
	private Mars map;
	
	private CardinalPoint direction;
	
	private static final int[] moveX = {0, 1, 0, -1};
	private static final int[] moveY = {1, 0, -1, 0};
	
	public Rover(int x, int y, String direction, Mars map) {
		coordinate = new Coordinate(x, y);
		this.direction = CardinalPoint.valueOf(direction);
		this.map = map;
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
		Coordinate nextCoordinate = new Coordinate(coordinate.row() + moveX[direction.ordinal()], coordinate.column() + moveY[direction.ordinal()]);
		if (map.isValid(nextCoordinate)) {
			coordinate = nextCoordinate;
		}
	}
	
	public String getStatus() {
		return String.format("%d %d %s", coordinate.row(), coordinate.column(), direction.toString());
	}
	
}
