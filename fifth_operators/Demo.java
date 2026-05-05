package fifth_operators;

public class Demo {
    
    public static void main(String[] args) {
        
        // Arithmetic Operators 
        int num1 = 10;
        int num2 = 5;
        System.out.println("Sum Of Numbers: " +(num1 + num2)); 
        System.out.println("Difference Of Numbers: " +(num1 - num2)); 
        System.out.println("Product Of Numbers: " +(num1 * num2)); 
        System.out.println("Division Of Numbers: " +(num1 / num2)); 
        System.out.println("Modulus Of Numbers: " +(num1 % num2)); 

        // Increment / Decrement Operators
        int count = 0;
        System.out.println(("Count is: " +count));
        count++; // Increment 
        System.out.println(("Count is: " +count));

        int newCount = 10;
        System.out.println(("Count is: " +newCount));
        newCount--; // Decrement
        System.out.println(("Count is: " +newCount));

        // Compound Assignment Operators 
        int valueX = 10;
        System.out.println("Before Value is: " +valueX);
        valueX = valueX + 5; // long form i.e no Compound Assignment Operator
        System.out.println("After Value is: " +valueX);

        int valueY = 10;
        System.out.println("Before Value is: " +valueY);
        valueY += 5; // short form i.e with Compound Assignment Operator
        System.out.println("After Value is: " +valueY);

        int valueZ = 10;
        System.out.println("Before Value is: " +valueZ);
        valueZ *= 5; // short form i.e with Compound Assignment Operator
        System.out.println("After Value is: " +valueZ);


        // Comparison / Relational Operators 
        int n1 = 10;
        int n2 = 5;

        System.out.println(n1 == n2); // false 
        System.out.println(n1 != n2); // true 
        System.out.println(n1 > n2); // true 

        System.out.println("===================");

        // Logical Operators 
        int a = 5;
        int b = 4;
        int c = 3;
        int d = 2;

        System.out.println(a > b && c < d); // T && F -> F 
        System.out.println(a > b && c > d); // T && T -> T 

        System.out.println(a > b || c < d); // T || F -> T
        System.out.println(a > b || c > d); // T || T -> T 
        System.out.println(a < b || c < d); // F || F -> F

        System.out.println(a > b); // T
        System.out.println(! (a > b)); // ! T -> F
        
        // Bitwise Operators
        int b1 = 5; // 0000000000000101
        int b2 = 3; // 0000000000000011 
                    // 0000000000000111 -> |
                    // 0000000000000001 -> &   

        System.out.println(b1 & b2); // 1
        System.out.println(b1 | b2); // 7

    }

}
