import java.util.ArrayList;
import java.util.List;

public class TeamLead {

    private String name;

    private List<Programmer> team;

    private String status;

    public TeamLead(String name, List<Programmer> team) {
        this.name = name;
        this.team = team;
        this.status = "available";
    }

    public void setAvailable() {
        status = "Available";
    }

    public void setNotAvailable() {
        status = "Not available";
    }

    public String doTask(String taskMsg) throws AllProgrammersAreBusyNowException {
        List<String> reasons = new ArrayList<>();
        if (status.equals("Not available")) throw new TeamLeadUnavailableNowException("Team Lead " + name + " is not available");
        for (Programmer programmer : team) {
            try {
                return programmer.doWork(taskMsg);
            } catch (MyUncheckedException e) {
                reasons.add(e.getMessage());
            }
        }
        throw new AllProgrammersAreBusyNowException("Задача не выполнена", reasons);
    }
}
