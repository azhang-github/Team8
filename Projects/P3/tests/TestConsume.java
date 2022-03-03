import junit.framework.*;
import java.awt.Color;
import java.io.*;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class TestConsume extends TestCase {
  public void testConsume() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    PacMan pacman = frame.addPacMan(new Location(2, 2));
    Map map = frame.getMap();
    assertTrue(pacman.consume() == null);
    CookieComponent cookieComponent = new CookieComponent(2, 2, 20);
    map.add("tok_x2_y2", new Location(2, 2), cookieComponent, Map.Type.COOKIE);
    assertTrue(pacman.consume() != null);
  }
}
