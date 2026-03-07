# smart-parking-system
Java mini project
This is a practice project to strengthen java skills.

Description:
Smart Parking Management System is a Java-based application that manages vehicle entry, parking allocation, ticket generation, and billing. The system models real-world parking operations using object-oriented principles for clean, scalable design.

->Technologies Used
-Java
-Object-Oriented Programming concepts such as inheritance, abstraction, interface, polymorphism.
-Java Collections (List, Map)
-Java Time API (LocalDateTime, Duration)

->Features
-Park vehicles (Car, Bike, Truck)
-Allocate suitable parking spots automatically
-Generate parking tickets
-Calculate parking duration
-Calculate parking fees based on vehicle type
-Process payments using different strategies
-Free parking spots after vehicle exit

->Example Output:
vehicle Parked.TicketId:T1
vehicle Parked.TicketId:T2
Ticket{T1,vehicle=Vehicle{numberPlate='KA53AB1234'},spot=C1,entryTime=2026-03-07T17:06:39.927358300,exitTime=null}
Ticket{T2,vehicle=Vehicle{numberPlate='KA53AB1222'},spot=B1,entryTime=2026-03-07T17:06:39.929428300,exitTime=null}
Processing UPI payment...
Vehicle exited.Fee:20.0
PaymentReceipt{receiptId='dc45fae8-574d-42b3-818c-8612a521df57', ticketId='T1', amount=20.0, paymentMethod='UPI', timestamp=2026-03-07T17:06:40.073640300, successful=true}

->This project helped reinforce:
-Object modeling
-OOP design principles
-Strategy pattern implementation
-Real-world system design thinking
-Java collections and time API usage
