package strategy;

import model.PaymentReceipt;

public class CardPayment implements PaymentStrategy {
    @Override
    public PaymentReceipt pay(String ticketId,double amount)
    {
        System.out.println("Processing card payment...");
        return new PaymentReceipt(ticketId, amount,"CARD", true);
    }
    
}
