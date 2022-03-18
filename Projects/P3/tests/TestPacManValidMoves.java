import junit.framework.*;
import java.awt.Color;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import org.junit.Test;
import static org.junit.Assert.assertFalse;

public class TestPacManValidMoves extends TestCase {

	public void testPacManValidMoves() throws FileNotFoundException{
		NoFrame frame = new NoFrame();
		Map map = frame.getMap();
		PacMan pacman = new PacMan("pacman", new Location(1, 1), map);
		
		//Check validity of valid moves
		ArrayList<Location> validMoves = pacman.get_valid_moves();
		for(Location loc : validMoves) {
			HashSet<Map.Type> types = map.getLoc(loc);
			assertFalse(types.contains(Map.Type.WALL) || types.isEmpty());
		}

		//Check validity of invalid moves
		int[][] directions = {{1,0}, {0,1}, {-1,0}, {0,-1}};
		for(int[] dir : directions) {
			Location possibleLoc = pacman.myLoc.shift(dir[0], dir[1]);
			if(!validMoves.contains(possibleLoc)) {
				HashSet<Map.Type> types = map.getLoc(possibleLoc);
				assertFalse(types.contains(Map.Type.EMPTY) || types.contains(Map.Type.COOKIE) || types.contains(Map.Type.GHOST));
			}
		}
		
	}
}
