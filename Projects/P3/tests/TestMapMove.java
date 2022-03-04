import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestMapMove extends TestCase{

	public void testMapMove() throws FileNotFoundException {
		NoFrame frame = new NoFrame();
        Map myMap = frame.getMap();

        Location loc = new Location(15,20);
        Ghost ghost = frame.addGhost(loc, "clyde", Color.orange); 
        assertTrue(myMap.move("clyde", loc, Map.Type.GHOST ));
	}
}

