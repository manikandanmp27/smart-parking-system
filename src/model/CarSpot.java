package model;

public class CarSpot extends ParkingSpot {
    public CarSpot(String spotId)
    {
        super(spotId);
    }
    @Override
    public boolean canFitVehicle(Vehicle vehicle)
    {
        return vehicle instanceof Car;
    }
}
