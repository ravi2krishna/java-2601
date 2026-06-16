package seventeen_polymorphism.TwoApp;

public class LMS {

    public static void main(String[] args) {
        
        Personable student = new Student();
        
        // Institute Details
        Student.instituteInformation(); 

        // Set Student Details
        student.setPersonDetails();

        // Get Student Details
        student.displayPersonDetails();

        // Calculate Course Fee 
        ((Payables)student).calculatePayment();

        // Calculate Achievement 
        student.calculateFinalAchievement();

        Personable trainer = new Trainer();

        // Set Trainers Details
        trainer.setPersonDetails();

        // Get Trainer Details
        trainer.displayPersonDetails();

        // Calculate Course Fee 
        ((Payables)trainer).calculatePayment();


    }

}
