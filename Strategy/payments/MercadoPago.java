package payments;

import strategy.PaymentStrategy;

public class MercadoPago implements PaymentStrategy{

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment with MercadoPago - USD" + amount);
    }

    
    
}
