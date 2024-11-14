package Model;

public class Passenger {
    private String passengerID;
    private String passengerName;
    private int passengerGender;
    private int passengerAge;

    public Passenger(String passengerID, String passengerName, int passengerGender, int passengerAge) {
        this.passengerID = passengerID;
        this.passengerName = passengerName;
        this.passengerGender = passengerGender;
        this.passengerAge = passengerAge;
    }

    public String getPassengerID() {
        return passengerID;
    }

    public void setPassengerID(String passengerID) {
        this.passengerID = passengerID;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public int getPassengerGender() {
        return passengerGender;
    }

    public void setPassengerGender(int passengerGender) {
        this.passengerGender = passengerGender;
    }

    public int getPassengerAge() {
        return passengerAge;
    }

    public void setPassengerAge(int passengerAge) {
        this.passengerAge = passengerAge;
    }

    public void getPassengerInfo() {
        String gender;
        if (passengerGender == 0) {
            gender = "Male";
        } else {
            gender = "Female";
        }
        System.out.println("Passenger Information:");
        System.out.println("ID: " + passengerID);
        System.out.println("Name: " + passengerName);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + passengerAge);
    }
}
