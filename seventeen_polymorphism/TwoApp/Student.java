package seventeen_polymorphism.TwoApp;

import java.util.Scanner;

public class Student extends AbstractPerson implements Personable,Payables {

    // Static Variables 
    // Implement Data Hiding i.e Encapsulation 
    private static String instituteName;
    private static double globalDiscount; 
    // 10% globalDiscount - unlike instance method calculateCourseFee
    // which applies discount only to specific students with coupons 

    // Static Block for initialization of Static Variables  
    static {
        instituteName = "Digital Institute";
        globalDiscount = 0.1;
    }

    // Static Method To Display Common Data i.e Static Variables  
    public static void instituteInformation(){
        System.out.println("============== Institute Details ==============");
        System.out.println("Institute Name: "+Student.instituteName); // using class name
        System.out.println("=================");
        System.out.println("OFFER NOTIFICATION");
        System.out.println("=================");
        // We can access static variables inside static methods without classname
        System.out.println("Great News!!! Currently We Have Discount Of For EverOne "+(globalDiscount * 100) +"%" ); 
    }
    
    // Student Data - Instance Variables  
    // Implement Data Hiding i.e Encapsulation
    // Course Fee Related Variables For String Functionality
    private double courseFee;
    private String coupon;

    // Take Dynamic Scores i.e with arrays 
    private int [] subjectScores;

    // Setters & Getters
    public void setCourseFee(double courseFee) {
        this.courseFee = courseFee;
    }

    public double getCourseFee() {
        return courseFee;
    }

    public void setCoupon(String coupon) {
        this.coupon = coupon;
    }

    public String getCoupon() {
        return coupon;
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

        System.out.println("Enter Course Fee: ");
        setCourseFee(input.nextDouble());

        System.out.println("Enter Coupon Code: ");
        setCoupon(input.next());
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
        double discount = 0;

        // if Coupon is PROMO apply 5000 Discount 
        // if Coupon is 50-OFF apply 15000 Discount 
        String couponApplied = coupon;

        if (couponApplied.equals("PROMO")) {
            discount = 5000;
        } else if (couponApplied.equals("50-OFF")) {
            discount = 15000;
        } else {
            discount = 0;
        }

        // Apply Global Discount 10% Off
        double globalDiscountApplied = courseFee * globalDiscount;

        double finalCourseFee = courseFee - discount;

        System.out.println("Actual Course Fee: "+courseFee);
        System.out.println("Discount Applied: "+discount);
        System.out.println("Global Discount Applied: "+globalDiscountApplied);

        System.out.println("Final Fee To Pay: "+(finalCourseFee - globalDiscountApplied));

        // Fee Payment Options 
        System.out.println("====== PAYMENT PROCESSING ======");
        System.out.println("Select One Of Payment Options Below");
        System.out.println(("1-NetBanking 2-CreditCard 3-UPI"));

        Scanner input = new Scanner(System.in);
        int option = input.nextInt();

        PaymentProcessor processor =new PaymentProcessor();

        if (option == 1) {
            NetBankingPayment bankName = new NetBankingPayment();
            bankName.setBankName(bankName.getBankName());
            System.out.println("Processing Fee: "+(finalCourseFee - globalDiscountApplied));
            processor.makePayment((finalCourseFee - globalDiscountApplied),bankName.getBankName());
        } else if(option == 2) {
            System.out.println("Do For Card Payment");
        } else if(option == 3) {
            System.out.println("Do For UPI Payment");
        } else {
            System.out.println("Only Select 1 or 2 or 3");
        }

    }

    // Calculate Attendance Credits 
    public int calculateAttendanceCredits() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Attendance (1-31): ");
        int attendance = input.nextInt();

        if (attendance >=31) {
            return 5;
        } else if (attendance >=20) {
            return 3;
        } else {
            return 0;
        }
    }

    // Calculate Score Dynamically like average
    public int calculateAverageScore() {

        System.out.println("Enter Number Of Subjects: ");
        Scanner input = new Scanner(System.in);
        int numOfSubjects = input.nextInt();
        
        subjectScores = new int[numOfSubjects];

        int totalMarks = 0;

        for (int i = 0; i < subjectScores.length; i++) {
            System.out.println("Enter Score For Subject: "+(i+1));
            subjectScores[i] = input.nextInt();
            totalMarks +=  subjectScores[i];
        }

        // average score 
        int averageScore = totalMarks / subjectScores.length;
        return averageScore;

    }

    // Calculate Score Credits 
    public int calculateScoreCredits(int averageScore) {

        if (averageScore >=85) {
            return 5;
        } else if (averageScore >=60) {
            return 3;
        } else {
            return 0;
        }
    }

    // Calculate Final Achievement
    public void calculateFinalAchievement() {
        int finalCredits = calculateAttendanceCredits() + calculateAverageScore();
        if (finalCredits >=10) {
            System.out.println("Good");
        } else if (finalCredits >=8) {
            System.out.println("Better");
        } else {
            System.out.println("Improve");
        }
    }

    // Give Rating To Trainer
    public int trainerRating() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Trainer Rating (1-5): ");
        int trainerRating = input.nextInt();

        if (trainerRating == 5) {
            return 5000;
        } else {
            return 0;
        }
    }

}
