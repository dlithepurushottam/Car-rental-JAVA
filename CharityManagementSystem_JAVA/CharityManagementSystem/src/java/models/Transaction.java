package models;

import java.util.Date;

public class Transaction {
    private int transactionId;
    private int donorId; 
    private double amount;
    private Date date; 

    // Constructor
    public Transaction() {}

    public Transaction(int transactionId, int donorId, double amount, Date date) {
        this.transactionId = transactionId;
        this.donorId = donorId;
        this.amount = amount;
        this.date = date;
    }

    // Getters and Setters
    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public int getDonorId() {
        return donorId;
    }

    public void setDonorId(int donorId) {
        this.donorId = donorId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Transaction{" +
               "transactionId=" + transactionId +
               ", donorId=" + donorId +
               ", amount=" + amount +
               ", date=" + date +
               '}';
    }
}

