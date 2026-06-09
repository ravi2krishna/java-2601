package sixteen_abstraction.One;

public class FourUser {
    
    public static void main(String[] args) {
        
        System.out.println("Customer Buying Dell Laptop");
        TwoDellLaptop dell = new TwoDellLaptop();
        dell.processorComponent();
        dell.memoryComponent();

        System.out.println("Customer Buying Lenovo Laptop");
        ThreeLenovoLaptop lenovo = new ThreeLenovoLaptop();
        lenovo.diskComponent();
        lenovo.networkComponent();

    }

}
