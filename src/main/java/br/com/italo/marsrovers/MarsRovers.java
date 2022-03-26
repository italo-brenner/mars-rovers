package br.com.italo.marsrovers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

public class MarsRovers {
	
	private Integer mapWidth;
	
	private Integer mapHeight;
	
	private Integer x, y;
	
	// N -> 0; E -> 1; S -> 2; W -> 3
	private Integer direction;
	
	private char[] coordenates = {'N', 'E', 'S', 'W'};
	
	private int[] moveX = {0, 1, 0, -1};
	private int[] moveY = {1, 0, -1, 0};
	
	public void solveProblem() throws IOException {
		List<String> lines = Files.readAllLines(Paths.get("input"));
		Iterator<String> iterateLines = lines.iterator();
		setMap(iterateLines.next());
		for (int i = 0; i < 2; i++) {
			setRover(iterateLines.next());
			char[] actions = iterateLines.next().toCharArray();
			for (char action : actions) {
				doAction(action);
			}
			printResult();
		}
	}
	
	private void printResult() {
		System.out.printf("%d %d %c\n", x, y, coordenates[direction]);
	}

	private void setMap(String str) {
		String[] splited = str.split(" ");
		mapWidth = Integer.valueOf(splited[0]);
		mapHeight = Integer.valueOf(splited[1]);
	}
	
	private void setRover(String str) {
		String[] splited = str.split(" ");
		x = Integer.valueOf(splited[0]);
		y = Integer.valueOf(splited[1]);
		direction = setDirection(splited[2].charAt(0));
	}
	
	private Integer setDirection(char cDirection) {
		return switch (cDirection) {
			case 'N' -> 0;
			case 'E' -> 1;
			case 'S' -> 2;
			case 'W' -> 3;
			default -> throw new IllegalArgumentException("Unexpected value: " + cDirection);
		};
	}
	
	private void doAction(char cAction) {
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
		if (--direction < 0) {
			direction = 3;
		}
	}

	private void turnRight() {
		if (++direction > 3) {
			direction = 0;
		}
	}

	private void move() {
		int newX = x + moveX[direction];
		int newY = y + moveY[direction];
		if (isValid(newX, newY)) {
			x = newX;
			y = newY;
		}
	}
	
	private boolean isValid(int newX, int newY) {
		return newX >= 0 && newX <= mapWidth && newY >= 0 && newY <= mapHeight;
	}
	
}
