package service;

import model.*;
import strategy.PaymentStrategy;
import java.util.*;

public class ParkingLot {
    private final List<ParkingSpot> spots = new ArrayList<>();
    private final Map<String, Ticket> activeTickets = new HashMap<>();
    private int ticketCounter = 1;

    public ParkingLot(List<ParkingSpot> spots) {
        this.spots.addAll(spots);
    }

    private String generateTicketId()// Used for generating unique tickets
    {
        return "T" + ticketCounter++;
    }

    public Ticket parkVehicle(Vehicle vehicle)// entering parking
    {
        for (ParkingSpot spot : spots) {
            if (spot.isFree() && spot.canFitVehicle(vehicle)) {
                String ticketId = generateTicketId();
                Ticket ticket = new Ticket(ticketId, vehicle, spot);
                spot.assignTicket(ticket);
                activeTickets.put(vehicle.getNumberPlate(), ticket);
                System.out.println("vehicle Parked.TicketId:" + ticketId);
                return ticket;
            }
        }
        throw new RuntimeException("No suitable parking spot available..");
    }

    public PaymentReceipt exitVehicle(String numberPlate, PaymentStrategy paymentStrategy) {
        Ticket ticket = activeTickets.get(numberPlate);
        if (ticket == null) {
            throw new RuntimeException("Vehicle not found in parking");
        }
        ticket.closeTicket();

        long hours = ticket.calculateDurationInHours();
        double fee = ticket.getVehicle().calculateParkingFee(hours);
        PaymentReceipt receipt = paymentStrategy.pay(ticket.getTicketId(), fee);
        ticket.setReceipt(receipt);
        ticket.getSpot().removeTicket();
        activeTickets.remove(numberPlate);
        System.out.println("Vehicle exited.Fee:" + fee);
        return receipt;
    }
}
