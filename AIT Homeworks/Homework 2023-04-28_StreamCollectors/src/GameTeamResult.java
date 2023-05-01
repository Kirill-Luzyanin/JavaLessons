public class GameTeamResult {

    private String team;
    private int goals;

    public GameTeamResult(String team, int goals) {
        this.team = team;
        this.goals = goals;
    }

    public String getTeam() {
        return team;
    }

    public int getGoals() {
        return goals;
    }

    @Override
    public String toString() {
        return "team:" + team + " goals:" + goals;
    }
}
