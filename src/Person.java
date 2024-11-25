/**
 * Person.java
 */
public class Person {

    /**
     * The name
     */
    private String name;
    /**
     * The sex
     */
    private String sex;
    /**
     * phone
     */
    private String phoneNumber;


    public Person() {
    }

    public Person(String name, String sex, String phoneNumber) {
        this.name = name;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
    }

    /*
        get set methods
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
