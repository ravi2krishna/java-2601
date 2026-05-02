package second_identifiers;

public class Demo {
    
    public static void main(String[] args) {
        
        // Identifiers
        String today = "monday";
        System.out.println(today);

        // String 2day = "monday"; // Syntax error Identifier starts with digit 
        // System.out.println(2day);

        String day2moro = "tuesday";
        System.out.println(day2moro);

        String _2moro = "tuesday";
        System.out.println(_2moro);

        String $2moro = "tuesday";
        System.out.println($2moro);

        // String @2moro = "tuesday"; // Syntax error Identifier starts with @ 
        // System.out.println(@2moro);

        // String class = "Tenth"; // Syntax error Identifier is a keyword 
        // System.out.println(class);

        // Improper Way Of Naming Identifiers
        String x = "Ravi";
        int y = 25;
        double z = 9.5;

        // Proper Way Of Naming Identifiers
        String studentName = "Ravi";
        int studentAge = 25;
        double studentGpa = 9.5;

        // UPPER CASE for Static Data
        double pi = 3.14159265359; // not recommended
        double PI = 3.14159265359; // recommended
        double PI_VALUE = 3.14159265359; // recommended
        String PAN_ID = "AHUOP9987S"; // recommended
        
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        System.out.println(studentName);
        System.out.println(studentAge);
        System.out.println(studentGpa);

        System.out.println(pi);
        System.out.println(PI);
        System.out.println(PI_VALUE);
        System.out.println(PAN_ID);

    }
    
}
