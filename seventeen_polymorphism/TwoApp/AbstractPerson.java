package seventeen_polymorphism.TwoApp;

public abstract class AbstractPerson {

    // all common attributes
    // Implement Data Hiding i.e Encapsulation
    private int personID;
    private String personName;
    private int personAge;
    private int personMobileNumber;

    // Getters & Setters 
    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonAge(int personAge) {
        if (personAge > 0) {
            this.personAge = personAge;
        } else {
            System.out.println("Person Age Should be Above Zero");
        }
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonMobileNumber(int personMobileNumber) {
        this.personMobileNumber = personMobileNumber;
    }

    public int getPersonMobileNumber() {
        return personMobileNumber;
    }

}
