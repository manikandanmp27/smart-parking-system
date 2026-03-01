import model.*;
public class Main {
    public static void main(String[] args) {
        Vehicle car=new Car("KA01AB1234");
        Vehicle bike=new Bike("KA01AB1233");
        System.out.println(car.calculateParkingFee(3));
        System.out.println(bike.calculateParkingFee(3));
    }
}
