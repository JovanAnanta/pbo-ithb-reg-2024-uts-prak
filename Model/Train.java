package Model;

public class Train {
    private int trainNumber;
    private String trainName;
    private TrainType trainType;

    public Train(int trainNumber, String trainName, TrainType trainType) {
        this.trainNumber = trainNumber;
        this.trainName = trainName;
        this.trainType = trainType;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public TrainType getTrainType() {
        return trainType;
    }

    public void setTrainType(TrainType trainType) {
        this.trainType = trainType;
    }

    public void getTrainDetails() {
        System.out.println("Train Details :");
        System.out.println("Number: " + trainNumber);
        System.out.println("Name: " + trainName);
        System.out.println("Type: " + trainType);
    }
}
