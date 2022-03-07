import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestAttack extends TestCase {

	public void testAttack() throws FileNotFoundException{
		/* in range */
		int[][] inRange = {{3, 2}, {3, 4}, {2, 3}, {4, 3}};
		for (int[] r : inRange) {
			Map map = new Map(5);
			Ghost ghost = new Ghost("G", new Location(r[0], r[1]), map);
			PacMan pacman = new PacMan("P", new Location(3, 3), map);

			map.add("P", new Location(3, 3), null, Map.Type.PACMAN);
			map.add("G", new Location(r[0], r[1]), null, Map.Type.GHOST);
			Assert.assertTrue(ghost.attack());
		}

		/* not in range */
		int[][] notInRange = {{2, 2}, {2, 4}, {4, 2}, {0, 0}, {4, 4}};
		Map map = new Map(5);
		PacMan pacman = new PacMan("P", new Location(3, 3), map);
		for (int[] r : notInRange) {
			Ghost ghost = new Ghost("G", new Location(r[0], r[1]), map);

			map.add("P", new Location(3, 3), null, Map.Type.PACMAN);
			map.add("G", new Location(r[0], r[1]), null, Map.Type.GHOST);
			Assert.assertFalse(ghost.attack());
		}
	}
}
