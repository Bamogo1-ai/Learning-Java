package paymentMethod;

public class PaymentSystemTest {
    public static void main(String[] args) {

        CreditCard creditCard = new CreditCard("1234-5678-9999-2222", "Axelle ZOURE");
        PayPal paypal = new PayPal("Axelle.@example.com");

        System.out.println("=== CREDIT CARD TEST ===");
        creditCard.authenticate();
        creditCard.processPayment(120.50);
        creditCard.processRefund(60.25);
        System.out.println(creditCard.getPaymentDetails());

        System.out.println("\n=== PAYPAL TEST ===");
        paypal.authenticate();
        paypal.processPayment(75.00);
        System.out.println(paypal.getPaymentDetails());
    }
}
