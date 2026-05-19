package ten_constructors.five;

public class OverLoading {

    // Constructor overloading - more than one constructor with the same name
    // Number Of Parameters
    // Type Of Parameters
    // Order Of Parameters

    // Number Of Parameters
    public OverLoading(int a, int b) {
        System.out.println("Sum: "+(a+b));
    }

    // Type Of Parameters
    public OverLoading(int a, double b) {
        System.out.println("Sum: "+(a+b));
    }

    // Order Of Parameters
    public OverLoading(double a, int b) {
        System.out.println("Sum: "+(a+b));
    }


    public static void main(String[] args) {
        
        OverLoading obj1 = new OverLoading(5.5, 10);
        OverLoading obj2 = new OverLoading(5,1.5);
        OverLoading obj3 = new OverLoading(1,2);


    }
    
}