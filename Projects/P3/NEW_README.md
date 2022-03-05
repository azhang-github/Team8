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

- **Implementation**: This method returns true if there are any ghosts in a
                      attack range of radius 1, otherwise it returns false.
- **Test**: We test this method by iterating over a list of locations including
            both in-the-range and out-of-the-range locations to validate this
            method's ability to detect a ghost within its detection range.
            
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

- **Implementation**: This method invokes `Map->attack(Name)` instance method if
                      `is_pacman_in_range()` evaluates to true, otherwise it does
                      nothing and returns false.
- **Test**: We iterate over all possible valid and invalid locations of which a ghost may
            attack a pacman from and appy this method by manually initializing a map.

## Map Class

### move(String name, Location loc, Type type)

- **Implementation**:
- **Test**:

### getLoc(Location loc)

- **Implementation**: This method, given a location, will return the type of location said location is. That is, it will return the ```field``` hashmap for the location, returning a hashset containing: Empty, Ghost, Pacman, Wall, Cookie.
- **Test**: We intialize a map by hand and check that the location type return matches what is should be.

### attack(String name)

- **Implementation**: This function updates the display and set appropriate game
                      status when an attack of a ghost with the given name against
                      a pacman is successful, otherwise it returns false.

- **Test**: We iterate over all possible valid locations of which a ghost may attack 
            a pacman from and appy this method by manually initializing a map. Only valid
            locations are tested because it is only going to be called when an attack
            target is in range (i.e. from `Ghost->attack`).

### eatCookie(String Name)

- **Implementation**:
- **Test**:
