// The most searched cars - Navigator
package nine_oops_basics;

// blueprint for car creation (Properties & Behaviors)
public class CarNavigator {
    
    // Characteristics / Properties / Variables
    String colorCar;
    String brandCar;
    String modelCar;
    double priceCar;

    // Behaviors / Actions / Methods
    public void displayCarInfo() {
        System.out.println("Car Brand: "+brandCar);
        System.out.println("Car Model: "+modelCar);
        System.out.println("Car Price: "+priceCar);
        System.out.println("Car Color: "+colorCar);
    }

}
