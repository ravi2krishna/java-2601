package nine_oops_basics;

public class CarObjects {
    
    public static void main(String[] args) {
        
        // Create Maruti Suzuki Brezza Object 
        CarNavigator brezzaCar = new CarNavigator();

        // Assign Data To Brezza Car i.e object
        brezzaCar.colorCar = "Red";
        brezzaCar.brandCar = "Maruti";
        brezzaCar.modelCar = "Brezza";
        brezzaCar.priceCar = 13.01;

        //Display Brezza Car Info 
        System.out.println("Loading From Car Dekho Website");
        brezzaCar.displayCarInfo();

        System.out.println("====================================");

        // Create Tata Punch Object 
        CarNavigator punchCar = new CarNavigator();

        // Assign Data To Brezza Car i.e object
        punchCar.colorCar = "Orange";
        punchCar.brandCar = "Tata";
        punchCar.modelCar = "Punch";
        punchCar.priceCar = 10.60;

        //Display Punch Car Info 
        System.out.println("Loading From Car Dekho Website");
        punchCar.displayCarInfo();

    }

}
