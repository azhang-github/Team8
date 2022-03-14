import junit.framework.*;
import java.awt.Color;
import java.io.*;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
public class TestMapGetLoc {

	@Test
	public void testMapGetLoc() {
		Map map = new Map(5);
		map.add("Ghost", new Location(0, 0), null, Map.Type.GHOST);
		map.add("Empty", new Location(0, 1), null, Map.Type.EMPTY);
		map.add("Pacman", new Location(1, 0), null, Map.Type.PACMAN);
		map.add("Wall", new Location(1, 2), null, Map.Type.WALL);
		map.add("Cookie", new Location(2, 2), null, Map.Type.COOKIE);
		assertTrue(map.getLoc(new Location(0, 1)).contains(Map.Type.GHOST));
		assertTrue(map.getLoc(new Location(0, 1)).contains(Map.Type.EMPTY));
		assertTrue(map.getLoc(new Location(1, 0)).contains(Map.Type.PACMAN));
		assertTrue(map.getLoc(new Location(1, 2)).contains(Map.Type.WALL));
		assertTrue(map.getLoc(new Location(2, 2)).contains(Map.Type.COOKIE));
		assertTrue(map.getLoc(new Location(12, 12)).isEmpty());
	}
}
