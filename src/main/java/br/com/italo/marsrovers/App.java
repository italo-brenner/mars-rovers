package br.com.italo.marsrovers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class App {
	
    public static void main( String[] args ) throws IOException {
    	List<String> lines = Files.readAllLines(Paths.get("input"));
    	for (String line : lines) {
			System.out.println(line);
		}
    }
    
}
