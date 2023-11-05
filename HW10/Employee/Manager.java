package HW10.Employee;

public class Manager extends Employee {
    public Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
    }

    @Override
    public double calculateBonus() {
        return this.salary * 0.15;
    }

    @Override
    public String workInformation() {
        return "Manager " + name + " manages the team.";
    }
}

