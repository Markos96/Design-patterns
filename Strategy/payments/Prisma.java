package payments;

import strategy.PaymentStrategy;

public class Prisma implements PaymentStrategy {

    @Override
    public void processPayment(double amount) {
       System.out.println("Processing payment with Prisma USD " + amount);
    }
    
}
