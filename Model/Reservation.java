package Model;

import java.sql.Date;

public abstract class Reservation extends Ticket {
    private String reservationID;
    private Date reservationDate;
    private TicketStatus status;
    private int reservedSeat;

    public Reservation(String ticketID, String seatNumber, ClassType classType, TicketStatus status, double price,
            TrainType trainType, String reservationID, Date reservationDate, TicketStatus status2, int reservedSeat) {
        super(ticketID, seatNumber, classType, status, price, trainType);
        this.reservationID = reservationID;
        this.reservationDate = reservationDate;
        status = status2;
        this.reservedSeat = reservedSeat;
    }

    public String getReservationID() {
        return reservationID;
    }

    public void setReservationID(String reservationID) {
        this.reservationID = reservationID;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public TicketStatus getStatus() {
        return status;
    }

    public void setStatus(TicketStatus status) {
        this.status = status;
    }

    public int getReservedSeat() {
        return reservedSeat;
    }

    public void setReservedSeat(int reservedSeat) {
        this.reservedSeat = reservedSeat;
    }

    public void reservedSeat() {
        if (status == TicketStatus.PAID) {
            System.out.println("BERHASIL");
        } else {
            System.out.println("KAMU TIDAK PUNYA TEMPAT DUDUK");
        }
    }

    public void cancelReservation() {
        this.status = TicketStatus.CANCELED;
    }

}
