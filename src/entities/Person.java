package entities;

import java.time.LocalDate;

public abstract class Person {

    private final String name;
    private final LocalDate dateOrigin;
    private double amountMoney;

    public Person(String name, LocalDate date, double amountMoney) {
        this.name = name;
        this.dateOrigin = date;
        this.amountMoney = amountMoney;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOrigin() {
        return dateOrigin;
    }

    public double getAmountMoney() {
        return amountMoney;
    }

    public void robSomeone(double amount) {
        this.amountMoney = amount;
    }

    public abstract boolean buyProduct(Product p);
    public abstract int getID();
    protected abstract boolean checkID();
}
