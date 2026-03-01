package model;
import java.time.Duration;
import java.time.LocalDateTime;
public class Ticket {
    private final String ticketId;
    private final Vehicle vehicle;
    private final ParkingSpot spot;
    private final LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private PaymentReceipt receipt;

    public Ticket(String ticketId,Vehicle vehicle,ParkingSpot spot,LocalDateTime entryTime)
    {
        if(ticketId==null||ticketId.isBlank())
        {
            throw new IllegalArgumentException("Ticket ID cannot be empty.");
        }
        this.ticketId=ticketId;
        this.vehicle=vehicle;
        this.spot=spot;
        this.entryTime=entryTime;
    }
    public String getTicketId()
    {
        return ticketId;
    }
    public Vehicle getVehicle()
    {
        return vehicle;
    }
    public ParkingSpot getSpot()
    {
        return spot;
    }
    public LocalDateTime getEntryTime()
    {
        return entryTime;
    }
    public LocalDateTime getExitTime()
    {
        return exitTime;
    }
    public PaymentReceipt getReceipt()
    {
        return receipt;
    }

    public void closeTicket()
    {
        this.exitTime=LocalDateTime.now();//For vehicle exiting time
    }
    public long calculateDurationInHours()
    {
        if(exitTime==null)
        {
            throw new IllegalStateException("The ticket is not closed yet.");
        }
        long hours=Duration.between(entryTime, exitTime).toHours();
        if(hours<=0)
                hours=1;
        return hours;
    }
    public void setReceipt(PaymentReceipt receipt)
    {
        this.receipt=receipt;
    }
    @Override
    public String toString()
    {
        return "Ticket{"+ticketId+'\''+",vehicle="+vehicle+",spot="+spot.getSpotId()+",entryTime="+entryTime+",exitTime="+exitTime+'}';
    }
}
