public class Team {
    String name;
    int points;

    public Team(String name) {
        this.name = name;
        this.points = 0;
    }

    public void addPoints(int p) {
        points += p;
    }

    public String toString() {
        return name + " (Points: " + points + ")";
    }
}