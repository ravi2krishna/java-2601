package fifteen_encapsulation.SevenApp;

import java.util.Scanner;

public class LMSOne {
    
    public static void main(String[] args) {
        
        
        Student student = new Student();
        Scanner input = new Scanner(System.in);

        // Institute Details
        Student.instituteInformation();

        // display student complete details - Click
        student.personCompleteInfo();

        // calculateCourseFee
        student.calculateCourseFee();

        // achievement
        student.calculateFinalAchievement();

        // Trainer 
        Trainer trainer = new Trainer();
        
        // display trainer details
        trainer.personCompleteInfo();

        // trainer payments
        trainer.calculatePayment();

    }

}
