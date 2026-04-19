 import java.util.Random;

public class Match {
    Team team1, team2;

    public Match(Team t1, Team t2) {
        team1 = t1;
        team2 = t2;
    }

    public Team playMatch() {
        Random rand = new Random();

        int score1 = rand.nextInt(200);
        int score2 = rand.nextInt(200);

        System.out.println("\nMatch: " + team1.name + " vs " + team2.name);
        System.out.println(team1.name + " Score: " + score1);
        System.out.println(team2.name + " Score: " + score2);

        if (score1 > score2) {
            System.out.println("Winner: " + team1.name);
            team1.addPoints(2);
            return team1;
        } else if (score2 > score1) {
            System.out.println("Winner: " + team2.name);
            team2.addPoints(2);
            return team2;
        } else {
            System.out.println("Match Draw!");
            team1.addPoints(1);
            team2.addPoints(1);
            return null;
        }
    }
}
