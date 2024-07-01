package com.gamingroom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * A singleton service for the game engine
 * 
 * <p>
 * The singleton pattern ensures that only one instance of GameService exists in
 * memory at any time. This is crucial for ensuring that the state of the game
 * service is consistent across all parts of the application.
 * </p>
 * 
 * @author coce@snhu.edu
 */
public class GameService {

    private static List<Game> games = new ArrayList<>();
    private static List<Team> teams = new ArrayList<>();
    private static List<Player> players = new ArrayList<>();

    private static long nextGameId = 1;
    private static long nextTeamId = 1;
    private static long nextPlayerId = 1;

    private static GameService instance;

    private GameService() {
    }

    public static synchronized GameService getInstance() {
        if (instance == null) {
            instance = new GameService();
        }
        return instance;
    }

    public Game addGame(String name) {
        Game game = null;

        Iterator<Game> gameIterator = games.iterator();
        while (gameIterator.hasNext()) {
            Game existingGame = gameIterator.next();
            if (existingGame.getName().equals(name)) {
                game = existingGame;
                break;
            }
        }

        if (game == null) {
            game = new Game(nextGameId++, name);
            games.add(game);
        }

        return game;
    }

    public Game getGame(int index) {
        return games.get(index);
    }

    public Game getGame(long id) {
        Game game = null;

        Iterator<Game> gameIterator = games.iterator();
        while (gameIterator.hasNext()) {
            Game existingGame = gameIterator.next();
            if (existingGame.getId() == id) {
                game = existingGame;
                break;
            }
        }

        return game;
    }

    public Game getGame(String name) {
        Game game = null;

        Iterator<Game> gameIterator = games.iterator();
        while (gameIterator.hasNext()) {
            Game existingGame = gameIterator.next();
            if (existingGame.getName().equals(name)) {
                game = existingGame;
                break;
            }
        }

        return game;
    }

    public int getGameCount() {
        return games.size();
    }

    public Team addTeam(String name) {
        Team team = null;

        Iterator<Team> teamIterator = teams.iterator();
        while (teamIterator.hasNext()) {
            Team existingTeam = teamIterator.next();
            if (existingTeam.getName().equals(name)) {
                team = existingTeam;
                break;
            }
        }

        if (team == null) {
            team = new Team(nextTeamId++, name);
            teams.add(team);
        }

        return team;
    }

    public Player addPlayer(String name) {
        Player player = null;

        Iterator<Player> playerIterator = players.iterator();
        while (playerIterator.hasNext()) {
            Player existingPlayer = playerIterator.next();
            if (existingPlayer.getName().equals(name)) {
                player = existingPlayer;
                break;
            }
        }

        if (player == null) {
            player = new Player(nextPlayerId++, name);
            players.add(player);
        }

        return player;
    }

    public Team getTeam(int index) {
        return teams.get(index);
    }

    public Team getTeam(long id) {
        Team team = null;

        Iterator<Team> teamIterator = teams.iterator();
        while (teamIterator.hasNext()) {
            Team existingTeam = teamIterator.next();
            if (existingTeam.getId() == id) {
                team = existingTeam;
                break;
            }
        }

        return team;
    }

    public Team getTeam(String name) {
        Team team = null;

        Iterator<Team> teamIterator = teams.iterator();
        while (teamIterator.hasNext()) {
            Team existingTeam = teamIterator.next();
            if (existingTeam.getName().equals(name)) {
                team = existingTeam;
                break;
            }
        }

        return team;
    }

    public Player getPlayer(int index) {
        return players.get(index);
    }

    public Player getPlayer(long id) {
        Player player = null;

        Iterator<Player> playerIterator = players.iterator();
        while (playerIterator.hasNext()) {
            Player existingPlayer = playerIterator.next();
            if (existingPlayer.getId() == id) {
                player = existingPlayer;
                break;
            }
        }

        return player;
    }

    public Player getPlayer(String name) {
        Player player = null;

        Iterator<Player> playerIterator = players.iterator();
        while (playerIterator.hasNext()) {
            Player existingPlayer = playerIterator.next();
            if (existingPlayer.getName().equals(name)) {
                player = existingPlayer;
                break;
            }
        }

        return player;
    }
}
