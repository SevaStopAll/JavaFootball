package Team;

import java.util.List;

public class Team {
    private List<Player> players;
    private static final int LIMIT = 5;
    private int people = 0;

    public boolean add(Player player) {
        boolean result = false;
        if (people < LIMIT) {
            players.add(player);
            people++;
            result = true;
        } else {
        }
        return result;
    }
}
