package ten_constructors.six;

import java.util.Scanner;

public class Student {
    
    // Student Data
    int studentID;
    String studentName;
    String studentEmail;
    String studentGender;
    String studentLocation;

    int studentAttendance;
    int studentScore;

    // Default Constructor 
    public Student() {
        System.out.println("Default Called");
    }

    
    // Parametrized Constructor 
    // hover show only few details - studentID, studentName
    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    // Constructor Overloading
    // click show all details - studentID, studentName, studentEmail, studentGender, studentLocation
    public Student(int studentID, String studentName, String studentEmail, String studentGender,
            String studentLocation) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentEmail = studentEmail;
        this.studentGender = studentGender;
        this.studentLocation = studentLocation;
    }


    // Method To Display Info - hover 
    public void showInfo() {
        System.out.println("======== Student Basic Details ========");
        System.out.println("Student ID: "+studentID);
        System.out.println("Student Name: "+studentName);
    }

    // Method To Display All Info - click 
    public void showCompleteInfo() {
        System.out.println("======== Student Complete Details ========");
        System.out.println("Student ID: "+studentID);
        System.out.println("Student Name: "+studentName);
        System.out.println("Student Email: "+studentEmail);
        System.out.println("Student Gender: "+studentGender);
        System.out.println("Student Location: "+studentLocation);
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

    // Calculate Score Credits 
    public int calculateScoreCredits() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Score (0-100): ");
        int score = input.nextInt();

        if (score >=85) {
            return 5;
        } else if (score >=60) {
            return 3;
        } else {
            return 0;
        }
    }

    // Calculate Final Achievement
    public void calculateFinalAchievement() {
        int finalCredits = calculateAttendanceCredits() + calculateScoreCredits();
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
