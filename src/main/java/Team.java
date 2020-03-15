public class Team {
    private Roster teamRoster;
    private String records;
    private String projections;
    private String history;
    private String schedule;

    public Team(String records,String projections,String history,String schedule, Roster roster){
        this.teamRoster = new Roster();
        this.records = records;
        this.projections = projections;
        this.history = history;
        this.schedule = schedule;

    }

    public Team(){    }

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
    // get roster from API
//    records;
//    projections;
//    history;
//    schedule;


}
