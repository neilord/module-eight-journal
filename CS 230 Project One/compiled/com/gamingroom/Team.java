package com.gamingroom;

/**
 * A simple class to hold information about a team
 * 
 * <p>
 * Notice the overloaded constructor that requires an id and name to be passed
 * when creating. Also note that no mutators (setters) are defined so these values
 * cannot be changed once a team is created.
 * </p>
 * 
 */
public class Team extends Entity {

    public Team(long id, String name) {
        super(id, name);
    }

    @Override
    public String toString() {
        return "Team [id=" + id + ", name=" + name + "]";
    }
}
