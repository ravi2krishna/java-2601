package ten_constructors.seven;

public class LMS {
    
    public static void main(String[] args) {
        
        // Student default constructor 
        Student mike = new Student();

        // Student with hover 
        Student john = new Student(101, "John");

        // Student with Click 
        Student ravii = new Student(102, "Ravi", "ravi2krishna@gmail.com", "Male", "Hyderabad");
        
        // no data initialized 
        mike.showInfo();
        
        // display student partial details - Hover
        john.showInfo();

        // display student complete details - Click
        ravii.showCompleteInfo();

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
