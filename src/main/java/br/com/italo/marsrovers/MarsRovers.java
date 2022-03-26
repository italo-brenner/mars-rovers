package br.com.italo.marsrovers;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

public class MarsRovers {

	private Mars mars;
	
	public void solveProblem() throws IOException, URISyntaxException {
		List<String> lines = Files.readAllLines(Paths.get(ClassLoader.getSystemResource("input").toURI()));
		Iterator<String> iterateLines = lines.iterator();
		initializeMars(iterateLines.next());
		for (int i = 0; i < 2; i++) {
			Rover rover = createRover(iterateLines.next());
			char[] actions = iterateLines.next().toCharArray();
			for (char action : actions) {
				rover.doAction(action);
			}
			System.out.println(rover.getStatus());
		}
	}

	private void initializeMars(String str) {
		String[] splited = str.split(" ");
		mars = new Mars(Integer.valueOf(splited[0]), Integer.valueOf(splited[1]));
	}
	
	private Rover createRover(String str) {
		String[] splited = str.split(" ");
		return new Rover(Integer.valueOf(splited[0]), Integer.valueOf(splited[1]), splited[2], mars);
	}
	
}
