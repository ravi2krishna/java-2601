package sixteen_abstraction.Three;

// Abstract Parent Class

abstract class Vehicle {
    String brand;

    // Constructor (called when a subclass object is instantiated)
    Vehicle(String brand) {
        this.brand = brand;
    }

    // Abstract method: Has no body and MUST be implemented by subclasses
    abstract void accelerate();

    // Concrete method: Shared functionality inherited by all subclasses
    void displayBrand() {
        System.out.println("Vehicle brand: " + this.brand);
    }
}

// Concrete Subclass
class Car extends Vehicle {
    Car(String brand) {
        super(brand); // Invoking the parent abstract class constructor
    }

    // Overriding and implementing the abstract method
    @Override
    void accelerate() {
        System.out.println("The car accelerates rapidly using an internal combustion engine.");
    }

    
}

public class FiveAbstractClass {
    public static void main(String[] args) {
        // Vehicle v = new Vehicle("Tesla"); // Error: Vehicle is abstract

        // Using Polymorphism: Abstract class reference pointing to a subclass object
        Vehicle myCar = new Car("Ford"); 
        
        myCar.displayBrand(); // Outputs: Vehicle brand: Ford
        myCar.accelerate();   // Outputs: The car accelerates rapidly...
    }
}