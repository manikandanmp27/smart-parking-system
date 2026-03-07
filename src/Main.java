import model.*;
import service.ParkingLot;
import strategy.*;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<ParkingSpot> spots=new ArrayList<>();
        spots.add(new CarSpot("C1"));
        spots.add(new CarSpot("C2"));
        spots.add(new BikeSpot("B1"));
        spots.add(new TruckSpot("T1"));
        
        ParkingLot parkingLot=new ParkingLot(spots);
        Vehicle car=new Car("KA53AB1234");
        Vehicle bike=new Bike("KA53AB1222");
        Vehicle truck=new Truck("KA53AB1244");

        Ticket carTicket=parkingLot.parkVehicle(car);
        Ticket bikeTicket=parkingLot.parkVehicle(bike);
        System.out.println(carTicket);
        System.out.println(bikeTicket);

        PaymentStrategy payment=new UpiPayment();
        PaymentReceipt receipt=parkingLot.exitVehicle("KA53AB1234", payment);
        System.out.println(receipt);
    }
}
