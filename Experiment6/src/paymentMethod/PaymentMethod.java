package paymentMethod;

public abstract class PaymentMethod {

    public abstract void processPayment(double amount);
    public abstract String getPaymentDetails();

    public boolean validateAmount(double amount) {
        return amount > 0;
    }
}
