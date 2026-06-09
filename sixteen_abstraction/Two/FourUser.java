package sixteen_abstraction.Two;

public class FourUser {
    
    public static void main(String[] args) {
        
        System.out.println("Customer Buying Dell Laptop");
        TwoDellLaptop dell = new TwoDellLaptop(); // No Abstraction yet
        dell.processorComponent();
        dell.memoryComponent();
        dell.diskComponent();
        dell.networkComponent();
        // NOTE: When we click with control on methods above we can see implementation 


        System.out.println("Customer Buying Lenovo Laptop");
        OneLaptop lenovo = new ThreeLenovoLaptop(); // It's Valid Because Of Inheritance
        lenovo.processorComponent();
        lenovo.memoryComponent();
        lenovo.diskComponent();
        lenovo.networkComponent();
        // NOTE: When we click with control on methods above we cannot see implementation now 
        // Now Truly Abstraction is Achieved 

    }

}
