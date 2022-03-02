import java.awt.Color;
import junit.framework.*;

public class TestMapAttack {

	public void testMapAttack() {
		/* in range */
		int[][] inRange = {{3, 2}, {3, 4}, {2, 3}, {4, 3}};
		for (int[] r : inRange) {
			Map map = new Map(5);
			Ghost ghost = new Ghost("G", new Location(r[0], r[1]), map);
			PacMan pacman = new PacMan("pacman", new Location(3, 3), map);

			map.add("pacman", new Location(3, 3), null, Map.Type.PACMAN);
			map.add("G", new Location(r[0], r[1]), null, Map.Type.GHOST);
			assertTrue(map.attack("G"));
		}

		/* not in range */
		int[][] notInRange = {{2, 2}, {3, 3}, {2, 4}, {4, 2}, {0, 0}, {4, 4}};
		for (int[] r : inRange) {
			Map map = new Map(5);
			Ghost ghost = new Ghost("G", new Location(r[0], r[1]), map);
			PacMan pacman = new PacMan("pacman", new Location(3, 3), map);

			map.add("pacman", new Location(3, 3), null, Map.Type.PACMAN);
			map.add("G", new Location(r[0], r[1]), null, Map.Type.GHOST);
			assertFalse(map.attack("G"));
		}
	}
}
