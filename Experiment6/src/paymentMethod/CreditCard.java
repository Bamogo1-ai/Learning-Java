package paymentMethod;

public class CreditCard extends PaymentMethod implements SecurePayment, Refundable {

    private String cardNumber;
    private String cardHolder;

    public CreditCard(String cardNumber, String cardHolder) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }

    @Override
    public void processPayment(double amount) {
        if (validateAmount(amount)) {
            System.out.println("Processing credit card payment of $" + amount);
        } else {
            System.out.println("Invalid payment amount.");
        }
    }

    @Override
    public void authenticate() {
        System.out.println("Authenticating via CVV and expiry date");
    }

    @Override
    public void processRefund(double amount) {
        if (validateAmount(amount)) {
            System.out.println("Refunding $" + amount + " to credit card");
        } else {
            System.out.println("Invalid refund amount.");
        }
    }

    @Override
    public String getPaymentDetails() {
        return "Credit Card: " + cardHolder + " | Number: " + cardNumber;
    }
}
