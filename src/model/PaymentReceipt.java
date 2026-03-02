package model;

import java.time.LocalDateTime;
import java.util.UUID;

public class PaymentReceipt {
    private final String receiptId;
    private final String ticketId;
    private final double amount;
    private final String paymentMethod;
    private final LocalDateTime timestamp;
    private final boolean successful;

    public PaymentReceipt(String ticketId, double amount, String paymentMethod, boolean successful) {
        this.receiptId = UUID.randomUUID().toString();
        this.ticketId = ticketId;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.timestamp = LocalDateTime.now();
        this.successful = successful;
    }

    public String getReceiptId() {
        return receiptId;
    }

    public String getTicketId() {
        return ticketId;
    }

    public double getAmount() {
        return amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public boolean isSuccessful() {
        return successful;
    }

    @Override
    public String toString() {
        return "PaymentReceipt{" +
                "receiptId='" + receiptId + '\'' +
                ", ticketId='" + ticketId + '\'' +
                ", amount=" + amount +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", timestamp=" + timestamp +
                ", successful=" + successful +
                '}';
    }
}
