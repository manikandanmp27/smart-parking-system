package model;
public class Car extends Vehicle {
    private static final double RATE_PER_HOUR=20.0;

    public Car(String numberPlate)
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
