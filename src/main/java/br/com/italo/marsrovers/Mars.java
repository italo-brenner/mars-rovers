package br.com.italo.marsrovers;

public class Mars {
	
	private int width;
	
	private int height;
	
	public Mars(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public boolean isValid(Coordinate coordinate) {
		return coordinate.row() >= 0 && coordinate.row() <= width && coordinate.column() >= 0 && coordinate.column() <= height;
	}
	
}
