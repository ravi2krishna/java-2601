package seventeen_polymorphism.TwoApp;

// Different Payment Processing
public class PaymentProcessor {

    // Net Banking Payment
    public void makePayment(double amount, String bankName) {
        System.out.println("====== NET BANKING PAYMENT ======");
        NetBankingPayment netBanking = new NetBankingPayment();
        System.out.println("Amount To Pay: "+amount);
        netBanking.processPayment(amount);
        netBanking.generateReceipt(netBanking.getTransactionID());
    }

    // Credit card Payment
    public void makePayment(double amount, int cardNumber) {
       System.out.println("====== CREDIT CARD PAYMENT ======"); 
       CreditCardPayment creditCard = new CreditCardPayment();
       creditCard.processPayment(amount);
       creditCard.generateReceipt(creditCard.getTransactionID());
    }

}
