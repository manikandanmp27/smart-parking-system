package model;

public abstract class Vehicle {
    private final String numberPlate;

    // we set a constructor for this string,protected means only subclass can access
    // it it
    protected Vehicle(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    // add a getter to print platenumber
    public String getNumberPlate() {
        return numberPlate;
    }

    // each vehicle implements its own fee logic
    public abstract double calculateParkingFee(long hours);

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;
        Vehicle vehicle = (Vehicle) obj;
        return numberPlate.equals(vehicle.numberPlate);
    }

    @Override
    public int hashCode() {
        return numberPlate.hashCode();
    }

    @Override
    public String toString() {
        return "Vehicle{" +"numberPlate='" + numberPlate + '\'' +'}';
    }
}
