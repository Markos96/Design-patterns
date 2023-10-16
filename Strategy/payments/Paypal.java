package payments;

import strategy.PaymentStrategy;

public class Paypal implements PaymentStrategy{

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment with Paypal USD" + amount);
    }
    
}
