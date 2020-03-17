import java.util.HashMap;


public class Region{
    private Bracket regionBracket;
    private HashMap<Team, Integer> teamSeedMap;

    public Region(String selectedRegion){
        JDBC jdbc = new JDBC();
        //method below will take jdbc queries - need to mapify the query results
        this.teamSeedMap.put(new Team(), 1);
    }

    public Bracket getRegionBracket(){
        return this.regionBracket;
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
