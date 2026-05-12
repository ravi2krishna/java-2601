package eight_branching;

import java.util.Scanner;

public class TaskOne {
    
    public static void main(String[] args) {
        
        // Take Inputs
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter ID: ");
        int studentID = input.nextInt();

        System.out.println("Enter Name: ");
        String studentName = input.next();

        System.out.println("Enter Attendance %: ");
        int studentAttendance = input.nextInt();

        String continueInput = "yes";
        int numberOfScores = 0; // 1 2 3
        int totalScore = 0; //60 + 60 + 40

        while (continueInput.equals("yes") ) {
            System.out.println("Enter Score For Subject: "+(numberOfScores+1));
            int currentScore = input.nextInt();
            numberOfScores++;
            totalScore += currentScore; // currentScore + totalScore
            System.out.println("Do you want to enter another score ? (yes/no): ");    
            continueInput = input.next(); 
        }

        // average score
        double averageScore = totalScore / numberOfScores;

        // Grade Check
        String gradeResult;
        if (averageScore >= 85) {
            gradeResult = "A";
        } else if (averageScore >= 75) {
            gradeResult = "B";
        } else if (averageScore >= 60) {
            gradeResult = "C";
        }
        else {
            gradeResult = "FAILED";
        }

        // Final Outputs 
        System.out.println("Student ID: "+studentID);
        System.out.println("Student Name: "+studentName);
        System.out.println("Total Score: "+totalScore);
        System.out.println("Average Score: "+averageScore);
        System.out.println("Grade: "+gradeResult);
        System.out.println("Number Of Scores: "+numberOfScores);
        
        // Award Check
        if (averageScore >= 85 && studentAttendance >=75) {
            System.out.println("Got Awarded");
        } else {
            System.out.println("Not Awarded");
        }

        input.close();

    }

}
