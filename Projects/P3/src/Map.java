import java.util.HashMap;
import java.util.HashSet;
import javax.swing.JComponent;

public class Map{

	public enum Type {
		EMPTY,
		PACMAN,
		GHOST,
		WALL,
		COOKIE
	}

	private HashMap<Location, HashSet<Type>> field;
	private boolean gameOver;
	private int dim;

	private HashMap<String, Location> locations;
	private HashMap<String, JComponent> components;
	private HashSet<Type> emptySet;
	private HashSet<Type> wallSet;

	private int cookies = 0;

	public Map(int dim){
		gameOver = false;
		locations = new HashMap<String, Location>();
		components = new HashMap<String, JComponent>();
		field = new HashMap<Location, HashSet<Type>>();

		emptySet = new HashSet<Type>();
		wallSet = new HashSet<Type>();
		emptySet.add(Type.EMPTY);
		wallSet.add(Type.WALL);
		this.dim = dim;
	}


	public void add(String name, Location loc, JComponent comp, Type type) {
		locations.put(name, loc);
		components.put(name, comp);
		if (!field.containsKey(loc)) field.put(loc, new HashSet<Type>());
		field.get(loc).add(type);
	}

	public int getCookies() {
		return cookies;
	}

	public boolean isGameOver() {
		return gameOver;
	}

	public boolean move(String name, Location loc, Type type) {
		Location old = locations.get(name);
		JComponent comp = components.get(name);

		locations.put(name, loc);
		comp.setLocation(loc.x, loc.y);

		field.get(old).remove(type);
		if (!field.containsKey(loc)) field.put(loc, new HashSet<Type>());
		field.get(loc).add(type);
		return true;
	}

	public HashSet<Type> getLoc(Location loc) {
		//wallSet and emptySet will help you write this method
		return field.getOrDefault(loc, new HashSet<Type>());
	}

	public boolean attack(String Name) {
		int[][] xy = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
		Location loc = locations.get(Name);

		for (int[] p : xy) {
			Location pacLoc = new Location(loc.x + p[0], loc.y + p[1]);

			if (getLoc(pacLoc).contains(Type.PACMAN)) {
				/* remove pacman */
				components.remove("pacman");
				locations.remove("pacman");

				/* update location */
				locations.put(Name, pacLoc);

				/* update field */
				field.get(pacLoc).remove(Type.PACMAN);
				field.get(pacLoc).add(Type.GHOST);

				return gameOver = true;
			}
		}

		return false;
	}

	public JComponent eatCookie(String name) {
		//update locations, components, field, and cookies
		//the id for a cookie at (10, 1) is tok_x10_y1
    Location pacmanLocation = this.locations.get(name);
    if (this.field.get(pacmanLocation).contains(Map.Type.COOKIE)) {
      String cookieName = "tok_x" + pacmanLocation.x + "_y" + pacmanLocation.y;
      this.locations.remove(cookieName);
      this.field.get(pacmanLocation).remove(Map.Type.COOKIE);
      field.get(pacmanLocation).add(Type.EMPTY);
      this.cookies--;
      return this.components.remove(cookieName);
    }

    return null;
	}
}
