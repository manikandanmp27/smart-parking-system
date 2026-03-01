package model;

public abstract class ParkingSpot {
    private final String spotId;
    private Ticket currentTicket;

    protected ParkingSpot(String spotId)
    {
        if(spotId==null||spotId.isBlank())
        {
            throw new IllegalArgumentException("Spot ID cannot be null or empty.");
        }
        this.spotId=spotId;
    }

    public String getSpotId()
    {
        return spotId;
    }
    public boolean isFree()
    {
        return currentTicket==null;
    }
    public void assignTicket(Ticket ticket)
    {
        this.currentTicket=ticket;
    }
    public void removeTicket()
    {
        this.currentTicket=null;
    }
    public Ticket getCurrentTicket()
    {
        return currentTicket;
    }
    public abstract boolean canFitVehicle(Vehicle vehicle);
    @Override
    public String toString()
    {
        return getClass().getSimpleName()+"{spotId='"+spotId+"'free="+isFree()+"}";
    }

}
