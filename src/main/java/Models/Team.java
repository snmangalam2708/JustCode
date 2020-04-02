package Models;

import Services.TeamService;

public class Team {
    private String teamName;
    private Roster teamRoster;
    private String records;
    private String projections;
    private String history;
    private String schedule;
    private int teamId;
    private String regionName;


    public Team(String teamName, String records,String projections,String history,String schedule, Roster roster){
        this.teamName = teamName;
        this.records = records;
        this.projections = projections;
        this.history = history;
        this.schedule = schedule;

    }

    public void addRoster(){
        this.teamRoster = new Roster(this.teamId);
    }

    public Team(int teamId,String regionName){
        this.teamId = teamId;
        this.regionName = regionName;
        addRoster();
        populateName();
    }

    public Team(){}

    public void populateName(){
        this.teamName = new TeamService().getTeamNameByTeamIdRegionName(teamId,regionName);
    }

    public Roster getTeamRoster() {
        return teamRoster;
    }

    public void setTeamRoster(Roster teamRoster) {
        this.teamRoster = teamRoster;
    }

    public String getRecords() {
        return records;
    }

    public void setRecords(String records) {
        this.records = records;
    }

    public String getProjections() {
        return projections;
    }

    public void setProjections(String projections) {
        this.projections = projections;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }


    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    //    get roster from API
//    records;
//    projections;
//    history;
//    schedule;


}
