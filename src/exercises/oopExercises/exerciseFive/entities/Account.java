package exercises.oopExercises.exerciseFive.entities;



public class Account {

    public static final double taxes = 5.0;
    private int number;
    private String name;
    private double balance;

    public Account(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public Account(int number, String name, double initialDeposit) {
        this.number = number;
        this.name = name;
        deposit(initialDeposit);
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        balance -= amount + taxes;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public String toString() {
        return "Account " + number + ", Holder: " + name + ", Balance: $ " + String.format("%.2f", balance);
    }
}