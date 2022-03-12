import junit.framework.*;
import java.awt.Color;
import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;

public class TestGhostValidMoves extends TestCase {

	public void testGhostValidMoves() throws FileNotFoundException{
		NoFrame frame = new NoFrame();
		Map map = frame.getMap();
		Ghost ghost = new Ghost("ghost", new Location(1, 1), map);

		//Check validity of valid moves
		ArrayList<Location> validMoves = ghost.get_valid_moves();
		for(Location loc : validMoves) {
			HashSet<Map.Type> types = map.getLoc(loc);
			assertFalse(types.contains(Map.Type.WALL) || types.isEmpty());
		}

		//Check validity of invalid moves
		int[][] directions = {{1,0}, {0,1}, {-1,0}, {0,-1}};
		for(int[] dir : directions) {
			Location possibleLoc = ghost.myLoc.shift(dir[0], dir[1]);
			if(!validMoves.contains(possibleLoc)) {
				HashSet<Map.Type> types = map.getLoc(possibleLoc);
				assertFalse(types.contains(Map.Type.EMPTY) || types.contains(Map.Type.COOKIE) || types.contains(Map.Type.PACMAN) || types.contains(Map.Type.GHOST));
			}
		}
	}
}
