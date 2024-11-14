package Controller;

import java.sql.Date;
import java.util.List;

import Model.*;
import Main.*;
import View.*;

public class Controller {
    public static List<Train> listTrains;
    public static List<Passenger> listPassengers;
    public static List<Reservation> listReservations;
    public static List<OnlinePayment> listPayments;
    public static List<Ticket> listTickets;

    public void createDummy() {
        listTrains.add(new Train(1, "KAI1", TrainType.STANDART));
        listTrains.add(new Train(2, "KAI2", TrainType.FASTTRAIN));

        listPassengers.add(new Passenger("P001", "AAA", 0, 26));
        listPassengers.add(new Passenger("P002", "BBB", 0, 24));
        listPassengers.add(new Passenger("P003", "CCC", 0, 45));
        listPassengers.add(new Passenger("P004", "DDD", 0, 68));

        listTickets.add(new Ticket("T001", "A1", ClassType.FIRST_CLASS, TicketStatus.PAID, 350000, TrainType.STANDART) {
        });
        listTickets.add(new Ticket("T002", "A2", ClassType.BUSINESS_CLASS, TicketStatus.AWAITING_PAYMENT, 250000,
                TrainType.STANDART) {
        });
        listTickets.add(
                new Ticket("T003", "A3", ClassType.ECONOMY_CLASS, TicketStatus.CANCELED, 175000, TrainType.STANDART) {
                });

        listTickets
                .add(new Ticket("T001", "A4", ClassType.FIRST_CLASS, TicketStatus.PAID, 350000, TrainType.FASTTRAIN) {
                });
        listTickets.add(new Ticket("T002", "A5", ClassType.BUSINESS_CLASS, TicketStatus.AWAITING_PAYMENT, 250000,
                TrainType.FASTTRAIN) {
        });
        listTickets.add(
                new Ticket("T003", "A6", ClassType.ECONOMY_CLASS, TicketStatus.CANCELED, 175000, TrainType.FASTTRAIN) {
                });

        listReservations.add(
                new Reservation("R001", "A1", ClassType.FIRST_CLASS, TicketStatus.PAID, 600000, TrainType.FASTTRAIN,
                        "R001", Date.valueOf("2019-03-24"), TicketStatus.PAID, 1) {
                });
        listReservations.add(new Reservation("R002", "A2", ClassType.BUSINESS_CLASS, TicketStatus.AWAITING_PAYMENT,
                250000, TrainType.STANDART,
                "R002", Date.valueOf("2019-04-12"), TicketStatus.AWAITING_PAYMENT, 1) {
        });

        listPayments.add(new OnlinePayment("OP001", "PayPal", 600000));
        listPayments.add(new OnlinePayment("OP002", "DOKU", 250000));
    }

    public static double processPayment(Reservation reservation, String paymentType, TrainType trainType,
            ClassType classType) {

        if (trainType == TrainType.STANDART) {
            switch (classType) {
                case FIRST_CLASS:
                    return 350000;
                case BUSINESS_CLASS:
                    return 250000;
                case ECONOMY_CLASS:
                    return 175000;
            }
        } else if (trainType == TrainType.FASTTRAIN) {
            switch (classType) {
                case FIRST_CLASS:
                    return 600000;
                case BUSINESS_CLASS:
                    return 500000;
                case ECONOMY_CLASS:
                    return 400000;
            }
        }
        return 0;
    }

    public static double calculateTotalRevenue() {

        double total = 0;

        for (OnlinePayment payment : listPayments) {

            total += payment.getAmount();

        }

        return total;

    }
}
