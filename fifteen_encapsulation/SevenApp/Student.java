package fifteen_encapsulation.SevenApp;

import java.util.Scanner;

public class Student extends Person {

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

    // Calculate Course Fee to apply String Concept 
    public void calculateCourseFee() {
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
