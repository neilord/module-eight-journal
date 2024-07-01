package com.gamingroom;

/**
 * A class to test a singleton's behavior
 * 
 * <p>
 * The singleton pattern ensures that only one instance of GameService exists
 * in memory at any time. This is crucial for ensuring that the state of the
 * game service is consistent across all parts of the application.
 * </p>
 * 
 * <p>
 * The iterator pattern is used to traverse the collection of games to ensure
 * there are no duplicates when adding a new game.
 * </p>
 * 
 * @author coce@snhu.edu
 */
public class SingletonTester {

    public void testSingleton() {

        System.out.println("\nAbout to test the singleton...");

        // Obtain local reference to the singleton instance
        GameService service = GameService.getInstance();

        // A simple for loop to print the games
        for (int i = 0; i < service.getGameCount(); i++) {
            System.out.println(service.getGame(i));
        }

    }

}

