package strategy;
import model.PaymentReceipt;
public class UpiPayment implements PaymentStrategy {
    @Override
    public PaymentReceipt pay(String ticketId,double amount)
    {
        System.out.println("Processing UPI payment...");
        return new PaymentReceipt(ticketId,amount,"UPI",true);
    }
}
