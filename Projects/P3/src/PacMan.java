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

	private int[][] directions = {{1,0}, {0,1}, {-1,0}, {0,-1}};
	public ArrayList<Location> get_valid_moves() {
		ArrayList<Location> validMoves = new ArrayList<>();
		for(int[] dir : directions) {
			Location shiftedLoc = this.myLoc.shift(dir[0], dir[1]);
			HashSet<Map.Type> newLocation = this.myMap.getLoc(shiftedLoc);
			
			if(newLocation.contains(Map.Type.EMPTY) 
			| newLocation.contains(Map.Type.COOKIE)
			| newLocation.contains(Map.Type.GHOST)
			) {
				validMoves.add(shiftedLoc);
			}
		}
		return validMoves;
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
    HashSet typeSet = this.myMap.getLoc(this.myLoc);

    if (typeSet.contains(Map.Type.COOKIE)) {
      return this.myMap.eatCookie(this.myName);
    }

    return null;
	}
}
