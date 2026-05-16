package ten_constructors.three;

public class Bank {
    
    // Instance Variable
    double minimumBalance;

    // method to show balance
    public double showBalance() {
        return minimumBalance;
    }

    // Constructor For Initializing Account With Minimum Balance 
    public Bank() {
        System.out.println("===== HDFC =====");
        System.out.println("Creating HDFC Account");
        minimumBalance = 10000;

        // Service Charge - 1500
        minimumBalance -= 1500;

    }

    // Create Bank Account With Custom Balance 
    public Bank(double customMinimumBalance) {
        System.out.println("===== HDFC =====");
        System.out.println("Creating HDFC Account");
        minimumBalance = customMinimumBalance;

        // Service Charge - 1500
        minimumBalance -= 1500;
    }

    public static void main(String[] args) {

        Bank customerOneHDFC = new Bank(); // 
        System.out.println("Customer One Balance: "+customerOneHDFC.showBalance());

        Bank customerTwoHDFC = new Bank(); // 
        System.out.println("Customer Two Balance: "+customerTwoHDFC.showBalance());

        Bank customerThreeHDFC = new Bank(50000); // 
        System.out.println("Customer Three Balance: "+customerThreeHDFC.showBalance());

        Bank customerFourHDFC = new Bank(20000); // 
        System.out.println("Customer Four Balance: "+customerFourHDFC.showBalance());
        
    }


}
