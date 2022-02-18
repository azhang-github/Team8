import junit.framework.*;
import java.awt.Color;
import java.io.*;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class TestMapEatCookie extends TestCase {

	public void testMapEatCookie() throws FileNotFoundException {
    Map map = new Map(5);
    map.add("Pacman", new Location(2, 2), null, Map.Type.PACMAN);
    assertTrue(map.eatCookie("Pacman") == null);
    CookieComponent cookieComponent = new CookieComponent(2, 2, 20);
    map.add("tok_x2_y2", new Location(2, 2), cookieComponent, Map.Type.COOKIE);
    assertTrue(map.eatCookie("Pacman") != null);
	}
}
