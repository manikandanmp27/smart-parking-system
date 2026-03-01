package model;

public class TruckSpot extends ParkingSpot{
    public TruckSpot(String spotId)
    {
        super(spotId);
    }
    @Override
    public boolean canFitVehicle(Vehicle vehicle)
    {
        return vehicle instanceof Truck;
    }

}
