 public class Main {
    public static void main(String[] args) {
        Tournament t = new Tournament();

        t.addTeams();
        t.playLeague();
        t.showPointsTable();
        t.playFinal();
    }
}