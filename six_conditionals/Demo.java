package six_conditionals;

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

        System.out.println(("===================="));  

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


    }

}
