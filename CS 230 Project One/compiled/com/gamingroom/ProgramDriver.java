package com.gamingroom;

/**
 * Application start-up program
 * 
 * @author coce@snhu.edu
 */
public class ProgramDriver {

    /**
     * The one-and-only main() method
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {

        // Obtain reference to the singleton instance
        GameService service = GameService.getInstance();

        System.out.println("\nAbout to test initializing game data...");

        // Initialize with some game data
        Game game1 = service.addGame("Game #1");
        System.out.println(game1);
        Game game2 = service.addGame("Game #2");
        System.out.println(game2);

        // Use another class to prove there is only one instance
        SingletonTester tester = new SingletonTester();
        tester.testSingleton();
    }
}

