import java.util.Scanner;

public class BracketSelection {
    Team team1 = null;
    Team team2 = null;

    public void bracketSelection(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
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

    public Team pickWinner(Team team1, Team team2) {

        Team winner = new Team();


        Integer userInput = testConsole.getInteger(pickBracketsMessage());

        if (userInput == 1) {
            winner = team1;
        } else {
            winner = team2;
        }


        return winner;
    }

    public static void main(String[] args) {
        Team team1 = new Team();
        Team team2 = new Team();

        BracketSelection bs = new BracketSelection();
        bs.pickWinner(team1,team2);
    }

}