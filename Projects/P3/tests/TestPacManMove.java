import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestPacManMove extends TestCase {

	public void testPacManMove() throws FileNotFoundException{
		NoFrame frame = new NoFrame();
		PacMan pacman = frame.addPacMan(new Location(1,1));
		assertTrue(pacman.move());

		Location loc1 = new Location(1,2);
		Location loc2 = new Location(2,1);
		Location loc3 = new Location(2,2);

		assertTrue(pacman.myLoc.equals(loc1) || pacman.myLoc.equals(loc2) || pacman.myLoc.equals(loc3));
	}
}
