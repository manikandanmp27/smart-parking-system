package strategy;
import model.PaymentReceipt;
public interface PaymentStrategy {
    PaymentReceipt pay(String ticketId,double amount);
}
