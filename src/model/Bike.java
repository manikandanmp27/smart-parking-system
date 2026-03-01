package model;
public class Bike extends Vehicle{
    private static final double RATE_PER_HOUR=10.0;

    public Bike(String numberPlate)
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