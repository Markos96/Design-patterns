import strategy.PaymentStrategy;

public class PaymentContext {
    
    public PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public PaymentStrategy getPayment(){
        return this.paymentStrategy;
    }

}