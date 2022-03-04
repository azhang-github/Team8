import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestGhostInRange extends TestCase {

	public void testGhostInRange() throws FileNotFoundException{

		/* in range */
		int[][] inRange = {{3, 2}, {3, 4}, {2, 3}, {4, 3}};
		for (int[] r : inRange) {
			Map map = new Map(5);
			PacMan pacman = new PacMan("pac", new Location(3, 3), map);

			map.add("G", new Location(r[0], r[1]), null, Map.Type.GHOST);
			assertTrue(pacman.is_ghost_in_range());
		}

		/* not in range */
		int[][] notInRange = {{2, 2}, {3, 3}, {2, 4}, {4, 2}, {0, 0}, {4, 4}};
		for (int[] r : inRange) {
			Map map = new Map(5);
			PacMan pacman = new PacMan("pac", new Location(3, 3), map);

			map.add("G", new Location(r[0], r[1]), null, Map.Type.GHOST);
			assertFalse(pacman.is_ghost_in_range());
		}
	}
}

