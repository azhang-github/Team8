import junit.framework.*;
import java.awt.Color;
import java.io.*;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class TestPacManInRange extends TestCase {

	public void testPacManInRange() throws FileNotFoundException{
	    NoFrame frame = new NoFrame();
	    PacMan pacman = frame.addPacMan(new Location(2, 2));
	    Ghost ghost1 = frame.addGhost(new Location(2, 1), "ghost1", Color.red);
	    assertTrue(ghost1.is_pacman_in_range());
	    Ghost ghost2 = frame.addGhost(new Location(4, 4), "ghost2", Color.red);
	    assertFalse(ghost2.is_pacman_in_range());
	}
}
