package model;

public class Truck extends Vehicle {
    private static final double RATE_PER_HOUR=40.0;

    public Truck(String numberPlate)
    {
        super(numberPlate);
    }
    @Override
    public double calculateParkingFee(long hours)
    {
        if(hours<=0)
            hours=1;
        return hours*RATE_PER_HOUR;
    }

}
