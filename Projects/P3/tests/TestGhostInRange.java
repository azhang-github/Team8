import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestGhostInRange extends TestCase {

	public void testGhostInRange() throws FileNotFoundException{
		NoFrame frame = new NoFrame();
		PacMan pacman = frame.addPacMan(new Location(2, 2));
		Ghost ghost2 = frame.addGhost(new Location(4, 4), "ghost2", Color.red);
		assertFalse(pacman.is_ghost_in_range());
		Ghost ghost1 = frame.addGhost(new Location(2, 3), "ghost1", Color.red);
		assertTrue(pacman.is_ghost_in_range());
	}
}

