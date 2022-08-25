package interfaces.exampleThree.entities;

public class Employee implements Comparable<Employee> {
// faz com que o objeto possa ser comparado a outro
    private String name;
    private Double salary;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee o) {
        return name.compareTo(o.getName());
    }
}
