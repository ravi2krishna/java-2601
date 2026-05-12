package eight_branching;

import java.util.Scanner;

public class TaskTwo {
    
    public static void main(String[] args) {
        
        // maximum attempts - 3
        int attempts = 3;

        // Assume Correct Pin is stored
        int correctPin = 2345;
        // System.out.println("Length: "+correctPin.length()); // 
        // String Pin = "2345";
        // System.out.println("Length: "+Pin.length()); 

        // input reader
        Scanner input = new Scanner(System.in);

        while (attempts > 0) {
            System.out.println("You Have "+attempts +" attempts left");
            System.out.println("Enter PIN: ");
            int userPin = input.nextInt();

            if(String.valueOf(userPin).length() != 4) {
                System.out.println("Transaction Failed - Pin Must be 4 Digit Number");
                attempts--;
                continue;
            } 

            if (userPin == correctPin) {
                System.out.println("Transaction Success");
                break;
            } else {
                System.out.println("Transaction Failed - Incorrect PIN");
                attempts--;
            }

            if (attempts == 0) {
                System.out.println("Maximum attempt reached, Try after 24 Hours ");
            }

        }



    }

}
