package seventeen_polymorphism.One;

public class OneCalculator {
    
    // Method Overloading 
    // public void add() {
    //     // add two numbers
    // }

    // public void add() { // Duplicate method 
    //     // add three numbers
    // }

    // this is not method overloading i.e no polymorphism
    public void addTwoNumbers() {
        // add two numbers 
    }

    public void addThreeNumbers() {
        // add three numbers 
    }

    // Method Overloading 
    public void add(int a, int b) {
        // add two numbers
        System.out.println("Sum Of Numbers: "+(a+b));
    }

    public void add(int a, int b, int c) { 
        // add three numbers
        System.out.println("Sum Of Numbers: "+(a+b+c));
    }

    public void add(int a, double b) {
        // add two numbers
        System.out.println("Sum Of Numbers: "+(a+b));
    }

    public void add(double a, double b) {
        // add two numbers
        System.out.println("Sum Of Numbers: "+(a+b));
    }

    public static void main(String[] args) {
        
        OneCalculator obj = new OneCalculator();
        obj.add(10,10);
        obj.add(10, 3.5);
        obj.add(10, 10,10);
        obj.add(10.1, 10.2);

    }



}
