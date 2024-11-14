package Model;

public abstract class Ticket {
    private String ticketID;
    private String seatNumber;
    private ClassType classType;
    private TicketStatus status;
    private double price;
    private TrainType trainType;

    public TrainType getTrainType() {
        return trainType;
    }

    public void setTrainType(TrainType trainType) {
        this.trainType = trainType;
    }

    public Ticket(String ticketID, String seatNumber, ClassType classType, TicketStatus status, double price,
            TrainType trainType) {
        this.ticketID = ticketID;
        this.seatNumber = seatNumber;
        this.classType = classType;
        this.status = status;
        this.price = price;
        this.trainType = trainType;
    }

    public String getTicketID() {
        return ticketID;
    }

    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public ClassType getClassType() {
        return classType;
    }

    public void setClassType(ClassType classType) {
        this.classType = classType;
    }

    public TicketStatus getStatus() {
        return status;
    }

    public void setStatus(TicketStatus status) {
        this.status = status;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void printTicket() {
        System.out.println("Ticket:");
        System.out.println("Ticket ID: " + ticketID);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Class Type: " + classType);
        System.out.println("Price: " + price);
        System.out.println("Status: " + status);
    }

    public void getTicketStatus() {
        System.out.println("Ticket Status for Ticket ID " + ticketID + ": " + status);
    }
}
