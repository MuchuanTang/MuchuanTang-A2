/**
 * Employee.java
 */
public class Employee extends Person {

    // idCard, position
    private String idCard;

    // position
    private String position;

    public Employee() {
    }

    public Employee(String name, String sex, String phoneNumber, String idCard, String position) {
        super(name, sex, phoneNumber);
        this.idCard = idCard;
        this.position = position;
    }

    /*
        get set methods
     */
    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
