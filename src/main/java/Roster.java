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

    public void listRoster() {
        System.out.println(roster.toString());
    }

    @Override
    public String toString() {
        String result = null;
        for (Map.Entry<Player, Position> e : roster.entrySet()) {
            result = "Name: " + e.getKey().getName() +
                    "\n Position: " + e.getValue();

        }
        return result;
    }
}
