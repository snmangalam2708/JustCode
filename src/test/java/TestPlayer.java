import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Logger;

public class TestPlayer {
    private static final Logger LOGGER = Logger.getLogger(TestPlayer.class.getName());
    @Test
    public void playerDetailsTest(){
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
