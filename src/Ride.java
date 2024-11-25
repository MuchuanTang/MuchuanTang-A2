/**
 * Ride.java
 */
public class Ride {

    private Employee employee;

    // playItem
    private String playItem;

    //riderRequirements
    private String riderRequirements;

    public Ride() {
    }

    public Ride(Employee employee, String playItem, String riderRequirements) {
        this.employee = employee;
        this.playItem = playItem;
        this.riderRequirements = riderRequirements;
    }

    /*
        get set methods
     */
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getPlayItem() {
        return playItem;
    }

    public void setPlayItem(String playItem) {
        this.playItem = playItem;
    }

    public String getRiderRequirements() {
        return riderRequirements;
    }

    public void setRiderRequirements(String riderRequirements) {
        this.riderRequirements = riderRequirements;
    }
}

