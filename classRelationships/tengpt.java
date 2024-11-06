import java.util.ArrayList;

class Player {
    private String name;

    Player(String name) {
        this.name = name;
    }

    void showPlayer() {
        System.out.println("Player Name: " + this.name);
    }
}

class Team {
    private String teamName;
    private ArrayList<Player> players;

    Team(String teamName) {
        this.teamName = teamName;
        this.players = new ArrayList<>();
    }

    void addPlayer(Player player) {
        players.add(player);
    }

    void showTeam() {
        System.out.println("Team: " + this.teamName);
        for (Player player : players) {
            player.showPlayer();
        }
    }
}
//aggregation example
//Concept: Aggregation vs. Composition
// Both aggregation and composition create relationships between classes, but they differ in their strength of association:

// Composition (what you just practiced): Represents a strong relationship between objects. If the containing object is destroyed, 
// so are its components. For example, a Library and its Books — if the library closes, the collection may no longer be relevant in
//  that context.

// Aggregation: Represents a weaker association between objects. The contained object can exist independently of the container. 
// For instance, a Team has Players, but if the team disbands, the players still exist independently.

// In terms of implementation:

// Composition usually has private members created within the containing class.
// Aggregation often involves objects that are passed into the containing class and can exist outside of it.

public class tengpt {
    public static void main(String[] args) {
        // Creating players independently
        Player p1 = new Player("Alice");
        Player p2 = new Player("Bob");
        
        // Creating a team and adding players
        Team teamA = new Team("Warriors");
        teamA.addPlayer(p1);
        teamA.addPlayer(p2);
        
        // Displaying team information
        teamA.showTeam();
    }
}
