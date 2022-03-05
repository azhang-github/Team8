import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestPacManMove extends TestCase {

	public void testPacManMove() throws FileNotFoundException{
		NoFrame frame = new NoFrame();
		PacMan pacman = frame.addPacMan(new Location(9,11));
		assertTrue(pacman.move());
	
		Location loc1 = new Location(9,12);
		Location loc2 = new Location(10,11);
		Location loc3 = new Location(10,12);

		assertTrue(pacman.myLoc.equals(loc1) || pacman.myLoc.equals(loc2) || pacman.myLoc.equals(loc3));
	}
}
