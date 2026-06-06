package fifteen_encapsulation.SevenApp;

// Parent for all user entities like Student, Trainer, Mentor, VideoAdmin, SuperAdmin etc
public class Person {
    
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

    // Display Complete Info 
    public void personCompleteInfo() {
        System.out.println("========= Complete Profile Information =========");
        System.out.println("ID: "+personID);
        System.out.println("Name: "+personName);
        System.out.println("Age: "+personAge);
        System.out.println("Mobile Number: "+personMobileNumber);

    }

}
