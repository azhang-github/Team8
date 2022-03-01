import java.util.HashSet;
import java.util.ArrayList;

public class Ghost{
	String myName;
	Location myLoc;
	Map myMap;

	public Ghost(String name, Location loc, Map map) {
		this.myLoc = loc;
		this.myName = name;
		this.myMap = map;
	}

	private int[][] directions = {{1,0}, {0,1}, {-1,0}, {0,-1}};
	public ArrayList<Location> get_valid_moves() {
		ArrayList<Location> validMoves = new ArrayList<>();
		
		for(int[] dir : directions) {
			Location shiftedLocation = this.myLoc.shift(dir[0], dir[1]);
			HashSet<Map.Type> newLocation = this.myMap.getLoc(shiftedLocation);

			if(newLocation.contains(Map.Type.EMPTY) 
			| newLocation.contains(Map.Type.COOKIE) 
			| newLocation.contains(Map.Type.PACMAN)
			| newLocation.contains(Map.Type.GHOST)) {
				validMoves.add(shiftedLocation);
			};
		}
		return validMoves;
	}

	public boolean move() {
		return false;
	}

	public boolean is_pacman_in_range() { 
		return false;
	}

	public boolean attack() {
		return false;
	}
}
