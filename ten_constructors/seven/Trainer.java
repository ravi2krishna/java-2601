package ten_constructors.seven;

import java.util.Scanner;

public class Trainer {
    
    // Trainer Data
    int trainerID;
    String trainerName;
    int sessionsTaken;
    int totalPayment;

    // Method To Display Info 
    public void showInfo() {
        System.out.println("======== Trainer Details ========");
        System.out.println("Trainer ID: "+trainerID);
        System.out.println("Trainer Name: "+trainerName);
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
