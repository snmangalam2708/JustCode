import java.util.HashMap;
import java.util.Scanner;

public class BracketSelection {
    private Region east = new Region("east");
    private Region west = new Region("west");
    private Region midwest = new Region("midwest");
    private Region south = new Region("south");
    private Team team1 = null;
    private Team team2 = null;

    public BracketSelection() {
        this.east = new Region("east");
        this.west = new Region("west");
        this.midwest = new Region("midwest");
        this.south = new Region("south");
    }

    public String pickBracketsMessage() {
        return
        "\n" +
        ("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^")+ "\n" +
        ("         Who Will Win This Matchup?           ")+ "\n" +
        (" -------------------------------------------- ")+ "\n" +
        ("                                              ")+ "\n" +
        ("    1. " + team1 + "                          ")+ "\n" +
        ("    2. " + team2 + "                          ")+ "\n" +
        ("                                              ")+ "\n" +
        ("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^")+ "\n" +
        (" Enter your input :");
    }

    public HashMap<Integer, Team> pickFirstRoundWinner(Region region) {
        HashMap<Integer, Team> winnerMap = new HashMap<>();
        Team winner = new Team();
        int seedCounter = 16;
        //below creates round 1 matchups
        for(int i = 1; i <=8; i++){
            this.team1 = region.getSeedTeamMap().get(i);
            this.team2 = region.getSeedTeamMap().get(seedCounter);
            Integer userInput = testConsole.getInteger(pickBracketsMessage());
            if (userInput == 1) {
                winner = team1;
                winnerMap.put(i,team1);
            } else {
                winner = team2;
                winnerMap.put(i,team2);
            }
            seedCounter--;
        }
        region.setPicks(winnerMap);
        return winnerMap;
    }
    public void pickSecondRoundWinner(Region region){
        if (region.getPicks().containsKey(1)){}}

    public void pickThirdRoundWinner(Region region){}
    public void pickFourthRoundWinner(Region region){}
    public void pickRegionWinner(Region region){
        pickFirstRoundWinner(east);
        pickSecondRoundWinner(east);
        pickThirdRoundWinner(east);
        pickFourthRoundWinner(east);}

    public static void main(String[] args) {
        // selectedRegion will be either pulled from user input or we can hardcode it

        Team team1 = new Team();
        Team team2 = new Team();

        BracketSelection bs = new BracketSelection();
        bs.pickRegionWinner(bs.east);
        bs.pickRegionWinner(bs.west);
        bs.pickRegionWinner(bs.midwest);
        bs.pickRegionWinner(bs.south);
    }

}