package model;

public class BikeSpot extends ParkingSpot {
    public BikeSpot(String spotId)
    {
        super(spotId);
    }
    @Override
    public boolean canFitVehicle(Vehicle vehicle)
    {
        return vehicle instanceof Bike;
    }
}
