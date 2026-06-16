package seventeen_polymorphism.TwoApp;

import java.util.Scanner;

// Implementation Of NetBanking Payment
public class CreditCardPayment extends AbstractPayment {

    private int cardNumber;

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Card Number: ");
        cardNumber = input.nextInt();
        this.cardNumber = cardNumber;
    }

    // Process Payment
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card Payment Of ₹ "+amount);
    }

}
