package HW10.Employee;

public class QA extends Employee {
    public QA(String name, String address, double salary) {
        super(name, address, salary, "QA");
    }

    @Override
    public String workInformation() {
        return "QA " + name + " tests the software.";
    }
}
