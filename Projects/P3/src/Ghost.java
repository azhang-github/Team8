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

	public ArrayList<Location> get_valid_moves() {
		return null;
	}

	public boolean move() {
		return false;
	}

	public boolean is_pacman_in_range() {
    HashSet<Location> locationSet = new HashSet<>();
    Location up = new Location(this.myLoc.x, this.myLoc.y + 1);
    locationSet.add(up);
    Location down = new Location(this.myLoc.x, this.myLoc.y - 1);
    locationSet.add(down);
    Location right = new Location(this.myLoc.x + 1, this.myLoc.y);
    locationSet.add(right);
    Location left = new Location(this.myLoc.x - 1, this.myLoc.y);
    locationSet.add(left);

    for (Location location : locationSet) {
      if (this.myMap.getLoc(location).contains(Map.Type.PACMAN)) {
        return true;
      }
    }
    return false;
	}

	public boolean attack() {
		return false;
	}
}
