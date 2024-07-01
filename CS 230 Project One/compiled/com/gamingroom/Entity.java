package com.gamingroom;

/**
 * A base class to hold common attributes and behaviors
 * 
 * <p>
 * This class promotes code reuse and simplifies maintenance by holding common
 * properties such as id and name.
 * </p>
 * 
 * @author coce@snhu.edu
 *
 */
public abstract class Entity {
    long id;
    String name;

    /**
     * Constructor with an identifier and name
     */
    public Entity(long id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " [id=" + id + ", name=" + name + "]";
    }
}
