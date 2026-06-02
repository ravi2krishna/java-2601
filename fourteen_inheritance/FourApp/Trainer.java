package fourteen_inheritance.FourApp;

import java.util.Scanner;

public class Trainer extends Person {
    
    // Trainer Data
    int sessionsTaken;
    int totalPayment;

    //Constructor
    public Trainer(int trainerID, String trainerName, int trainerAge, int trainerMobileNumber) {
        super(trainerID, trainerName, trainerAge, trainerMobileNumber);
    }

    // Calculate payment for sessions
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
