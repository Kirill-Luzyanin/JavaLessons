public class Programmer {
    private String name;
    private String status;

    public Programmer(String name) {
        this.name = name;
        status = "Available";
    }

    public void setBusy() {
        status = "Busy";
    }

    public void setAvailable() {
        status = "Available";
    }

    public void setNotAvailable() {
        status = "Not available";
    }

    public String doWork (String taskMsg) throws ProgrammerUnavailableNowException, ProgrammerBusyException{
        if (status.equals("Not available")) throw new ProgrammerUnavailableNowException("Programmer " + name + " is not available");
        if (status.equals("Busy")) throw new ProgrammerBusyException("Programmer " + name + " is busy");
        return taskMsg.toUpperCase();

    }

}
