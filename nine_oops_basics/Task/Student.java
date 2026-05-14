package nine_oops_basics.Task;

import java.util.Scanner;

public class Student {
    
    // Student Data
    int studentID;
    String studentName;
    int studentAttendance;
    int studentScore;

    // Method To Display Info 
    public void showInfo() {
        System.out.println("======== Student Details ========");
        System.out.println("Student ID: "+studentID);
        System.out.println("Student Name: "+studentName);
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
