package six_conditionals;

import java.util.Scanner;

public class Demo {
    
    public static void main(String[] args) {
        
        // if 
        if (5 > 2) {
            System.out.println("Yes 5 > 2 is correct");
        }

        if (5 < 2) { // Dead code
            System.out.println("Yes 5 > 2 is correct");
            System.out.println("This block will never execute");
        }

        //int num = 10;
        int num = -10;

        if (num > 0){
            System.out.println("Given Num is Positive");
        }
        if (num < 0){
            System.out.println("Given Num is Negative");
        }

        System.out.println(("===================="));

        // if else 
        int numb = 10;
        if (numb > 0) {
            System.out.println("Given Num is Positive");
        } else {
            System.out.println("Given Num is Negative");
        }   

        System.out.println(("===================="));
        
        // Voting Application
        int age = 12;
        if (age >= 18) {
            System.out.println("You Can Vote");
        } else {
            System.out.println("You Cannot Vote");
        }

        System.out.println(("===================="));    

        // Ternary operator
        // variable = (condition) ? value_if_true:value_if_false
        String result = (age >=18) ? "You Can Vote":"You Cannot Vote";
        System.out.println(result);

        System.out.println(("===================="));    

        // else if ladder 
        int marks = 25;
        if (marks >= 35) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }

        System.out.println("====================");  

        // Check For Grades 
        int newMarks = 25;
        if (newMarks >= 90) {
            System.out.println("A Grade");
        } else if (newMarks >= 75) {
            System.out.println("B Grade");
        } else if (newMarks >= 60) {
            System.out.println("C Grade");
        } else if (newMarks >= 50) {
            System.out.println("D Grade");
        } else if (newMarks >= 35) {
            System.out.println("E Grade");
        } else {
            System.out.println("FAILED");
        }

        System.out.println("====================");  

        // switch 
        int dayNumber = 9;
        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Day Selection");
                break;
        }

        System.out.println("===================="); 

        // switch without break
        int dayNum = 3;
        switch (dayNum) {
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Saturday");
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("Invalid Day Selection");
        }

        System.out.println("====================");  

        // switch in modern java (version 17 onwards)
        int day = 6;
        String results = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid Day Selection";
        };
        System.out.println("Selected Day: "+results);

        System.out.println("===================="); 

        // Error Code Handling
        int errorCode = 403;
        String errorMessage = switch (errorCode) {
            case 403 -> "Forbidden Error";
            case 200 -> "Success";
            case 404 -> "Not Found Error";
            default -> "Unknown Error";
        };

        System.out.println("Got Error: "+errorMessage);

        System.out.println("===================="); 

        // User Role Handling
        String userRole = "lead";
        String accessMessage = switch (userRole) {
            case "lead","manager" -> "You have Read, Write & Delete Access";
            case "developer","tester" -> "You have Read & Write Access";
            case "guest" -> "You have Read Only Access";
            default -> "Access Denied";
        };

        System.out.println("Message: "+accessMessage);

        System.out.println("===================="); 

        // User Role Handling with if-else 
        String access;
        if(userRole.equals("lead") || userRole.equals("manager") ) {
            access = "You have Read, Write & Delete Access";
        } else if (userRole.equals("developer") || userRole.equals("tester")) {
            access = "You have Read & Write Access";
        } else if (userRole.equals("guest")) {
            access = "You have Read Only Access";
        } else {
            access = "Access Denied";
        }
        System.out.println("Message: "+access);

        System.out.println("====================");

        // NO Scanner Problem
        String name = "krishna"; // Hardcoded
        System.out.println("Name is: "+ name);

        System.out.println("====================");

        // Scanner For Reading Inputs 
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String newName = reader.next();
        System.out.println("Name is: "+ newName);

        System.out.println("====================");

        // Voting App Dynamic
        System.out.println("Enter Your Age: ");
        int agePerson = reader.nextInt();
        if (agePerson >= 18) {
            System.out.println("You Can Vote");
        } else {
            System.out.println("You Cannot Vote");
        }

        System.out.println("====================");

        // Nested Conditionals 
        // inner condition is only checked, if the outer condition is true. 
        if (true) {
            System.out.println("1");
        }

        // inner condition is only checked, if the outer condition is true. 
        if (true) { // outer condition
            System.out.println("1");
            if (true) { // inner condition
                System.out.println("This is Nested Condition");
            }
        }

        if (true) {
            System.out.println("1");
        }
        if (true) {
            System.out.println("This is Not Nested Condition");
        }
        
        System.out.println("====================");

        // inner condition is only checked, if the outer condition is true
        // here outer condition is false, so didn't execute
        if (false) { // outer condition
            System.out.println("1");
            if (true) { // inner condition
                System.out.println("This is Nested Condition");
            }
        }

        System.out.println("====================");

        // Voting App Dynamic With Nested Conditionals 
        // Real World Scenario - At voting booth first they will check voter id(age confirmation)
        // and aadhar id (identity confirmation)
        System.out.println("Enter Your Age: ");
        int ageCandidate = reader.nextInt();
        if (ageCandidate >= 18) {
            System.out.println("Do You have ID: (yes/no)");
            String hasID = reader.next();
            if (hasID.equals("yes")) {
                System.out.println("You Can Vote");
            } else {
                System.out.println("You Need ID To Vote");
            }           
        } else {
            System.out.println("You Cannot Vote - Too Young");
        }

        reader.close();

        // Real World Scenario Nested Conditionals - NetBanking Login 
        // First Check User Credentials 
        // If User Credentials are Valid, then only ask for "OTP"
        // If OTP is Invalid Login Failed 
        // If User Credentials are Invalid Login Failed 

    }

}
