import com.oracle.webservices.internal.api.message.BasePropertySet;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public class Roster {

    LinkedHashMap<Player, Position> roster = new LinkedHashMap<>();

    public Roster() {

    }

    public LinkedHashMap<Player, Position> getRoster() {
        return roster;
    }

    public void setRoster(LinkedHashMap<Player, Position> roster) {
        this.roster = roster;
    }

    public void addToRoster(Player player, Position position) {
        roster.put(player, position);
    }

    public Integer size() {
        return roster.size();
    }

    public String listRoster(Roster roster) {
        return roster.toString();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Player, Position> entry : roster.entrySet()) {
            result.append("\n").append(entry.getValue().toString()).append(" ").append(entry.getKey().getName());}

        return result.toString();
    }
}
