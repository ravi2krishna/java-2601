package fifteen_encapsulation.SevenApp;

import java.util.Scanner;

public class Trainer extends Person {
    
    // Trainer Data
    // Implement Data Hiding i.e Encapsulation 
    private int sessionsTaken;
    private int totalPayment;

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
