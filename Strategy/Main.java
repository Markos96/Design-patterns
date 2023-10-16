import java.util.InputMismatchException;
import java.util.Scanner;

import payments.MercadoPago;
import payments.Paypal;
import payments.Prisma;
import payments.Transfer;

public class Main {

    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println(
                    "\t PAYMENT TIPES \n 1- MercadoPago \n 2- Prisma \n 3- Transfer \n 4- Paypal \nEnter payment type: ");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    paymentContext.setPaymentStrategy(new MercadoPago());
                    paymentContext.getPayment().processPayment(10D);
                    break;

                case 2:
                    paymentContext.setPaymentStrategy(new Prisma());
                    paymentContext.getPayment().processPayment(10D);
                    break;

                case 3:
                    paymentContext.setPaymentStrategy(new Transfer());
                    paymentContext.getPayment().processPayment(10D);
                    break;

                case 4:
                    paymentContext.setPaymentStrategy(new Paypal());
                    paymentContext.getPayment().processPayment(10D);
                    break;

                default:
                    throw new IllegalArgumentException("Invalid payment option");
            }
        } catch (InputMismatchException e) {
            throw new NumberFormatException("Value is not a valid number");
        }
    }
}