package fourteen_inheritance.FourApp;

public class LMS {
    
    public static void main(String[] args) {
        
        // Student default constructor 
        Student mike = new Student();

        // Student with hover 
        Student john = new Student(101, "John");

        // Student with Click 
        Student ravii = new Student(102, "Ravi",20,9009090,20000,"NO");
        
        // Institute Details
        Student.instituteInformation();

        // display student complete details - Click
        ravii.personCompleteInfo();

        // calculateCourseFee
        ravii.calculateCourseFee();

        // achievement
        mike.calculateFinalAchievement();

        // Trainer 
        Trainer ravi = new Trainer(102,"Krishna",29,808080);
        
        // display trainer details
        ravi.personCompleteInfo();

        // trainer payments
        ravi.calculatePayment();

    }

}
