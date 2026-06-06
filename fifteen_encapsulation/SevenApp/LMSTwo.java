package fifteen_encapsulation.SevenApp;

import java.util.Scanner;

public class LMSTwo {
    
    public static void main(String[] args) {
        
        Student student = new Student();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter ID: ");
        student.setPersonID(input.nextInt());

        System.out.println("Enter Name: ");
        student.setPersonName(input.next());

        System.out.println("Enter Age: ");
        student.setPersonAge(input.nextInt());

        System.out.println("Enter Mobile: ");
        student.setPersonMobileNumber(input.nextInt());

        System.out.println("Enter Course Fee: ");
        student.setCourseFee(input.nextDouble());

        System.out.println("Enter Coupon Code: ");
        student.setCoupon(input.next());

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

        System.out.println("Enter ID: ");
        trainer.setPersonID(input.nextInt());

        System.out.println("Enter Name: ");
        trainer.setPersonName(input.next());

        System.out.println("Enter Age: ");
        trainer.setPersonAge(input.nextInt());

        System.out.println("Enter Mobile: ");
        trainer.setPersonMobileNumber(input.nextInt());
        
        // display trainer details
        trainer.personCompleteInfo();

        // trainer payments
        trainer.calculatePayment();

    }

}
