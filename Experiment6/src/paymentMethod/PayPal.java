package paymentMethod;

public class PayPal extends PaymentMethod implements SecurePayment {

    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    @Override
    public void processPayment(double amount) {
        if (validateAmount(amount)) {
            System.out.println("Processing PayPal payment of $" + amount);
        } else {
            System.out.println("Invalid payment amount.");
        }
    }

    @Override
    public void authenticate() {
        System.out.println("Authenticating via PayPal login");
    }

    @Override
    public String getPaymentDetails() {
        return "PayPal Account: " + email;
    }
}
