package seventeen_polymorphism.TwoApp;

// Interface For Payment Methods
public interface Payment {

    // Contract For Processing Payment
    public void processPayment(double amount); 

    // Contract For Generating Payment Receipts 
    public void generateReceipt(String transactionID);

}
