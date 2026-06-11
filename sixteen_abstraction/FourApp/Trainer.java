package sixteen_abstraction.FourApp;

import java.util.Scanner;

public class Trainer extends AbstractPerson implements Personable, Payables {

    // Trainer Data
    // Implement Data Hiding i.e Encapsulation 
    private int sessionsTaken;
    private int totalPayment;
    
    public void setSessionsTaken(int sessionsTaken) {
        this.sessionsTaken = sessionsTaken;
    }

    public int getSessionsTaken() {
        return sessionsTaken;
    }

    public void setTotalPayment(int totalPayment) {
        this.totalPayment = totalPayment;
    }

    public int getTotalPayment() {
        return totalPayment;
    }

    // Provide Implementations 

    // implement setPersonDetails() -> Personable Interface
    // public void setPersonDetails();
    public void setPersonDetails(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ID: ");
        setPersonID(input.nextInt());

        System.out.println("Enter Name: ");
        setPersonName(input.next());

        System.out.println("Enter Age: ");
        setPersonAge(input.nextInt());

        System.out.println("Enter Mobile: ");
        setPersonMobileNumber(input.nextInt());

    }

    // implement displayPersonDetails() -> Personable Interface
    // public void displayPersonDetails();
    public void displayPersonDetails(){
        System.out.println("========= Complete Profile Information =========");
        System.out.println("ID: "+getPersonID());
        System.out.println("Name: "+getPersonName());
        System.out.println("Age: "+getPersonAge());
        System.out.println("Mobile Number: "+getPersonMobileNumber());
    }

    // implement calculatePayment()() -> Payables Interface
    // public void calculatePayment();
    public void calculatePayment() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Session Taken: ");
        sessionsTaken = input.nextInt();
        totalPayment = 1500 * sessionsTaken;

        // Student rating -> Bonus Calculation
        Student studentObject = new Student();
        System.out.println("Student Giving Rating To Trainer");
        int bounsAmount = studentObject.trainerRating();
        totalPayment = bounsAmount + totalPayment; 
        System.out.println("Trainer Payment: "+totalPayment);

    }

    
}
