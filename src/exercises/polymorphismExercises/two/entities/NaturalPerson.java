package exercises.polymorphismExercises.two.entities;

public class NaturalPerson extends Person{

    private Double healthExpenses;

    public NaturalPerson() {
        super();
    }

    public NaturalPerson(String name, Double annualIncome, Double healthExpenses) {
        super(name, annualIncome);
        this.healthExpenses = healthExpenses;
    }

    public Double getHealthExpenses() {
        return healthExpenses;
    }

    public void setHealthExpenses(Double healthExpenses) {
        this.healthExpenses = healthExpenses;
    }

    @Override
    public double calculateTaxes() {
        if (getAnnualIncome() < 20000.00) {
            return getAnnualIncome() * 0.15 - healthExpenses * 0.5;
        } else {
            return getAnnualIncome() * 0.25 - healthExpenses * 0.5;
        }
    }
}
