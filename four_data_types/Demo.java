package four_data_types;

public class Demo {
    
    public static void main(String[] args) {
        
        // Primitive Data Types (Simple Data Types) (Predefined)

        // byte
        // byte byteValue = 9000000000; // out of range
        byte byteValue = 9;

        // short
        short shortValue = 999;

        // int 
        int intValue = 9999;

        // long 
        // long longValue = 99999999999999; // Add l
        long longValue = 99999999999999l;

        // float 
        // float floatValue = 3.14; // Add f
        float floatValue = 3.14f;

        // double 
        double doubleValue = 32.822922982;

        // char 
        char charValue = 'c';
        
        // boolean
        boolean booleanValue = true;

        // Non-Primitive Data Types (Complex  Data Types) (Predefined) (User defined)
        String greetMorning = "Good Morning Everyone";
        String greetEvening = "Good Evening Everyone";

        int [] employeeIDS = {101,102,103,104};
        
        // User Defined Custom Data Type
        class Student {

        }

        // User Defined Custom Data Type
        class Employee {

        }

        // No Concatenation 
        System.out.println(charValue);
        System.out.println(booleanValue);

        // With Concatenation 
        System.out.println("The Value Of Character is: " +charValue);
        System.out.println("Today The Class is Happening: " +booleanValue);
        System.out.println(greetMorning + greetEvening);
    }

}
