package HW10.Employee;

import java.util.Objects;

public class Employee {
    protected String name;
    protected String address;
    protected double salary;
    protected String position;

    public Employee(String name, String address, double salary, String position) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.position = position;
    }

    public double calculateBonus() {
        return this.salary * 0.1;
    }

    public String performanceReport() {
        return "Performance report for " + position + " " + name + " -> Good";
    }

    public String workInformation() {
        return position + " is working.";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return Double.compare(employee.salary, salary) == 0 &&
                name.equals(employee.name) &&
                address.equals(employee.address) &&
                position.equals(employee.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, salary, position);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", position='" + position + '\'' +
                '}';
    }
}
