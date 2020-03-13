import org.junit.Assert;
import org.junit.Test;

import java.util.Random;
import java.util.logging.Logger;

public class TestRoster {
    private static final Logger LOGGER = Logger.getLogger(TestRoster.class.getName());

    @Test
    public void sizeTest(){
        Player player1 = new Player();
        Position pg = Position.PG;
        Player player2 = new Player();
        Position sg = Position.SG;
        Player player3 = new Player();
        Position c = Position.SF;
        Roster roster = new Roster();
        roster.addToRoster(player1,pg);
        roster.addToRoster(player2,sg);
        roster.addToRoster(player3,pg);

        Integer expected = roster.size();
        Integer actual = 3;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void listRosterTest(){
        Player player = new Player("Raheel Uppal",Position.PG,6.3,230.5,32.6,8.6,9.2,Year.FM);
        String expected = player.playerDetails(player);
        String actual ="Name: Raheel Uppal\n" +
                " Position: PG\n" +
                " Height: 6.3\n" +
                " Weight: 230.5\n" +
                " PPG: 32.6\n" +
                " APG: 8.6\n" +
                " RPG 9.2\n" +
                " Class: FM";
        LOGGER.info(player.playerDetails(player));
        Assert.assertEquals(expected, actual);
    }
}
