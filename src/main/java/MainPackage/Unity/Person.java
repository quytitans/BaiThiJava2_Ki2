package MainPackage.Unity;

public class Person {
    String ID;
    String name;
    String phoneNumber;

    public Person() {
    }

    public Person(String ID, String name, String phoneNumber) {
        this.ID = ID;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return String.format("|%10s%15s%10s|%10s%20s%10s|",
                "", this.name, "",
                "", this.phoneNumber, ""
        );
    }
}
