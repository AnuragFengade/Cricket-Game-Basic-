 import java.util.*;

public class Tournament {
    List<Team> teams = new ArrayList<>();

    public void addTeams() {
        teams.add(new Team("Lonar Sarovar Kings"));
        teams.add(new Team("Vidharbh Riders"));
        teams.add(new Team("Mumbai Villa"));
        teams.add(new Team("Buldhana Sadan 11"));
        teams.add(new Team("Malkapur NCC"));
        teams.add(new Team("Deulgaon Raja 11"));
        teams.add(new Team("Khamgaon Raja 11"));
        teams.add(new Team("Mehakar Titans"));
        teams.add(new Team("Chikhali Pentium 11"));
        teams.add(new Team("Nandura Elevens"));
    }

    public void playLeague() {
        System.out.println("\n--- League Matches ---");

        for (int i = 0; i < teams.size(); i++) {
            for (int j = i + 1; j < teams.size(); j++) {
                Match match = new Match(teams.get(i), teams.get(j));
                match.playMatch();
            }
        }
    }

    public void showPointsTable() {
        System.out.println("\n--- Points Table ---");
        teams.sort((a, b) -> b.points - a.points);

        for (Team t : teams) {
            System.out.println(t);
        }
    }

    public void playFinal() {
        Team finalist1 = teams.get(0);
        Team finalist2 = teams.get(1);

        System.out.println("\n--- FINAL MATCH ---");
        Match finalMatch = new Match(finalist1, finalist2);
        Team winner = finalMatch.playMatch();

        System.out.println("\n🏆 Champion: " + winner.name);
    }
}