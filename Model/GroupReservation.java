package Model;

import java.sql.Date;

public class GroupReservation extends Reservation {
    private String groupName;
    private int numberofPassenger;

    public GroupReservation(String ticketID, String seatNumber, ClassType classType, TicketStatus status, double price,
            TrainType trainType, String reservationID, Date reservationDate, TicketStatus status2, int reservedSeat,
            String groupName, int numberofPassenger) {
        super(ticketID, seatNumber, classType, status, price, trainType, reservationID, reservationDate, status2,
                reservedSeat);
        this.groupName = groupName;
        this.numberofPassenger = numberofPassenger;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getNumberofPassenger() {
        return numberofPassenger;
    }

    public void setNumberofPassenger(int numberofPassenger) {
        this.numberofPassenger = numberofPassenger;
    }

}
