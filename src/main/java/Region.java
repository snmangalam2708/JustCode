import java.util.HashMap;


public class Region{
    private Bracket regionBracket;
    private HashMap<Team, Integer> teamSeedMap;

    public Region(String selectedRegion){
        this.regionBracket = new Bracket();
    }

    public Bracket getRegionBracket() {
        return regionBracket;
    }

    public void setRegionBracket(Bracket regionBracket) {
        this.regionBracket = regionBracket;
    }

    public HashMap<Team, Integer> getTeamSeedMap() {
        return teamSeedMap;
    }

    public void setTeamSeedMap(HashMap<Team, Integer> teamSeedMap) {
        this.teamSeedMap = teamSeedMap;
    }

    //    methods planned for future use below
//    get list of teams and seeds from API
//            put them in the hashmap
}
