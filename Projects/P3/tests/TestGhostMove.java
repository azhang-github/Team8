import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestGhostMove extends TestCase {

	public void testGhostMove() throws FileNotFoundException{
		NoFrame frame = new NoFrame();
		Ghost ghost = frame.addGhost(new Location(9,11), "binky", Color.red);	
		assertTrue(ghost.move());
	
		Location loc1 = new Location(9,12);
		Location loc2 = new Location(10,11);
		Location loc3 = new Location(10,12);

		System.out.println(ghost.myLoc.x + " " + ghost.myLoc.y);		
		assertTrue(ghost.myLoc.equals(loc1) || ghost.myLoc.equals(loc2) || ghost.myLoc.equals(loc3));
	}
}
