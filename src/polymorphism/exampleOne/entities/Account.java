package polymorphism.exampleOne.entities;

public abstract class Account {

    private static final double taxes = 5.0;
    private Integer number;
    private String holder;
    protected Double balance;

    public Account() {}

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        balance -= amount + taxes;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}
