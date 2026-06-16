package seventeen_polymorphism.TwoApp;

import java.util.Random;

// For Shared Payment Functionalities, Transaction ID Generations & Receipt Generations
public abstract class AbstractPayment implements Payment {

    // Transaction ID
    private String transactionID;

    // Abstract Method For Specific Payment Logic
    public abstract void processPayment(double amount); 

    // Generate Transaction ID, after Processing Payment
    public String getTransactionID() {
        Random randomID = new Random();
        transactionID = "TX-ID-"+randomID.nextInt(1000000000);
        return transactionID;
    }

    // Receipt Generation is common for all payment methods
    @Override
    public void generateReceipt(String transactionID) {
        System.out.println("Receipt Generated Successfully For Transaction ID: "+transactionID);
    }

}
