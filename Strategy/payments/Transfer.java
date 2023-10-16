package payments;

import strategy.PaymentStrategy;

public class Transfer implements PaymentStrategy {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment with Transfer USD " + amount);
    }
    
}
