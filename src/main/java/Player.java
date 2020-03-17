import java.util.Map;

public class Player {
    
private String name;
private Double height;
private Double weight;

private Double PPG;
private Double APG;
private Double RPG;

private Year year;
private Position position;

    public Player(String name, Position position, Double height, Double weight, Double PPG, Double APG, Double RPG, Year year) {
        this.name = name;
        this.position = position;
        this.height = height;
        this.weight = weight;
        this.PPG = PPG;
        this.APG = APG;
        this.RPG = RPG;
        this.year = year;
        
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getPPG() {
        return PPG;
    }

    public void setPPG(Double PPG) {
        this.PPG = PPG;
    }

    public Double getAPG() {
        return APG;
    }

    public void setAPG(Double APG) {
        this.APG = APG;
    }

    public Double getRPG() {
        return RPG;
    }

    public void setRPG(Double RPG) {
        this.RPG = RPG;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String playerDetails(Player player){
        return player.toString();
    }

    @Override
    public String toString() {
             return "Name: " + getName() +
                    "\n Position: " + getPosition() +
                    "\n Height: " + getHeight() +
                    "\n Weight: " + getWeight() +
                    "\n PPG: " + getPPG() +
                    "\n APG: " + getAPG() +
                    "\n RPG " + getRPG() +
                    "\n Class: " + getYear();
    }
}
