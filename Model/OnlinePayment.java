package Model;

public class OnlinePayment implements Payment {
    private String transactionID;
    private String paymentGateway;
    private double amount;

    public OnlinePayment(String transactionID, String paymentGateway, double amount) {
        this.transactionID = transactionID;
        this.paymentGateway = paymentGateway;
        this.amount = amount;
    }

    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    public String getPaymentGateway() {
        return paymentGateway;
    }

    public void setPaymentGateway(String paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public void makePayment(double amount) {
        System.out.println("Payment : " + amount);
        System.out.println("Payment Gate Away : " + paymentGateway);
        System.out.println("transaction ID : " + transactionID);
    }
}
