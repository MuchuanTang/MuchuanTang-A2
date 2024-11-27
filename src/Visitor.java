/**
 * Visitor.java
 */
public class Visitor extends Person {

    //height (cm)
    private int height;

    //isRecentSurgery
    private boolean isRecentSurgery;

    public Visitor() {
    }

    public Visitor(String name, String sex, String phoneNumber, int height, boolean isRecentSurgery) {
        super(name, sex, phoneNumber);
        this.height = height;
        this.isRecentSurgery = isRecentSurgery;
    }

    /*
        get set methods
     */
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isRecentSurgery() {
        return isRecentSurgery;
    }

    public void setRecentSurgery(boolean recentSurgery) {
        isRecentSurgery = recentSurgery;
    }

    @Override
    public String toString() {
        return "Visitor{" +
                "name=" + super.getName() +
                ", sex=" + super.getSex() +
                ", phoneNumber=" + super.getPhoneNumber() +
                ", height=" + height +
                ", isRecentSurgery=" + isRecentSurgery +
                '}';
    }

    public String toCSV() {
        return super.getName() + "," + super.getSex() + "," + super.getPhoneNumber() + "," + height + "," + isRecentSurgery;
    }
}
