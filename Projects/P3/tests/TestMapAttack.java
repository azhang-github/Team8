import java.awt.Color;
import junit.framework.*;

public class TestMapAttack extends TestCase {

	public void testMapAttack()  {
		/* in range */
		int[][] inRange = {{3, 4}, {3, 2}, {2, 3}, {4, 3}};

		for (int[] r : inRange) {
			Map map = new Map(10);

			PacMan pacman = new PacMan("pacman", new Location(3, 3), map);
			map.add("pacman", new Location(3, 3), null, Map.Type.PACMAN);

			Ghost ghost = new Ghost("G" + r[0] + r[1], new Location(r[0], r[1]), map);
			map.add("G" + r[0] + r[1], new Location(r[0], r[1]), null, Map.Type.GHOST);

			Assert.assertTrue(map.attack("G" + r[0] + r[1]));
		}

		/* out of range */
		Map map = new Map(10);

		PacMan pacman = new PacMan("pacman", new Location(3, 3), map);
		map.add("pacman", new Location(3, 3), null, Map.Type.PACMAN);

		Ghost ghost = new Ghost("G", new Location(2, 2), map);
		map.add("G", new Location(2, 2), null, Map.Type.GHOST);

		Assert.assertFalse(map.attack("G"));
	}
}
