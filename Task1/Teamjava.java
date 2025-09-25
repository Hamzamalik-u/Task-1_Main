import java.util.ArrayList;

public class Team {
    // 1.c private instance variable for team name
    private String name;

    // 1.d private instance variable for team rank
    private int rank;

    // 1.e private instance variable for player names
    private ArrayList<String> players;

    // 1.f constructor with parameter (team name)
    public Team(String name) {
        this.name = name;
        this.rank = 0;                // default rank
        this.players = new ArrayList<>(); // start with empty list
    }

    // Example setter for rank
    public void setRank(int rank) {
        this.rank = rank;
    }

     // Example method to add a player
    public void addPlayer(String player) {
        players.add(player);
    }

    // toString() method
    @Override
    public String toString() {
        return "Team{name='" + name + "', rank=" + rank + ", players=" + players + "}";
    }
}