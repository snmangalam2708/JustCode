package Models;

import Services.RegionService;

import java.util.ArrayList;
import java.util.HashMap;


public class Region{
    private Bracket regionBracket;
    private HashMap<Integer, Team> seedTeamMap;
    private ArrayList<Integer> seedPicks;
    private Team champ;
    private String regionName;

    public Region(String regionName){
        this.regionName = regionName;
        this.seedPicks = new ArrayList<Integer>();
        this.champ = new Team();
    }

    public Region(){}

    public void populateSeedTeamMap(){
        this.seedTeamMap = new RegionService().getSeedsTeamsByRegion(this.regionName);
    }

    public Bracket getRegionBracket(){
        return this.regionBracket;
    }

    public void setRegionBracket(Bracket regionBracket) {
        this.regionBracket = regionBracket;
    }

    public HashMap<Integer, Team> getSeedTeamMap() {
        return seedTeamMap;
    }

    public void setSeedTeamMap(HashMap<Integer, Team> teamSeedMap) {
        this.seedTeamMap = teamSeedMap;
    }

    public ArrayList<Integer> getPicks(){return this.seedPicks;};

    public void setPicks(ArrayList<Integer> picks){this.seedPicks = picks;};

    public void clearPicks(){
        this.getPicks().clear();
    }

    public Team getChamp() {
        return champ;
    }

    public void setChamp(Team champ) {
        this.champ = champ;
    }

    //    methods planned for future use below
//    get list of teams and seeds from API
//            put them in the hashmap
}
