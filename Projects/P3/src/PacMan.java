import java.util.HashSet;
import java.util.ArrayList;
import javax.swing.JComponent;

public class PacMan{
	String myName;
	Location myLoc;
	Map myMap;
	Location shift; 

	public PacMan(String name, Location loc, Map map) {
		this.myLoc = loc;
		this.myName = name;
		this.myMap = map;
	}

	public ArrayList<Location> get_valid_moves() {
		return null;	
	}

	public boolean move() {
		return false;
	}

	public boolean is_ghost_in_range() {
		int[][] xy = { {1, 0}, {-1, 0}, {0, 1}, {0, -1} };

		for (int[] p : xy) {
			Location loc = new Location(myLoc.x + p[0], myLoc.y + p[1]);
			if (myMap.getLoc(loc).contains(Map.Type.GHOST))
				return true;
		}

		return false;
	}

	public JComponent consume() { 
 		return null;
	}
}
