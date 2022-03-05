# Project 1: PacMan
By Michael Li, Jason Lavis, Chiayo Lin

## Image

Put image here.

## How To Run
```
javac -cp "src/" src/*.java
java -cp "src/" StartMenu
```

## Part 1a: PacMan Class

### get_valid_moves()

- **Implementation**: This method searches in all cardinal directions by 1 space to search for a position that contains the ```Map.Type``` Empty, Cookie, or Ghost, which are all valid moves. Returns the Locations of all valid moves, and nothing if there are no valid moves.
- **Test**: Initialized with a map loaded from a text file, we test that all valid moves returned satisfy conditions as said above that make it a valid move, and test that all invalid moves not return by this method are in-fact invalid. That is, we test that it must be a wall or an empty set.

### move()

- **Implementation**:
- **Test**:

### is_ghost_in_range()

- **Implementation**:
- **Test**:

### consume()

- **Implementation**: First get the set of components at the pacman's location. If the location contains a cookie, call `map.eatCookie` with the pacman's name as a parameter. Otherwise, return null.
- **Test**:  Written in `TestConsume.java`. The test first adds a Pacman and tries to call `consume` on the Pacman. However, it will return `null` since there is no cookie at that location. The test then adds a cookie at the Pacman's location and calls `consume` again. This time it will return the Cookie Component

## Part 1b: Ghost Class

### get_valid_moves()

- **Implementation**: This method searches in all cardinal directions by 1 space to search for a position that contains the ```Map.Type``` Empty, Cookie, Ghost, or Pacman which are all valid moves. Returns the Locations of all valid moves, and nothing if there are no valid moves.
- **Test**: Initialized with a map loaded from a text file, we test that all valid moves returned satisfy conditions as said above that make it a valid move, and test that all invalid moves not return by this method are in-fact invalid. That is, we test that it must be a wall or an empty set.

### move()

- **Implementation**:
- **Test**:

### is_pacman_in_range()

- **Implementation**: Create a hashset of locations to test: `(x+1, y), (x-1, y), (x, y+1), (x, y-1)`. For each location, check if the pacman is at that location. If so then return true. Else return false.
- **Tests**: Written in `TestPacManInRange.java`. The test places a Pacman at `(2,2)` and a Ghost at `(2, 1)`, then calls `is_pacman_in_range()` on this ghost, which is expected to return true. The test then places another Ghost at `(2, 2)`, then calls `is_pacman_in_range()` on this second ghost, which is expected to return false.

### attack()

- **Implementation**:
- **Test**:

## Map Class

### move(String name, Location loc, Type type)

- **Implementation**:
- **Test**:

### getLoc(Location loc)

- **Implementation**: This method, given a location, will return the type of location said location is. That is, it will return the ```field``` hashmap for the location, returning a hashset containing: Empty, Ghost, Pacman, Wall, Cookie.
- **Test**: We intialize a map by hand and check that the location type return matches what is should be.

### attack(String name)

- **Implementation**:
- **Test**:

### eatCookie(String Name)

- **Implementation**: First get the location of pacman's name. If the location contains a cookie, remove the cookie from the location, field, and components, increment `cookies`, and return the cookie component. Otherwise return null.
- **Test**: Written in `TestMapEatCookie.java`. The test first adds a Pacman and tries to call `eatCookie` on the map and Pacman. However, it will return `null` since there is no cookie at that location. The test then adds a cookie at the Pacman's location and calls `eatCookie` again. This time it will return the Cookie Component
