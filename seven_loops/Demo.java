package seven_loops;

import java.util.Scanner;

public class Demo {
    
    public static void main(String[] args) {
        
        // Without Loops 

        // Greet 
        System.out.println("Good Morning");

        // Greet 20 times (Manual - repeating)
        System.out.println("Good Morning");
        System.out.println("Good Morning");
        System.out.println("Good Morning");
        System.out.println("Good Morning");
        System.out.println("Good Morning");
        System.out.println("Good Morning");
        System.out.println("Good Morning");
        System.out.println("Good Morning");
        System.out.println("Good Morning");
        System.out.println("Good Morning");
        System.out.println("Good Morning");
        System.out.println("Good Morning");
        System.out.println("Good Morning");
        System.out.println("Good Morning");
        System.out.println("Good Morning");
        System.out.println("Good Morning");
        System.out.println("Good Morning");
        System.out.println("Good Morning");
        System.out.println("Good Morning");
        System.out.println("Good Morning");

        // Syntax - Increment - Forward Direction
        for(int count=1; count <= 5; count++) {
            System.out.println("Count is: "+count);
        }

        // With Loops 
        // Greet 20 times (Manual - repeating)
        //Used when you know number of Iterations / Repetitions in advance 
        for(int count=1; count <= 200; count++) {
            System.out.println("Good Morning: "+count);
        }

        // Syntax - Decrement - Backward Direction
        for(int count=10; count >= 1; count--) {
            System.out.println("Count is: "+count);
        }

        System.out.println("================");

        // Syntax - while loop 
        int count = 1;
        while (count <= 5) {
            System.out.println("Count is: "+count);
            count++;
        }

        System.out.println("================");

        // use while when you DON'T know number of Iterations / Repetitions in advance   
        // You found a lost phone, trying to break its password 
        // Tell me at what attempt, phone will be unlocked ??
        int correctPin = 5678;
        int enteredPin = 0;

        Scanner input = new Scanner(System.in);
        while (enteredPin != correctPin) {
            System.out.println("Enter PIN: ");
            enteredPin = input.nextInt();
        }
        System.out.println("Phone Successfully Unlocked");


        System.out.println("================");

        // do-while 
        // but runs the code at least once, before checking the condition 
        int ct = 7;

        do {
            System.out.println(ct);
            ct++;
        } while (ct <=5 );

        // Menu Driven App 
        int choice;
        do {
            System.out.println("======= Menu =======");
            System.out.println("1 - Deposit");
            System.out.println("2 - Withdraw");
            System.out.println("3 - Balance");
            System.out.println("4 - Exit");

            System.out.println("Enter Choice: ");
            choice = input.nextInt();
            
        } while (choice != 4);

        System.out.println("Application Closed");

        // Generate Math Tables 
        // 1 X 1 - 1 X 2 - 1 X 3 - 1 X 4 - 1 X 5
        // 2 X 1 - 2 X 2 - 2 X 3 - 2 X 4 - 2 X 5
        // 3 X 1 - 3 X 2 - 3 X 3 - 3 X 4 - 3 X 5
        // 4 X 1 - 3 X 2 - 4 X 3 - 4 X 4 - 4 X 5
        // 5 X 1 - 5 X 2 - 5 X 3 - 4 X 4 - 5 X 5

        // take one as outer, for this outer loop inner 5 time 
        
        // nested for loop
        for (int outer = 1; outer <=5 ; outer++) {
            // System.out.println(outer);
            for (int inner = 1; inner <=5 ; inner++) {
                // 1 X 1 - 1 X 2 - 1 X 3 - 1 X 4 - 1 X 5
                System.out.println(outer + "X" + inner + " = " +(outer * inner));
            }
        }
        // for (int inner = 1; inner <=5 ; inner++) {
        //     System.out.println(inner);
        // }

        System.out.println("================");

        // nested while loop
        int outer = 1;
        while (outer <=5) {
            int inner = 1;
            while (inner <=5) {
                System.out.println(outer + "X" + inner + " = " +(outer * inner));
                inner++;
            }
            outer++;
        }


    }

}
