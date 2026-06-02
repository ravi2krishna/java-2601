package fourteen_inheritance.FourApp;

// Parent for all user entities like Student, Trainer, Mentor, VideoAdmin, SuperAdmin etc
public class Person {
    
    // all common attributes
    int personID;
    String personName;
    int personAge;
    int personMobileNumber;

    public Person() {

    }

    public Person(int personID, String personName, int personAge, int personMobileNumber) {
        this.personID = personID;
        this.personName = personName;
        this.personAge = personAge;
        this.personMobileNumber = personMobileNumber;
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
