package seventeen_polymorphism.TwoApp;

import java.util.Scanner;

// Implementation Of NetBanking Payment
public class NetBankingPayment extends AbstractPayment {

    private String bankName;

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Bank Name: ");
        bankName = input.next();
        this.bankName = bankName;
    }

    // Process Payment
    public void processPayment(double amount) {
        System.out.println("Processing Net Banking Payment Of ₹ "+amount);
    }

}
