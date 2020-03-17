import java.util.HashMap;


public class Region{
    private Bracket regionBracket;
    private HashMap<Integer, Team> seedTeamMap;
    private HashMap<Integer,Team> picks;

    public Region(String selectedRegion){
        JDBC jdbc = new JDBC();
        //method below will take jdbc query results - need to mapify the query results using selectedRegion
        this.seedTeamMap.put(1,new Team());
    }

    public Bracket getRegionBracket(){
        return this.regionBracket;
    }

    public void setRegionBracket(Bracket regionBracket) {
        this.regionBracket = regionBracket;
    }

    public HashMap<Integer,Team> getSeedTeamMap() {
        return seedTeamMap;
    }

    public void setSeedTeamMap(HashMap<Integer, Team> teamSeedMap) {
        this.seedTeamMap = teamSeedMap;
    }

    public HashMap<Integer, Team> getPicks(){return this.picks;};

    public void setPicks(HashMap<Integer, Team> picks){this.picks = picks;};


    //    methods planned for future use below
//    get list of teams and seeds from API
//            put them in the hashmap
}
