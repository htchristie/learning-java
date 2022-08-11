package exercises.polymorphismExercises.two.entities;

public class LegalEntity extends Person{
    private Integer employees;

    public LegalEntity() {
        super();
    }

    public LegalEntity(String name, Double annualIncome, Integer employees) {
        super(name, annualIncome);
        this.employees = employees;
    }

    public Integer getEmployees() {
        return employees;
    }

    public void setEmployees(Integer employees) {
        this.employees = employees;
    }

    @Override
    public double calculateTaxes() {
        if (employees > 10) {
            return getAnnualIncome() * 0.14;
        } else {
            return getAnnualIncome() * 0.16;
        }
    }
}
