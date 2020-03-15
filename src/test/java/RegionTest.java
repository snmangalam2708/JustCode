import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class RegionTest {
    Region testRegion = new Region("East");
    Bracket testBracket = new Bracket();
    HashMap<Team, Integer> testMap = new HashMap<>();

    @Test
    public void getSetRegionBracket() {
        testRegion.setRegionBracket(testBracket);
        Bracket expected = testBracket;
        Bracket actual = testRegion.getRegionBracket();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getSetTeamSeedMap() {
        testRegion.setTeamSeedMap(testMap);
        HashMap expected = testMap;
        HashMap actual = testRegion.getTeamSeedMap();
        Assert.assertEquals(expected,actual);
    }
}