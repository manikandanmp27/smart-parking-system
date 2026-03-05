package strategy;

import model.PaymentReceipt;

public class CashPayment implements PaymentStrategy {
    @Override
    public PaymentReceipt pay(String ticketId,double amount)
    {
        System.out.println("Processing cash payment...");
        return new PaymentReceipt(ticketId, amount,"CASH", true);
    }
    
}
