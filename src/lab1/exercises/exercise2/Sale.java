package lab1.exercises.exercise2;

public class Sale {
    private double amount;
    private int year;

    public Sale(double amount, int year) {
        this.amount = amount;
        this.year = year;
    }

    public double getAmount() {
        return amount;
    }

    public int getYear() {
        return year;
    }
}
