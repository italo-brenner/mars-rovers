package br.com.italo.marsrovers;

import java.io.IOException;
import java.net.URISyntaxException;

public class App {
	
    public static void main( String[] args ) throws IOException, URISyntaxException {
    	MarsRovers marsRovers;
    	if (args != null && args.length != 0) {
    		marsRovers = new MarsRovers(args[0]);
    	} else {
    		marsRovers = new MarsRovers();
    	}
    	marsRovers.solveProblem();
    }
    
}
