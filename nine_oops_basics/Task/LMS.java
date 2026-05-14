package nine_oops_basics.Task;

public class LMS {
    
    public static void main(String[] args) {
        
        // Student 
        Student mike = new Student();
        mike.studentID = 101;
        mike.studentName = "Mike";
        
        // display student details
        mike.showInfo();

        // achievement
        mike.calculateFinalAchievement();

        // Trainer 
        Trainer ravi = new Trainer();
        ravi.trainerID = 102;
        ravi.trainerName = "Ravi";

        // display trainer details
        ravi.showInfo();

        // trainer payments
        ravi.calculatePayment();

    }

}
