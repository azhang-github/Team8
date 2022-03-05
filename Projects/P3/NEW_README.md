# Project 1: PacMan
By Michael Li, Jason Lavis, Chiayo Lin, 

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

- **Implementation**:
- **Test**:

## Part 1b: Ghost Class

### get_valid_moves()

- **Implementation**: This method searches in all cardinal directions by 1 space to search for a position that contains the ```Map.Type``` Empty, Cookie, Ghost, or Pacman which are all valid moves. Returns the Locations of all valid moves, and nothing if there are no valid moves.
- **Test**: Initialized with a map loaded from a text file, we test that all valid moves returned satisfy conditions as said above that make it a valid move, and test that all invalid moves not return by this method are in-fact invalid. That is, we test that it must be a wall or an empty set.

### move()

- **Implementation**:
- **Test**:

### is_pacman_in_range()

- **Implementation**:
- **Test**:

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

- **Implementation**:
- **Test**:
